package com.productmanagment.mebel.controller;

import com.productmanagment.mebel.manager.ProductManager;
import com.productmanagment.mebel.modul.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductManager productManager;
    @GetMapping
    public List<Product> getAllProduct() {
        return productManager.getAllProduct();
    }

    @PostMapping("/product")
    public Product saveProduct(@RequestBody Product product) {
        return productManager.saveProduct(product);
    }
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable int id) {
        productManager.deleteProduct(id);

    }
}

