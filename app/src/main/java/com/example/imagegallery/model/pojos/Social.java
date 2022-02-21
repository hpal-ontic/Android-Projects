package com.example.imagegallery.model.pojos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Social {

    @SerializedName("instagram_username")
    @Expose
    private String instagramUsername;
    @SerializedName("portfolio_url")
    @Expose
    private String portfolioUrl;
    @SerializedName("twitter_username")
    @Expose
    private String twitterUsername;
    @SerializedName("paypal_email")
    @Expose
    private Object paypalEmail;

    public String getInstagramUsername() {
        return instagramUsername;
    }

    public String getPortfolioUrl() {
        return portfolioUrl;
    }

    public String getTwitterUsername() {
        return twitterUsername;
    }

    public Object getPaypalEmail() {
        return paypalEmail;
    }
}
