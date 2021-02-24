package com.gmail.rotorldi1541.letsgocamping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ghldnjsActivity extends AppCompatActivity {
    EditText etName,etNum,etEme,etId,etPwd,etPwd2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ghldnjs);
        etName=findViewById(R.id.et_name);
        etNum=findViewById(R.id.et_num);
        etEme=findViewById(R.id.et_eme);
        etId=findViewById(R.id.et_id);
        etPwd=findViewById(R.id.et_pass1);
        etPwd2=findViewById(R.id.et_pass2);
    }

    public void mane2(View view) {


        Intent intent=new Intent(this,IogActivity.class);
        startActivity(intent);
    }
}