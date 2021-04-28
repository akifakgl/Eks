package com.example.gulof.bitirme_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class bolum_9 extends AppCompatActivity {

    ImageView sifir,bir,iki,uc,dort,bes,alti,yedi,sekiz,dokuz,on,onbir;
    int tiklanma=0,sayi=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_bolum_9);

        sifir=findViewById(R.id.sifir);
        bir=findViewById(R.id.bir);
        iki=findViewById(R.id.iki);
        uc=findViewById(R.id.uc);
        dort=findViewById(R.id.dort);
        bes=findViewById(R.id.bes);
        alti=findViewById(R.id.alti);
        yedi=findViewById(R.id.yedi);
        sekiz=findViewById(R.id.sekiz);
        dokuz=findViewById(R.id.dokuz);
        on=findViewById(R.id.on);
        onbir=findViewById(R.id.onbir);

        sifir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi++;
                if(sayi==1){
                    sifir.setImageResource(R.drawable.kararti);
                }
                else{
                    sifir.setImageResource(R.drawable.sagiki);
                    bir.setImageResource(R.drawable.asagiiki);
                    iki.setImageResource(R.drawable.asagiuc);
                    uc.setImageResource(R.drawable.asagiiki);
                    dort.setImageResource(R.drawable.solbir);
                    bes.setImageResource(R.drawable.solbir);
                    alti.setImageResource(R.drawable.sagbir);
                    yedi.setImageResource(R.drawable.sagbir);
                    sekiz.setImageResource(R.drawable.yukaribir);
                    dokuz.setImageResource(R.drawable.yukaribir);
                    on.setImageResource(R.drawable.yukariuc);
                    onbir.setImageResource(R.drawable.solbir);
                    sayi=0;
                }
            }
        });
        bir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi++;
                if(sayi==5){
                    bir.setImageResource(R.drawable.kararti);
                }
                else{
                    sifir.setImageResource(R.drawable.sagiki);
                    bir.setImageResource(R.drawable.asagiiki);
                    iki.setImageResource(R.drawable.asagiuc);
                    uc.setImageResource(R.drawable.asagiiki);
                    dort.setImageResource(R.drawable.solbir);
                    bes.setImageResource(R.drawable.solbir);
                    alti.setImageResource(R.drawable.sagbir);
                    yedi.setImageResource(R.drawable.sagbir);
                    sekiz.setImageResource(R.drawable.yukaribir);
                    dokuz.setImageResource(R.drawable.yukaribir);
                    on.setImageResource(R.drawable.yukariuc);
                    onbir.setImageResource(R.drawable.solbir);
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
                    sifir.setImageResource(R.drawable.sagiki);
                    bir.setImageResource(R.drawable.asagiiki);
                    iki.setImageResource(R.drawable.asagiuc);
                    uc.setImageResource(R.drawable.asagiiki);
                    dort.setImageResource(R.drawable.solbir);
                    bes.setImageResource(R.drawable.solbir);
                    alti.setImageResource(R.drawable.sagbir);
                    yedi.setImageResource(R.drawable.sagbir);
                    sekiz.setImageResource(R.drawable.yukaribir);
                    dokuz.setImageResource(R.drawable.yukaribir);
                    on.setImageResource(R.drawable.yukariuc);
                    onbir.setImageResource(R.drawable.solbir);
                    sayi=0;
                }
            }
        });
        uc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi++;
                if(sayi==10){
                    uc.setImageResource(R.drawable.kararti);
                }
                else{
                    sifir.setImageResource(R.drawable.sagiki);
                    bir.setImageResource(R.drawable.asagiiki);
                    iki.setImageResource(R.drawable.asagiuc);
                    uc.setImageResource(R.drawable.asagiiki);
                    dort.setImageResource(R.drawable.solbir);
                    bes.setImageResource(R.drawable.solbir);
                    alti.setImageResource(R.drawable.sagbir);
                    yedi.setImageResource(R.drawable.sagbir);
                    sekiz.setImageResource(R.drawable.yukaribir);
                    dokuz.setImageResource(R.drawable.yukaribir);
                    on.setImageResource(R.drawable.yukariuc);
                    onbir.setImageResource(R.drawable.solbir);
                    sayi=0;
                }
            }
        });
        dort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi++;
                if(sayi==9){
                    dort.setImageResource(R.drawable.kararti);
                }
                else{
                    sifir.setImageResource(R.drawable.sagiki);
                    bir.setImageResource(R.drawable.asagiiki);
                    iki.setImageResource(R.drawable.asagiuc);
                    uc.setImageResource(R.drawable.asagiiki);
                    dort.setImageResource(R.drawable.solbir);
                    bes.setImageResource(R.drawable.solbir);
                    alti.setImageResource(R.drawable.sagbir);
                    yedi.setImageResource(R.drawable.sagbir);
                    sekiz.setImageResource(R.drawable.yukaribir);
                    dokuz.setImageResource(R.drawable.yukaribir);
                    on.setImageResource(R.drawable.yukariuc);
                    onbir.setImageResource(R.drawable.solbir);
                    sayi=0;
                }
            }
        });
        bes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi++;
                if(sayi==8){
                    bes.setImageResource(R.drawable.kararti);
                }
                else{
                    sifir.setImageResource(R.drawable.sagiki);
                    bir.setImageResource(R.drawable.asagiiki);
                    iki.setImageResource(R.drawable.asagiuc);
                    uc.setImageResource(R.drawable.asagiiki);
                    dort.setImageResource(R.drawable.solbir);
                    bes.setImageResource(R.drawable.solbir);
                    alti.setImageResource(R.drawable.sagbir);
                    yedi.setImageResource(R.drawable.sagbir);
                    sekiz.setImageResource(R.drawable.yukaribir);
                    dokuz.setImageResource(R.drawable.yukaribir);
                    on.setImageResource(R.drawable.yukariuc);
                    onbir.setImageResource(R.drawable.solbir);
                    sayi=0;
                }
            }
        });
        alti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi++;
                if(sayi==12){
                    Intent intent = new Intent(bolum_9.this,bolum_10.class);
                    alti.setImageResource(R.drawable.kararti);
                    startActivity(intent);
                }
                else{
                    sifir.setImageResource(R.drawable.sagiki);
                    bir.setImageResource(R.drawable.asagiiki);
                    iki.setImageResource(R.drawable.asagiuc);
                    uc.setImageResource(R.drawable.asagiiki);
                    dort.setImageResource(R.drawable.solbir);
                    bes.setImageResource(R.drawable.solbir);
                    alti.setImageResource(R.drawable.sagbir);
                    yedi.setImageResource(R.drawable.sagbir);
                    sekiz.setImageResource(R.drawable.yukaribir);
                    dokuz.setImageResource(R.drawable.yukaribir);
                    on.setImageResource(R.drawable.yukariuc);
                    onbir.setImageResource(R.drawable.solbir);
                    sayi=0;
                }
            }
        });
        yedi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi++;
                if(sayi==6){
                    yedi.setImageResource(R.drawable.kararti);
                }
                else{
                    sifir.setImageResource(R.drawable.sagiki);
                    bir.setImageResource(R.drawable.asagiiki);
                    iki.setImageResource(R.drawable.asagiuc);
                    uc.setImageResource(R.drawable.asagiiki);
                    dort.setImageResource(R.drawable.solbir);
                    bes.setImageResource(R.drawable.solbir);
                    alti.setImageResource(R.drawable.sagbir);
                    yedi.setImageResource(R.drawable.sagbir);
                    sekiz.setImageResource(R.drawable.yukaribir);
                    dokuz.setImageResource(R.drawable.yukaribir);
                    on.setImageResource(R.drawable.yukariuc);
                    onbir.setImageResource(R.drawable.solbir);
                    sayi=0;
                }
            }
        });
        sekiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi++;
                if(sayi==7){
                    sekiz.setImageResource(R.drawable.kararti);
                }
                else{
                    sifir.setImageResource(R.drawable.sagiki);
                    bir.setImageResource(R.drawable.asagiiki);
                    iki.setImageResource(R.drawable.asagiuc);
                    uc.setImageResource(R.drawable.asagiiki);
                    dort.setImageResource(R.drawable.solbir);
                    bes.setImageResource(R.drawable.solbir);
                    alti.setImageResource(R.drawable.sagbir);
                    yedi.setImageResource(R.drawable.sagbir);
                    sekiz.setImageResource(R.drawable.yukaribir);
                    dokuz.setImageResource(R.drawable.yukaribir);
                    on.setImageResource(R.drawable.yukariuc);
                    onbir.setImageResource(R.drawable.solbir);
                    sayi=0;
                }
            }
        });
        dokuz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi++;
                if(sayi==11){
                    dokuz.setImageResource(R.drawable.kararti);
                }
                else{
                    sifir.setImageResource(R.drawable.sagiki);
                    bir.setImageResource(R.drawable.asagiiki);
                    iki.setImageResource(R.drawable.asagiuc);
                    uc.setImageResource(R.drawable.asagiiki);
                    dort.setImageResource(R.drawable.solbir);
                    bes.setImageResource(R.drawable.solbir);
                    alti.setImageResource(R.drawable.sagbir);
                    yedi.setImageResource(R.drawable.sagbir);
                    sekiz.setImageResource(R.drawable.yukaribir);
                    dokuz.setImageResource(R.drawable.yukaribir);
                    on.setImageResource(R.drawable.yukariuc);
                    onbir.setImageResource(R.drawable.solbir);
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
                    sifir.setImageResource(R.drawable.sagiki);
                    bir.setImageResource(R.drawable.asagiiki);
                    iki.setImageResource(R.drawable.asagiuc);
                    uc.setImageResource(R.drawable.asagiiki);
                    dort.setImageResource(R.drawable.solbir);
                    bes.setImageResource(R.drawable.solbir);
                    alti.setImageResource(R.drawable.sagbir);
                    yedi.setImageResource(R.drawable.sagbir);
                    sekiz.setImageResource(R.drawable.yukaribir);
                    dokuz.setImageResource(R.drawable.yukaribir);
                    on.setImageResource(R.drawable.yukariuc);
                    onbir.setImageResource(R.drawable.solbir);
                    sayi=0;
                }
            }
        });
        onbir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi++;
                if(sayi==3){
                    onbir.setImageResource(R.drawable.kararti);
                }
                else{
                    sifir.setImageResource(R.drawable.sagiki);
                    bir.setImageResource(R.drawable.asagiiki);
                    iki.setImageResource(R.drawable.asagiuc);
                    uc.setImageResource(R.drawable.asagiiki);
                    dort.setImageResource(R.drawable.solbir);
                    bes.setImageResource(R.drawable.solbir);
                    alti.setImageResource(R.drawable.sagbir);
                    yedi.setImageResource(R.drawable.sagbir);
                    sekiz.setImageResource(R.drawable.yukaribir);
                    dokuz.setImageResource(R.drawable.yukaribir);
                    on.setImageResource(R.drawable.yukariuc);
                    onbir.setImageResource(R.drawable.solbir);
                    sayi=0;
                }
            }
        });



    }
}
