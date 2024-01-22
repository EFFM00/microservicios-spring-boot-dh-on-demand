package com.dh.checkoutservice.repository;

import com.dh.checkoutservice.configuration.LoadBalancerConfiguration;
import com.dh.checkoutservice.model.dto.Product;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="product-service")
@LoadBalancerClient(value = "product-service", configuration = LoadBalancerConfiguration.class)
public interface FeignProductRepository {
    @RequestMapping(method = RequestMethod.GET, value="/products")
    Product getProductById(@RequestParam String id);
}
