package com.example.viewmodelapp;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {
    private int counter = 0;
    // When tha app first launched


    private MutableLiveData<Integer> countLiveData = new MutableLiveData<>();

    public MutableLiveData<Integer> getInitialCounter(){
        countLiveData.setValue(counter);
        return countLiveData;
    }

    // When the user clicks
    public void getCounter(){
        counter++;
        countLiveData.setValue(counter);
    }
}
