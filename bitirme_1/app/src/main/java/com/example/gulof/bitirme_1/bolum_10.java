package com.example.gulof.bitirme_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class bolum_10 extends AppCompatActivity {
    ImageView bir,yedi,oniki,onbes;
    int sayi1=0,dogruluk=0,sayi2=0,sayi3=0,sayi4=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_bolum_10);

        bir = findViewById(R.id.bir);
        yedi = findViewById(R.id.yedi);
        oniki = findViewById(R.id.oniki);
        onbes = findViewById(R.id.onbes);




        bir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi1++;
                if(sayi2<7){
                    sayi2=0;
                }
                if(sayi3<12){
                    sayi3=0;
                }
                if(sayi4<15){
                    sayi4=0;
                }
                    if(sayi1==1){
                        bir.setImageResource(R.drawable.bkararti);
                        dogruluk++;
                        if(dogruluk==4){
                            Intent intent=new Intent(bolum_10.this,bolum_11.class);
                            startActivity(intent);

                        }
                    }
            }
        });
        yedi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi2++;
                if(sayi1<1){
                    sayi1=0;
                }
                if(sayi3<12){
                    sayi3=0;
                }
                if(sayi4<15){
                    sayi4=0;
                }

                if(sayi2==7){
                    yedi.setImageResource(R.drawable.bkararti);
                    dogruluk++;
                    if(dogruluk==4){
                        Intent intent=new Intent(bolum_10.this,bolum_11.class);
                        startActivity(intent);
                    }
                }
            }
        });
        oniki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi3++;
                if(sayi1<1){
                    sayi1=0;
                }
                if(sayi2<7){
                    sayi2=0;
                }
                if(sayi4<15){
                    sayi4=0;
                }

                if(sayi3==12){
                    oniki.setImageResource(R.drawable.bkararti);
                    dogruluk++;
                    if(dogruluk==4){
                        Intent intent=new Intent(bolum_10.this,bolum_11.class);
                        startActivity(intent);

                    }
                }
            }
        });
        onbes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi4++;
                if(sayi2<7){
                    sayi2=0;
                }
                if(sayi3<12){
                    sayi3=0;
                }
                if(sayi1<1){
                    sayi1=0;
                }
                if(sayi4==15){
                    onbes.setImageResource(R.drawable.bkararti);
                    dogruluk++;
                    if(dogruluk==4){
                        Intent intent=new Intent(bolum_10.this,bolum_11.class);
                        startActivity(intent);

                    }
                }
            }
        });
    }
}
