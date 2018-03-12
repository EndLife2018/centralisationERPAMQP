package guru.springframework.listener;

import guru.springframework.repositories.ProductRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

/**
 * This is the queue listener class, its receiveMessage() method ios invoked with the
 * message as the parameter.
 */
@Component
public class ArticleMessageListener {

    private ProductRepository productRepository;

    private static final Logger log = LogManager.getLogger(ArticleMessageListener.class);

    public ArticleMessageListener(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    /**
     * This method is invoked whenever any new message is put in the queue.
     * See {@link guru.springframework.SpringBootRabbitMQApplication} for more details
     * @param message
     */
    public void receiveMessage(String message) {
        log.info("Received <" + message + ">");
    }
}
