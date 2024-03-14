package com.example.product.service;

import com.example.product.dto.Blog;
import com.example.product.dto.BlogContentRequest;
import com.example.product.dto.BlogResponse;
import com.example.product.dto.ProductRequest;
import com.example.product.dto.ProductResponse;
import com.example.product.model.BlogContent;
import com.example.product.model.Product;
import com.example.product.repository.BlogContentRepository;
import com.example.product.repository.ProductRepository;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class BlogContentService {
    private final BlogContentRepository blogContentRepository;

    public void createBlogContent(BlogResponse blogContentRequest) {
//    public void createBlogContent(BlogContentRequest blogContentRequest) {
        BlogContent blogContent = new BlogContent();
        Blog blog = blogContentRequest.getBlog();

        

       blogContent.builder()
               .title(blog.getTitle())
               .banner(blog.getBanner())
               .des(blog.getDes())
               .content(mapContent(blog.getContent()))
               .tags(blog.getTags())
               .draft(blog.isDraft())
               .build();

        blogContentRepository.save(blogContent);
        log.info("BlogContent {} is created ", blogContent.getId());
    }

    private List<com.example.product.model.Content>  mapContent(List<com.example.product.dto.Content> contentList) {
        List<com.example.product.model.Content> mappedContentList = new ArrayList<>();
    
        for (com.example.product.dto.Content originalContent : contentList) {
        // Create a new Content object for each originalContent
            com.example.product.model.Content mappedContent = new com.example.product.model.Content();
            // Copy the properties from originalContent to mappedContent
            mappedContent.setTime(originalContent.getTime());
            // mappedContent.setBlocks(originalContent.getBlocks());
            mappedContent.setVersion(originalContent.getVersion());
            
            // Add the mappedContent to the list
            mappedContentList.add(mappedContent);
    }
    
        return mappedContentList;
    }
}




//    public List<ProductResponse> getAllBlogs()
//    {
//            List<BlogContent> blogContents = blogContentRepository.findAll();

//            return blogContents.stream().map(this::mapToProductResponse).toList();

//    }
//    ProductResponse mapToProductResponse(Product product)
//    {
//        return ProductResponse.builder()
//                .id(product.getId())
//                .name(product.getName())
//                .description(product.getDescription())
//                .price(product.getPrice())
//                .build();
//    }


//}
