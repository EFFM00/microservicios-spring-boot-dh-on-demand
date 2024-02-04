package com.dh.checkoutservice.service.implementation;

import com.dh.checkoutservice.model.dto.Product;
import com.dh.checkoutservice.repository.FeignProductRepository;
import com.dh.checkoutservice.service.IProductService;
import io.github.resilience4j.circuitbreaker.CallNotPermittedException;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;

@Service
public class ProductService implements IProductService {

    Logger log = LoggerFactory.getLogger(ProductService.class);

    private FeignProductRepository feignProductRepository;

    public ProductService(FeignProductRepository feignProductRepository) {
        super();
        this.feignProductRepository = feignProductRepository;
    }

    @Override
    @CircuitBreaker(name="product",fallbackMethod="getProductFallbackMethod")
    public Product getProduct(String id) {
        return feignProductRepository.getProductById(id, true);
    }

    public Product getProductFallbackMethod(String id, CallNotPermittedException exception ) {
        log.error("Circuit breaker en estado Open");

        return new Product(id, "Default", 0.0, "Instance 1");
    }

}

