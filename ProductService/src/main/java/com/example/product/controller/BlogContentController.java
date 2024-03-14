package com.example.product.controller;


import com.example.product.dto.BlogContentRequest;
import com.example.product.dto.ProductRequest;
import com.example.product.dto.ProductResponse;
import com.example.product.service.BlogContentService;
import com.example.product.service.ProductService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


// RestController = Controller+ResponseBody
@RestController
@RequestMapping("/api/blogs")
//@RequiredArgsConstructor
public class BlogContentController {

    @PostMapping
    public void createBlogs(@RequestBody JsonNode jsonNode) {
        // Now you have the mapped object, you can use it as needed.
    }
    private final BlogContentService blogContentService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    void createBlogs(@RequestBody JsonNode jsonNode)
    {
        BlogContentRequest blogContentRequest = new BlogContentRequest();

        blogContentRequest.setTitle(jsonNode.get("title").asText());
        blogContentRequest.setBanner(jsonNode.get("banner").asText());
        blogContentRequest.setDes(jsonNode.get("des").asText());
        for(JsonNode contentElement: jsonNode.get("content"))
        {
            blogContentRequest.getContent().add(contentElement);
        }
        blogContentRequest.setContent(jsonNode.get("content").asText());
        blogContentRequest.setTags((List<String>) jsonNode.get("tags"));
        blogContentService.createBlogContent(jsonNode);

    }
    {
        BlogContentRequest data = null;
        try {
            data = new ObjectMapper().readValue(jsonString, BlogContentRequest.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        System.out.println(data);

        blogContentService.createBlogContent(blogContentRequest);

    }

    // if you use @GetMapping("/get) then it will take the path as /api/products/get
//    @GetMapping
//    @ResponseStatus(HttpStatus.OK)
//    List<ProductResponse> getAllProduct()
//    {
//        return productService.getAllProducts();
//    }




