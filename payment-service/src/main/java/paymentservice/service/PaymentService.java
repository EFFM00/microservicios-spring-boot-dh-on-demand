package paymentservice.service;

import org.springframework.stereotype.Service;
import paymentservice.client.PaymentClient;
import paymentservice.model.Payment;

@Service
public class PaymentService {
    private PublishNotification publishNotification;
    private PaymentClient paymentClient;

    public PaymentService(PublishNotification publishNotification, PaymentClient paymentClient) {
        this.publishNotification = publishNotification;
        this.paymentClient = paymentClient;
    }

    public void createPayment(Payment payment) {
        paymentClient.createPayment(payment);
        publishNotification.sendMessageToTopic(payment.getClientId());
    }
}
