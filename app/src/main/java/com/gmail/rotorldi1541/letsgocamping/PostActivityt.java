package com.gmail.rotorldi1541.letsgocamping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PostActivityt extends AppCompatActivity {
    ImageView iv;
    TextView tvTitle,tvMag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_activityt);
        tvTitle=findViewById(R.id.tv_title);
        tvMag=findViewById(R.id.tv_information);
        iv=findViewById(R.id.ivi);


        Intent intent=getIntent();

        tvTitle.setText(intent.getStringExtra("title"));
        iv.setImageResource(intent.getIntExtra("img",R.drawable.thumb_moana));
        tvMag.setText(intent.getStringExtra("mag"));


    }
}