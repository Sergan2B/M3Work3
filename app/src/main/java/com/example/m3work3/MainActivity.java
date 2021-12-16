package com.example.m3work3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recycleViewFirst;
    private ArrayList<String> names = new ArrayList<>();
    private ArrayList<String> number = new ArrayList<>();
    private AdapterPerson adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycleViewFirst = findViewById(R.id.recycleViewFirst);
        loadData();
        adapter = new AdapterPerson(names, number);
        recycleViewFirst.setAdapter(adapter);
    }
    private void loadData() {
        names.add("Adilet");
        number.add("+996755164578");
        names.add("Turakulov");
        number.add("+996755164578");
        names.add("Bakyt");
        number.add("+996755164578");
        names.add("John");
        number.add("+996705453326");
        names.add("Sergey");
        number.add("+996999455652");
        names.add("Almaz");
        number.add("+996776868645");
        names.add("Samat");
        number.add("+996555456502");
        names.add("Samarkand");
        number.add("+996705123366");
        names.add("Shah");
        number.add("+996755113695");
        names.add("Vidic");
        number.add("+996709232366");
        names.add("Yashin");
        number.add("+996999466253");
        names.add("Neymar");
        number.add("+996999485565");
        names.add("Messi");
        number.add("+996755451535");
        names.add("Ronaldo");
        number.add("+996755858585");
        names.add("Samir");

    }
}