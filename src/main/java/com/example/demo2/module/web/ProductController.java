package com.example.demo2.module.web;

import com.example.demo2.module.dto.ProductDTO;
import com.example.demo2.module.model.Product;
import com.example.demo2.module.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService service) {
        productService = service;
    }


    @GetMapping
    public ResponseEntity index() {
        List<Product> product = productService.getAll();

        if (product == null)
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("Product not found");

        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> addProduct(@RequestBody ProductDTO productDTO) {
        productService.addProduct(productDTO);

        return ResponseEntity.status(HttpStatus.CREATED).body("Product add success");
    }
}
