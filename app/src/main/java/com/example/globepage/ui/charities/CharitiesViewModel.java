package com.example.globepage.ui.charities;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CharitiesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CharitiesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is ic_charities_blue fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}