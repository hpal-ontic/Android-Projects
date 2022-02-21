package com.example.imagegallery.model.pojos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class Sponsor {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("update_at")
    @Expose
    private Date updatedAt;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("first_name")
    @Expose
    private String firstName;
    @SerializedName("last_name")
    @Expose
    private String lastName;
    @SerializedName("twitter_username")
    @Expose
    private String twitterUsername;
    @SerializedName("portfolio_url")
    @Expose
    private String portfolioUrl;
    @SerializedName("bio")
    @Expose
    private String bio;
    @SerializedName("location")
    @Expose
    private Object location;
    @SerializedName("links")
    @Expose
    private SponsorLinks links;
    @SerializedName("profile_image")
    @Expose
    private ProfileImage profileImage;
    @SerializedName("instagram_username")
    @Expose
    private String instagramUsername;
    @SerializedName("total_collections")
    @Expose
    private Integer totalCollections;
    @SerializedName("total_likes")
    @Expose
    private Integer totalLikes;
    @SerializedName("total_photos")
    @Expose
    private Integer totalPhotos;
    @SerializedName("accepted_tos")
    @Expose
    private Boolean acceptedTos;
    @SerializedName("for_hire")
    @Expose
    private Boolean firHire;
    @SerializedName("social")
    @Expose
    private Social social;

    public String getId() {
        return id;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTwitterUsername() {
        return twitterUsername;
    }

    public String getPortfolioUrl() {
        return portfolioUrl;
    }

    public String getBio() {
        return bio;
    }

    public Object getLocation() {
        return location;
    }

    public SponsorLinks getLinks() {
        return links;
    }

    public ProfileImage getProfileImage() {
        return profileImage;
    }

    public String getInstagramUsername() {
        return instagramUsername;
    }

    public Integer getTotalCollections() {
        return totalCollections;
    }

    public Integer getTotalLikes() {
        return totalLikes;
    }

    public Integer getTotalPhotos() {
        return totalPhotos;
    }

    public Boolean getAcceptedTos() {
        return acceptedTos;
    }

    public Boolean getFirHire() {
        return firHire;
    }

    public Social getSocial() {
        return social;
    }
}
