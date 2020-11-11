package com.example.recycler_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
List<khuyenmai> khuyenmais;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        khuyenmais= new ArrayList<>();
        khuyenmais.add(new khuyenmai("bgvnm","hhh",R.drawable.cgv));
        khuyenmais.add(new khuyenmai("bgvnm","hhh",R.drawable.cgv));
        khuyenmais.add(new khuyenmai("bgvnm","hhh",R.drawable.cgv));
        khuyenmais.add(new khuyenmai("bgvnm","hhh",R.drawable.cgv));
        khuyenmais.add(new khuyenmai("bgvnm","hhh",R.drawable.cgv));
        khuyenmais.add(new khuyenmai("bgvnm","hhh",R.drawable.cgv));
        khuyenmais.add(new khuyenmai("bgvnm","hhh",R.drawable.cgv));
        RecyclerView recycle = (RecyclerView)findViewById(R.id.recycle);
        WordAdapter adapter= new WordAdapter(this,khuyenmais);
        recycle.setLayoutManager(new GridLayoutManager(this,1));
        recycle.setAdapter(adapter);
    }
}