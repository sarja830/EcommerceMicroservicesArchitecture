package com.example.product.model;


import com.fasterxml.jackson.annotation.JsonRawValue;
import lombok.AllArgsConstructor;
import lombok.Builder;
// import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

// this is specifically for mongodb
@Document(value = "product")
// @AllArgsConstructor
@NoArgsConstructor
@Builder
public class BlogContent {

    @Id
    private String id;
    private String title;
    private String banner;
    private String des;


    private List<Content> content;
    private List<String> tags;
    private boolean draft;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getBanner() {
        return banner;
    }
    public void setBanner(String banner) {
        this.banner = banner;
    }
    public String getDes() {
        return des;
    }
    public void setDes(String des) {
        this.des = des;
    }
    public List<Content> getContent() {
        return content;
    }
    public void setContent(List<Content> content) {
        this.content = content;
    }
    public List<String> getTags() {
        return tags;
    }
    public void setTags(List<String> tags) {
        this.tags = tags;
    }
    public boolean isDraft() {
        return draft;
    }
    public void setDraft(boolean draft) {
        this.draft = draft;
    }
    public BlogContent(String id, String title, String banner, String des, List<Content> content, List<String> tags,
            boolean draft) {
        this.id = id;
        this.title = title;
        this.banner = banner;
        this.des = des;
        this.content = content;
        this.tags = tags;
        this.draft = draft;
    }

    


}

