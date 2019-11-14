package com.example.myappsui;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

public class ActivityControl extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.control_button);
    }
}
