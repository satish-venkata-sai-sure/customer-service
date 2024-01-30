package com.altimetrik.customerservice.config;


import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.altimetrik.customerservice.exception.ResourceNotFoundException;
import com.altimetrik.customerservice.model.CategoryDTO;
import com.altimetrik.customerservice.model.ProductDTO;

@FeignClient(name = "admin-service", url = "${admin-service.url}", configuration = FeignClientConfiguration.class)
public interface AdminFeignClient {

    @GetMapping("/admin/categories")
    List<CategoryDTO> getAllCategories();

    @GetMapping("/admin/categories/{categoryId}")
    CategoryDTO getCategoryById(@PathVariable Long categoryId)throws ResourceNotFoundException;

    @GetMapping("/admin/categories/byName/{categoryName}")
    CategoryDTO getCategoryByName(@PathVariable String categoryName)throws ResourceNotFoundException;

    @GetMapping("/admin/products")
    List<ProductDTO> getAllProducts();

    @GetMapping("/admin/products/{productId}")
    ProductDTO getProductById(@PathVariable Long productId)throws ResourceNotFoundException;

    @GetMapping("/admin/products/byName/{productName}")
    ProductDTO getProductByName(@PathVariable String productName)throws ResourceNotFoundException;
}

