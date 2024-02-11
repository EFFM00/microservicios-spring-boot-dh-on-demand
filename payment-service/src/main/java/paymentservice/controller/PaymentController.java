package paymentservice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/payments")
public class PaymentController {

    @PostMapping()
    public void createPayment() {

    }
}
