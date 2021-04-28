package com.example.gulof.bitirme_1;

import android.content.Intent;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class bolum_6 extends AppCompatActivity {
    ImageView a,h,t,l,ı,p,kararti1,kararti2,kararti3,kararti4;
    int dogruluk=0,tiklanma=1,sayi=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_bolum_6);

        a=findViewById(R.id.a);
        h=findViewById(R.id.h);
        t=findViewById(R.id.t);
        l=findViewById(R.id.l);
        ı=findViewById(R.id.I);
        p=findViewById(R.id.p);
        kararti1=findViewById(R.id.kararti1);
        kararti2=findViewById(R.id.kararti2);
        kararti3=findViewById(R.id.kararti3);
        kararti4=findViewById(R.id.kararti4);



        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi=1;
                if(tiklanma==1){
                    kararti1.setImageResource(R.drawable.a);
                    a.setImageResource(R.drawable.kararti);
                    tiklanma++;
                    if (sayi==1){
                        dogruluk++;
                    }
                }
               else if(tiklanma==2){
                    kararti2.setImageResource(R.drawable.a);
                    a.setImageResource(R.drawable.kararti);
                    tiklanma++;
                    if (sayi==4){
                        dogruluk++;
                    }
                }
               else if(tiklanma==3){
                    kararti3.setImageResource(R.drawable.a);
                    a.setImageResource(R.drawable.kararti);
                    tiklanma++;
                    if (sayi==3){
                        dogruluk++;
                    }
                }
              else  if(tiklanma==4){
                    kararti4.setImageResource(R.drawable.a);
                    a.setImageResource(R.drawable.kararti);
                    tiklanma++;
                    if (sayi==5){
                        dogruluk++;
                    }

                    if(dogruluk==4){
                        Intent ıntent=new Intent(bolum_6.this,bolum_7.class);
                        startActivity(ıntent);
                    }
                    else{
                        kararti1.setImageResource(R.drawable.kararti);
                        kararti2.setImageResource(R.drawable.kararti);
                        kararti3.setImageResource(R.drawable.kararti);
                        kararti4.setImageResource(R.drawable.kararti);
                        a.setImageResource(R.drawable.a);
                        h.setImageResource(R.drawable.h);
                        t.setImageResource(R.drawable.t);
                        l.setImageResource(R.drawable.l);
                        ı.setImageResource(R.drawable.k);
                        p.setImageResource(R.drawable.p);
                        dogruluk=0;
                        tiklanma=1;
                    }
                }
            }
        });
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi=2;
                if(tiklanma==1){
                    kararti1.setImageResource(R.drawable.h);
                    h.setImageResource(R.drawable.kararti);
                    tiklanma++;
                    if (sayi==4){
                        dogruluk++;
                    }
                }
                else if(tiklanma==2){
                    kararti2.setImageResource(R.drawable.h);
                    h.setImageResource(R.drawable.kararti);
                    tiklanma++;
                    if (sayi==4){
                        dogruluk++;
                    }
                }
                else if(tiklanma==3){
                    kararti3.setImageResource(R.drawable.h);
                    h.setImageResource(R.drawable.kararti);
                    tiklanma++;
                    if (sayi==3){
                        dogruluk++;
                    }
                }
                else  if(tiklanma==4){
                    kararti4.setImageResource(R.drawable.h);
                    h.setImageResource(R.drawable.kararti);
                    tiklanma++;
                    if (sayi==5){
                        dogruluk++;
                    }
                    if(dogruluk==4){
                        Intent ıntent=new Intent(bolum_6.this,bolum_7.class);
                        startActivity(ıntent);
                    }
                    else{
                        kararti1.setImageResource(R.drawable.kararti);
                        kararti2.setImageResource(R.drawable.kararti);
                        kararti3.setImageResource(R.drawable.kararti);
                        kararti4.setImageResource(R.drawable.kararti);
                        a.setImageResource(R.drawable.a);
                        h.setImageResource(R.drawable.h);
                        t.setImageResource(R.drawable.t);
                        l.setImageResource(R.drawable.l);
                        ı.setImageResource(R.drawable.k);
                        p.setImageResource(R.drawable.p);
                        dogruluk=0;
                        tiklanma=1;
                    }
                }
            }
        });
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi=3;
                if(tiklanma==1){
                    kararti1.setImageResource(R.drawable.t);
                    t.setImageResource(R.drawable.kararti);
                    tiklanma++;
                    if (sayi==3){
                        dogruluk++;
                    }
                }
                else if(tiklanma==2){
                    kararti2.setImageResource(R.drawable.t);
                    t.setImageResource(R.drawable.kararti);
                    tiklanma++;
                    if (sayi==4){
                        dogruluk++;
                    }
                }
                else if(tiklanma==3){
                    kararti3.setImageResource(R.drawable.t);
                    t.setImageResource(R.drawable.kararti);
                    tiklanma++;
                    if (sayi==3){
                        dogruluk++;
                    }
                }
                else  if(tiklanma==4){
                    kararti4.setImageResource(R.drawable.t);
                    t.setImageResource(R.drawable.kararti);
                    tiklanma++;
                    if (sayi==5){
                        dogruluk++;
                    }
                    if(dogruluk==4){
                        Intent ıntent=new Intent(bolum_6.this,bolum_7.class);
                        startActivity(ıntent);
                    }
                    else{
                        kararti1.setImageResource(R.drawable.kararti);
                        kararti2.setImageResource(R.drawable.kararti);
                        kararti3.setImageResource(R.drawable.kararti);
                        kararti4.setImageResource(R.drawable.kararti);
                        a.setImageResource(R.drawable.a);
                        h.setImageResource(R.drawable.h);
                        t.setImageResource(R.drawable.t);
                        l.setImageResource(R.drawable.l);
                        ı.setImageResource(R.drawable.k);
                        p.setImageResource(R.drawable.p);
                        dogruluk=0;
                        tiklanma=1;
                    }
                }
            }
        });
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi=4;
                if(tiklanma==1){
                    kararti1.setImageResource(R.drawable.l);
                    l.setImageResource(R.drawable.kararti);
                    tiklanma++;
                    if (sayi==1){
                        dogruluk++;
                    }
                }
                else if(tiklanma==2){
                    kararti2.setImageResource(R.drawable.l);
                    l.setImageResource(R.drawable.kararti);
                    tiklanma++;
                    if (sayi==4){
                        dogruluk++;
                    }
                }
                else if(tiklanma==3){
                    kararti3.setImageResource(R.drawable.l);
                    l.setImageResource(R.drawable.kararti);
                    tiklanma++;
                    if (sayi==3){
                        dogruluk++;
                    }
                }
                else  if(tiklanma==4){
                    kararti4.setImageResource(R.drawable.l);
                    l.setImageResource(R.drawable.kararti);
                    tiklanma++;
                    if (sayi==5){
                        dogruluk++;
                    }
                    if(dogruluk==4){
                        Intent ıntent=new Intent(bolum_6.this,bolum_7.class);
                        startActivity(ıntent);
                    }
                    else{
                        kararti1.setImageResource(R.drawable.kararti);
                        kararti2.setImageResource(R.drawable.kararti);
                        kararti3.setImageResource(R.drawable.kararti);
                        kararti4.setImageResource(R.drawable.kararti);
                        a.setImageResource(R.drawable.a);
                        h.setImageResource(R.drawable.h);
                        t.setImageResource(R.drawable.t);
                        l.setImageResource(R.drawable.l);
                        ı.setImageResource(R.drawable.k);
                        p.setImageResource(R.drawable.p);
                        dogruluk=0;
                        tiklanma=1;
                    }
                }
            }
        });
        ı.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi=5;
                if(tiklanma==1){
                    kararti1.setImageResource(R.drawable.k);
                    ı.setImageResource(R.drawable.kararti);
                    tiklanma++;
                    if (sayi==1){
                        dogruluk++;
                    }
                }
                else if(tiklanma==2){
                    kararti2.setImageResource(R.drawable.k);
                    ı.setImageResource(R.drawable.kararti);
                    tiklanma++;
                    if (sayi==4){
                        dogruluk++;
                    }
                }
                else if(tiklanma==3){
                    kararti3.setImageResource(R.drawable.k);
                    ı.setImageResource(R.drawable.kararti);
                    tiklanma++;
                    if (sayi==3){
                        dogruluk++;
                    }
                }
                else  if(tiklanma==4){
                    kararti4.setImageResource(R.drawable.k);
                    ı.setImageResource(R.drawable.kararti);
                    tiklanma++;
                    if (sayi==5){
                        dogruluk++;
                    }
                    if(dogruluk==4){
                        Intent ıntent=new Intent(bolum_6.this,bolum_7.class);
                        startActivity(ıntent);
                    }
                    else{
                        kararti1.setImageResource(R.drawable.kararti);
                        kararti2.setImageResource(R.drawable.kararti);
                        kararti3.setImageResource(R.drawable.kararti);
                        kararti4.setImageResource(R.drawable.kararti);
                        a.setImageResource(R.drawable.a);
                        h.setImageResource(R.drawable.h);
                        t.setImageResource(R.drawable.t);
                        l.setImageResource(R.drawable.l);
                        ı.setImageResource(R.drawable.k);
                        p.setImageResource(R.drawable.p);
                        dogruluk=0;
                        tiklanma=1;
                    }
                }
            }
        });
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi=6;
                if(tiklanma==1){
                    kararti1.setImageResource(R.drawable.p);
                    p.setImageResource(R.drawable.kararti);
                    tiklanma++;
                    if (sayi==1){
                        dogruluk++;
                    }
                }
                else if(tiklanma==2){
                    kararti2.setImageResource(R.drawable.p);
                    p.setImageResource(R.drawable.kararti);
                    tiklanma++;
                    if (sayi==4){
                        dogruluk++;
                    }
                }
                else if(tiklanma==3){
                    kararti3.setImageResource(R.drawable.p);
                    p.setImageResource(R.drawable.kararti);
                    tiklanma++;
                    if (sayi==3){
                        dogruluk++;
                    }
                }
                else  if(tiklanma==4){
                    kararti4.setImageResource(R.drawable.p);
                    p.setImageResource(R.drawable.kararti);
                    tiklanma++;
                    if (sayi==5){
                        dogruluk++;
                    }
                    if(dogruluk==4){
                        Intent ıntent=new Intent(bolum_6.this,bolum_7.class);
                        startActivity(ıntent);
                    }
                    else{
                        kararti1.setImageResource(R.drawable.kararti);
                        kararti2.setImageResource(R.drawable.kararti);
                        kararti3.setImageResource(R.drawable.kararti);
                        kararti4.setImageResource(R.drawable.kararti);
                        a.setImageResource(R.drawable.a);
                        h.setImageResource(R.drawable.h);
                        t.setImageResource(R.drawable.t);
                        l.setImageResource(R.drawable.l);
                        ı.setImageResource(R.drawable.k);
                        p.setImageResource(R.drawable.p);
                        dogruluk=0;
                        tiklanma=1;
                    }
                }
            }
        });




    }
}
