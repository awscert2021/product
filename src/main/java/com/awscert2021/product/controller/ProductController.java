package com.awscert2021.product.controller;

import com.awscert2021.product.model.Product;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/")
public class ProductController {

    @GetMapping(value = "product", produces = MediaType.APPLICATION_JSON_VALUE)
    public Flux<Product> getAllProducts() {
        Product product1 = new Product("p-1", "Product 1", 55);
        Product product2 = new Product("p-2", "Product 2", 59);
        Product product3 = new Product("p-3", "Product 3", 65);

        return Flux.just(product1, product2, product3);
    }
}
