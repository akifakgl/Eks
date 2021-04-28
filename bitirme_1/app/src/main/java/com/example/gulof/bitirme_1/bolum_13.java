package com.example.gulof.bitirme_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class bolum_13 extends AppCompatActivity {

    ImageView solbtn,sagbtn,yukaribtn,asagribtn;
    int tiklanma=0,dogruluk=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_bolum_13);

        solbtn=findViewById(R.id.solbtn);
        sagbtn=findViewById(R.id.sagbtn);
        yukaribtn=findViewById(R.id.yukaribtn);
        asagribtn=findViewById(R.id.asagibtn);


        solbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tiklanma++;

                if(tiklanma==8 || tiklanma==9||tiklanma==11){
                    dogruluk++;

                }
                else {
                    dogruluk=0;
                    tiklanma=0;
                }
            }
        });
        sagbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tiklanma++;

                if(tiklanma==1 || tiklanma==5||tiklanma==12){
                    dogruluk++;
                    if(dogruluk==12){
                        Intent intent = new Intent(bolum_13.this,bolum_14.class);
                        startActivity(intent);
                    }
                }
                else {
                    dogruluk=0;
                    tiklanma=0;
                }
            }
        });
        asagribtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tiklanma++;

                if(tiklanma==4 || tiklanma==6||tiklanma==10){
                    dogruluk++;
                }
                else {
                    dogruluk=0;
                    tiklanma=0;
                }
            }
        });
        yukaribtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tiklanma++;

                if(tiklanma==2 || tiklanma==3||tiklanma==7){
                    dogruluk++;
                }
                else {
                    dogruluk=0;
                    tiklanma=0;
                }
            }
        });

    }
}
