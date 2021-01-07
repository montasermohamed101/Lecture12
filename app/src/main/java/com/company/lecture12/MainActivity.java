package com.company.lecture12;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<String> names;
    ArrayAdapter<String> adapter;
    ImageView imageView;
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.list1);
        button=findViewById(R.id.btn1);

        names=new ArrayList<String>();
        names.add("Justin Mathews");
        names.add("Myla Micheal");
        names.add("Celia Ware");
        names.add("Stella Carter");
        names.add("Wendy Anthony");
        names.add("Agustin Casey");
        names.add("Carina Benson");
        names.add("Isaac Gonzales");
        names.add("Jagger Mills");
        names.add("Sofia Bush");

        adapter=new ArrayAdapter<>(MainActivity.this,R.layout.custom_row,R.id.txt,names);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,"Item "+i+" Clicked",Toast.LENGTH_SHORT).show();
            }
        });


        imageView=findViewById(R.id.img);
        editText=findViewById(R.id.edit);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                names.add(editText.getText().toString().trim());
                adapter.notifyDataSetChanged();
                editText.getText().clear();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SpinnerActivty.class);
                startActivity(intent);
            }
        });


    }
}