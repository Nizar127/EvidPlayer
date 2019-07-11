package com.example.evidplayer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Feed extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<feedModel> feedModelArrayList = new ArrayList<>();
    AdapterFeed adapterFeed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);

        recyclerView = (RecyclerView)findViewById(R.id.feedView);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapterFeed = new AdapterFeed(this, feedModelArrayList);
        recyclerView.setAdapter(adapterFeed);

        populateRecyclerView();



    }

    public void populateRecyclerView(){
        feedModel feedModel = new feedModel(1,5,2,R.drawable.lucy_pinder,5,5,"Lucy Pinder", "10 hours ago","yes");
    }
}
