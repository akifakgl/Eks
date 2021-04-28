package com.example.gulof.bitirme_1;

import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class bolum_16 extends AppCompatActivity {
ImageView basamak1,basamak2,basamak3,basamak4,basamak5,basamak6,basamak7;
int tiklanma=0,dogruluk=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_bolum_16);


        basamak1=findViewById(R.id.basamak1);
        basamak2=findViewById(R.id.basamak2);
        basamak3=findViewById(R.id.basamak3);
        basamak4=findViewById(R.id.basamak4);
        basamak5=findViewById(R.id.basamak5);
        basamak6=findViewById(R.id.basamak6);
        basamak7=findViewById(R.id.basamak7);






        basamak1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                basamak1.setImageResource(R.drawable.basamaktik);
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        // Do something after 5s = 5000ms
                        basamak1.setImageResource(R.drawable.sifrebasamakbir);
                    }
                }, 200);



                tiklanma++;
                if(tiklanma==2){
                    dogruluk++;
                }
                else{
                    dogruluk=0;
                    tiklanma=0;
                }

            }
        });

        basamak2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                basamak2.setImageResource(R.drawable.basamaktik);
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        // Do something after 5s = 5000ms
                        basamak2.setImageResource(R.drawable.sifrebosbasamak);
                    }
                }, 200);


                tiklanma++;
                if(tiklanma==5){
                    dogruluk++;
                }
                else{
                    dogruluk=0;
                    tiklanma=0;
                }

            }
        });

        basamak3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                basamak3.setImageResource(R.drawable.basamaktik);
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        // Do something after 5s = 5000ms
                        basamak3.setImageResource(R.drawable.sifrebosbasamak);
                    }
                }, 200);



                tiklanma++;
                if(tiklanma==1){
                    dogruluk++;
                }
                else{
                    dogruluk=0;
                    tiklanma=0;
                }

            }
        });

        basamak4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                basamak4.setImageResource(R.drawable.basamaktik);
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        // Do something after 5s = 5000ms
                        basamak4.setImageResource(R.drawable.sifrebosbasamak);
                    }
                }, 200);


                tiklanma++;
                if(tiklanma==4){
                    dogruluk++;
                }
                else{
                    dogruluk=0;
                    tiklanma=0;
                }

            }
        });

        basamak5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                basamak5.setImageResource(R.drawable.basamaktik);
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        // Do something after 5s = 5000ms
                        basamak5.setImageResource(R.drawable.sifrebosbasamak);
                    }
                }, 200);
                    dogruluk=0;
                    tiklanma=0;
            }
        });

        basamak6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                basamak6.setImageResource(R.drawable.basamaktik);
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        // Do something after 5s = 5000ms
                        basamak6.setImageResource(R.drawable.sifrebosbasamak);
                    }
                }, 200);

                tiklanma++;
                if(tiklanma==6){
                    dogruluk++;
                }
                else{
                    dogruluk=0;
                    tiklanma=0;
                }

                if(dogruluk==6){
                    Intent intent=new Intent(bolum_16.this,bolum_17.class);
                    startActivity(intent);
                }

            }
        });

        basamak7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                basamak7.setImageResource(R.drawable.basamaktik);
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        // Do something after 5s = 5000ms
                        basamak7.setImageResource(R.drawable.sifrebosbasamak);
                    }
                }, 200);


                tiklanma++;
                if(tiklanma==3){
                    dogruluk++;
                }
                else{
                    dogruluk=0;
                    tiklanma=0;
                }

            }
        });











    }
}
