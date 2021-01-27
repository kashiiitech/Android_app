package com.kashii.quranapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
ListView pdflistview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pdflistview=(ListView) findViewById(R.id.Surah_names);


        String [] pdffilenames={"Surah Ar Rehman","Surah Al Fajar","Surah Al Falaq","Surah Al Fatiha","Surah Al Hajrat"};


        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,pdffilenames)


        {
          //alt+insert


            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View View=super.getView(position, convertView, parent);
                TextView mytext=(TextView) View.findViewById(android.R.id.text1);


                return View;
            }
        };
        pdflistview.setAdapter(adapter);
    }
}