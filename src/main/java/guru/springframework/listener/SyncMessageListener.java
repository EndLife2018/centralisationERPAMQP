package guru.springframework.listener;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import guru.springframework.SpringBootRabbitMQApplication;
import guru.springframework.entities.EndlifeProductEntity;
import guru.springframework.repositories.EndLifeProductRepository;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.thymeleaf.util.DateUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

/**
 * This is the queue listener class, its receiveMessage() method ios invoked with the
 * message as the parameter.
 */
@Component
public class SyncMessageListener {

    //private EndLifeProductRepository productRepository;

    private static final Logger log = LogManager.getLogger(ProductMessageListener.class);
    @Autowired
    private EndLifeProductRepository endLifeProductRepository;
    @Autowired
    private RabbitTemplate rabbitTemplate;

    //public ProductMessageListener(EndLifeProductRepository productRepository) {
    //    this.productRepository = productRepository;
    //}

    /**
     * This method is invoked whenever any new message is put in the queue.
     * See {@link guru.springframework.SpringBootRabbitMQApplication} for more details
     * @param date
     */
    @RabbitListener(queues = SpringBootRabbitMQApplication.SFG_MESSAGE_SYNC)
    public void receiveMessage(String date) throws JsonProcessingException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime d = LocalDateTime.parse(date, formatter);
        List<EndlifeProductEntity> productsToSend = endLifeProductRepository.findAllByTmsAfter(Date.from(d.toInstant(ZoneOffset.UTC)));
        ObjectMapper mapper = new ObjectMapper();
        String jsonProducts = mapper.writeValueAsString(productsToSend);
        log.info("Sending data");
        this.rabbitTemplate.
                    convertAndSend(SpringBootRabbitMQApplication.SFG_MESSAGE_CALLBACK_ARTICLE,
                            jsonProducts);
    }
}
