package com.task.crudAPI.repository;
import com.task.crudAPI.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {}
