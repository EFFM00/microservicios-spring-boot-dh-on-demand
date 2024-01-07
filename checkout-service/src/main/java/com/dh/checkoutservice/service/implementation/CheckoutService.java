package com.dh.checkoutservice.service.implementation;

import com.dh.checkoutservice.model.Checkout;
import com.dh.checkoutservice.model.dto.Product;
import com.dh.checkoutservice.service.ICheckoutService;
import com.dh.checkoutservice.service.IProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheckoutService implements ICheckoutService {
    private IProductService productService;

    public CheckoutService(IProductService productService) {
        this.productService = productService;
    }

    @Override
    public Checkout buildCheckout(List<String> productsIds) {
        Double total = 0.0;
        for(String id : productsIds) {
            Product product = productService.getProduct(id);
            total += product.getPrice();
        }
        Checkout checkout = new Checkout("234", "www.example.com", total.toString(), List.of("credit_card"));

        return checkout;
    }
}
