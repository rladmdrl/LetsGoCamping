package com.gmail.rotorldi1541.letsgocamping;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.VH> {
    Context context;
    ArrayList<MainData> datas;

    public MainAdapter(Context context, ArrayList<MainData> datas) {
        this.context = context;
        this.datas = datas;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View itemView=inflater.inflate(R.layout.item,parent,false);
        VH holder=new VH(itemView);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        VH vh=(VH)holder;
        MainData data=datas.get(position);
        vh.img.setImageResource(data.getImg());
        vh.title.setText(data.getTitle());
        vh.mag.setText(data.getMag());
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }
    class VH extends RecyclerView.ViewHolder{
        ImageView img;
        TextView title;
        TextView mag;

        public VH(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.imageView);
            title=itemView.findViewById(R.id.textView1);
            mag=itemView.findViewById(R.id.textView2);

            itemView.setClickable(true);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    }

            });


        }
    }
}
