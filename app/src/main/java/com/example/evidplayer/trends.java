package com.example.evidplayer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class trends extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<trendingModel> trendingModelArrayList = new ArrayList<>();
    AdapterTrending adapterTrending;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trends);

        recyclerView = (RecyclerView)findViewById(R.id.trendView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapterTrending = new AdapterTrending(this, trendingModelArrayList);
        recyclerView.setAdapter(adapterTrending);

        populateRecyclerView();


//
//        adapterFeed = new AdapterFeed(this, feedModelArrayList);
//        recyclerView.setAdapter(adapterFeed);
//
//        populateRecyclerView();


    }

    public void populateRecyclerView(){
        //trendingModel trendingModel = new trendingModel();
    }
}
