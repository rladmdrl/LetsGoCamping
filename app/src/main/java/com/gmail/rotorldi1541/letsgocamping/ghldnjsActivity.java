package com.gmail.rotorldi1541.letsgocamping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ghldnjsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ghldnjs);
    }

    public void mane2(View view) {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}