package com.example.product.controller;


import com.example.product.dto.ProductRequest;
import com.example.product.dto.ProductResponse;
import com.example.product.model.Product;
import com.example.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


// RestController = Controller+ResponseBody
@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    void createProduct(@RequestBody ProductRequest productRequest)
    {
        productService.createProduct(productRequest);

    }

    // if you use @GetMapping("/get) then it will take the path as /api/products/get
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    List<ProductResponse> getAllProduct()
    {
        return productService.getAllProducts();
    }




}