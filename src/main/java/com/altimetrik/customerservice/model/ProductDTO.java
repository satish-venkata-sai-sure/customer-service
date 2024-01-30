package com.altimetrik.customerservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    private Long productId;
    private String name;
    private String brand;
    private String description;
    private String priceCurrency;
    private Double priceAmount;
    private Integer inventoryTotal;
    private Integer inventoryAvailable;
    private Integer inventoryReserved;
    private Long categoryId;
}
