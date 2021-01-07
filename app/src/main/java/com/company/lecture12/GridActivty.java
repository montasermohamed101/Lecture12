package com.company.lecture12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Spinner;

import java.util.ArrayList;

public class GridActivty extends AppCompatActivity {
    ArrayList<String> names;
    GridView gridView;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);
        gridView=findViewById(R.id.gridView);
        names=new ArrayList<>();

        names.add("Engineer");
        names.add("Doctor");
        names.add("Teacher");
        names.add("Designer");
        names.add("Nurse");
        names.add("Dentist");
        names.add("Therapist");

        adapter= new ArrayAdapter<>(GridActivty.this,R.layout.custom_grid,R.id.txt1,names);

        gridView.setAdapter(adapter);


    }
}