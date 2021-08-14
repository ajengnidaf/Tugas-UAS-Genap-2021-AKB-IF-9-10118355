package com.example.UAS_AKB_IF9_10118355;

// 08 Agustus 2021 - 10118355 - Siti Alawiah - IF 9

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Info extends AppCompatActivity {

    private  String title = "Info";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        setActionBarTitle(title);
    }
    private void setActionBarTitle(String title) {
        if (getSupportActionBar() !=null) {
            getSupportActionBar().setTitle(title);
        }
    }
}