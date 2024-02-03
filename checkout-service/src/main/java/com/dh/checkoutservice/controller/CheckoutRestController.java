package com.dh.checkoutservice.controller;

import com.dh.checkoutservice.model.Checkout;
import com.dh.checkoutservice.service.ICheckoutService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/checkout")
public class CheckoutRestController {
    private ICheckoutService checkoutService;

    public CheckoutRestController(ICheckoutService checkoutService) {
        super();
        this.checkoutService = checkoutService;
    }

    @GetMapping()
    public Checkout getCheckout(@RequestParam List<String> productIds, @RequestHeader("X-Request-From") String requestFrom) {
        System.out.println("Enviado desde: " + requestFrom);
//        if(!requestFrom.equals("gateway")) {
//            return null;
//        }
        return checkoutService.buildCheckout(productIds);
    }

}
