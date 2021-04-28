package com.example.gulof.bitirme_1;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class bolum_17 extends AppCompatActivity {
ImageView numped0,numped1,numped2,numped3,numped4,numped5,numped6,numped7,numped8,numped9;
ImageView sifreg1,sifreg2,sifreg3,sifreg4,sifreg5;

int dogruluk=0,tiklanma=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_bolum_17);


        numped0=findViewById(R.id.numped0);
        numped1=findViewById(R.id.numped1);
        numped2=findViewById(R.id.numped2);
        numped3=findViewById(R.id.numped3);
        numped4=findViewById(R.id.numped4);
        numped5=findViewById(R.id.numped5);
        numped6=findViewById(R.id.numped6);
        numped7=findViewById(R.id.numped7);
        numped8=findViewById(R.id.numped8);
        numped9=findViewById(R.id.numped9);

        sifreg1=findViewById(R.id.sifreg1);
        sifreg2=findViewById(R.id.sifreg2);
        sifreg3=findViewById(R.id.sifreg3);
        sifreg4=findViewById(R.id.sifreg4);
        sifreg5=findViewById(R.id.sifreg5);








        numped0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numped0.setEnabled(false);

                numped0.setImageResource(R.drawable.numarakapali);
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        // Do something after 5s = 5000ms
                        numped0.setImageResource(R.drawable.numarasifir);

                    }
                }, 200);


                tiklanma++;
                dogruluk++;

                if(tiklanma==1){
                    sifreg1.setImageResource(R.drawable.numarayildiz);
                }
                else if (tiklanma==2){
                    sifreg2.setImageResource(R.drawable.numarayildiz);
                }
                else if (tiklanma==3){
                    sifreg3.setImageResource(R.drawable.numarayildiz);
                }
                else if (tiklanma==4){
                    sifreg4.setImageResource(R.drawable.numarayildiz);
                }
                else if (tiklanma==5){
                    sifreg5.setImageResource(R.drawable.numarayildiz);
                }
                else{
                    sifreg1.setImageResource(R.drawable.numarabosluk);
                    sifreg2.setImageResource(R.drawable.numarabosluk);
                    sifreg3.setImageResource(R.drawable.numarabosluk);
                    sifreg4.setImageResource(R.drawable.numarabosluk);
                    sifreg5.setImageResource(R.drawable.numarabosluk);

                }


                if(tiklanma==5){
                    if(dogruluk==5){
                        Intent intent=new Intent(bolum_17.this,bolum_18.class);
                        startActivity(intent);
                    }
                    else {
                        dogruluk=0;
                        tiklanma=0;
                        sifreg1.setImageResource(R.drawable.numarabosluk);
                        sifreg2.setImageResource(R.drawable.numarabosluk);
                        sifreg3.setImageResource(R.drawable.numarabosluk);
                        sifreg4.setImageResource(R.drawable.numarabosluk);
                        sifreg5.setImageResource(R.drawable.numarabosluk);
                        numped0.setEnabled(true);
                        numped1.setEnabled(true);
                        numped2.setEnabled(true);
                        numped3.setEnabled(true);
                        numped4.setEnabled(true);
                        numped5.setEnabled(true);
                        numped6.setEnabled(true);
                        numped7.setEnabled(true);
                        numped8.setEnabled(true);
                        numped9.setEnabled(true);

                    }
                }





            }
        });

        numped1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numped1.setEnabled(false);

                numped1.setImageResource(R.drawable.numarakapali);
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        // Do something after 5s = 5000ms
                        numped1.setImageResource(R.drawable.numarabir);

                    }
                }, 200);


                tiklanma++;
                if(tiklanma==1){
                    sifreg1.setImageResource(R.drawable.numarayildiz);
                }
                else if (tiklanma==2){
                    sifreg2.setImageResource(R.drawable.numarayildiz);
                }
                else if (tiklanma==3){
                    sifreg3.setImageResource(R.drawable.numarayildiz);
                }
                else if (tiklanma==4){
                    sifreg4.setImageResource(R.drawable.numarayildiz);
                }
                else if (tiklanma==5){
                    sifreg5.setImageResource(R.drawable.numarayildiz);
                }
                else{
                    sifreg1.setImageResource(R.drawable.numarabosluk);
                    sifreg2.setImageResource(R.drawable.numarabosluk);
                    sifreg3.setImageResource(R.drawable.numarabosluk);
                    sifreg4.setImageResource(R.drawable.numarabosluk);
                    sifreg5.setImageResource(R.drawable.numarabosluk);

                }


                if(tiklanma==5){
                    if(dogruluk==5){
                        Intent intent=new Intent(bolum_17.this,bolum_18.class);
                        startActivity(intent);
                    }
                    else {
                        dogruluk=0;
                        tiklanma=0;
                        sifreg1.setImageResource(R.drawable.numarabosluk);
                        sifreg2.setImageResource(R.drawable.numarabosluk);
                        sifreg3.setImageResource(R.drawable.numarabosluk);
                        sifreg4.setImageResource(R.drawable.numarabosluk);
                        sifreg5.setImageResource(R.drawable.numarabosluk);
                        numped0.setEnabled(true);
                        numped1.setEnabled(true);
                        numped2.setEnabled(true);
                        numped3.setEnabled(true);
                        numped4.setEnabled(true);
                        numped5.setEnabled(true);
                        numped6.setEnabled(true);
                        numped7.setEnabled(true);
                        numped8.setEnabled(true);
                        numped9.setEnabled(true);

                    }
                }






            }
        });

        numped2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numped2.setEnabled(false);
                numped2.setImageResource(R.drawable.numarakapali);
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        // Do something after 5s = 5000ms
                        numped2.setImageResource(R.drawable.numaraiki);

                    }
                }, 200);


                tiklanma++;
                dogruluk++;

                if(tiklanma==1){
                    sifreg1.setImageResource(R.drawable.numarayildiz);
                }
                else if (tiklanma==2){
                    sifreg2.setImageResource(R.drawable.numarayildiz);
                }
                else if (tiklanma==3){
                    sifreg3.setImageResource(R.drawable.numarayildiz);
                }
                else if (tiklanma==4){
                    sifreg4.setImageResource(R.drawable.numarayildiz);
                }
                else if (tiklanma==5){
                    sifreg5.setImageResource(R.drawable.numarayildiz);
                }
                else{
                    sifreg1.setImageResource(R.drawable.numarabosluk);
                    sifreg2.setImageResource(R.drawable.numarabosluk);
                    sifreg3.setImageResource(R.drawable.numarabosluk);
                    sifreg4.setImageResource(R.drawable.numarabosluk);
                    sifreg5.setImageResource(R.drawable.numarabosluk);

                }


                if(tiklanma==5){
                    if(dogruluk==5){
                        Intent intent=new Intent(bolum_17.this,bolum_18.class);
                        startActivity(intent);
                    }
                    else {
                        dogruluk=0;
                        tiklanma=0;
                        sifreg1.setImageResource(R.drawable.numarabosluk);
                        sifreg2.setImageResource(R.drawable.numarabosluk);
                        sifreg3.setImageResource(R.drawable.numarabosluk);
                        sifreg4.setImageResource(R.drawable.numarabosluk);
                        sifreg5.setImageResource(R.drawable.numarabosluk);
                        numped0.setEnabled(true);
                        numped1.setEnabled(true);
                        numped2.setEnabled(true);
                        numped3.setEnabled(true);
                        numped4.setEnabled(true);
                        numped5.setEnabled(true);
                        numped6.setEnabled(true);
                        numped7.setEnabled(true);
                        numped8.setEnabled(true);
                        numped9.setEnabled(true);

                    }
                }





            }
        });

        numped3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numped3.setEnabled(false);

                numped3.setImageResource(R.drawable.numarakapali);
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        // Do something after 5s = 5000ms
                        numped3.setImageResource(R.drawable.numarauc);

                    }
                }, 200);


                tiklanma++;

                if(tiklanma==1){
                    sifreg1.setImageResource(R.drawable.numarayildiz);
                }
                else if (tiklanma==2){
                    sifreg2.setImageResource(R.drawable.numarayildiz);
                }
                else if (tiklanma==3){
                    sifreg3.setImageResource(R.drawable.numarayildiz);
                }
                else if (tiklanma==4){
                    sifreg4.setImageResource(R.drawable.numarayildiz);
                }
                else if (tiklanma==5){
                    sifreg5.setImageResource(R.drawable.numarayildiz);
                }
                else{
                    sifreg1.setImageResource(R.drawable.numarabosluk);
                    sifreg2.setImageResource(R.drawable.numarabosluk);
                    sifreg3.setImageResource(R.drawable.numarabosluk);
                    sifreg4.setImageResource(R.drawable.numarabosluk);
                    sifreg5.setImageResource(R.drawable.numarabosluk);

                }


                if(tiklanma==5){
                    if(dogruluk==5){
                        Intent intent=new Intent(bolum_17.this,bolum_18.class);
                        startActivity(intent);
                    }
                    else {
                        dogruluk=0;
                        tiklanma=0;
                        sifreg1.setImageResource(R.drawable.numarabosluk);
                        sifreg2.setImageResource(R.drawable.numarabosluk);
                        sifreg3.setImageResource(R.drawable.numarabosluk);
                        sifreg4.setImageResource(R.drawable.numarabosluk);
                        sifreg5.setImageResource(R.drawable.numarabosluk);
                        numped0.setEnabled(true);
                        numped1.setEnabled(true);
                        numped2.setEnabled(true);
                        numped3.setEnabled(true);
                        numped4.setEnabled(true);
                        numped5.setEnabled(true);
                        numped6.setEnabled(true);
                        numped7.setEnabled(true);
                        numped8.setEnabled(true);
                        numped9.setEnabled(true);

                    }
                }






            }
        });

        numped4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numped4.setEnabled(false);

                numped4.setImageResource(R.drawable.numarakapali);
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        // Do something after 5s = 5000ms
                        numped4.setImageResource(R.drawable.numaradort);

                    }
                }, 200);


                tiklanma++;

                if(tiklanma==1){
                    sifreg1.setImageResource(R.drawable.numarayildiz);
                }
                else if (tiklanma==2){
                    sifreg2.setImageResource(R.drawable.numarayildiz);
                }
                else if (tiklanma==3){
                    sifreg3.setImageResource(R.drawable.numarayildiz);
                }
                else if (tiklanma==4){
                    sifreg4.setImageResource(R.drawable.numarayildiz);
                }
                else if (tiklanma==5){
                    sifreg5.setImageResource(R.drawable.numarayildiz);
                }
                else{
                    sifreg1.setImageResource(R.drawable.numarabosluk);
                    sifreg2.setImageResource(R.drawable.numarabosluk);
                    sifreg3.setImageResource(R.drawable.numarabosluk);
                    sifreg4.setImageResource(R.drawable.numarabosluk);
                    sifreg5.setImageResource(R.drawable.numarabosluk);

                }


                if(tiklanma==5){
                    if(dogruluk==5){
                        Intent intent=new Intent(bolum_17.this,bolum_18.class);
                        startActivity(intent);
                    }
                    else {
                        dogruluk=0;
                        tiklanma=0;
                        sifreg1.setImageResource(R.drawable.numarabosluk);
                        sifreg2.setImageResource(R.drawable.numarabosluk);
                        sifreg3.setImageResource(R.drawable.numarabosluk);
                        sifreg4.setImageResource(R.drawable.numarabosluk);
                        sifreg5.setImageResource(R.drawable.numarabosluk);
                        numped0.setEnabled(true);
                        numped1.setEnabled(true);
                        numped2.setEnabled(true);
                        numped3.setEnabled(true);
                        numped4.setEnabled(true);
                        numped5.setEnabled(true);
                        numped6.setEnabled(true);
                        numped7.setEnabled(true);
                        numped8.setEnabled(true);
                        numped9.setEnabled(true);

                    }
                }






            }
        });

        numped5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numped5.setEnabled(false);
                numped5.setImageResource(R.drawable.numarakapali);
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        // Do something after 5s = 5000ms
                        numped5.setImageResource(R.drawable.numarabes);

                    }
                }, 200);


                tiklanma++;
                dogruluk++;

                if(tiklanma==1){
                    sifreg1.setImageResource(R.drawable.numarayildiz);
                }
                else if (tiklanma==2){
                    sifreg2.setImageResource(R.drawable.numarayildiz);
                }
                else if (tiklanma==3){
                    sifreg3.setImageResource(R.drawable.numarayildiz);
                }
                else if (tiklanma==4){
                    sifreg4.setImageResource(R.drawable.numarayildiz);
                }
                else if (tiklanma==5){
                    sifreg5.setImageResource(R.drawable.numarayildiz);
                }
                else{
                    sifreg1.setImageResource(R.drawable.numarabosluk);
                    sifreg2.setImageResource(R.drawable.numarabosluk);
                    sifreg3.setImageResource(R.drawable.numarabosluk);
                    sifreg4.setImageResource(R.drawable.numarabosluk);
                    sifreg5.setImageResource(R.drawable.numarabosluk);

                }


                if(tiklanma==5){
                    if(dogruluk==5){
                        Intent intent=new Intent(bolum_17.this,bolum_18.class);
                        startActivity(intent);
                    }
                    else {
                        dogruluk=0;
                        tiklanma=0;
                        sifreg1.setImageResource(R.drawable.numarabosluk);
                        sifreg2.setImageResource(R.drawable.numarabosluk);
                        sifreg3.setImageResource(R.drawable.numarabosluk);
                        sifreg4.setImageResource(R.drawable.numarabosluk);
                        sifreg5.setImageResource(R.drawable.numarabosluk);
                        numped0.setEnabled(true);
                        numped1.setEnabled(true);
                        numped2.setEnabled(true);
                        numped3.setEnabled(true);
                        numped4.setEnabled(true);
                        numped5.setEnabled(true);
                        numped6.setEnabled(true);
                        numped7.setEnabled(true);
                        numped8.setEnabled(true);
                        numped9.setEnabled(true);

                    }
                }




            }
        });

        numped6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numped6.setEnabled(false);
                numped6.setImageResource(R.drawable.numarakapali);
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        // Do something after 5s = 5000ms
                        numped6.setImageResource(R.drawable.numaraalti);

                    }
                }, 200);


                tiklanma++;
                dogruluk++;

                if(tiklanma==1){
                    sifreg1.setImageResource(R.drawable.numarayildiz);
                }
                else if (tiklanma==2){
                    sifreg2.setImageResource(R.drawable.numarayildiz);
                }
                else if (tiklanma==3){
                    sifreg3.setImageResource(R.drawable.numarayildiz);
                }
                else if (tiklanma==4){
                    sifreg4.setImageResource(R.drawable.numarayildiz);
                }
                else if (tiklanma==5){
                    sifreg5.setImageResource(R.drawable.numarayildiz);
                }
                else{
                    sifreg1.setImageResource(R.drawable.numarabosluk);
                    sifreg2.setImageResource(R.drawable.numarabosluk);
                    sifreg3.setImageResource(R.drawable.numarabosluk);
                    sifreg4.setImageResource(R.drawable.numarabosluk);
                    sifreg5.setImageResource(R.drawable.numarabosluk);


                }


                if(tiklanma==5){
                    if(dogruluk==5){
                        Intent intent=new Intent(bolum_17.this,bolum_18.class);
                        startActivity(intent);
                    }
                    else {
                        dogruluk=0;
                        tiklanma=0;
                        sifreg1.setImageResource(R.drawable.numarabosluk);
                        sifreg2.setImageResource(R.drawable.numarabosluk);
                        sifreg3.setImageResource(R.drawable.numarabosluk);
                        sifreg4.setImageResource(R.drawable.numarabosluk);
                        sifreg5.setImageResource(R.drawable.numarabosluk);
                        numped0.setEnabled(true);
                        numped1.setEnabled(true);
                        numped2.setEnabled(true);
                        numped3.setEnabled(true);
                        numped4.setEnabled(true);
                        numped5.setEnabled(true);
                        numped6.setEnabled(true);
                        numped7.setEnabled(true);
                        numped8.setEnabled(true);
                        numped9.setEnabled(true);

                    }
                }






            }
        });

        numped7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numped7.setEnabled(false);
                numped7.setImageResource(R.drawable.numarakapali);
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        // Do something after 5s = 5000ms
                        numped7.setImageResource(R.drawable.numarayedi);

                    }
                }, 200);


                tiklanma++;

                if(tiklanma==1){
                    sifreg1.setImageResource(R.drawable.numarayildiz);
                }
                else if (tiklanma==2){
                    sifreg2.setImageResource(R.drawable.numarayildiz);
                }
                else if (tiklanma==3){
                    sifreg3.setImageResource(R.drawable.numarayildiz);
                }
                else if (tiklanma==4){
                    sifreg4.setImageResource(R.drawable.numarayildiz);
                }
                else if (tiklanma==5){
                    sifreg5.setImageResource(R.drawable.numarayildiz);
                }
                else{
                    sifreg1.setImageResource(R.drawable.numarabosluk);
                    sifreg2.setImageResource(R.drawable.numarabosluk);
                    sifreg3.setImageResource(R.drawable.numarabosluk);
                    sifreg4.setImageResource(R.drawable.numarabosluk);
                    sifreg5.setImageResource(R.drawable.numarabosluk);

                }


                if(tiklanma==5){
                    if(dogruluk==5){
                        Intent intent=new Intent(bolum_17.this,bolum_18.class);
                        startActivity(intent);
                    }
                    else {
                        dogruluk=0;
                        tiklanma=0;
                        sifreg1.setImageResource(R.drawable.numarabosluk);
                        sifreg2.setImageResource(R.drawable.numarabosluk);
                        sifreg3.setImageResource(R.drawable.numarabosluk);
                        sifreg4.setImageResource(R.drawable.numarabosluk);
                        sifreg5.setImageResource(R.drawable.numarabosluk);
                        numped0.setEnabled(true);
                        numped1.setEnabled(true);
                        numped2.setEnabled(true);
                        numped3.setEnabled(true);
                        numped4.setEnabled(true);
                        numped5.setEnabled(true);
                        numped6.setEnabled(true);
                        numped7.setEnabled(true);
                        numped8.setEnabled(true);
                        numped9.setEnabled(true);

                    }
                }





            }
        });

        numped8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numped8.setEnabled(false);
                numped8.setImageResource(R.drawable.numarakapali);
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        // Do something after 5s = 5000ms
                        numped8.setImageResource(R.drawable.numarasekiz);

                    }
                }, 200);


                tiklanma++;
                dogruluk++;

                if(tiklanma==1){
                    sifreg1.setImageResource(R.drawable.numarayildiz);
                }
                else if (tiklanma==2){
                    sifreg2.setImageResource(R.drawable.numarayildiz);
                }
                else if (tiklanma==3){
                    sifreg3.setImageResource(R.drawable.numarayildiz);
                }
                else if (tiklanma==4){
                    sifreg4.setImageResource(R.drawable.numarayildiz);
                }
                else if (tiklanma==5){
                    sifreg5.setImageResource(R.drawable.numarayildiz);
                }
                else{
                    sifreg1.setImageResource(R.drawable.numarabosluk);
                    sifreg2.setImageResource(R.drawable.numarabosluk);
                    sifreg3.setImageResource(R.drawable.numarabosluk);
                    sifreg4.setImageResource(R.drawable.numarabosluk);
                    sifreg5.setImageResource(R.drawable.numarabosluk);


                }


                if(tiklanma==5){
                    if(dogruluk==5){
                        Intent intent=new Intent(bolum_17.this,bolum_18.class);
                        startActivity(intent);
                    }
                    else {
                        dogruluk=0;
                        tiklanma=0;
                        sifreg1.setImageResource(R.drawable.numarabosluk);
                        sifreg2.setImageResource(R.drawable.numarabosluk);
                        sifreg3.setImageResource(R.drawable.numarabosluk);
                        sifreg4.setImageResource(R.drawable.numarabosluk);
                        sifreg5.setImageResource(R.drawable.numarabosluk);
                        numped0.setEnabled(true);
                        numped1.setEnabled(true);
                        numped2.setEnabled(true);
                        numped3.setEnabled(true);
                        numped4.setEnabled(true);
                        numped5.setEnabled(true);
                        numped6.setEnabled(true);
                        numped7.setEnabled(true);
                        numped8.setEnabled(true);
                        numped9.setEnabled(true);

                    }
                }






            }
        });

        numped9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numped9.setEnabled(false);

                numped9.setImageResource(R.drawable.numarakapali);
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        // Do something after 5s = 5000ms
                        numped9.setImageResource(R.drawable.nuamradokuz);

                    }
                }, 200);


                tiklanma++;

                if(tiklanma==1){
                    sifreg1.setImageResource(R.drawable.numarayildiz);
                }
                else if (tiklanma==2){
                    sifreg2.setImageResource(R.drawable.numarayildiz);
                }
                else if (tiklanma==3){
                    sifreg3.setImageResource(R.drawable.numarayildiz);
                }
                else if (tiklanma==4){
                    sifreg4.setImageResource(R.drawable.numarayildiz);
                }
                else if (tiklanma==5){
                    sifreg5.setImageResource(R.drawable.numarayildiz);
                }
                else{
                    sifreg1.setImageResource(R.drawable.numarabosluk);
                    sifreg2.setImageResource(R.drawable.numarabosluk);
                    sifreg3.setImageResource(R.drawable.numarabosluk);
                    sifreg4.setImageResource(R.drawable.numarabosluk);
                    sifreg5.setImageResource(R.drawable.numarabosluk);

                }


                if(tiklanma==5){
                    if(dogruluk==5){
                        Intent intent=new Intent(bolum_17.this,bolum_18.class);
                        startActivity(intent);
                    }
                    else {
                        dogruluk=0;
                        tiklanma=0;
                        sifreg1.setImageResource(R.drawable.numarabosluk);
                        sifreg2.setImageResource(R.drawable.numarabosluk);
                        sifreg3.setImageResource(R.drawable.numarabosluk);
                        sifreg4.setImageResource(R.drawable.numarabosluk);
                        sifreg5.setImageResource(R.drawable.numarabosluk);
                        numped0.setEnabled(true);
                        numped1.setEnabled(true);
                        numped2.setEnabled(true);
                        numped3.setEnabled(true);
                        numped4.setEnabled(true);
                        numped5.setEnabled(true);
                        numped6.setEnabled(true);
                        numped7.setEnabled(true);
                        numped8.setEnabled(true);
                        numped9.setEnabled(true);

                    }
                }




            }
        });


    }
}
