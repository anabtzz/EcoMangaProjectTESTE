package com.example.ecomanga;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class mangaeco extends AppCompatActivity {

    ImageView manga_man;
    ImageView manga_jojo;
    ImageView manga_one;


    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mangaeco);

        manga_man = findViewById(R.id.chainsaw);
        manga_jojo = findViewById(R.id.jojo);
        manga_one = findViewById(R.id.onepiece);

        View chainsaw = findViewById(R.id.chainsaw);
        manga_man.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        View jojo = findViewById(R.id.jojo);
        manga_man.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        View onepiece = findViewById(R.id.onepiece);
        manga_man.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }
}