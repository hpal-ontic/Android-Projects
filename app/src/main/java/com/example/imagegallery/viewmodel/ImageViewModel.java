package com.example.imagegallery.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.example.imagegallery.model.pojos.Image;
import com.example.imagegallery.model.repositories.ImageRepository;

import java.util.List;

public class ImageViewModel extends AndroidViewModel {

    private final ImageRepository imageRepository;

    public ImageViewModel(@NonNull Application application) {
        super(application);
        this.imageRepository = ImageRepository.getInstance();
    }

    public MutableLiveData<List<Image>> getImagesData() {
        return imageRepository.getListOfImages();
    }
}
