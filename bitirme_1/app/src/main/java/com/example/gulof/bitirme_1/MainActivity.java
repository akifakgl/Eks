package com.example.gulof.bitirme_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView btnplay;
    TextView bolumtxt;
    ImageView sola1,saga1;
    int  bolumsayisi=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);


        btnplay=findViewById(R.id.btnplay);
        sola1=findViewById(R.id.sola);
        saga1=findViewById(R.id.saga);
        bolumtxt=findViewById(R.id.bolumsecimi);


        //oyun başlama butonu kodları
        btnplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (bolumsayisi){

                    case 1:
                        Intent intent = new Intent(MainActivity.this,bolum_1.class);
                        startActivity(intent);
                        break;

                    case 2:
                        Intent intent1 = new Intent(MainActivity.this,bolum_2.class);
                        startActivity(intent1);
                        break;

                    case 3:
                        Intent intent2 = new Intent(MainActivity.this,bolum_3.class);
                        startActivity(intent2);
                        break;

                    case 4:
                        Intent intent3 = new Intent(MainActivity.this,bolum_4.class);
                        startActivity(intent3);
                        break;

                    case 5:
                        Intent intent4 = new Intent(MainActivity.this,bolum_5.class);
                        startActivity(intent4);
                        break;
                    case 6:
                        Intent intent5 = new Intent(MainActivity.this,bolum_6.class);
                        startActivity(intent5);
                        break;
                    case 7:
                        Intent intent6 = new Intent(MainActivity.this,bolum_7.class);
                        startActivity(intent6);
                        break;
                    case 8:
                        Intent intent7 = new Intent(MainActivity.this,bolum_8.class);
                        startActivity(intent7);
                        break;
                    case 9:
                        Intent intent8 = new Intent(MainActivity.this,bolum_9.class);
                        startActivity(intent8);
                        break;
                    case 10:
                        Intent intent9 = new Intent(MainActivity.this,bolum_10.class);
                        startActivity(intent9);
                        break;
                    case 11:
                        Intent intent10 = new Intent(MainActivity.this,bolum_11.class);
                        startActivity(intent10);
                        break;
                    case 12:
                        Intent intent11 = new Intent(MainActivity.this,bolum_12.class);
                        startActivity(intent11);
                        break;
                    case 13:
                        Intent intent12 = new Intent(MainActivity.this,bolum_13.class);
                        startActivity(intent12);
                        break;
                    case 14:
                        Intent intent13 = new Intent(MainActivity.this,bolum_14.class);
                        startActivity(intent13);
                        break;
                    case 15:
                        Intent intent14 = new Intent(MainActivity.this,bolum_15.class);
                        startActivity(intent14);
                        break;
                    case 16:
                        Intent intent15 = new Intent(MainActivity.this,bolum_16.class);
                        startActivity(intent15);
                        break;
                    case 17:
                        Intent intent16 = new Intent(MainActivity.this,bolum_17.class);
                        startActivity(intent16);
                        break;
                    case 18:
                        Intent intent17 = new Intent(MainActivity.this,bolum_18.class);
                        startActivity(intent17);
                        break;
                    case 19:
                        Intent intent18 = new Intent(MainActivity.this,bolum_19.class);
                        startActivity(intent18);
                        break;
                    case 20:
                        Intent intent19 = new Intent(MainActivity.this,bolum_20.class);
                        startActivity(intent19);
                        break;

                }


            }
        });


        saga1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bolumsayisi++;
                bolumtxt.setText(""+bolumsayisi);
            }
        });
        sola1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bolumsayisi>=1)
                   bolumsayisi--;
                bolumtxt.setText(""+bolumsayisi);

            }
        });






    }

}
