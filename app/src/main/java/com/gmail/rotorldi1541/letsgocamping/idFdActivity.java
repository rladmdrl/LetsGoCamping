package com.gmail.rotorldi1541.letsgocamping;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class idFdActivity extends AppCompatActivity {
    ArrayList<IdData> datas=new ArrayList<>();
    RecyclerView recyclerView;
    IdAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_id_fd);

        datas.add(new IdData("1","rladmdrl","2000.01.04"));
        datas.add(new IdData("1","rladmdrl","2000.01.04"));
        datas.add(new IdData("1","rladmdrl","2000.01.04"));
        datas.add(new IdData("1","rladmdrl","2000.01.04"));
        datas.add(new IdData("1","rladmdrl","2000.01.04"));
        datas.add(new IdData("1","rladmdrl","2000.01.04"));
        datas.add(new IdData("1","rladmdrl","2000.01.04"));
        recyclerView=findViewById(R.id.id_recyclerview);
        adapter=new IdAdapter(this,datas);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    public void dlwjs(View view) {
        Intent intent=new Intent(this,FindIdPasswordActivity.class);
        startActivity(intent);
    }
}