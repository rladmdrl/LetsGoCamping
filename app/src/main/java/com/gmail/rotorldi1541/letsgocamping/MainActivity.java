package com.gmail.rotorldi1541.letsgocamping;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Camping(View view) {
        //캠핑장
    }

    public void restaurant(View view) {
        //음식점
    }

    public void SuppliesStore(View view) {
        //캠핑용품점
    }

    public void parkingLot(View view) {
        //주차장
    }
}