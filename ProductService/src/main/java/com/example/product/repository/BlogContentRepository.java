package com.example.product.repository;

import com.example.product.model.BlogContent;
import com.example.product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

// second generic argument is for unique identifier
public interface BlogContentRepository extends MongoRepository<BlogContent,String> {
}
