package paymentservice.service;

public class PaymentService {
    private PublishNotification publishNotification;

    public void createPayment() {
        publishNotification.sendMessageToTopic("");
    }
}
