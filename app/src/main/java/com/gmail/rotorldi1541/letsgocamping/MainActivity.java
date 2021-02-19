package com.gmail.rotorldi1541.letsgocamping;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<MainData> datas=new ArrayList<>();
    RecyclerView recyclerView;
    MainAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datas.add(new MainData(R.drawable.tkwls,"산속","산속어느곳 풍경멋있네"));
        datas.add(new MainData(R.drawable.tkwls,"물속","물속어느곳 숨막혀"));
        datas.add(new MainData(R.drawable.tkwls,"하늘","하늘위 바람시원하네"));
        datas.add(new MainData(R.drawable.tkwls,"용암","용암 녹는다~~~~"));
        recyclerView=findViewById(R.id.recycler);
        adapter=new MainAdapter(this,datas);
        recyclerView.setAdapter(adapter);




    }

    public void Camping(View view) {
        //캠핑장
        datas.clear();
        datas.add(new MainData(R.drawable.tkwls,"산속","산속어느곳 풍경멋있네"));
        datas.add(new MainData(R.drawable.tkwls,"물속","물속어느곳 숨막혀"));
        datas.add(new MainData(R.drawable.tkwls,"하늘","하늘위 바람시원하네"));
        datas.add(new MainData(R.drawable.tkwls,"용암","용암 녹는다~~~~"));
        adapter.notifyDataSetChanged();
    }

    public void restaurant(View view) {
        //음식점
        datas.clear();
        datas.add(new MainData(R.drawable.dkqdp,"산속","산속어느곳 풍경멋있네"));
        datas.add(new MainData(R.drawable.dkqdp,"물속","물속어느곳 숨막혀"));
        datas.add(new MainData(R.drawable.dkqdp,"하늘","하늘위 바람시원하네"));
        datas.add(new MainData(R.drawable.dkqdp,"용암","용암 녹는다~~~~"));
        adapter.notifyDataSetChanged();

    }

    public void SuppliesStore(View view) {
        //캠핑용품점
        datas.clear();
        datas.add(new MainData(R.drawable.zoavld,"산속","산속어느곳 풍경멋있네"));
        datas.add(new MainData(R.drawable.zoavld,"물속","물속어느곳 숨막혀"));
        datas.add(new MainData(R.drawable.zoavld,"하늘","하늘위 바람시원하네"));
        datas.add(new MainData(R.drawable.zoavld,"용암","용암 녹는다~~~~"));
        adapter.notifyDataSetChanged();
    }

    public void parkingLot(View view) {
        //주차장
        datas.clear();
        datas.add(new MainData(R.drawable.thumb_moana,"산속","산속어느곳 풍경멋있네"));
        datas.add(new MainData(R.drawable.thumb_moana,"물속","물속어느곳 숨막혀"));
        datas.add(new MainData(R.drawable.thumb_moana,"하늘","하늘위 바람시원하네"));
        datas.add(new MainData(R.drawable.thumb_moana,"용암","용암 녹는다~~~~"));
        adapter.notifyDataSetChanged();
    }
}