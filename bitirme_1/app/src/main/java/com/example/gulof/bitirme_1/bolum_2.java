package com.example.gulof.bitirme_1;

import android.content.Intent;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;


public class bolum_2 extends AppCompatActivity {
    final Handler handler = new Handler();
    ImageView img,img2;
    private ViewGroup rootLayout;
    private int _xDelta;
    private int _yDelta;
    float x1,x2,y1,y2,ebx,eby,ekx,eky;
    View ekranrengi1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_bolum_2);
        rootLayout = (ViewGroup) findViewById(R.id.view_root);
        img = (ImageView) rootLayout.findViewById(R.id.imageView);
        img2=(ImageView) rootLayout.findViewById(R.id.imageView2);
        ekranrengi1=this.getWindow().getDecorView();

        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(250, 250);//nesnenin boyutu
        img.setLayoutParams(layoutParams);
        img.setOnTouchListener(new ChoiceTouchListener());//hareket fonksiyonu
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(250, 250);
        img2.setLayoutParams(layoutParams2);
        img2.setOnTouchListener(new ChoiceTouchListener());
        img.setX(250);
        img.setY(50);
        img2.setX(250);
        img2.setY(950);

    }
    private final class ChoiceTouchListener implements View.OnTouchListener {
        public boolean onTouch(View view, MotionEvent event) {
            final int X = (int) event.getRawX();
            final int Y = (int) event.getRawY();
            switch (event.getAction() & MotionEvent.ACTION_MASK) {
                case MotionEvent.ACTION_DOWN:
                    RelativeLayout.LayoutParams lParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
                    _xDelta = X - lParams.leftMargin;
                    _yDelta = Y - lParams.topMargin;
                    break;
                case MotionEvent.ACTION_UP://nesneyi tutup bırakınca çalışıyor


                    if(x1>x2){
                        ebx=x1;
                        ekx=x2;
                    }
                    else{
                        ebx=x2;
                        ekx=x1;

                    }
                    if(y1>y2){
                        eby=y1;
                        eky=y2;
                    }
                    else{
                        eby=y2;
                        eky=y1;

                    }


                    if(ebx-ekx<=20&&eby-eky<=20){
                        x1=x2;
                    }



                    if(x1==x2){
                        new CountDownTimer(1500, 1000) {

                            public void onTick(long millisUntilFinished) {
                                ekranrengi1.setBackgroundResource(R.color.bes);
                                //here you can have your logic to set text to edittext
                            }

                            public void onFinish() {
                                Intent intent = new Intent(bolum_2.this,bolum_3.class);
                                startActivity(intent);

                            }

                        }.start();

                    }

                    break;
                case MotionEvent.ACTION_POINTER_DOWN:
                    break;
                case MotionEvent.ACTION_POINTER_UP:
                    break;
                case MotionEvent.ACTION_MOVE://hareket ettirme 1. cisim için
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view
                            .getLayoutParams();
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) view
                            .getLayoutParams();

                    layoutParams.leftMargin = X - _xDelta;
                    layoutParams.topMargin = Y - _yDelta;
                    layoutParams.rightMargin = -250;
                    layoutParams.bottomMargin = -250;
                    x1=img.getX();
                    y1=img.getY();
                    System.out.println("konumu 1:"+x1);
                    System.out.println("konumu 2:"+y1);
                    layoutParams2.leftMargin = X - _xDelta;
                    layoutParams2.topMargin = Y - _yDelta;
                    layoutParams2.rightMargin = -250;
                    layoutParams2.bottomMargin = -250;
                    x2=img2.getX();
                    y2=img2.getY();
                    System.out.println("konumu 3:"+x2);
                    System.out.println("konumu 4:"+y2);
                    view.setLayoutParams(layoutParams2);
                    view.setLayoutParams(layoutParams);
                    break;

            }

            rootLayout.invalidate();
            return true;
        }
    }

}
