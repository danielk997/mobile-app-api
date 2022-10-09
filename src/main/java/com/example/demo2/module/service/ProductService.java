package com.example.demo2.module.service;

import com.example.demo2.module.dao.ProductRepository;
import com.example.demo2.module.dto.ProductDTO;
import com.example.demo2.module.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository repository) {
        productRepository = repository;
    }

    public Product getByName(String name) {
        return productRepository.getByName(name);
    }

    public List<Product> getAll() { return productRepository.findAll(); }

    public void addProduct(ProductDTO productDTO) {
        productRepository.save(buildProductFromDTO(productDTO));
    }

    private Product buildProductFromDTO(ProductDTO productDTO) {

        return Product.builder()
                .name(productDTO.getName())
                .build();
    }
}
