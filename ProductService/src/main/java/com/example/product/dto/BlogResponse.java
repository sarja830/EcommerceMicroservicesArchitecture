package com.example.product.dto;


public class BlogResponse {
    private Blog blog;

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    @Override
    public String toString() {
        return "BlogResponse{" +
                "blog=" + blog +
                '}';
    }
}

