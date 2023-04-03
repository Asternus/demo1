package com.example.demo1.example;


import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepo productRepo;

    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public void save(Product product){
        productRepo.save(product);

    }

}
