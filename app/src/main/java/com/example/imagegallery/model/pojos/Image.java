package com.example.imagegallery.model.pojos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Image {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("created_at")
    @Expose
    private Date createdAt;
    @SerializedName("updated_at")
    @Expose
    private Object updatedAt;
    @SerializedName("promoted_at")
    @Expose
    private Date promotedAt;
    @SerializedName("width")
    @Expose
    private Integer width;
    @SerializedName("height")
    @Expose
    private Integer height;
    @SerializedName("color")
    @Expose
    private String color;
    @SerializedName("blur_hash")
    @Expose
    private String blurHash;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("alt_description")
    @Expose
    private String altDescription;
    @SerializedName("urls")
    @Expose
    private Urls urls;
    @SerializedName("links")
    @Expose
    private Links links;
    @SerializedName("categories")
    @Expose
    private List<Object> categories;
    @SerializedName("likes")
    @Expose
    private Integer likes;
    @SerializedName("liked_by_user")
    @Expose
    private Boolean likedByUser;
    @SerializedName("current_user_collections")
    @Expose
    private List<Object> currentUserCollections;
    @SerializedName("sponsorship")
    @Expose
    private Sponsorship sponsorship;
    @SerializedName("topic_submissions")
    @Expose
    private TopicSubmissions topicSubmissions;
    @SerializedName("user")
    @Expose
    private User user;

    public String getId() {
        return id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Object getUpdatedAt() {
        return updatedAt;
    }

    public Date getPromotedAt() {
        return promotedAt;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public String getBlurHash() {
        return blurHash;
    }

    public String getDescription() {
        return description;
    }

    public String getAltDescription() {
        return altDescription;
    }

    public Urls getUrls() {
        return urls;
    }

    public Links getLinks() {
        return links;
    }

    public List<Object> getCategories() {
        return categories;
    }

    public Integer getLikes() {
        return likes;
    }

    public Boolean getLikedByUser() {
        return likedByUser;
    }

    public List<Object> getCurrentUserCollections() {
        return currentUserCollections;
    }

    public Sponsorship getSponsorship() {
        return sponsorship;
    }

    public TopicSubmissions getTopicSubmissions() {
        return topicSubmissions;
    }

    public User getUser() {
        return user;
    }
}
