package com.gmail.rotorldi1541.letsgocamping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.kakao.sdk.auth.LoginClient;
import com.kakao.sdk.auth.model.OAuthToken;
import com.kakao.sdk.common.util.Utility;
import com.kakao.sdk.user.UserApiClient;
import com.kakao.sdk.user.model.User;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public class IogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iog);

        String KeyHesh = Utility.INSTANCE.getKeyHash(this);
        Log.i("keyHash", KeyHesh);
    }

    public void idcktrl(View view) {
        //아이디 비밀번호 찾기
        Intent intent = new Intent(this, FindIdPasswordActivity.class);
        startActivity(intent);
    }

    public void djqfhem(View view) {
        //회원가입
        Intent intent = new Intent(this, ghldnjsActivity.class);
        startActivity(intent);
    }

    public void main(View view) {
        //메인가기
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void KaKalog(View view) {
        //카카오 계정 로그인하기
        LoginClient.getInstance().loginWithKakaoAccount(this, new Function2<OAuthToken, Throwable, Unit>(){

            @Override
            public Unit invoke(OAuthToken oAuthToken, Throwable throwable) {
                if (oAuthToken!=null){
                    Intent intent = new Intent(IogActivity.this, MainActivity.class);
                    startActivity(intent);
                }
                return null;
            }
        } );
    }
}