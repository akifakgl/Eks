package com.example.gulof.bitirme_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class bolum_18 extends AppCompatActivity {
    ImageView bir,iki,uc,dort,bes,alti,yedi,sekiz,dokuz,on,onbir,oniki;
    int tiklanma=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_bolum_18);


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
        oniki=findViewById(R.id.oniki);




        bir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tiklanma++;
                if(tiklanma==1){
                    bir.setImageResource(R.drawable.onsekizbolumkararti);
                }
                else{
                    bir.setImageResource(R.drawable.birkirkbir);
                    iki.setImageResource(R.drawable.ikiotuziki);
                    uc.setImageResource(R.drawable.uconuc);
                    dort.setImageResource(R.drawable.dortonbir);
                    bes.setImageResource(R.drawable.beskirkiki);
                    alti.setImageResource(R.drawable.altioniki);
                    yedi.setImageResource(R.drawable.yediyirmiuc);
                    sekiz.setImageResource(R.drawable.sekizotuzbir);
                    dokuz.setImageResource(R.drawable.dokuzkirkuc);
                    on.setImageResource(R.drawable.onikiyirbir);
                    onbir.setImageResource(R.drawable.onbirotuzuc);
                    oniki.setImageResource(R.drawable.onikiyirbir);
                    tiklanma=0;
                }

            }
        });

        iki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tiklanma++;
                if(tiklanma==2){
                    iki.setImageResource(R.drawable.onsekizbolumkararti);
                }
                else{
                    bir.setImageResource(R.drawable.birkirkbir);
                    iki.setImageResource(R.drawable.ikiotuziki);
                    uc.setImageResource(R.drawable.uconuc);
                    dort.setImageResource(R.drawable.dortonbir);
                    bes.setImageResource(R.drawable.beskirkiki);
                    alti.setImageResource(R.drawable.altioniki);
                    yedi.setImageResource(R.drawable.yediyirmiuc);
                    sekiz.setImageResource(R.drawable.sekizotuzbir);
                    dokuz.setImageResource(R.drawable.dokuzkirkuc);
                    on.setImageResource(R.drawable.onikiyirbir);
                    onbir.setImageResource(R.drawable.onbirotuzuc);
                    oniki.setImageResource(R.drawable.onikiyirbir);
                    tiklanma=0;
                }

            }
        });

        uc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tiklanma++;
                if(tiklanma==3){
                    uc.setImageResource(R.drawable.onsekizbolumkararti);
                }
                else{
                    bir.setImageResource(R.drawable.birkirkbir);
                    iki.setImageResource(R.drawable.ikiotuziki);
                    uc.setImageResource(R.drawable.uconuc);
                    dort.setImageResource(R.drawable.dortonbir);
                    bes.setImageResource(R.drawable.beskirkiki);
                    alti.setImageResource(R.drawable.altioniki);
                    yedi.setImageResource(R.drawable.yediyirmiuc);
                    sekiz.setImageResource(R.drawable.sekizotuzbir);
                    dokuz.setImageResource(R.drawable.dokuzkirkuc);
                    on.setImageResource(R.drawable.onikiyirbir);
                    onbir.setImageResource(R.drawable.onbirotuzuc);
                    oniki.setImageResource(R.drawable.onikiyirbir);
                    tiklanma=0;
                }

            }
        });

        dort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tiklanma++;
                if(tiklanma==4){
                    dort.setImageResource(R.drawable.onsekizbolumkararti);
                }
                else{
                    bir.setImageResource(R.drawable.birkirkbir);
                    iki.setImageResource(R.drawable.ikiotuziki);
                    uc.setImageResource(R.drawable.uconuc);
                    dort.setImageResource(R.drawable.dortonbir);
                    bes.setImageResource(R.drawable.beskirkiki);
                    alti.setImageResource(R.drawable.altioniki);
                    yedi.setImageResource(R.drawable.yediyirmiuc);
                    sekiz.setImageResource(R.drawable.sekizotuzbir);
                    dokuz.setImageResource(R.drawable.dokuzkirkuc);
                    on.setImageResource(R.drawable.onikiyirbir);
                    onbir.setImageResource(R.drawable.onbirotuzuc);
                    oniki.setImageResource(R.drawable.onikiyirbir);
                    tiklanma=0;
                }

            }
        });

        bes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tiklanma++;
                if(tiklanma==5){
                    bes.setImageResource(R.drawable.onsekizbolumkararti);
                }
                else{
                    bir.setImageResource(R.drawable.birkirkbir);
                    iki.setImageResource(R.drawable.ikiotuziki);
                    uc.setImageResource(R.drawable.uconuc);
                    dort.setImageResource(R.drawable.dortonbir);
                    bes.setImageResource(R.drawable.beskirkiki);
                    alti.setImageResource(R.drawable.altioniki);
                    yedi.setImageResource(R.drawable.yediyirmiuc);
                    sekiz.setImageResource(R.drawable.sekizotuzbir);
                    dokuz.setImageResource(R.drawable.dokuzkirkuc);
                    on.setImageResource(R.drawable.onikiyirbir);
                    onbir.setImageResource(R.drawable.onbirotuzuc);
                    oniki.setImageResource(R.drawable.onikiyirbir);
                    tiklanma=0;
                }

            }
        });

        alti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tiklanma++;
                if(tiklanma==6){
                    alti.setImageResource(R.drawable.onsekizbolumkararti);
                }
                else{
                    bir.setImageResource(R.drawable.birkirkbir);
                    iki.setImageResource(R.drawable.ikiotuziki);
                    uc.setImageResource(R.drawable.uconuc);
                    dort.setImageResource(R.drawable.dortonbir);
                    bes.setImageResource(R.drawable.beskirkiki);
                    alti.setImageResource(R.drawable.altioniki);
                    yedi.setImageResource(R.drawable.yediyirmiuc);
                    sekiz.setImageResource(R.drawable.sekizotuzbir);
                    dokuz.setImageResource(R.drawable.dokuzkirkuc);
                    on.setImageResource(R.drawable.onikiyirbir);
                    onbir.setImageResource(R.drawable.onbirotuzuc);
                    oniki.setImageResource(R.drawable.onikiyirbir);
                    tiklanma=0;
                }

            }
        });

        yedi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tiklanma++;
                if(tiklanma==7){
                    yedi.setImageResource(R.drawable.onsekizbolumkararti);
                }
                else{
                    bir.setImageResource(R.drawable.birkirkbir);
                    iki.setImageResource(R.drawable.ikiotuziki);
                    uc.setImageResource(R.drawable.uconuc);
                    dort.setImageResource(R.drawable.dortonbir);
                    bes.setImageResource(R.drawable.beskirkiki);
                    alti.setImageResource(R.drawable.altioniki);
                    yedi.setImageResource(R.drawable.yediyirmiuc);
                    sekiz.setImageResource(R.drawable.sekizotuzbir);
                    dokuz.setImageResource(R.drawable.dokuzkirkuc);
                    on.setImageResource(R.drawable.onikiyirbir);
                    onbir.setImageResource(R.drawable.onbirotuzuc);
                    oniki.setImageResource(R.drawable.onikiyirbir);
                    tiklanma=0;
                }

            }
        });

        sekiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tiklanma++;
                if(tiklanma==8){
                    sekiz.setImageResource(R.drawable.onsekizbolumkararti);
                }
                else{
                    bir.setImageResource(R.drawable.birkirkbir);
                    iki.setImageResource(R.drawable.ikiotuziki);
                    uc.setImageResource(R.drawable.uconuc);
                    dort.setImageResource(R.drawable.dortonbir);
                    bes.setImageResource(R.drawable.beskirkiki);
                    alti.setImageResource(R.drawable.altioniki);
                    yedi.setImageResource(R.drawable.yediyirmiuc);
                    sekiz.setImageResource(R.drawable.sekizotuzbir);
                    dokuz.setImageResource(R.drawable.dokuzkirkuc);
                    on.setImageResource(R.drawable.onikiyirbir);
                    onbir.setImageResource(R.drawable.onbirotuzuc);
                    oniki.setImageResource(R.drawable.onikiyirbir);
                    tiklanma=0;
                }

            }
        });

        dokuz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tiklanma++;
                if(tiklanma==9){
                    dokuz.setImageResource(R.drawable.onsekizbolumkararti);
                }
                else{
                    bir.setImageResource(R.drawable.birkirkbir);
                    iki.setImageResource(R.drawable.ikiotuziki);
                    uc.setImageResource(R.drawable.uconuc);
                    dort.setImageResource(R.drawable.dortonbir);
                    bes.setImageResource(R.drawable.beskirkiki);
                    alti.setImageResource(R.drawable.altioniki);
                    yedi.setImageResource(R.drawable.yediyirmiuc);
                    sekiz.setImageResource(R.drawable.sekizotuzbir);
                    dokuz.setImageResource(R.drawable.dokuzkirkuc);
                    on.setImageResource(R.drawable.onikiyirbir);
                    onbir.setImageResource(R.drawable.onbirotuzuc);
                    oniki.setImageResource(R.drawable.onikiyirbir);
                    tiklanma=0;
                }

            }
        });

        on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tiklanma++;
                if(tiklanma==10){
                    on.setImageResource(R.drawable.onsekizbolumkararti);
                }
                else{
                    bir.setImageResource(R.drawable.birkirkbir);
                    iki.setImageResource(R.drawable.ikiotuziki);
                    uc.setImageResource(R.drawable.uconuc);
                    dort.setImageResource(R.drawable.dortonbir);
                    bes.setImageResource(R.drawable.beskirkiki);
                    alti.setImageResource(R.drawable.altioniki);
                    yedi.setImageResource(R.drawable.yediyirmiuc);
                    sekiz.setImageResource(R.drawable.sekizotuzbir);
                    dokuz.setImageResource(R.drawable.dokuzkirkuc);
                    on.setImageResource(R.drawable.onikiyirbir);
                    onbir.setImageResource(R.drawable.onbirotuzuc);
                    oniki.setImageResource(R.drawable.onikiyirbir);
                    tiklanma=0;
                }

            }
        });

        onbir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tiklanma++;
                if(tiklanma==11){
                    onbir.setImageResource(R.drawable.onsekizbolumkararti);
                }
                else{
                    bir.setImageResource(R.drawable.birkirkbir);
                    iki.setImageResource(R.drawable.ikiotuziki);
                    uc.setImageResource(R.drawable.uconuc);
                    dort.setImageResource(R.drawable.dortonbir);
                    bes.setImageResource(R.drawable.beskirkiki);
                    alti.setImageResource(R.drawable.altioniki);
                    yedi.setImageResource(R.drawable.yediyirmiuc);
                    sekiz.setImageResource(R.drawable.sekizotuzbir);
                    dokuz.setImageResource(R.drawable.dokuzkirkuc);
                    on.setImageResource(R.drawable.onikiyirbir);
                    onbir.setImageResource(R.drawable.onbirotuzuc);
                    oniki.setImageResource(R.drawable.onikiyirbir);
                    tiklanma=0;
                }

            }
        });

        oniki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tiklanma++;
                if(tiklanma==12){
                    oniki.setImageResource(R.drawable.onsekizbolumkararti);

                    Intent intent = new Intent(bolum_18.this,bolum_19.class);
                    startActivity(intent);
                }
                else{
                    bir.setImageResource(R.drawable.birkirkbir);
                    iki.setImageResource(R.drawable.ikiotuziki);
                    uc.setImageResource(R.drawable.uconuc);
                    dort.setImageResource(R.drawable.dortonbir);
                    bes.setImageResource(R.drawable.beskirkiki);
                    alti.setImageResource(R.drawable.altioniki);
                    yedi.setImageResource(R.drawable.yediyirmiuc);
                    sekiz.setImageResource(R.drawable.sekizotuzbir);
                    dokuz.setImageResource(R.drawable.dokuzkirkuc);
                    on.setImageResource(R.drawable.onyirmiiki);
                    onbir.setImageResource(R.drawable.onbirotuzuc);
                    oniki.setImageResource(R.drawable.onikiyirbir);
                    tiklanma=0;
                }

            }
        });




    }
}
