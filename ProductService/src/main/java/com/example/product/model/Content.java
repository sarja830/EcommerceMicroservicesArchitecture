package com.example.product.model;

import java.util.List;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Content {
    private long time;
    // @JsonRawValue
    private List<Block> blocks;
    private String version;
    public long getTime() {
        return time;
    }
    public void setTime(long time) {
        this.time = time;
    }
    public List<Block> getBlocks() {
        return blocks;
    }
    public void setBlocks(List<Block> blocks) {
        this.blocks = blocks;
    }
    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }
    public Content(long time, List<Block> blocks, String version) {
        this.time = time;
        this.blocks = blocks;
        this.version = version;
    }

    
}

// @Data
// @NoArgsConstructor
// class Block {
//     private String id;
//     private String type;
//     private Map<String, Object> data;
// }

class Block {
    private String id;
    private String type;
    private Data data;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Data getData() {
        return data;
    }
    public void setData(Data data) {
        this.data = data;
    }
    public Block(String id, String type, Data data) {
        this.id = id;
        this.type = type;
        this.data = data;
    }

    // Getters and setters
    public Block() {}
}

class Data {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Data(String text) {
        this.text = text;
    }

    // Getters and setters
    public Data() {}
}
