package com.productmanagment.mebel.manager;

import com.productmanagment.mebel.modul.Product;
import com.productmanagment.mebel.repository.ProductRepository;
import com.productmanagment.mebel.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ProductManager implements ProductService {
    private final ProductRepository productRepository;
    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(int id) {
         productRepository.deleteById(id);

    }
}
