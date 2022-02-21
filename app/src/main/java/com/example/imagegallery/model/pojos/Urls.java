package com.example.imagegallery.model.pojos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Urls {

    @SerializedName("raw")
    @Expose
    private String raw;
    @SerializedName("full")
    @Expose
    private String full;
    @SerializedName("regular")
    @Expose
    private String regular;
    @SerializedName("small")
    @Expose
    private String small;
    @SerializedName("thumb")
    @Expose
    private String thumb;
    @SerializedName("small_s3")
    @Expose
    private String smallS3;

    public String getRaw() {
        return raw;
    }

    public String getFull() {
        return full;
    }

    public String getRegular() {
        return regular;
    }

    public String getSmall() {
        return small;
    }

    public String getThumb() {
        return thumb;
    }

    public String getSmallS3() {
        return smallS3;
    }
}
