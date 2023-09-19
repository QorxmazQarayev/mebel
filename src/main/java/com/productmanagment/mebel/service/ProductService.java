package com.productmanagment.mebel.service;

import com.productmanagment.mebel.modul.Product;

import java.util.List;

public interface ProductService {
    List<Product>getAllProduct();
    Product saveProduct(Product product);
    void deleteProduct(int id);
}
