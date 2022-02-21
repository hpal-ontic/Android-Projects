package com.example.imagegallery.model.repositories;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.example.imagegallery.model.networking.ImageDataService;
import com.example.imagegallery.model.networking.RetrofitClientInstance;
import com.example.imagegallery.model.pojos.Image;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ImageRepository {

    private static ImageDataService imageDataService;
    private static ImageRepository imageRepository;
    private final MutableLiveData<List<Image>> listOfImages = new MutableLiveData<>();

    public ImageRepository() {
        imageDataService = RetrofitClientInstance.getRetrofitInstance().create(ImageDataService.class);
    }

    public static ImageRepository getInstance() {
        if(imageRepository == null) {
            imageRepository = new ImageRepository();
        }
        return imageRepository;
    }

    public MutableLiveData<List<Image>> getListOfImages() {
        Call<List<Image>> call = imageDataService.getImages();

        call.enqueue(new Callback<List<Image>>() {
            @Override
            public void onResponse(Call<List<Image>> call, Response<List<Image>> response) {
                if(!response.isSuccessful()) {
                    Log.d("failure", "onResponse: " + response.code());
                    return;
                }
                listOfImages.setValue(response.body());
            }

            @Override
            public void onFailure(Call<List<Image>> call, Throwable t) {
                Log.d("failure", "onFailure: Failed from call.enqueue.onFailure");
            }
        });
        return listOfImages;
    }
}
