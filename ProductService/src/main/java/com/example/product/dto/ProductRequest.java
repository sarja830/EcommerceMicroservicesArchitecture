package com.example.product.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

// for getters and Setters
@Data
// for builder method
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductRequest {
    private String name;
    private String description;
    private BigDecimal price;

}
