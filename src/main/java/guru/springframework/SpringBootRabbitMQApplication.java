package guru.springframework;

import guru.springframework.listener.ArticleMessageListener;
import guru.springframework.listener.ProductMessageListener;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootRabbitMQApplication {

	public final static String SFG_MESSAGE_QUEUE_ARTICLE = "store-article";
	public final static String SFG_MESSAGE_QUEUE_CLIENT = "store-client";

	@Bean
	Queue queueArticle() {
		return new Queue(SFG_MESSAGE_QUEUE_ARTICLE, true);
	}

	@Bean
	Queue queueClient() {
		return new Queue(SFG_MESSAGE_QUEUE_CLIENT, true);
	}

	@Bean
	TopicExchange exchange() {
		return new TopicExchange("amq.topic");
	}

	@Bean
	Binding bindingArticle(@Qualifier("queueArticle") Queue queue, TopicExchange exchange) {
		return BindingBuilder.bind(queue).to(exchange).with(SFG_MESSAGE_QUEUE_ARTICLE);
	}

	@Bean
	Binding bindingClient(@Qualifier("queueClient") Queue queue, TopicExchange exchange) {
		return BindingBuilder.bind(queue).to(exchange).with(SFG_MESSAGE_QUEUE_CLIENT);
	}

	@Bean
	SimpleMessageListenerContainer containerClient(ConnectionFactory connectionFactory,
	@Qualifier("listenerAdapterClient") MessageListenerAdapter listenerAdapter) {
		SimpleMessageListenerContainer container = new SimpleMessageListenerContainer();
		container.setConnectionFactory(connectionFactory);
		container.setQueueNames(SFG_MESSAGE_QUEUE_CLIENT);
		container.setMessageListener(listenerAdapter);
		return container;
	}

	@Bean
	MessageListenerAdapter listenerAdapterClient(ProductMessageListener receiver) {
		return new MessageListenerAdapter(receiver, "receiveMessage");
	}

	@Bean
	SimpleMessageListenerContainer containerArticle(ConnectionFactory connectionFactory,
												   @Qualifier("listenerAdapterArticle") MessageListenerAdapter listenerAdapter) {
		SimpleMessageListenerContainer container = new SimpleMessageListenerContainer();
		container.setConnectionFactory(connectionFactory);
		container.setQueueNames(SFG_MESSAGE_QUEUE_ARTICLE);
		container.setMessageListener(listenerAdapter);
		return container;
	}

	@Bean
	MessageListenerAdapter listenerAdapterArticle(ArticleMessageListener receiver) {
		return new MessageListenerAdapter(receiver, "receiveMessage");
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRabbitMQApplication.class, args);
	}
}
