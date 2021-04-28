package com.example.gulof.bitirme_1;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class bolum_19 extends AppCompatActivity {
    ImageView siyahb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_bolum_19);

        siyahb=findViewById(R.id.btnsiyah);




        siyahb.setVisibility(View.INVISIBLE);
        siyahb.setEnabled(false);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // Do something after 5s = 5000ms

                Animation myanim = AnimationUtils.loadAnimation(bolum_19.this,R.anim.myanim);
                siyahb.startAnimation(myanim);


                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        // Do something after 5s = 5000ms
                        siyahb.setVisibility(View.VISIBLE);
                        siyahb.setEnabled(true);

                    }
                }, 3000);

            }
        }, 5000);





        siyahb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(bolum_19.this,bolum_20.class);
                startActivity(intent);
            }
        });












    }
}
