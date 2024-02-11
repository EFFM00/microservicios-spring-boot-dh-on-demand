package paymentservice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import paymentservice.model.Payment;
import paymentservice.service.PaymentService;

@RequestMapping("/payments")
@RestController
public class PaymentController {

    private PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        super();
        this.paymentService = paymentService;
    }

    @PostMapping()
    public void createPayment(@RequestBody Payment payment) {
        paymentService.createPayment((payment));
    }
}
