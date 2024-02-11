package paymentservice.client;

import org.springframework.stereotype.Service;
import paymentservice.model.Payment;

@Service
public class PaymentClient {
    public Boolean createPayment(Payment payment) {
        // Ejecuta llamada a un servicio externo para ejecutar pago
        return true;
    }
}
