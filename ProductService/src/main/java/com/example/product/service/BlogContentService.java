package com.example.product.service;

import com.example.product.dto.BlogContentRequest;
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

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class BlogContentService {
    private final BlogContentRepository blogContentRepository;

    public void createBlogContent(JsonNode blogContentRequest) {
//    public void createBlogContent(BlogContentRequest blogContentRequest) {
        BlogContent blogContent = new BlogContent();
//        blogContent.builder()
//                .title(blogContentRequest.getTitle())
//                .banner(blogContentRequest.getBanner())
//                .des(blogContentRequest.getDes())
//                .content(blogContentRequest.getContent())
//                .tags(blogContentRequest.getTags())
//                .draft(blogContentRequest.isDraft())
//                .build();

        blogContentRepository.save(blogContent);
        log.info("BlogContent {} is created ", blogContent.getId());
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
