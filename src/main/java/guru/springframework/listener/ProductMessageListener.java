package guru.springframework.listener;

import guru.springframework.SpringBootRabbitMQApplication;
import guru.springframework.repositories.EndLifeProductRepository;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This is the queue listener class, its receiveMessage() method ios invoked with the
 * message as the parameter.
 */
@Component
public class ProductMessageListener {

    //private EndLifeProductRepository productRepository;

    private static final Logger log = LogManager.getLogger(ProductMessageListener.class);

    //public ProductMessageListener(EndLifeProductRepository productRepository) {
    //    this.productRepository = productRepository;
    //}

    /**
     * This method is invoked whenever any new message is put in the queue.
     * See {@link guru.springframework.SpringBootRabbitMQApplication} for more details
     * @param message
     */
    @RabbitListener(queues = SpringBootRabbitMQApplication.SFG_MESSAGE_QUEUE_CLIENT)
    public void receiveMessage(String message) {
        log.info("Received <" + message + ">");
    }
}
