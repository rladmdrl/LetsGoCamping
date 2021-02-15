package com.gmail.rotorldi1541.letsgocamping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PassdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passd);
    }

    public void fhrmdls(View view) {
        //로그인화면

        Intent intent = new Intent(this, IogActivity.class);
        startActivity(intent);
    }
}