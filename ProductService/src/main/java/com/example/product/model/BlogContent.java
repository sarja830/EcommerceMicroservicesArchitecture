package com.example.product.model;


import com.fasterxml.jackson.annotation.JsonRawValue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

// this is specifically for mongodb
@Document(value = "product")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class BlogContent {

    @Id
    private String id;
    private String title;
    private String banner;
    private String des;


    private Content content;
    private List<String> tags;
    private boolean draft;



}
@Data
@NoArgsConstructor
class Content {
    private long time;
    @JsonRawValue
    private String blocks;
    private String version;
}

@Data
@NoArgsConstructor
class Block {
    private String id;
    private String type;
    private Map<String, Object> data;
}