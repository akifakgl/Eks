package com.example.gulof.bitirme_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class bolum_14 extends AppCompatActivity {

    ImageView bir,iki,uc,dort,bes,alti,yedi,sekiz,dokuz,on,onbir,oniki;
    int sayi=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_bolum_14);


        bir = findViewById(R.id.abir);
        iki = findViewById(R.id.aiki);
        uc = findViewById(R.id.auc);
        dort = findViewById(R.id.adort);
        bes = findViewById(R.id.abes);
        alti = findViewById(R.id.aalti);
        yedi = findViewById(R.id.ayedi);
        sekiz = findViewById(R.id.asekiz);
        dokuz = findViewById(R.id.adokuz);
        on = findViewById(R.id.aon);
        onbir = findViewById(R.id.aonbir);
        oniki = findViewById(R.id.aoniki);






        bir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi++;
                if(sayi==1){
                    bir.setImageResource(R.drawable.kararti);
                }
                else{
                    bir.setImageResource(R.drawable.abir);
                    iki.setImageResource(R.drawable.aiki);
                    uc.setImageResource(R.drawable.auc);
                    dort.setImageResource(R.drawable.adort);
                    bes.setImageResource(R.drawable.abes);
                    alti.setImageResource(R.drawable.aalti);
                    yedi.setImageResource(R.drawable.ayedi);
                    sekiz.setImageResource(R.drawable.asekiz);
                    dokuz.setImageResource(R.drawable.adokuz);
                    on.setImageResource(R.drawable.aon);
                    onbir.setImageResource(R.drawable.aonbir);
                    oniki.setImageResource(R.drawable.aoniki);
                    sayi=0;
                }
            }
        });
        iki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi++;
                if(sayi==2){
                    iki.setImageResource(R.drawable.kararti);
                }
                else{
                    bir.setImageResource(R.drawable.abir);
                    iki.setImageResource(R.drawable.aiki);
                    uc.setImageResource(R.drawable.auc);
                    dort.setImageResource(R.drawable.adort);
                    bes.setImageResource(R.drawable.abes);
                    alti.setImageResource(R.drawable.aalti);
                    yedi.setImageResource(R.drawable.ayedi);
                    sekiz.setImageResource(R.drawable.asekiz);
                    dokuz.setImageResource(R.drawable.adokuz);
                    on.setImageResource(R.drawable.aon);
                    onbir.setImageResource(R.drawable.aonbir);
                    oniki.setImageResource(R.drawable.aoniki);
                    sayi=0;
                }
            }
        });
        uc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi++;
                if(sayi==3){
                    uc.setImageResource(R.drawable.kararti);
                }
                else{
                    bir.setImageResource(R.drawable.abir);
                    iki.setImageResource(R.drawable.aiki);
                    uc.setImageResource(R.drawable.auc);
                    dort.setImageResource(R.drawable.adort);
                    bes.setImageResource(R.drawable.abes);
                    alti.setImageResource(R.drawable.aalti);
                    yedi.setImageResource(R.drawable.ayedi);
                    sekiz.setImageResource(R.drawable.asekiz);
                    dokuz.setImageResource(R.drawable.adokuz);
                    on.setImageResource(R.drawable.aon);
                    onbir.setImageResource(R.drawable.aonbir);
                    oniki.setImageResource(R.drawable.aoniki);
                    sayi=0;
                }
            }
        });
        dort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi++;
                if(sayi==4){
                    dort.setImageResource(R.drawable.kararti);
                }
                else{
                    bir.setImageResource(R.drawable.abir);
                    iki.setImageResource(R.drawable.aiki);
                    uc.setImageResource(R.drawable.auc);
                    dort.setImageResource(R.drawable.adort);
                    bes.setImageResource(R.drawable.abes);
                    alti.setImageResource(R.drawable.aalti);
                    yedi.setImageResource(R.drawable.ayedi);
                    sekiz.setImageResource(R.drawable.asekiz);
                    dokuz.setImageResource(R.drawable.adokuz);
                    on.setImageResource(R.drawable.aon);
                    onbir.setImageResource(R.drawable.aonbir);
                    oniki.setImageResource(R.drawable.aoniki);
                    sayi=0;
                }
            }
        });
        bes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi++;
                if(sayi==5){
                    bes.setImageResource(R.drawable.kararti);
                }
                else{
                    bir.setImageResource(R.drawable.abir);
                    iki.setImageResource(R.drawable.aiki);
                    uc.setImageResource(R.drawable.auc);
                    dort.setImageResource(R.drawable.adort);
                    bes.setImageResource(R.drawable.abes);
                    alti.setImageResource(R.drawable.aalti);
                    yedi.setImageResource(R.drawable.ayedi);
                    sekiz.setImageResource(R.drawable.asekiz);
                    dokuz.setImageResource(R.drawable.adokuz);
                    on.setImageResource(R.drawable.aon);
                    onbir.setImageResource(R.drawable.aonbir);
                    oniki.setImageResource(R.drawable.aoniki);
                    sayi=0;
                }
            }
        });
        alti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi++;
                if(sayi==6){
                    alti.setImageResource(R.drawable.kararti);
                }
                else{
                    bir.setImageResource(R.drawable.abir);
                    iki.setImageResource(R.drawable.aiki);
                    uc.setImageResource(R.drawable.auc);
                    dort.setImageResource(R.drawable.adort);
                    bes.setImageResource(R.drawable.abes);
                    alti.setImageResource(R.drawable.aalti);
                    yedi.setImageResource(R.drawable.ayedi);
                    sekiz.setImageResource(R.drawable.asekiz);
                    dokuz.setImageResource(R.drawable.adokuz);
                    on.setImageResource(R.drawable.aon);
                    onbir.setImageResource(R.drawable.aonbir);
                    oniki.setImageResource(R.drawable.aoniki);
                    sayi=0;
                }
            }
        });
        yedi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi++;
                if(sayi==7){
                    yedi.setImageResource(R.drawable.kararti);
                }
                else{
                    bir.setImageResource(R.drawable.abir);
                    iki.setImageResource(R.drawable.aiki);
                    uc.setImageResource(R.drawable.auc);
                    dort.setImageResource(R.drawable.adort);
                    bes.setImageResource(R.drawable.abes);
                    alti.setImageResource(R.drawable.aalti);
                    yedi.setImageResource(R.drawable.ayedi);
                    sekiz.setImageResource(R.drawable.asekiz);
                    dokuz.setImageResource(R.drawable.adokuz);
                    on.setImageResource(R.drawable.aon);
                    onbir.setImageResource(R.drawable.aonbir);
                    oniki.setImageResource(R.drawable.aoniki);
                    sayi=0;
                }
            }
        });
        sekiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi++;
                if(sayi==8){
                    sekiz.setImageResource(R.drawable.kararti);
                }
                else{
                    bir.setImageResource(R.drawable.abir);
                    iki.setImageResource(R.drawable.aiki);
                    uc.setImageResource(R.drawable.auc);
                    dort.setImageResource(R.drawable.adort);
                    bes.setImageResource(R.drawable.abes);
                    alti.setImageResource(R.drawable.aalti);
                    yedi.setImageResource(R.drawable.ayedi);
                    sekiz.setImageResource(R.drawable.asekiz);
                    dokuz.setImageResource(R.drawable.adokuz);
                    on.setImageResource(R.drawable.aon);
                    onbir.setImageResource(R.drawable.aonbir);
                    oniki.setImageResource(R.drawable.aoniki);
                    sayi=0;
                }
            }
        });
        dokuz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi++;
                if(sayi==9){
                    dokuz.setImageResource(R.drawable.kararti);
                }
                else{
                    bir.setImageResource(R.drawable.abir);
                    iki.setImageResource(R.drawable.aiki);
                    uc.setImageResource(R.drawable.auc);
                    dort.setImageResource(R.drawable.adort);
                    bes.setImageResource(R.drawable.abes);
                    alti.setImageResource(R.drawable.aalti);
                    yedi.setImageResource(R.drawable.ayedi);
                    sekiz.setImageResource(R.drawable.asekiz);
                    dokuz.setImageResource(R.drawable.adokuz);
                    on.setImageResource(R.drawable.aon);
                    onbir.setImageResource(R.drawable.aonbir);
                    oniki.setImageResource(R.drawable.aoniki);
                    sayi=0;
                }
            }
        });
        on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi++;
                if(sayi==10){
                    on.setImageResource(R.drawable.kararti);
                }
                else{
                    bir.setImageResource(R.drawable.abir);
                    iki.setImageResource(R.drawable.aiki);
                    uc.setImageResource(R.drawable.auc);
                    dort.setImageResource(R.drawable.adort);
                    bes.setImageResource(R.drawable.abes);
                    alti.setImageResource(R.drawable.aalti);
                    yedi.setImageResource(R.drawable.ayedi);
                    sekiz.setImageResource(R.drawable.asekiz);
                    dokuz.setImageResource(R.drawable.adokuz);
                    on.setImageResource(R.drawable.aon);
                    onbir.setImageResource(R.drawable.aonbir);
                    oniki.setImageResource(R.drawable.aoniki);
                    sayi=0;
                }
            }
        });
        onbir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi++;
                if(sayi==11){
                    onbir.setImageResource(R.drawable.kararti);
                }
                else{
                    bir.setImageResource(R.drawable.abir);
                    iki.setImageResource(R.drawable.aiki);
                    uc.setImageResource(R.drawable.auc);
                    dort.setImageResource(R.drawable.adort);
                    bes.setImageResource(R.drawable.abes);
                    alti.setImageResource(R.drawable.aalti);
                    yedi.setImageResource(R.drawable.ayedi);
                    sekiz.setImageResource(R.drawable.asekiz);
                    dokuz.setImageResource(R.drawable.adokuz);
                    on.setImageResource(R.drawable.aon);
                    onbir.setImageResource(R.drawable.aonbir);
                    oniki.setImageResource(R.drawable.aoniki);
                    sayi=0;
                }
            }
        });
        oniki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi++;
                if(sayi==12){
                    oniki.setImageResource(R.drawable.kararti);
                    Intent intent = new Intent(bolum_14.this,bolum_15.class);
                    startActivity(intent);
                }
                else{
                    bir.setImageResource(R.drawable.abir);
                    iki.setImageResource(R.drawable.aiki);
                    uc.setImageResource(R.drawable.auc);
                    dort.setImageResource(R.drawable.adort);
                    bes.setImageResource(R.drawable.abes);
                    alti.setImageResource(R.drawable.aalti);
                    yedi.setImageResource(R.drawable.ayedi);
                    sekiz.setImageResource(R.drawable.asekiz);
                    dokuz.setImageResource(R.drawable.adokuz);
                    on.setImageResource(R.drawable.aon);
                    onbir.setImageResource(R.drawable.aonbir);
                    oniki.setImageResource(R.drawable.aoniki);
                    sayi=0;
                }
            }
        });
    }
}
