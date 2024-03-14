package com.example.product.dto;


import com.example.product.model.BlogContent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

// for getters and Setters
@Data
// for builder method
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BlogContentRequest {

    private String id;
    private String title;
    private String banner;
    private String des;


    private Content content;
    private List<String> tags;
    private boolean draft;
}

@Data
// for builder method
@Builder
@NoArgsConstructor
@AllArgsConstructor
class Content {
    private long time;
    @JsonRawValue
    private String blocks;
    private String version;

    @JsonProperty("explanation")
    private void unpackBlocks(JsonNode blocks) {
        this.blocks = blocks.toString();
    }
}
