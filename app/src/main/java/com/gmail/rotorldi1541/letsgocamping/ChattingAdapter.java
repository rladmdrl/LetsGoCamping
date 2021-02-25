package com.gmail.rotorldi1541.letsgocamping;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ChattingAdapter extends RecyclerView.Adapter<ChattingAdapter.CVH> {
    Context context;
    ArrayList<ChattingData> list;

    public ChattingAdapter(Context context, ArrayList<ChattingData> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public CVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View itemView=inflater.inflate(R.layout.chatting_item,parent,false);
        CVH holder=new CVH(itemView);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CVH holder, int position) {
        CVH cvh=(CVH)holder;
        ChattingData data=list.get(position);
        cvh.tvName.setText(data.getName());
        cvh.tvMag.setText(data.getMag());
        cvh.tvDate.setText(data.getDate());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    class CVH extends RecyclerView.ViewHolder{
        TextView tvName,tvMag,tvDate;

        public CVH(@NonNull View itemView) {
            super(itemView);

            tvName=itemView.findViewById(R.id.tv_chatting_name);
            tvMag=itemView.findViewById(R.id.tv_chatting_mag);
            tvDate=itemView.findViewById(R.id.tv_chatting_date);

        }
    }
}
