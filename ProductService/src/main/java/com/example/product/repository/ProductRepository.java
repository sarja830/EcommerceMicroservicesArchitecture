package com.example.product.repository;

import com.example.product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

// second generic argument is for unique identifier
public interface ProductRepository extends MongoRepository<Product,String> {
}
