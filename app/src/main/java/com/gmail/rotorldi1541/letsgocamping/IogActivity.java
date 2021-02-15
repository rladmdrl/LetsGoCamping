package com.gmail.rotorldi1541.letsgocamping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iog);
    }

    public void idcktrl(View view) {
        //아이디 비밀번호 찾기
        Intent intent=new Intent(this,FindIdPasswordActivity.class);
        startActivity(intent);
    }

    public void djqfhem(View view) {
        //회원가입
        Intent intent=new Intent(this,ghldnjsActivity.class);
        startActivity(intent);
    }

    public void main(View view) {
        //메인가기
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}