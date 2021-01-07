package com.company.lecture12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class SpinnerActivty extends AppCompatActivity {

    ArrayList<String> names;
    Spinner spinner;
    ArrayAdapter<String> adapter;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        spinner=findViewById(R.id.spiner1);
        btn=findViewById(R.id.btn5);
        names=new ArrayList<>();

        names.add("USA");
        names.add("Egypt");
        names.add("England");
        names.add("Germany");
        names.add("Italy");
        names.add("France");
        names.add("Brazil");
        names.add("China");
        names.add("Japan");
        names.add("Australia");


        adapter = new ArrayAdapter<>(SpinnerActivty.this,R.layout.custom_spin,R.id.txt10,names);

        spinner.setAdapter(adapter);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SpinnerActivty.this,GridActivty.class);
                startActivity(intent);
            }
        });


    }
}