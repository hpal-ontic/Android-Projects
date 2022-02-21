package com.example.imagegallery.model.pojos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Fashion {

    @SerializedName("status")
    @Expose
    private String status;

    public String getStatus() {
        return status;
    }
}
