package guru.springframework.listener;

import guru.springframework.SpringBootRabbitMQApplication;
import guru.springframework.domain.EndLifeProductDto;
import guru.springframework.entities.EndlifeProductEntity;
import guru.springframework.repositories.EndLifeProductRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * This is the queue listener class, its receiveMessage() method ios invoked with the
 * message as the parameter.
 */
@Component
public class ArticleMessageListener {

    private EndLifeProductRepository productRepository;

    private static final Logger log = LogManager.getLogger(ArticleMessageListener.class);

    public ArticleMessageListener(EndLifeProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    /**
     * This method is invoked whenever any new message is put in the queue.
     * See {@link guru.springframework.SpringBootRabbitMQApplication} for more details
     * @param productEntity
     */
    @RabbitListener(queues = SpringBootRabbitMQApplication.SFG_MESSAGE_QUEUE_ARTICLE)
    public void receiveMessage(EndlifeProductEntity productEntity) {
        log.info("Received <" + productEntity + ">");
        if(productEntity.getCrud().equals("STORE")) {
            try {
                EndlifeProductEntity entity = productRepository.save(productEntity);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
