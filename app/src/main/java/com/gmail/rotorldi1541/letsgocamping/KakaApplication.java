package com.gmail.rotorldi1541.letsgocamping;

import android.app.Application;

import com.kakao.sdk.common.KakaoSdk;

public class KakaApplication extends Application  {
    @Override
    public void onCreate() {
        super.onCreate();
        KakaoSdk.init(this,"bf854dfe7fc7995bac8d4b9687096e55");
    }
}
