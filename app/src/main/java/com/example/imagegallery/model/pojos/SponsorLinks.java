package com.example.imagegallery.model.pojos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SponsorLinks {

    @SerializedName("self")
    @Expose
    private String self;
    @SerializedName("html")
    @Expose
    private String html;
    @SerializedName("photos")
    @Expose
    private String photos;
    @SerializedName("likes")
    @Expose
    private String likes;
    @SerializedName("portfolio")
    @Expose
    private String portfolio;
    @SerializedName("following")
    @Expose
    private String following;
    @SerializedName("followers")
    @Expose
    private String followers;

    public String getSelf() {
        return self;
    }

    public String getHtml() {
        return html;
    }

    public String getPhotos() {
        return photos;
    }

    public String getLikes() {
        return likes;
    }

    public String getPortfolio() {
        return portfolio;
    }

    public String getFollowing() {
        return following;
    }

    public String getFollowers() {
        return followers;
    }
}
