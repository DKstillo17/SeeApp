package com.example.seeappbeta.ui.slideshow;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SlideshowViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SlideshowViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("En este espacio podrás encontrar diferentes canales de comunicación con nosotros");
    }

    public LiveData<String> getText() {
        return mText;
    }
}