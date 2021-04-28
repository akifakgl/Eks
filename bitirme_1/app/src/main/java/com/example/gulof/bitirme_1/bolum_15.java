package com.example.gulof.bitirme_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class bolum_15 extends AppCompatActivity {
    ImageView bir,iki,uc,dort,bes,alti,yedi,sekiz,dokuz,on,onbir,oniki,onuc,ondort,onbes;
    int tiklanma=0,dogruluk=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_bolum_15);


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
        onuc = findViewById(R.id.onuc);
        ondort = findViewById(R.id.ondort);
        onbes = findViewById(R.id.onbes);


        bir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tiklanma++;
                if(tiklanma==1||tiklanma==2){
                    bir.setImageResource(R.drawable.kararti);
                }
                else{
                    bir.setImageResource(R.drawable.aucgenbir);
                    iki.setImageResource(R.drawable.akareiki);
                    uc.setImageResource(R.drawable.abesgeniki);
                    dort.setImageResource(R.drawable.aaltigeniki);
                    bes.setImageResource(R.drawable.aucgeniki);
                    alti.setImageResource(R.drawable.aaltigenbir);
                    yedi.setImageResource(R.drawable.akarebir);
                    sekiz.setImageResource(R.drawable.abesgenbir);
                    dokuz.setImageResource(R.drawable.akarebir);
                    on.setImageResource(R.drawable.aaltigeniki);
                    onbir.setImageResource(R.drawable.abesgeniki);
                    oniki.setImageResource(R.drawable.aucgenbir);
                    onuc.setImageResource(R.drawable.abesgeniki);
                    ondort.setImageResource(R.drawable.aaltigenbir);
                    onbes.setImageResource(R.drawable.aucgeniki);
                    tiklanma=0;
                }
            }
        });

        iki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tiklanma++;
                if(tiklanma==7){
                    iki.setImageResource(R.drawable.kararti);
                }
                else{
                    bir.setImageResource(R.drawable.aucgenbir);
                    iki.setImageResource(R.drawable.akareiki);
                    uc.setImageResource(R.drawable.abesgeniki);
                    dort.setImageResource(R.drawable.aaltigeniki);
                    bes.setImageResource(R.drawable.aucgeniki);
                    alti.setImageResource(R.drawable.aaltigenbir);
                    yedi.setImageResource(R.drawable.akarebir);
                    sekiz.setImageResource(R.drawable.abesgenbir);
                    dokuz.setImageResource(R.drawable.akarebir);
                    on.setImageResource(R.drawable.aaltigeniki);
                    onbir.setImageResource(R.drawable.abesgeniki);
                    oniki.setImageResource(R.drawable.aucgenbir);
                    onuc.setImageResource(R.drawable.abesgeniki);
                    ondort.setImageResource(R.drawable.aaltigenbir);
                    onbes.setImageResource(R.drawable.aucgeniki);
                    tiklanma=0;
                }
            }
        });

        uc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tiklanma++;
                if(tiklanma==9||tiklanma==10 ||tiklanma==11){
                    uc.setImageResource(R.drawable.kararti);
                }
                else{
                    bir.setImageResource(R.drawable.aucgenbir);
                    iki.setImageResource(R.drawable.akareiki);
                    uc.setImageResource(R.drawable.abesgeniki);
                    dort.setImageResource(R.drawable.aaltigeniki);
                    bes.setImageResource(R.drawable.aucgeniki);
                    alti.setImageResource(R.drawable.aaltigenbir);
                    yedi.setImageResource(R.drawable.akarebir);
                    sekiz.setImageResource(R.drawable.abesgenbir);
                    dokuz.setImageResource(R.drawable.akarebir);
                    on.setImageResource(R.drawable.aaltigeniki);
                    onbir.setImageResource(R.drawable.abesgeniki);
                    oniki.setImageResource(R.drawable.aucgenbir);
                    onuc.setImageResource(R.drawable.abesgeniki);
                    ondort.setImageResource(R.drawable.aaltigenbir);
                    onbes.setImageResource(R.drawable.aucgeniki);
                    tiklanma=0;
                }
            }
        });

        dort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tiklanma++;
                if(tiklanma==14||tiklanma==15){
                    dort.setImageResource(R.drawable.kararti);
                    dogruluk++;
                    if(dogruluk==2){
                        Intent intent = new Intent(bolum_15.this,bolum_16.class);
                        startActivity(intent);
                    }

                }
                else{
                    bir.setImageResource(R.drawable.aucgenbir);
                    iki.setImageResource(R.drawable.akareiki);
                    uc.setImageResource(R.drawable.abesgeniki);
                    dort.setImageResource(R.drawable.aaltigeniki);
                    bes.setImageResource(R.drawable.aucgeniki);
                    alti.setImageResource(R.drawable.aaltigenbir);
                    yedi.setImageResource(R.drawable.akarebir);
                    sekiz.setImageResource(R.drawable.abesgenbir);
                    dokuz.setImageResource(R.drawable.akarebir);
                    on.setImageResource(R.drawable.aaltigeniki);
                    onbir.setImageResource(R.drawable.abesgeniki);
                    oniki.setImageResource(R.drawable.aucgenbir);
                    onuc.setImageResource(R.drawable.abesgeniki);
                    ondort.setImageResource(R.drawable.aaltigenbir);
                    onbes.setImageResource(R.drawable.aucgeniki);
                    tiklanma=0;
                }
            }
        });

        bes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tiklanma++;
                if(tiklanma==3||tiklanma==4){
                    bes.setImageResource(R.drawable.kararti);
                }
                else{
                    bir.setImageResource(R.drawable.aucgenbir);
                    iki.setImageResource(R.drawable.akareiki);
                    uc.setImageResource(R.drawable.abesgeniki);
                    dort.setImageResource(R.drawable.aaltigeniki);
                    bes.setImageResource(R.drawable.aucgeniki);
                    alti.setImageResource(R.drawable.aaltigenbir);
                    yedi.setImageResource(R.drawable.akarebir);
                    sekiz.setImageResource(R.drawable.abesgenbir);
                    dokuz.setImageResource(R.drawable.akarebir);
                    on.setImageResource(R.drawable.aaltigeniki);
                    onbir.setImageResource(R.drawable.abesgeniki);
                    oniki.setImageResource(R.drawable.aucgenbir);
                    onuc.setImageResource(R.drawable.abesgeniki);
                    ondort.setImageResource(R.drawable.aaltigenbir);
                    onbes.setImageResource(R.drawable.aucgeniki);
                    tiklanma=0;
                }
            }
        });

        alti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tiklanma++;
                if(tiklanma==12||tiklanma==13){
                    alti.setImageResource(R.drawable.kararti);
                }
                else{
                    bir.setImageResource(R.drawable.aucgenbir);
                    iki.setImageResource(R.drawable.akareiki);
                    uc.setImageResource(R.drawable.abesgeniki);
                    dort.setImageResource(R.drawable.aaltigeniki);
                    bes.setImageResource(R.drawable.aucgeniki);
                    alti.setImageResource(R.drawable.aaltigenbir);
                    yedi.setImageResource(R.drawable.akarebir);
                    sekiz.setImageResource(R.drawable.abesgenbir);
                    dokuz.setImageResource(R.drawable.akarebir);
                    on.setImageResource(R.drawable.aaltigeniki);
                    onbir.setImageResource(R.drawable.abesgeniki);
                    oniki.setImageResource(R.drawable.aucgenbir);
                    onuc.setImageResource(R.drawable.abesgeniki);
                    ondort.setImageResource(R.drawable.aaltigenbir);
                    onbes.setImageResource(R.drawable.aucgeniki);
                    tiklanma=0;
                }
            }
        });

        yedi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tiklanma++;
                if(tiklanma==5||tiklanma==6){
                    yedi.setImageResource(R.drawable.kararti);
                }
                else{
                    bir.setImageResource(R.drawable.aucgenbir);
                    iki.setImageResource(R.drawable.akareiki);
                    uc.setImageResource(R.drawable.abesgeniki);
                    dort.setImageResource(R.drawable.aaltigeniki);
                    bes.setImageResource(R.drawable.aucgeniki);
                    alti.setImageResource(R.drawable.aaltigenbir);
                    yedi.setImageResource(R.drawable.akarebir);
                    sekiz.setImageResource(R.drawable.abesgenbir);
                    dokuz.setImageResource(R.drawable.akarebir);
                    on.setImageResource(R.drawable.aaltigeniki);
                    onbir.setImageResource(R.drawable.abesgeniki);
                    oniki.setImageResource(R.drawable.aucgenbir);
                    onuc.setImageResource(R.drawable.abesgeniki);
                    ondort.setImageResource(R.drawable.aaltigenbir);
                    onbes.setImageResource(R.drawable.aucgeniki);
                    tiklanma=0;
                }
            }
        });

        sekiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tiklanma++;
                if(tiklanma==8){
                    sekiz.setImageResource(R.drawable.kararti);
                }
                else{
                    bir.setImageResource(R.drawable.aucgenbir);
                    iki.setImageResource(R.drawable.akareiki);
                    uc.setImageResource(R.drawable.abesgeniki);
                    dort.setImageResource(R.drawable.aaltigeniki);
                    bes.setImageResource(R.drawable.aucgeniki);
                    alti.setImageResource(R.drawable.aaltigenbir);
                    yedi.setImageResource(R.drawable.akarebir);
                    sekiz.setImageResource(R.drawable.abesgenbir);
                    dokuz.setImageResource(R.drawable.akarebir);
                    on.setImageResource(R.drawable.aaltigeniki);
                    onbir.setImageResource(R.drawable.abesgeniki);
                    oniki.setImageResource(R.drawable.aucgenbir);
                    onuc.setImageResource(R.drawable.abesgeniki);
                    ondort.setImageResource(R.drawable.aaltigenbir);
                    onbes.setImageResource(R.drawable.aucgeniki);
                    tiklanma=0;
                }
            }
        });

        dokuz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tiklanma++;
                if(tiklanma==5||tiklanma==6){
                    dokuz.setImageResource(R.drawable.kararti);
                }
                else{
                    bir.setImageResource(R.drawable.aucgenbir);
                    iki.setImageResource(R.drawable.akareiki);
                    uc.setImageResource(R.drawable.abesgeniki);
                    dort.setImageResource(R.drawable.aaltigeniki);
                    bes.setImageResource(R.drawable.aucgeniki);
                    alti.setImageResource(R.drawable.aaltigenbir);
                    yedi.setImageResource(R.drawable.akarebir);
                    sekiz.setImageResource(R.drawable.abesgenbir);
                    dokuz.setImageResource(R.drawable.akarebir);
                    on.setImageResource(R.drawable.aaltigeniki);
                    onbir.setImageResource(R.drawable.abesgeniki);
                    oniki.setImageResource(R.drawable.aucgenbir);
                    onuc.setImageResource(R.drawable.abesgeniki);
                    ondort.setImageResource(R.drawable.aaltigenbir);
                    onbes.setImageResource(R.drawable.aucgeniki);
                    tiklanma=0;
                }
            }
        });

        on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tiklanma++;
                if(tiklanma==14||tiklanma==15){
                    on.setImageResource(R.drawable.kararti);
                    dogruluk++;
                    if(dogruluk==2){
                        Intent intent = new Intent(bolum_15.this,bolum_16.class);
                        startActivity(intent);
                    }
                }
                else{
                    bir.setImageResource(R.drawable.aucgenbir);
                    iki.setImageResource(R.drawable.akareiki);
                    uc.setImageResource(R.drawable.abesgeniki);
                    dort.setImageResource(R.drawable.aaltigeniki);
                    bes.setImageResource(R.drawable.aucgeniki);
                    alti.setImageResource(R.drawable.aaltigenbir);
                    yedi.setImageResource(R.drawable.akarebir);
                    sekiz.setImageResource(R.drawable.abesgenbir);
                    dokuz.setImageResource(R.drawable.akarebir);
                    on.setImageResource(R.drawable.aaltigeniki);
                    onbir.setImageResource(R.drawable.abesgeniki);
                    oniki.setImageResource(R.drawable.aucgenbir);
                    onuc.setImageResource(R.drawable.abesgeniki);
                    ondort.setImageResource(R.drawable.aaltigenbir);
                    onbes.setImageResource(R.drawable.aucgeniki);
                    tiklanma=0;
                }
            }
        });

        onbir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tiklanma++;
                if(tiklanma==9||tiklanma==10 ||tiklanma==11){
                    onbir.setImageResource(R.drawable.kararti);
                }
                else{
                    bir.setImageResource(R.drawable.aucgenbir);
                    iki.setImageResource(R.drawable.akareiki);
                    uc.setImageResource(R.drawable.abesgeniki);
                    dort.setImageResource(R.drawable.aaltigeniki);
                    bes.setImageResource(R.drawable.aucgeniki);
                    alti.setImageResource(R.drawable.aaltigenbir);
                    yedi.setImageResource(R.drawable.akarebir);
                    sekiz.setImageResource(R.drawable.abesgenbir);
                    dokuz.setImageResource(R.drawable.akarebir);
                    on.setImageResource(R.drawable.aaltigeniki);
                    onbir.setImageResource(R.drawable.abesgeniki);
                    oniki.setImageResource(R.drawable.aucgenbir);
                    onuc.setImageResource(R.drawable.abesgeniki);
                    ondort.setImageResource(R.drawable.aaltigenbir);
                    onbes.setImageResource(R.drawable.aucgeniki);
                    tiklanma=0;
                }
            }
        });

        oniki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tiklanma++;
                if(tiklanma==1||tiklanma==2){
                    oniki.setImageResource(R.drawable.kararti);
                }
                else{
                    bir.setImageResource(R.drawable.aucgenbir);
                    iki.setImageResource(R.drawable.akareiki);
                    uc.setImageResource(R.drawable.abesgeniki);
                    dort.setImageResource(R.drawable.aaltigeniki);
                    bes.setImageResource(R.drawable.aucgeniki);
                    alti.setImageResource(R.drawable.aaltigenbir);
                    yedi.setImageResource(R.drawable.akarebir);
                    sekiz.setImageResource(R.drawable.abesgenbir);
                    dokuz.setImageResource(R.drawable.akarebir);
                    on.setImageResource(R.drawable.aaltigeniki);
                    onbir.setImageResource(R.drawable.abesgeniki);
                    oniki.setImageResource(R.drawable.aucgenbir);
                    onuc.setImageResource(R.drawable.abesgeniki);
                    ondort.setImageResource(R.drawable.aaltigenbir);
                    onbes.setImageResource(R.drawable.aucgeniki);
                    tiklanma=0;
                }
            }
        });

        onuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tiklanma++;
                if(tiklanma==9||tiklanma==10||tiklanma==11){
                    onuc.setImageResource(R.drawable.kararti);
                }
                else{
                    bir.setImageResource(R.drawable.aucgenbir);
                    iki.setImageResource(R.drawable.akareiki);
                    uc.setImageResource(R.drawable.abesgeniki);
                    dort.setImageResource(R.drawable.aaltigeniki);
                    bes.setImageResource(R.drawable.aucgeniki);
                    alti.setImageResource(R.drawable.aaltigenbir);
                    yedi.setImageResource(R.drawable.akarebir);
                    sekiz.setImageResource(R.drawable.abesgenbir);
                    dokuz.setImageResource(R.drawable.akarebir);
                    on.setImageResource(R.drawable.aaltigeniki);
                    onbir.setImageResource(R.drawable.abesgeniki);
                    oniki.setImageResource(R.drawable.aucgenbir);
                    onuc.setImageResource(R.drawable.abesgeniki);
                    ondort.setImageResource(R.drawable.aaltigenbir);
                    onbes.setImageResource(R.drawable.aucgeniki);
                    tiklanma=0;
                }
            }
        });

        ondort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tiklanma++;
                if(tiklanma==12||tiklanma==13){
                    ondort.setImageResource(R.drawable.kararti);
                }
                else{
                    bir.setImageResource(R.drawable.aucgenbir);
                    iki.setImageResource(R.drawable.akareiki);
                    uc.setImageResource(R.drawable.abesgeniki);
                    dort.setImageResource(R.drawable.aaltigeniki);
                    bes.setImageResource(R.drawable.aucgeniki);
                    alti.setImageResource(R.drawable.aaltigenbir);
                    yedi.setImageResource(R.drawable.akarebir);
                    sekiz.setImageResource(R.drawable.abesgenbir);
                    dokuz.setImageResource(R.drawable.akarebir);
                    on.setImageResource(R.drawable.aaltigeniki);
                    onbir.setImageResource(R.drawable.abesgeniki);
                    oniki.setImageResource(R.drawable.aucgenbir);
                    onuc.setImageResource(R.drawable.abesgeniki);
                    ondort.setImageResource(R.drawable.aaltigenbir);
                    onbes.setImageResource(R.drawable.aucgeniki);
                    tiklanma=0;
                }
            }
        });

        onbes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tiklanma++;
                if(tiklanma==3||tiklanma==4){
                    onbes.setImageResource(R.drawable.kararti);
                }
                else{
                    bir.setImageResource(R.drawable.aucgenbir);
                    iki.setImageResource(R.drawable.akareiki);
                    uc.setImageResource(R.drawable.abesgeniki);
                    dort.setImageResource(R.drawable.aaltigeniki);
                    bes.setImageResource(R.drawable.aucgeniki);
                    alti.setImageResource(R.drawable.aaltigenbir);
                    yedi.setImageResource(R.drawable.akarebir);
                    sekiz.setImageResource(R.drawable.abesgenbir);
                    dokuz.setImageResource(R.drawable.akarebir);
                    on.setImageResource(R.drawable.aaltigeniki);
                    onbir.setImageResource(R.drawable.abesgeniki);
                    oniki.setImageResource(R.drawable.aucgenbir);
                    onuc.setImageResource(R.drawable.abesgeniki);
                    ondort.setImageResource(R.drawable.aaltigenbir);
                    onbes.setImageResource(R.drawable.aucgeniki);
                    tiklanma=0;
                }
            }
        });




    }
}
