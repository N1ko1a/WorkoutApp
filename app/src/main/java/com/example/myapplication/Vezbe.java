package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Vezbe extends AppCompatActivity {
    private ImageView ledja;
    private ImageView grudi;
    private ImageView biceps;
    private ImageView triceps;
    private ImageView noge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vezbe);

        ledja = (ImageView) findViewById(R.id.ledja);
        grudi = (ImageView) findViewById(R.id.grudi);
        biceps = (ImageView) findViewById(R.id.biceps);
        triceps = (ImageView) findViewById(R.id.triceps);
        noge = (ImageView) findViewById(R.id.noge);
        ledja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLedja();
            }
        });
        grudi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGrudi();
            }
        });
        biceps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBiceps();
            }
        });
        triceps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTriceps();
            }
        });
        noge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNoge();
            }
        });
    }

    public void openLedja(){
        Intent intent = new Intent(this,  Lejda.class);
        startActivity(intent);

    }

    public void openGrudi(){
        Intent intent = new Intent(this,  Grudi.class);
        startActivity(intent);

    }

    public void openBiceps(){
        Intent intent = new Intent(this,  Biceps.class);
        startActivity(intent);

    }

    public void openTriceps(){
        Intent intent = new Intent(this,  Triceps.class);
        startActivity(intent);

    }

    public void openNoge(){
        Intent intent = new Intent(this,  Noge.class);
        startActivity(intent);

    }
}