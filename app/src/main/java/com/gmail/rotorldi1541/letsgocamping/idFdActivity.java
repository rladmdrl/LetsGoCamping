package com.gmail.rotorldi1541.letsgocamping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class idFdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_id_fd);
    }

    public void dlwjs(View view) {
        Intent intent=new Intent(this,FindIdPasswordActivity.class);
        startActivity(intent);
    }
}