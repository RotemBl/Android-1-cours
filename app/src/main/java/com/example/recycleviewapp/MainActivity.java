package com.example.recycleviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recycleView;
    private LinearLayoutManager layoutManager;

    private ArrayList<DataModle> dataSet = null;
    private CustumeAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycleView = findViewById(R.id.res);
        layoutManager = new LinearLayoutManager( this);
        recycleView.setLayoutManager(layoutManager);
        dataSet = new ArrayList<>();

        recycleView.setItemAnimator(new DefaultItemAnimator());

        for(int i = 0; i<MtData.drowableArray.length; i++)
        {
            dataSet.add(new DataModle(
                    MtData.nameArray[i],
                    MtData.descriptionArray[i],
                    MtData.drowableArray[i]

            ));
        }

        adapter = new CustumeAdapter(dataSet);
        recycleView.setAdapter(adapter);





    }
}