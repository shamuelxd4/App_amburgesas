package com.example.app_amburgesas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    ArrayList<VectorComidas> nombredelalista2 = new ArrayList();
    private ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        lv = (ListView) findViewById(R.id.listaComidas);

        nombredelalista2 = (ArrayList<VectorComidas> ) getIntent().getSerializableExtra("listaComidas");


    }






}