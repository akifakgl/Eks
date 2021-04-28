package com.example.gulof.bitirme_1;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class bolum_3 extends AppCompatActivity {
    ImageView p1,p2,p3,p4,p5;
    int sayi=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_bolum_3);

        p1 = findViewById(R.id.uc1);
        p2 = findViewById(R.id.uc2);
        p3 = findViewById(R.id.uc3);
        p4 = findViewById(R.id.uc4);
        p5 = findViewById(R.id.uc5);



        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p1.setImageResource(R.drawable.ucun1k);
                sayi++;
                if(sayi==5){
                    Intent intent = new Intent(bolum_3.this,bolum_4.class);
                    startActivity(intent);
                }

            }
        });
        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p2.setImageResource(R.drawable.ucun1k);
                sayi++;
                if(sayi==5){
                    Intent intent = new Intent(bolum_3.this,bolum_4.class);
                    startActivity(intent);
                }

            }
        });
        p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p3.setImageResource(R.drawable.ucun1k);
                sayi++;
                if(sayi==5){
                    Intent intent = new Intent(bolum_3.this,bolum_4.class);
                    startActivity(intent);
                }

            }
        });
        p4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p4.setImageResource(R.drawable.ucun4k);
                sayi++;
                if(sayi==5){
                    Intent intent = new Intent(bolum_3.this,bolum_4.class);
                    startActivity(intent);
                }

            }
        });
        p5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p5.setImageResource(R.drawable.ucun5k);
                sayi++;
                if(sayi==5){
                    Intent intent = new Intent(bolum_3.this,bolum_4.class);
                    startActivity(intent);
                }

            }
        });

    }
}
