package com.example.gulof.bitirme_1;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class bolum_4 extends AppCompatActivity {
    ImageView btn1,btn2,btn3,btn4,btn5,
            btn6,btn7,btn8,btn9,btn10,btn11,btn12;
    int tekrar=0,sayi=0;
    View ekranrengi2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_bolum_4);

        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btn10=findViewById(R.id.btn10);
        btn11=findViewById(R.id.btn11);
        btn12=findViewById(R.id.btn12);



            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                        new CountDownTimer(1500, 1000) {
                            public void onTick(long millisUntilFinished) {
                                btn1.setImageResource(R.drawable.yildiz);
                            }
                            public void onFinish() {

                                    btn1.setImageResource(R.drawable.mayin);

                                    btn2.setImageResource(R.drawable.mayin);

                                    btn3.setImageResource(R.drawable.mayin);

                                    btn4.setImageResource(R.drawable.mayin);

                                    btn5.setImageResource(R.drawable.mayin);

                                    btn6.setImageResource(R.drawable.mayin);

                                    btn7.setImageResource(R.drawable.mayin);

                                    btn8.setImageResource(R.drawable.mayin);

                                    btn9.setImageResource(R.drawable.mayin);

                                    btn10.setImageResource(R.drawable.mayin);

                                    btn11.setImageResource(R.drawable.mayin);

                                    btn12.setImageResource(R.drawable.mayin);
                                    sayi=0;

                            }
                        }.start();

                }
            });
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    btn2.setImageResource(R.drawable.btns);
                    sayi++;
                    if(sayi==8) {
                        new CountDownTimer(1500, 1000) {
                            public void onTick(long millisUntilFinished) {
                                btn2.setImageResource(R.drawable.btns);
                                //ekranrengi2.setBackgroundResource(R.color.bes);
                            }
                            public void onFinish() {
                               Intent intent = new Intent(bolum_4.this,bolum_5.class);
                               startActivity(intent);
                            }
                        }.start();
                    }
                }
            });
            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                        new CountDownTimer(1500, 1000) {
                            public void onTick(long millisUntilFinished) {
                                btn3.setImageResource(R.drawable.yildiz);

                            }
                            public void onFinish() {


                                    btn1.setImageResource(R.drawable.mayin);

                                    btn2.setImageResource(R.drawable.mayin);

                                    btn3.setImageResource(R.drawable.mayin);

                                    btn4.setImageResource(R.drawable.mayin);

                                    btn5.setImageResource(R.drawable.mayin);

                                    btn6.setImageResource(R.drawable.mayin);

                                    btn7.setImageResource(R.drawable.mayin);

                                    btn8.setImageResource(R.drawable.mayin);

                                    btn9.setImageResource(R.drawable.mayin);

                                    btn10.setImageResource(R.drawable.mayin);

                                    btn11.setImageResource(R.drawable.mayin);

                                    btn12.setImageResource(R.drawable.mayin);
                                    sayi=0;

                            }
                        }.start();

                }
            });
            btn4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    btn4.setImageResource(R.drawable.btns);
                    sayi++;
                    if(sayi==8) {
                        new CountDownTimer(1500, 1000) {
                            public void onTick(long millisUntilFinished) {

                            }
                            public void onFinish() {
                                Intent intent = new Intent(bolum_4.this, bolum_5.class);
                                startActivity(intent);
                            }
                        }.start();
                    }
                }
            });
            btn5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    btn5.setImageResource(R.drawable.btns);
                    sayi++;
                    if(sayi==8) {
                        new CountDownTimer(1500, 1000) {
                            public void onTick(long millisUntilFinished) {

                            }
                            public void onFinish() {
                                Intent intent = new Intent(bolum_4.this, bolum_5.class);
                                startActivity(intent);
                            }
                        }.start();
                    }
                }
            });
            btn6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    btn6.setImageResource(R.drawable.btns);
                    sayi++;
                    if(sayi==8) {
                        new CountDownTimer(1500, 1000) {
                            public void onTick(long millisUntilFinished) {

                            }
                            public void onFinish() {
                                Intent intent = new Intent(bolum_4.this, bolum_5.class);
                                startActivity(intent);
                            }
                        }.start();
                    }
                }
            });
            btn7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    btn7.setImageResource(R.drawable.btns);
                    sayi++;
                    if(sayi==8) {
                        new CountDownTimer(1500, 1000) {
                            public void onTick(long millisUntilFinished) {

                            }
                            public void onFinish() {
                                Intent intent = new Intent(bolum_4.this, bolum_5.class);
                                startActivity(intent);
                            }
                        }.start();
                    }
                }
            });
            btn8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                        new CountDownTimer(1500, 1000) {
                            public void onTick(long millisUntilFinished) {
                                btn8.setImageResource(R.drawable.yildiz);

                            }
                            public void onFinish() {


                                    btn1.setImageResource(R.drawable.mayin);

                                    btn2.setImageResource(R.drawable.mayin);

                                    btn3.setImageResource(R.drawable.mayin);

                                    btn4.setImageResource(R.drawable.mayin);

                                    btn5.setImageResource(R.drawable.mayin);

                                    btn6.setImageResource(R.drawable.mayin);

                                    btn7.setImageResource(R.drawable.mayin);

                                    btn8.setImageResource(R.drawable.mayin);

                                    btn9.setImageResource(R.drawable.mayin);

                                    btn10.setImageResource(R.drawable.mayin);

                                    btn11.setImageResource(R.drawable.mayin);

                                    btn12.setImageResource(R.drawable.mayin);
                                    sayi=0;

                            }
                        }.start();

                }
            });
            btn9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    btn9.setImageResource(R.drawable.btns);
                    sayi++;
                    if(sayi==8) {
                        new CountDownTimer(1500, 1000) {
                            public void onTick(long millisUntilFinished) {

                            }
                            public void onFinish() {
                                Intent intent = new Intent(bolum_4.this, bolum_5.class);
                                startActivity(intent);
                            }
                        }.start();
                    }
                }
            });
            btn10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                        new CountDownTimer(1500, 1000) {
                            public void onTick(long millisUntilFinished) {
                                btn10.setImageResource(R.drawable.yildiz);

                            }
                            public void onFinish() {

                                    btn1.setImageResource(R.drawable.mayin);

                                    btn2.setImageResource(R.drawable.mayin);

                                    btn3.setImageResource(R.drawable.mayin);

                                    btn4.setImageResource(R.drawable.mayin);

                                    btn5.setImageResource(R.drawable.mayin);

                                    btn6.setImageResource(R.drawable.mayin);

                                    btn7.setImageResource(R.drawable.mayin);

                                    btn8.setImageResource(R.drawable.mayin);

                                    btn9.setImageResource(R.drawable.mayin);

                                    btn10.setImageResource(R.drawable.mayin);

                                    btn11.setImageResource(R.drawable.mayin);

                                    btn12.setImageResource(R.drawable.mayin);
                                    sayi=0;

                            }
                        }.start();


                }
            });
            btn11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    btn11.setImageResource(R.drawable.btns);
                    sayi++;
                    if(sayi==8) {
                        new CountDownTimer(1500, 1000) {
                            public void onTick(long millisUntilFinished) {

                            }
                            public void onFinish() {
                                Intent intent = new Intent(bolum_4.this, bolum_5.class);
                                startActivity(intent);
                            }
                        }.start();
                    }
                }
            });
            btn12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    btn12.setImageResource(R.drawable.btns);
                    sayi++;
                    if(sayi==8) {
                        new CountDownTimer(1500, 1000) {
                            public void onTick(long millisUntilFinished) {

                            }
                            public void onFinish() {
                                Intent intent = new Intent(bolum_4.this, bolum_5.class);
                                startActivity(intent);
                            }
                        }.start();
                    }
                }
            });



    }
}
