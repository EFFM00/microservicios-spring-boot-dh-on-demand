package com.dh.checkoutservice.controller;

import com.dh.checkoutservice.model.Checkout;
import com.dh.checkoutservice.service.ICheckoutService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value="/checkout")
public class CheckoutRestController {
    private ICheckoutService checkoutService;

    public CheckoutRestController(ICheckoutService checkoutService) {
        super();
        this.checkoutService = checkoutService;
    }

    @GetMapping("/{id}")
    @PreAuthorize("#oauth2.hasScope('email')")
    public Checkout getById(@PathVariable String id) {
        System.out.println("Crea checkout con id " + id);
        return new Checkout("2");
    }

    @GetMapping()
    public Checkout getCheckout(@RequestParam List<String> productIds, @RequestHeader("X-Request-From") String requestFrom, @RequestHeader() Map<String,String> headers) {
        System.out.println("Enviado desde: " + requestFrom);
        if(!requestFrom.equals("gateway")) {
            return null;
        }
        return checkoutService.buildCheckout(productIds);
    }

}
