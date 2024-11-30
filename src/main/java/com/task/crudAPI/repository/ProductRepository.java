package com.task.crudAPI.repository;

import com.task.crudAPI.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {}