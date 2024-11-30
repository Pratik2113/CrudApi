package com.task.crudAPI.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.task.crudAPI.entity.Category;
import com.task.crudAPI.repository.CategoryRepository;
import com.task.crudAPI.service.CategoryService;



@Service // Marks this class as a Spring-managed service component
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository; // Inject the repository to interact with the database

    @Override
    public Page<Category> getAllCategories(int page) {
        // Fetch paginated categories
        return categoryRepository.findAll(PageRequest.of(page, 5));
    }

    @Override
    public Category getCategoryById(Long id) {
        // Find category by ID or throw an exception
        return categoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Category not found with ID: " + id));
    }

    @Override
    public Category createCategory(Category category) {
        // Save a new category
        return categoryRepository.save(category);
    }

    @Override
    public Category updateCategory(Long id, Category category) {
        // Fetch the existing category
        Category existingCategory = getCategoryById(id);

        // Update the category name
        existingCategory.setName(category.getName());

        // Save the updated category
        return categoryRepository.save(existingCategory);
    }

    @Override
    public void deleteCategory(Long id) {
        // Delete the category by ID
        categoryRepository.deleteById(id);
    }
}

