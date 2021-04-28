package com.example.gulof.bitirme_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class bolum_12 extends AppCompatActivity {
    ImageView bir,iki,uc,dort,bes,alti,yedi,sekiz,dokuz,on,onbir,oniki,onuc,ondort,onbes,onalti,onyedi,onsekiz;
    int tiklanma=0,resim=0,dogruluk=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_bolum_12);

        bir= findViewById(R.id.bir);
        iki =findViewById(R.id.iki);
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
        onuc=findViewById(R.id.onuc);
        ondort=findViewById(R.id.ondort);
        onbes=findViewById(R.id.onbes);
        onalti=findViewById(R.id.onalti);
        onyedi=findViewById(R.id.onyedi);
        onsekiz=findViewById(R.id.onsekiz);

        bir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tiklanma++;

                if(tiklanma==1){
                    resim=1;
                }
                if(tiklanma==2){
                    if(resim==2){
                        bir.setImageResource(R.drawable.kararti);
                        iki.setImageResource(R.drawable.kararti);
                        tiklanma=0;
                        dogruluk++;
                        if(dogruluk==9){
                            Intent intent = new Intent(bolum_12.this,bolum_13.class);
                            startActivity(intent);
                        }
                    }
                    tiklanma=0;
                }
            }
        });
        iki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tiklanma++;

                if(tiklanma==1){
                    resim=2;
                }
                if(tiklanma==2){
                    if(resim==1){
                        bir.setImageResource(R.drawable.kararti);
                        iki.setImageResource(R.drawable.kararti);
                        dogruluk++;
                        if(dogruluk==9){
                            Intent intent = new Intent(bolum_12.this,bolum_13.class);
                            startActivity(intent);
                        }
                        tiklanma=0;
                    }
                    tiklanma=0;
                }
            }
        });




        uc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tiklanma++;

                if(tiklanma==1){
                    resim=3;
                }
                if(tiklanma==2){
                    if(resim==4){
                        uc.setImageResource(R.drawable.kararti);
                        dort.setImageResource(R.drawable.kararti);
                        dogruluk++;
                        if(dogruluk==9){
                            Intent intent = new Intent(bolum_12.this,bolum_13.class);
                            startActivity(intent);
                        }
                        tiklanma=0;
                    }
                    tiklanma=0;
                }
            }
        });
        dort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tiklanma++;

                if(tiklanma==1){
                    resim=4;
                }
                if(tiklanma==2){
                    if(resim==3){
                        uc.setImageResource(R.drawable.kararti);
                        dort.setImageResource(R.drawable.kararti);
                        dogruluk++;
                        if(dogruluk==9){
                            Intent intent = new Intent(bolum_12.this,bolum_13.class);
                            startActivity(intent);
                        }
                        tiklanma=0;
                    }
                    tiklanma=0;
                }
            }
        });



        bes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tiklanma++;

                if(tiklanma==1){
                    resim=5;
                }
                if(tiklanma==2){
                    if(resim==6){
                        bes.setImageResource(R.drawable.kararti);
                        alti.setImageResource(R.drawable.kararti);
                        dogruluk++;
                        if(dogruluk==9){
                            Intent intent = new Intent(bolum_12.this,bolum_13.class);
                            startActivity(intent);
                        }
                        tiklanma=0;
                    }
                    tiklanma=0;
                }
            }
        });
        alti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tiklanma++;

                if(tiklanma==1){
                    resim=6;
                }
                if(tiklanma==2){
                    if(resim==5){
                        bes.setImageResource(R.drawable.kararti);
                        alti.setImageResource(R.drawable.kararti);
                        dogruluk++;
                        if(dogruluk==9){
                            Intent intent = new Intent(bolum_12.this,bolum_13.class);
                            startActivity(intent);
                        }
                        tiklanma=0;
                    }
                    tiklanma=0;
                }
            }
        });


        yedi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tiklanma++;

                if(tiklanma==1){
                    resim=7;
                }
                if(tiklanma==2){
                    if(resim==8){
                        yedi.setImageResource(R.drawable.kararti);
                        sekiz.setImageResource(R.drawable.kararti);
                        dogruluk++;
                        if(dogruluk==9){
                            Intent intent = new Intent(bolum_12.this,bolum_13.class);
                            startActivity(intent);
                        }
                        tiklanma=0;
                    }
                    tiklanma=0;
                }
            }
        });
        sekiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tiklanma++;

                if(tiklanma==1){
                    resim=8;
                }
                if(tiklanma==2){
                    if(resim==7){
                        yedi.setImageResource(R.drawable.kararti);
                        sekiz.setImageResource(R.drawable.kararti);
                        dogruluk++;
                        if(dogruluk==9){
                            Intent intent = new Intent(bolum_12.this,bolum_13.class);
                            startActivity(intent);
                        }
                        tiklanma=0;
                    }
                    tiklanma=0;
                }
            }
        });


        dokuz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tiklanma++;

                if(tiklanma==1){
                    resim=9;
                }
                if(tiklanma==2){
                    if(resim==10){
                        dokuz.setImageResource(R.drawable.kararti);
                        on.setImageResource(R.drawable.kararti);
                        dogruluk++;
                        if(dogruluk==9){
                            Intent intent = new Intent(bolum_12.this,bolum_13.class);
                            startActivity(intent);
                        }
                        tiklanma=0;
                    }
                    tiklanma=0;
                }
            }
        });
        on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tiklanma++;

                if(tiklanma==1){
                    resim=10;
                }
                if(tiklanma==2){
                    if(resim==9){
                        dokuz.setImageResource(R.drawable.kararti);
                        on.setImageResource(R.drawable.kararti);
                        dogruluk++;
                        if(dogruluk==9){
                            Intent intent = new Intent(bolum_12.this,bolum_13.class);
                            startActivity(intent);
                        }
                        tiklanma=0;
                    }
                    tiklanma=0;
                }
            }
        });


        onbir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tiklanma++;

                if(tiklanma==1){
                    resim=11;
                }
                if(tiklanma==2){
                    if(resim==12){
                        onbir.setImageResource(R.drawable.kararti);
                        oniki.setImageResource(R.drawable.kararti);
                        dogruluk++;
                        if(dogruluk==9){
                            Intent intent = new Intent(bolum_12.this,bolum_13.class);
                            startActivity(intent);
                        }
                        tiklanma=0;
                    }
                    tiklanma=0;
                }
            }
        });
        oniki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tiklanma++;

                if(tiklanma==1){
                    resim=12;
                }
                if(tiklanma==2){
                    if(resim==11){
                        onbir.setImageResource(R.drawable.kararti);
                        oniki.setImageResource(R.drawable.kararti);
                        dogruluk++;
                        if(dogruluk==9){
                            Intent intent = new Intent(bolum_12.this,bolum_13.class);
                            startActivity(intent);
                        }
                        tiklanma=0;
                    }
                    tiklanma=0;
                }
            }
        });



        onuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tiklanma++;

                if(tiklanma==1){
                    resim=13;
                }
                if(tiklanma==2){
                    if(resim==14){
                        onuc.setImageResource(R.drawable.kararti);
                        ondort.setImageResource(R.drawable.kararti);
                        dogruluk++;
                        if(dogruluk==9){
                            Intent intent = new Intent(bolum_12.this,bolum_13.class);
                            startActivity(intent);
                        }
                        tiklanma=0;
                    }
                    tiklanma=0;
                }
            }
        });
        ondort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tiklanma++;

                if(tiklanma==1){
                    resim=14;
                }
                if(tiklanma==2){
                    if(resim==13){
                        onuc.setImageResource(R.drawable.kararti);
                        ondort.setImageResource(R.drawable.kararti);
                        dogruluk++;
                        if(dogruluk==9){
                            Intent intent = new Intent(bolum_12.this,bolum_13.class);
                            startActivity(intent);
                        }
                        tiklanma=0;
                    }
                    tiklanma=0;
                }
            }
        });



        onbes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tiklanma++;

                if(tiklanma==1){
                    resim=15;
                }
                if(tiklanma==2){
                    if(resim==16){
                        onbes.setImageResource(R.drawable.kararti);
                        onalti.setImageResource(R.drawable.kararti);
                        dogruluk++;
                        if(dogruluk==9){
                            Intent intent = new Intent(bolum_12.this,bolum_13.class);
                            startActivity(intent);
                        }
                        tiklanma=0;
                    }
                    tiklanma=0;
                }
            }
        });
        onalti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tiklanma++;

                if(tiklanma==1){
                    resim=16;
                }
                if(tiklanma==2){
                    if(resim==15){
                        onbes.setImageResource(R.drawable.kararti);
                        onalti.setImageResource(R.drawable.kararti);
                        dogruluk++;
                        if(dogruluk==9){
                            Intent intent = new Intent(bolum_12.this,bolum_13.class);
                            startActivity(intent);
                        }
                        tiklanma=0;
                    }
                    tiklanma=0;
                }
            }
        });


        onyedi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tiklanma++;

                if(tiklanma==1){
                    resim=17;
                }
                if(tiklanma==2){
                    if(resim==18){
                        onyedi.setImageResource(R.drawable.kararti);
                        onsekiz.setImageResource(R.drawable.kararti);
                        dogruluk++;
                        if(dogruluk==9){
                            Intent intent = new Intent(bolum_12.this,bolum_13.class);
                            startActivity(intent);
                        }
                        tiklanma=0;
                    }
                    tiklanma=0;
                }
            }
        });
        onsekiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tiklanma++;

                if(tiklanma==1){
                    resim=18;
                }
                if(tiklanma==2){
                    if(resim==17){
                        onyedi.setImageResource(R.drawable.kararti);
                        onsekiz.setImageResource(R.drawable.kararti);
                        dogruluk++;
                        if(dogruluk==9){
                            Intent intent = new Intent(bolum_12.this,bolum_13.class);
                            startActivity(intent);
                        }
                        tiklanma=0;
                    }
                    tiklanma=0;
                }
            }
        });


    }
}
