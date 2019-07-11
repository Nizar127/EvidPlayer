package com.example.evidplayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterTrending extends RecyclerView.Adapter<AdapterTrending.MyViewHolder> {

    Context context;
    ArrayList<trendingModel> trendingModelArrayList = new ArrayList<>();

    public AdapterTrending(Context context, ArrayList<trendingModel> trendingModelArrayList){

        this.context = context;
        this.trendingModelArrayList = trendingModelArrayList;
    }

    @NonNull
    @Override
    public AdapterTrending.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.trending_tab, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterTrending.MyViewHolder holder, int position) {
       final trendingModel trendingModel = trendingModelArrayList.get(position);
    }

    @Override
    public int getItemCount() {
        return trendingModelArrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        //view holder here

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
