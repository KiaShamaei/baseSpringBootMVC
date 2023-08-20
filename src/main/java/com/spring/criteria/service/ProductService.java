package com.spring.criteria.service;

import com.spring.criteria.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public void add(){

    }
    public void edit(){

    }
    public void delete(){

    }
    public void findOne(){

    }
    public void findAll(){

    }

}
