package com.mahmoud.dahdouh.demoproject;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Model> list;
    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyler);

        list = new ArrayList<>();
        list.add(new Model("Item " + list.size()));
        list.add(new Model("Item " + list.size()));
        list.add(new Model("Item " + list.size()));
        list.add(new Model("Item " + list.size()));
        list.add(new Model("Item " + list.size()));
        list.add(new Model("Item " + list.size()));
        list.add(new Model("Item " + list.size()));
        list.add(new Model("Item " + list.size()));
        list.add(new Model("Item " + list.size()));
        list.add(new Model("Item " + list.size()));
        list.add(new Model("Item " + list.size()));
        list.add(new Model("Item " + list.size()));
        list.add(new Model("Item " + list.size()));
        list.add(new Model("Item " + list.size()));
        list.add(new Model("Item " + list.size()));
        list.add(new Model("Item " + list.size()));
        list.add(new Model("Item " + list.size()));


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MyAdapter();
        adapter.setList(list);

        recyclerView.setAdapter(adapter);


    }
}
