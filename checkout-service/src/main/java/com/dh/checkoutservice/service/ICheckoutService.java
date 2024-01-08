package com.dh.checkoutservice.service;

import com.dh.checkoutservice.model.Checkout;

import java.util.List;

public interface ICheckoutService{
    public Checkout buildCheckout(List<String> productIds);

}
