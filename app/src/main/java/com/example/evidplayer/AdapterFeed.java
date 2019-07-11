package com.example.evidplayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterFeed extends RecyclerView.Adapter<AdapterFeed.MyViewHolder> {

    Context context;
    ArrayList<feedModel> feedModelArrayList = new ArrayList<>();

    public AdapterFeed(Context context, ArrayList<feedModel> feedModelArrayList){

        this.context = context;
        this.feedModelArrayList = feedModelArrayList;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_feed, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final feedModel feedModel = feedModelArrayList.get(position);
    }

    @Override
    public int getItemCount() {
        return feedModelArrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        //
        TextView name, status, view, like, description;
        ImageView propic;
        VideoView postVid;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
