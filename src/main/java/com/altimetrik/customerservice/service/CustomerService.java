package com.altimetrik.customerservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altimetrik.customerservice.config.AdminFeignClient;
import com.altimetrik.customerservice.exception.ResourceNotFoundException;
import com.altimetrik.customerservice.model.CategoryDTO;
import com.altimetrik.customerservice.model.ProductDTO;

@Service
public class CustomerService {

    @Autowired
    private AdminFeignClient adminFeignClient;

    public List<CategoryDTO> getAllCategories() {
        return adminFeignClient.getAllCategories();
    }

    public CategoryDTO getCategoryById(Long categoryId) throws ResourceNotFoundException {
        return adminFeignClient.getCategoryById(categoryId);
    }

    public CategoryDTO getCategoryByName(String categoryName) throws ResourceNotFoundException {
        return adminFeignClient.getCategoryByName(categoryName);
    }

    public List<ProductDTO> getAllProducts() {
        return adminFeignClient.getAllProducts();
    }

    public ProductDTO getProductById(Long productId) throws ResourceNotFoundException {
        return adminFeignClient.getProductById(productId);
    }

    public ProductDTO getProductByName(String productName) throws ResourceNotFoundException {
        return adminFeignClient.getProductByName(productName);
    }
}
