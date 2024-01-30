package com.altimetrik.customerservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.altimetrik.customerservice.exception.ResourceNotFoundException;
import com.altimetrik.customerservice.model.CategoryDTO;
import com.altimetrik.customerservice.model.ProductDTO;
import com.altimetrik.customerservice.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/categories")
    public List<CategoryDTO> getAllCategories() {
        return customerService.getAllCategories();
    }

    @GetMapping("/categories/{categoryId}")
    public CategoryDTO getCategoryById(@PathVariable Long categoryId) throws ResourceNotFoundException {
        return customerService.getCategoryById(categoryId);
    }

    @GetMapping("/categories/byName/{categoryName}")
    public CategoryDTO getCategoryByName(@PathVariable String categoryName) throws ResourceNotFoundException {
        return customerService.getCategoryByName(categoryName);
    }

    @GetMapping("/products")
    public List<ProductDTO> getAllProducts() {
        return customerService.getAllProducts();
    }

    @GetMapping("/products/{productId}")
    public ProductDTO getProductById(@PathVariable Long productId) throws ResourceNotFoundException {
        return customerService.getProductById(productId);
    }

    @GetMapping("/products/byName/{productName}")
    public ProductDTO getProductByName(@PathVariable String productName) throws ResourceNotFoundException {
        return customerService.getProductByName(productName);
    }
}

