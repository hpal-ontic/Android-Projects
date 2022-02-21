package com.example.imagegallery.model.pojos;

import com.example.imagegallery.model.pojos.Fashion;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TopicSubmissions {

    @SerializedName("fashion")
    @Expose
    private Fashion fashion;
}
