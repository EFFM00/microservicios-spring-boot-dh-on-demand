package paymentservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import paymentservice.model.Payment;
import paymentservice.service.PaymentService;

@RequestMapping("/payments")
@RestController
public class PaymentController {

    private PaymentService paymentService;

    Logger log = LoggerFactory.getLogger(PaymentController.class);
    @GetMapping()
    public Payment getPayment(String id) {
        log.info("Intentando obtener payment con id: "+ id);
        return new Payment(id, 999.99f, "178482", "838283");
    }

    public PaymentController(PaymentService paymentService) {
        super();
        this.paymentService = paymentService;
    }

    @PostMapping()
    public void createPayment(@RequestBody Payment payment) {
        paymentService.createPayment((payment));
    }
}
