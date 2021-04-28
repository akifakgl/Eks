package com.example.gulof.bitirme_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class bolum_11 extends AppCompatActivity {

    ImageView onalti,kirkiki,otuzsekiz,elliyedi;
    int tiklanma=0,dogruluk=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_bolum_11);

        onalti = findViewById(R.id.onalti);
        kirkiki = findViewById(R.id.kirkiki);
        otuzsekiz = findViewById(R.id.otuzsekiz);
        elliyedi = findViewById(R.id.elliyedi);


        onalti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tiklanma++;
                if (tiklanma==1||tiklanma==6){

                    dogruluk++;
                }
                else{
                    tiklanma=0;
                    dogruluk=0;
                }




            }
        });
        kirkiki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tiklanma++;
                if (tiklanma==4||tiklanma==2){
                    dogruluk++;
                }
                else{
                    tiklanma=0;
                    dogruluk=0;
                }
            }
        });

        elliyedi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tiklanma++;
                if(tiklanma==5||tiklanma==7){
                    dogruluk++;
                }
                else {
                    tiklanma=0;
                    dogruluk=0;
                }
            }
        });

        otuzsekiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tiklanma++;
                if (tiklanma==3||tiklanma==8){
                    dogruluk++;
                    if (dogruluk==8){

                        Intent intent = new Intent(bolum_11.this,bolum_12.class);
                        startActivity(intent);
                    }
                }
                else {
                    dogruluk=0;
                    tiklanma=0;
                }
            }
        });






    }
}
