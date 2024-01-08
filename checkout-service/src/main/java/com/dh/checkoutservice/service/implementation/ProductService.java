package com.dh.checkoutservice.service.implementation;

import com.dh.checkoutservice.model.dto.Product;
import com.dh.checkoutservice.repository.FeignProductRepository;
import com.dh.checkoutservice.service.IProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService {

    private FeignProductRepository feignProductRepository;

    public ProductService(FeignProductRepository feignProductRepository) {
        super();
        this.feignProductRepository = feignProductRepository;
    }

    @Override
    public Product getProduct(String id) {
        return feignProductRepository.getProductById(id);
    }
}

