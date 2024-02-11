package paymentservice.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
public class PublishNotification {

    private RabbitTemplate rabbitTemplate;

    public PublishNotification(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }
    public void sendMessageToTopic(String message) {
        rabbitTemplate.convertAndSend("send-notification", message);
    }
}
