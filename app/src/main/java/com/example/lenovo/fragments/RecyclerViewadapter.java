package com.example.lenovo.fragments;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewadapter extends RecyclerView.Adapter <RecyclerViewadapter.MyViewHolder> {


    Context mcontext;
    List <contact> mdata;

    public RecyclerViewadapter(Context mcontext, List<contact> mdata) {
        this.mcontext = mcontext;
        this.mdata = mdata;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v;



        v = LayoutInflater.from(mcontext).inflate(R.layout.contact_list,viewGroup,false);
        MyViewHolder vholder= new MyViewHolder(v);
        return  vholder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        myViewHolder.tv_name.setText(mdata.get(i).getName());
        myViewHolder.tv_phone.setText(mdata.get(i).getPhone());
        myViewHolder.tv_img.setImageResource(mdata.get(i).getPhoto());

    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{



        private TextView tv_name;
        private TextView tv_phone;
        private ImageView tv_img;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_name=(TextView)itemView.findViewById(R.id.contact_name);
            tv_phone=(TextView)itemView.findViewById(R.id.phone_number);
            tv_img=(ImageView)itemView.findViewById(R.id.contactimage);
        }
    }
}
