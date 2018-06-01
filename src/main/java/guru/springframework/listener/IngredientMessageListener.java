package guru.springframework.listener;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import guru.springframework.SpringBootRabbitMQApplication;
import guru.springframework.domain.IngredientDto;
import guru.springframework.entities.EndlifeCategorieProductEntity;
import guru.springframework.entities.EndlifeProductEntity;
import guru.springframework.entities.EndlifeProductPriceEntity;
import guru.springframework.repositories.EndLifeProductCategoryRepository;
import guru.springframework.repositories.EndLifeProductPriceRepository;
import guru.springframework.repositories.EndLifeProductRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManagerFactory;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class IngredientMessageListener {
    private EndLifeProductRepository productRepository;
    private EndLifeProductCategoryRepository endLifeProductCategoryRepository;
    @Autowired
    private EndLifeProductPriceRepository endLifeProductPriceRepository;


    @Autowired
    private RabbitTemplate rabbitTemplate;
    private SessionFactory hibernateFactory;

    private static final Logger log = LogManager.getLogger(ArticleMessageListener.class);

    public IngredientMessageListener(EndLifeProductRepository productRepository,
                                     EndLifeProductCategoryRepository endLifeProductCategoryRepository,
                                     EntityManagerFactory factory) {
        this.productRepository = productRepository;
        this.endLifeProductCategoryRepository = endLifeProductCategoryRepository;
        if(factory.unwrap(SessionFactory.class) == null){
            throw new NullPointerException("factory is not a hibernate factory");
        }
        this.hibernateFactory = factory.unwrap(SessionFactory.class);
    }

    /**
     * This method is invoked whenever any new message is put in the queue.
     * See {@link guru.springframework.SpringBootRabbitMQApplication} for more details
     * @param ingredientDto
     */
    @RabbitListener(queues = SpringBootRabbitMQApplication.SFG_MESSAGE_QUEUE_INGREDIENT)
    public void receiveMessage(IngredientDto ingredientDto) throws JsonProcessingException {
        if(ingredientDto.getNomcomposant() == null)
            return;
        EndlifeProductEntity endlifeProductEntity = new EndlifeProductEntity();
        endlifeProductEntity.setDescription(ingredientDto.getDescriptioncomposant());

        endlifeProductEntity.setLabel(ingredientDto.getNomcomposant());
        endlifeProductEntity.setLocaltax1Tx(0d);
        endlifeProductEntity.setLocaltax2Tx(0d);
        endlifeProductEntity.setLocaltax1Type("");
        endlifeProductEntity.setLocaltax2Type("");
        endlifeProductEntity.setRef(ingredientDto.getNomcomposant());
        endlifeProductEntity.setRowid(0);
        endlifeProductEntity.setEntity(1);

        productRepository.save(endlifeProductEntity);
        EndlifeProductEntity entity = productRepository.findDistinctByRefEquals(endlifeProductEntity.getRef());

        EndlifeProductPriceEntity productPriceEntity = new EndlifeProductPriceEntity();
        productPriceEntity.setDatePrice(new Timestamp(new Date().getTime()));
        productPriceEntity.setPrice(0d);
        productPriceEntity.setEntity(1);
        productPriceEntity.setLocaltax1Tx(0d);
        productPriceEntity.setLocaltax2Tx(0d);
        productPriceEntity.setLocaltax1Type("");
        productPriceEntity.setLocaltax2Type("");        productPriceEntity.setFkProduct(entity.getRowid());

        endLifeProductPriceRepository.save(productPriceEntity);

        ObjectMapper mapper = new ObjectMapper();
        String jsonProducts = mapper.writeValueAsString(productRepository.findAll());
        log.info("Sending data");
        this.rabbitTemplate.
                convertAndSend(SpringBootRabbitMQApplication.SFG_MESSAGE_CALLBACK_INGREDIENT,
                        jsonProducts);
    }
}
