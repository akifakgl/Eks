package com.example.gulof.bitirme_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class bolum_5 extends AppCompatActivity {
    ImageView bir,iki,uc,dort,bes;
    int tiklanma=1,sayi1,sayi2,x=1,y=2,z=3,t=4,m=5,gec=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_bolum_5);

        bir = findViewById(R.id.bir);
        iki=findViewById(R.id.iki);
        uc=findViewById(R.id.uc);
        dort=findViewById(R.id.dort);
        bes=findViewById(R.id.bes);


        /*bir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tiklanma==1){
                    sayi1=x;
                    tiklanma++;
                }
                else{
                    sayi2=x;
                    tiklanma=1;
                    if (sayi1>sayi2){

                        if(sayi1==x){
                            bir.setImageResource(R.drawable.iki);
                        }
                        if(sayi1==y){
                            bir.setImageResource(R.drawable.iki);
                        }
                        if(sayi1==z){
                            bir.setImageResource(R.drawable.uc);
                        }
                        if(sayi1==t){
                            bir.setImageResource(R.drawable.dort);
                        }
                        if(sayi1==m){
                            bir.setImageResource(R.drawable.bes);
                        }


                        if(sayi2==x){
                            iki.setImageResource(R.drawable.bir);
                        }
                        if(sayi2==y){
                            iki.setImageResource(R.drawable.bir);
                        }
                        if(sayi2==z){
                            uc.setImageResource(R.drawable.bir);
                        }
                        if(sayi2==t){
                            dort.setImageResource(R.drawable.bir);
                        }
                        if(sayi2==m){
                            bes.setImageResource(R.drawable.bir);
                        }



                        y=1;
                        x=2;
                    }
                }
            }
        });
        iki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tiklanma==1){
                    sayi1=y;
                    tiklanma++;
                }
                else{
                    sayi2=y;
                    tiklanma=1;
                    if (sayi1>sayi2){
                            if(sayi1==x){
                                bir.setImageResource(R.drawable.bir);
                            }
                            if(sayi1==y){
                                bir.setImageResource(R.drawable.iki);
                            }
                            if(sayi1==z){
                                bir.setImageResource(R.drawable.uc);
                            }
                            if(sayi1==t){
                                bir.setImageResource(R.drawable.dort);
                            }
                            if(sayi1==m){
                                bir.setImageResource(R.drawable.bes);
                            }


                            if(sayi2==x){
                                iki.setImageResource(R.drawable.bir);
                            }
                            if(sayi2==y){
                                iki.setImageResource(R.drawable.iki);
                            }
                            if(sayi2==z){
                                uc.setImageResource(R.drawable.bir);
                            }
                            if(sayi2==t){
                                dort.setImageResource(R.drawable.bir);
                            }
                            if(sayi2==m){
                                bes.setImageResource(R.drawable.bir);
                            }



                            y=2;
                            x=1;

                    }
                }
            }
        });*/

        uc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tiklanma==1){
                    sayi1=3;
                    tiklanma++;
                }



            }
        });


        bir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tiklanma==1){
                    sayi1=x;
                    tiklanma++;
                }
                else
                    if (sayi1==3){

                        bir.setImageResource(R.drawable.uc);
                        uc.setImageResource(R.drawable.bir);
                        tiklanma=1;
                        gec++;
                        if (gec==2){
                            Intent ıntent=new Intent(bolum_5.this,bolum_6.class);
                            startActivity(ıntent);
                        }

                    }

            }
        });
        bes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tiklanma==1){
                    sayi1=5;
                    tiklanma++;
                }



            }
        });


        iki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tiklanma==1){
                    sayi1=x;
                    tiklanma++;
                }
                else
                if (sayi1==5){

                    bes.setImageResource(R.drawable.iki);
                    iki.setImageResource(R.drawable.bes);
                    tiklanma=1;
                    gec++;
                    if (gec==2){
                        Intent ıntent=new Intent(bolum_5.this,bolum_6.class);
                        startActivity(ıntent);
                    }

                }

            }
        });



    }
}
