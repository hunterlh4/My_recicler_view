package com.miempresa.myreciclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private List<Persona> personas;

    private void inicializarDatos(){
        personas = new ArrayList<>();
        personas.add(new Persona("alex","25 años de edad",R.drawable.a));
        personas.add(new Persona("jesus","52 años de edad",R.drawable.b));
        personas.add(new Persona("mario","10 años de edad",R.drawable.c));
        personas.add(new Persona("pedro","20 años de edad",R.drawable.d));
        personas.add(new Persona("javier","30 años de edad",R.drawable.e));
        personas.add(new Persona("romulo","40 años de edad",R.drawable.f));
        personas.add(new Persona("mauricio","50 años de edad",R.drawable.g));
        personas.add(new Persona("jose","60 años de edad",R.drawable.h));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView reciclerview = (RecyclerView)findViewById(R.id.rv);

        reciclerview.setHasFixedSize(true);

        LinearLayoutManager LinearLayoutManager= new LinearLayoutManager(getApplicationContext());
        reciclerview.setLayoutManager(LinearLayoutManager);


        inicializarDatos();
        RVAdapter rvAdapter = new RVAdapter(personas,getApplicationContext());
        reciclerview.setAdapter(rvAdapter);
    }
}