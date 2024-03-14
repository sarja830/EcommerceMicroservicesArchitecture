package com.example.product.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;


public class Content {
    private long time;
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

    // Getters and setters
    public Content() {}
}

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

@AllArgsConstructor
class Author {
    private PersonalInfo personal_info;
    @JsonProperty("_id")
    private String id;

    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    // Getters and setters
    public Author() {}
    public PersonalInfo getPersonal_info() {
        return personal_info;
    }
    public void setPersonal_info(PersonalInfo personal_Info) {
        this.personal_info = personal_Info;
    }
}

class PersonalInfo {
    private String fullname;
    private String username;
    @JsonProperty("profile_img")
    private String profileImg;
    public String getFullname() {
        return fullname;
    }
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getProfileImg() {
        return profileImg;
    }
    public void setProfileImg(String profileImg) {
        this.profileImg = profileImg;
    }
    public PersonalInfo(String fullname, String username, String profileImg) {
        this.fullname = fullname;
        this.username = username;
        this.profileImg = profileImg;
    }

    // Getters and setters
    public PersonalInfo() {}
}
