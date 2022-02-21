package com.example.imagegallery.model.pojos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Sponsorship {

    @SerializedName("impression_urls")
    @Expose
    private List<String> impressionUrls;
    @SerializedName("tagline")
    @Expose
    private String tagline;
    @SerializedName("tagline_url")
    @Expose
    private String taglineUrl;
    @SerializedName("sponsor")
    @Expose
    private Sponsor sponsor;

    public List<String> getImpressionUrls() {
        return impressionUrls;
    }

    public String getTagline() {
        return tagline;
    }

    public String getTaglineUrl() {
        return taglineUrl;
    }

    public Sponsor getSponsor() {
        return sponsor;
    }
}
