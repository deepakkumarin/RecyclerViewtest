package com.example.recyclerviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;

import Adapters.RecipeAdapter;
import Models.RecipeModel;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);

        ArrayList <RecipeModel> list = new ArrayList<>();

        list.add(new RecipeModel(R.drawable.food1 , "Burger"));
        list.add(new RecipeModel(R.drawable.food2 , "Burger"));
        list.add(new RecipeModel(R.drawable.food3 , "Burger"));
        list.add(new RecipeModel(R.drawable.food4 , "Burger"));
        list.add(new RecipeModel(R.drawable.food5 , "Burger"));
        list.add(new RecipeModel(R.drawable.food6, "Burger"));
        list.add(new RecipeModel(R.drawable.food7 , "Burger"));
        list.add(new RecipeModel(R.drawable.food8 , "Burger"));

        RecipeAdapter adapter = new RecipeAdapter(list ,this);
        recyclerView.setAdapter(adapter);

//        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.HORIZONTAL);
//        recyclerView.setLayoutManager(staggeredGridLayoutManager);

//        GridLayoutManager  gridLayoutManager =new GridLayoutManager(this,2);
//        recyclerView.setLayoutManager(gridLayoutManager);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

//        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true);
//        recyclerView.setLayoutManager(layoutManager);

    }
}