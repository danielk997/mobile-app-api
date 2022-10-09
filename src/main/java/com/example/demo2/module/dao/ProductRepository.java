package com.example.demo2.module.dao;

import com.example.demo2.module.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    Product getByName(String name);
}
