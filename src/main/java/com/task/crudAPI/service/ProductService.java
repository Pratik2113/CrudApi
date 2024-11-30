package com.task.crudAPI.service;

import com.task.crudAPI.entity.Product;
import org.springframework.data.domain.Page;

public interface ProductService {
    Page<Product> getAllProducts(int page); // Fetch all products with pagination
    Product getProductById(Long id); // Fetch product by ID
    Product createProduct(Product product); // Create a new product
    Product updateProduct(Long id, Product product); // Update product by ID
    void deleteProduct(Long id); // Delete product by ID
}

