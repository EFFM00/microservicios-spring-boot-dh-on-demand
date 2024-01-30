package com.dh.checkoutservice.repository;

import com.dh.checkoutservice.model.dto.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="external-products", url="http://localhost:8089")
public interface FeignProductRepository {
    @RequestMapping(method = RequestMethod.GET, value="/products")
    Product getProductById(@RequestParam String id);
}
