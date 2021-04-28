package com.example.gulof.bitirme_1;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class bolum_7 extends AppCompatActivity {
    ImageView bir,iki,uc,dort,bes,alti,yedi,sekiz,dokuz,on,onbir,oniki;
    int sayi=0;
    View ekranrengi1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_bolum_7);

        bir = findViewById(R.id.bir);
        iki = findViewById(R.id.iki);
        uc = findViewById(R.id.uc);
        dort = findViewById(R.id.dort);
        bes = findViewById(R.id.bes);
        alti = findViewById(R.id.alti);
        yedi = findViewById(R.id.yedi);
        sekiz = findViewById(R.id.sekiz);
        dokuz = findViewById(R.id.dokuz);
        on = findViewById(R.id.on);
        onbir = findViewById(R.id.onbir);
        oniki = findViewById(R.id.oniki);






        bir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi++;
                if(sayi==8){
                    bir.setImageResource(R.drawable.kararti);
                }
                else{
                    bir.setImageResource(R.drawable.mayin);
                    iki.setImageResource(R.drawable.mayin);
                    uc.setImageResource(R.drawable.mayin);
                    dort.setImageResource(R.drawable.mayin);
                    bes.setImageResource(R.drawable.mayin);
                    alti.setImageResource(R.drawable.mayin);
                    yedi.setImageResource(R.drawable.mayin);
                    sekiz.setImageResource(R.drawable.mayin);
                    dokuz.setImageResource(R.drawable.mayin);
                    on.setImageResource(R.drawable.mayin);
                    onbir.setImageResource(R.drawable.mayin);
                    oniki.setImageResource(R.drawable.mayin);
                    sayi=0;
                }
            }
        });
        iki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi++;
                if(sayi==6){
                    iki.setImageResource(R.drawable.kararti);
                }
                else{
                    bir.setImageResource(R.drawable.mayin);
                    iki.setImageResource(R.drawable.mayin);
                    uc.setImageResource(R.drawable.mayin);
                    dort.setImageResource(R.drawable.mayin);
                    bes.setImageResource(R.drawable.mayin);
                    alti.setImageResource(R.drawable.mayin);
                    yedi.setImageResource(R.drawable.mayin);
                    sekiz.setImageResource(R.drawable.mayin);
                    dokuz.setImageResource(R.drawable.mayin);
                    on.setImageResource(R.drawable.mayin);
                    onbir.setImageResource(R.drawable.mayin);
                    oniki.setImageResource(R.drawable.mayin);
                    sayi=0;
                }
            }
        });
        uc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi++;
                if(sayi==2){
                    uc.setImageResource(R.drawable.kararti);
                }
                else{
                    bir.setImageResource(R.drawable.mayin);
                    iki.setImageResource(R.drawable.mayin);
                    uc.setImageResource(R.drawable.mayin);
                    dort.setImageResource(R.drawable.mayin);
                    bes.setImageResource(R.drawable.mayin);
                    alti.setImageResource(R.drawable.mayin);
                    yedi.setImageResource(R.drawable.mayin);
                    sekiz.setImageResource(R.drawable.mayin);
                    dokuz.setImageResource(R.drawable.mayin);
                    on.setImageResource(R.drawable.mayin);
                    onbir.setImageResource(R.drawable.mayin);
                    oniki.setImageResource(R.drawable.mayin);
                    sayi=0;
                }
            }
        });
        dort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi++;
                if(sayi==3){
                    dort.setImageResource(R.drawable.kararti);
                }
                else{
                    bir.setImageResource(R.drawable.mayin);
                    iki.setImageResource(R.drawable.mayin);
                    uc.setImageResource(R.drawable.mayin);
                    dort.setImageResource(R.drawable.mayin);
                    bes.setImageResource(R.drawable.mayin);
                    alti.setImageResource(R.drawable.mayin);
                    yedi.setImageResource(R.drawable.mayin);
                    sekiz.setImageResource(R.drawable.mayin);
                    dokuz.setImageResource(R.drawable.mayin);
                    on.setImageResource(R.drawable.mayin);
                    onbir.setImageResource(R.drawable.mayin);
                    oniki.setImageResource(R.drawable.mayin);
                    sayi=0;
                }
            }
        });
        bes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi++;
                if(sayi==10){
                    bes.setImageResource(R.drawable.kararti);
                }
                else{
                    bir.setImageResource(R.drawable.mayin);
                    iki.setImageResource(R.drawable.mayin);
                    uc.setImageResource(R.drawable.mayin);
                    dort.setImageResource(R.drawable.mayin);
                    bes.setImageResource(R.drawable.mayin);
                    alti.setImageResource(R.drawable.mayin);
                    yedi.setImageResource(R.drawable.mayin);
                    sekiz.setImageResource(R.drawable.mayin);
                    dokuz.setImageResource(R.drawable.mayin);
                    on.setImageResource(R.drawable.mayin);
                    onbir.setImageResource(R.drawable.mayin);
                    oniki.setImageResource(R.drawable.mayin);
                    sayi=0;
                }
            }
        });
        alti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi++;
                if(sayi==9){
                    alti.setImageResource(R.drawable.kararti);
                }
                else{
                    bir.setImageResource(R.drawable.mayin);
                    iki.setImageResource(R.drawable.mayin);
                    uc.setImageResource(R.drawable.mayin);
                    dort.setImageResource(R.drawable.mayin);
                    bes.setImageResource(R.drawable.mayin);
                    alti.setImageResource(R.drawable.mayin);
                    yedi.setImageResource(R.drawable.mayin);
                    sekiz.setImageResource(R.drawable.mayin);
                    dokuz.setImageResource(R.drawable.mayin);
                    on.setImageResource(R.drawable.mayin);
                    onbir.setImageResource(R.drawable.mayin);
                    oniki.setImageResource(R.drawable.mayin);
                    sayi=0;
                }
            }
        });
        yedi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi++;
                if(sayi==11){
                    yedi.setImageResource(R.drawable.kararti);
                }
                else{
                    bir.setImageResource(R.drawable.mayin);
                    iki.setImageResource(R.drawable.mayin);
                    uc.setImageResource(R.drawable.mayin);
                    dort.setImageResource(R.drawable.mayin);
                    bes.setImageResource(R.drawable.mayin);
                    alti.setImageResource(R.drawable.mayin);
                    yedi.setImageResource(R.drawable.mayin);
                    sekiz.setImageResource(R.drawable.mayin);
                    dokuz.setImageResource(R.drawable.mayin);
                    on.setImageResource(R.drawable.mayin);
                    onbir.setImageResource(R.drawable.mayin);
                    oniki.setImageResource(R.drawable.mayin);
                    sayi=0;
                }
            }
        });
        sekiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi++;
                if(sayi==12){
                    sekiz.setImageResource(R.drawable.kararti);
                    Intent intent = new Intent(bolum_7.this,bolum_8.class);
                    startActivity(intent);

                }
                else{
                    bir.setImageResource(R.drawable.mayin);
                    iki.setImageResource(R.drawable.mayin);
                    uc.setImageResource(R.drawable.mayin);
                    dort.setImageResource(R.drawable.mayin);
                    bes.setImageResource(R.drawable.mayin);
                    alti.setImageResource(R.drawable.mayin);
                    yedi.setImageResource(R.drawable.mayin);
                    sekiz.setImageResource(R.drawable.mayin);
                    dokuz.setImageResource(R.drawable.mayin);
                    on.setImageResource(R.drawable.mayin);
                    onbir.setImageResource(R.drawable.mayin);
                    oniki.setImageResource(R.drawable.mayin);
                    sayi=0;
                }
            }
        });
        dokuz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi++;
                if(sayi==7){
                    dokuz.setImageResource(R.drawable.kararti);
                }
                else{
                    bir.setImageResource(R.drawable.mayin);
                    iki.setImageResource(R.drawable.mayin);
                    uc.setImageResource(R.drawable.mayin);
                    dort.setImageResource(R.drawable.mayin);
                    bes.setImageResource(R.drawable.mayin);
                    alti.setImageResource(R.drawable.mayin);
                    yedi.setImageResource(R.drawable.mayin);
                    sekiz.setImageResource(R.drawable.mayin);
                    dokuz.setImageResource(R.drawable.mayin);
                    on.setImageResource(R.drawable.mayin);
                    onbir.setImageResource(R.drawable.mayin);
                    oniki.setImageResource(R.drawable.mayin);
                    sayi=0;
                }
            }
        });
        on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi++;
                if(sayi==4){
                    on.setImageResource(R.drawable.kararti);
                }
                else{
                    bir.setImageResource(R.drawable.mayin);
                    iki.setImageResource(R.drawable.mayin);
                    uc.setImageResource(R.drawable.mayin);
                    dort.setImageResource(R.drawable.mayin);
                    bes.setImageResource(R.drawable.mayin);
                    alti.setImageResource(R.drawable.mayin);
                    yedi.setImageResource(R.drawable.mayin);
                    sekiz.setImageResource(R.drawable.mayin);
                    dokuz.setImageResource(R.drawable.mayin);
                    on.setImageResource(R.drawable.mayin);
                    onbir.setImageResource(R.drawable.mayin);
                    oniki.setImageResource(R.drawable.mayin);
                    sayi=0;
                }
            }
        });
        onbir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi++;
                if(sayi==5){
                    onbir.setImageResource(R.drawable.kararti);
                }
                else{
                    bir.setImageResource(R.drawable.mayin);
                    iki.setImageResource(R.drawable.mayin);
                    uc.setImageResource(R.drawable.mayin);
                    dort.setImageResource(R.drawable.mayin);
                    bes.setImageResource(R.drawable.mayin);
                    alti.setImageResource(R.drawable.mayin);
                    yedi.setImageResource(R.drawable.mayin);
                    sekiz.setImageResource(R.drawable.mayin);
                    dokuz.setImageResource(R.drawable.mayin);
                    on.setImageResource(R.drawable.mayin);
                    onbir.setImageResource(R.drawable.mayin);
                    oniki.setImageResource(R.drawable.mayin);
                    sayi=0;
                }
            }
        });
        oniki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi++;
                if(sayi==1){
                    oniki.setImageResource(R.drawable.kararti);
                }
                else{
                    bir.setImageResource(R.drawable.mayin);
                    iki.setImageResource(R.drawable.mayin);
                    uc.setImageResource(R.drawable.mayin);
                    dort.setImageResource(R.drawable.mayin);
                    bes.setImageResource(R.drawable.mayin);
                    alti.setImageResource(R.drawable.mayin);
                    yedi.setImageResource(R.drawable.mayin);
                    sekiz.setImageResource(R.drawable.mayin);
                    dokuz.setImageResource(R.drawable.mayin);
                    on.setImageResource(R.drawable.mayin);
                    onbir.setImageResource(R.drawable.mayin);
                    oniki.setImageResource(R.drawable.mayin);
                    sayi=0;
                }
            }
        });





    }
}
