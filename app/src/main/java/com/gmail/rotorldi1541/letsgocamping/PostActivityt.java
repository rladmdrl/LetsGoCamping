package com.gmail.rotorldi1541.letsgocamping;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class PostActivityt extends AppCompatActivity {
    ImageView iv;
    TextView tvTitle,tvMag;
    EditText etMag;
    RecyclerView rv;
    ArrayList<ChattingData> list=new ArrayList<>();
    ChattingAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_activityt);
        list.add(new ChattingData("dmdrl","반가워요","2:16"));
        list.add(new ChattingData("민겅","안녕하세요","2:17"));
        list.add(new ChattingData("준구","반가워요","2:20"));
        list.add(new ChattingData("슬기","안녕하세여","2:21"));


        etMag=findViewById(R.id.et_chatting);
        tvTitle=findViewById(R.id.tv_title);
        tvMag=findViewById(R.id.tv_information);
        iv=findViewById(R.id.ivi);
        rv=findViewById(R.id.rv_chatting);
        adapter=new ChattingAdapter(this,list);
        rv.setAdapter(adapter);
        LinearLayoutManager layoutManager=new LinearLayoutManager(rv.getContext());
        rv.setLayoutManager(layoutManager);


        Intent intent=getIntent();

        tvTitle.setText(intent.getStringExtra("title"));
        iv.setImageResource(intent.getIntExtra("img",R.drawable.thumb_moana));
        tvMag.setText(intent.getStringExtra("mag"));
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);



    }

    public void clianMag(View view) {
        Toast.makeText(PostActivityt.this, "실행", Toast.LENGTH_SHORT).show();
        list.add(new ChattingData("name",etMag.getText().toString(),"2:30"));
        adapter.notifyDataSetChanged();
        rv.smoothScrollToPosition(list.size());
        etMag.setText(null);

    }
}