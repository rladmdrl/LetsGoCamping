package com.gmail.rotorldi1541.letsgocamping;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FindIdPasswordActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_id_password);


    }

    public void FindIn(View view) {
        Intent intent=new Intent(this,idFdActivity.class);
        startActivity(intent);
    }

    public void PasswordSetUp(View view) {
        Intent intent=new Intent(this,PassdActivity.class);
        startActivity(intent);
    }
}