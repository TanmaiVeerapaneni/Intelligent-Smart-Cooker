package com.example.mini;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView rice;
    CardView Sambar;
    CardView tomatorice;
    CardView soup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rice = findViewById(R.id.cardrice);
        Sambar = findViewById(R.id.Sambarcard);
        tomatorice = findViewById(R.id.tomatoricecard);
        soup=findViewById(R.id.soupcard);

        rice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, Rice.class));

            }
        });

        Sambar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, Sambar.class));

            }
        });

        tomatorice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, tomatorice.class));

            }
        });

        soup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, soup.class));

            }
        });



    }
}
