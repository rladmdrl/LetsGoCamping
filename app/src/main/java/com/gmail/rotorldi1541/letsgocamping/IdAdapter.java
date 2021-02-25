package com.gmail.rotorldi1541.letsgocamping;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class IdAdapter extends RecyclerView.Adapter<IdAdapter.VHV> {
    Context context;
    ArrayList<IdData> datas;

    public IdAdapter(Context context, ArrayList<IdData> datas) {
        this.context = context;
        this.datas = datas;
    }

    @NonNull
    @Override
    public VHV onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View itemView=inflater.inflate(R.layout.id_item,parent,false);
        VHV holder=new VHV(itemView);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull VHV holder, int position) {
        VHV vh=(VHV)holder;
        IdData idData=datas.get(position);
        vh.num.setText(idData.getNum());
        vh.ids.setText(idData.getIds());
        vh.data.setText(idData.getData());
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }
    class VHV extends RecyclerView.ViewHolder{
        TextView num;
        TextView ids;
        TextView data;

        public VHV(@NonNull View itemView) {
            super(itemView);
            num=itemView.findViewById(R.id.tv_num);
            ids=itemView.findViewById(R.id.tv_ids);
            data=itemView.findViewById(R.id.tv_data);
        }
    }
}
