package com.example.gulof.bitirme_1;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class bolum_8 extends AppCompatActivity {

    TextView txt;
    int sure=30000;
    int deger,dogruluk=0;
    boolean dongu=true;
    ImageView bir,bes,yedi,dokuz,onuc,onsekiz,yirmibir,yirmialti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_bolum_8);
        txt=findViewById(R.id.txt);

        bir =findViewById(R.id.bir);
        bes=findViewById(R.id.bes);
        yedi=findViewById(R.id.yedi);
        dokuz=findViewById(R.id.dokuz);
        onuc=findViewById(R.id.onuc);
        onsekiz=findViewById(R.id.onsekiz);
        yirmibir=findViewById(R.id.yirmibir);
        yirmialti=findViewById(R.id.yirmialti);

            new CountDownTimer(sure, 1000) {

                public void onTick(long millisUntilFinished) {

                    deger = (int) millisUntilFinished / 1000;
                    txt.setText("              " + deger);


                    bir.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if (deger ==1) {
                                bir.setImageResource(R.drawable.kararti);
                                dogruluk++;
                            }
                        }
                    });
                    bes.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if (deger == 5) {
                                bes.setImageResource(R.drawable.kararti);
                                dogruluk++;
                            }
                        }
                    });
                    yedi.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if (deger == 7) {
                                yedi.setImageResource(R.drawable.kararti);
                                dogruluk++;
                            }
                        }
                    });
                    dokuz.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if (deger == 9) {
                                dokuz.setImageResource(R.drawable.kararti);
                                dogruluk++;
                            }
                        }
                    });
                    onuc.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if (deger == 13) {
                                onuc.setImageResource(R.drawable.kararti);
                                dogruluk++;
                            }
                        }
                    });
                    onsekiz.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if (deger == 18) {
                                onsekiz.setImageResource(R.drawable.kararti);
                                dogruluk++;
                            }
                        }
                    });
                    yirmibir.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if (deger == 21) {
                                yirmibir.setImageResource(R.drawable.kararti);
                                dogruluk++;
                            }
                        }
                    });
                    yirmialti.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if (deger == 26) {
                                yirmialti.setImageResource(R.drawable.kararti);
                                dogruluk++;
                            }
                        }
                    });

                }

                public void onFinish() {

                    if (dogruluk == 8) {
                        Intent intent1 = new Intent(bolum_8.this,bolum_9.class);
                        startActivity(intent1);
                    } else {
                        bir.setImageResource(R.drawable.bir);
                        bes.setImageResource(R.drawable.bes);
                        yedi.setImageResource(R.drawable.yedi);
                        dokuz.setImageResource(R.drawable.dokuz);
                        onuc.setImageResource(R.drawable.onuc);
                        onsekiz.setImageResource(R.drawable.onsekiz);
                        yirmibir.setImageResource(R.drawable.yirmibir);
                        yirmialti.setImageResource(R.drawable.yirmialti);
                        dongu=false;
                        dogruluk=0;
                        Intent intent = getIntent();
                        finish();
                        startActivity(intent);


                    }
                }

            }.start();



    }
}
