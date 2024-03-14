package com.example.product.dto;

import java.beans.JavaBean;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Blog {
    private Activity activity;
    // @JsonProperty("_id")
    private String _id;
    // @JsonProperty("blog_id")
    private String blog_id;
    private String title;
    private String banner;
    private String des;
    private List<Content> content;
    private List<String> tags;
    private Author author;
    private boolean draft;
    @JsonProperty("publishedAt")
    private String publishedAt;

    
    public Activity getActivity() {
        return activity;
    }
    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    
    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }
    public String getBlog_id() {
        return blog_id;
    }
    public void setBlog_id(String blog_id) {
        this.blog_id = blog_id;
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
    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
    public String getPublishedAt() {
        return publishedAt;
    }
    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }



    public Blog() {}

    public boolean isDraft() {
        return draft;
    }
    public void setDraft(boolean draft) {
        this.draft = draft;
    }

}

class Activity {
    @JsonProperty("total_likes")
    private int totalLikes;
    @JsonProperty("total_comments")
    private int totalComments;
    @JsonProperty("total_reads")
    private int totalReads;
    @JsonProperty("total_parent_comments")
    private int totalParentComments;

    public int getTotalLikes() {
        return totalLikes;
    }
    public void setTotalLikes(int totalLikes) {
        this.totalLikes = totalLikes;
    }
    public int getTotalComments() {
        return totalComments;
    }
    public void setTotalComments(int totalComments) {
        this.totalComments = totalComments;
    }
    public int getTotalReads() {
        return totalReads;
    }
    public void setTotalReads(int totalReads) {
        this.totalReads = totalReads;
    }
    public int getTotalParentComments() {
        return totalParentComments;
    }
    public void setTotalParentComments(int totalParentComments) {
        this.totalParentComments = totalParentComments;
    }
    public Activity(int totalLikes, int totalComments, int totalReads, int totalParentComments) {
        this.totalLikes = totalLikes;
        this.totalComments = totalComments;
        this.totalReads = totalReads;
        this.totalParentComments = totalParentComments;
    }

    public Activity() {}

    
}

// class Content {
//     private long time;
//     private List<Block> blocks;
//     private String version;
//     public long getTime() {
//         return time;
//     }
//     public void setTime(long time) {
//         this.time = time;
//     }
//     public List<Block> getBlocks() {
//         return blocks;
//     }
//     public void setBlocks(List<Block> blocks) {
//         this.blocks = blocks;
//     }
//     public String getVersion() {
//         return version;
//     }
//     public void setVersion(String version) {
//         this.version = version;
//     }
//     public Content(long time, List<Block> blocks, String version) {
//         this.time = time;
//         this.blocks = blocks;
//         this.version = version;
//     }

//     // Getters and setters
//     public Content() {}
// }

// class Block {
//     private String id;
//     private String type;
//     private Data data;
//     public String getId() {
//         return id;
//     }
//     public void setId(String id) {
//         this.id = id;
//     }
//     public String getType() {
//         return type;
//     }
//     public void setType(String type) {
//         this.type = type;
//     }
//     public Data getData() {
//         return data;
//     }
//     public void setData(Data data) {
//         this.data = data;
//     }
//     public Block(String id, String type, Data data) {
//         this.id = id;
//         this.type = type;
//         this.data = data;
//     }

//     // Getters and setters
//     public Block() {}
// }

// class Data {
//     private String text;

//     public String getText() {
//         return text;
//     }

//     public void setText(String text) {
//         this.text = text;
//     }

//     public Data(String text) {
//         this.text = text;
//     }

//     // Getters and setters
//     public Data() {}
// }

// class Author {
//     private PersonalInfo personalInfo;
//     @JsonProperty("_id")
//     private String id;
//     public PersonalInfo getPersonalInfo() {
//         return personalInfo;
//     }
//     public void setPersonalInfo(PersonalInfo personalInfo) {
//         this.personalInfo = personalInfo;
//     }
//     public String getId() {
//         return id;
//     }
//     public void setId(String id) {
//         this.id = id;
//     }
//     public Author(PersonalInfo personalInfo, String id) {
//         this.personalInfo = personalInfo;
//         this.id = id;
//     }

//     // Getters and setters
//     public Author() {}
// }

// class PersonalInfo {
//     private String fullname;
//     private String username;
//     @JsonProperty("profile_img")
//     private String profileImg;
//     public String getFullname() {
//         return fullname;
//     }
//     public void setFullname(String fullname) {
//         this.fullname = fullname;
//     }
//     public String getUsername() {
//         return username;
//     }
//     public void setUsername(String username) {
//         this.username = username;
//     }
//     public String getProfileImg() {
//         return profileImg;
//     }
//     public void setProfileImg(String profileImg) {
//         this.profileImg = profileImg;
//     }
//     public PersonalInfo(String fullname, String username, String profileImg) {
//         this.fullname = fullname;
//         this.username = username;
//         this.profileImg = profileImg;
//     }

//     // Getters and setters
//     public PersonalInfo() {}
// }
