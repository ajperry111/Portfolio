package com.example.navdrawerexploring;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TigerViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public TigerViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is tiger fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }

}