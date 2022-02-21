package com.example.imagegallery.model.networking;

import com.example.imagegallery.model.pojos.Image;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ImageDataService {

    @GET("/photos/?client_id=oDUoh3Icm9zz8e6suhMNvesMdYzWzZu-6jN0z2AsAFA")
    Call<List<Image>> getImages();
}
