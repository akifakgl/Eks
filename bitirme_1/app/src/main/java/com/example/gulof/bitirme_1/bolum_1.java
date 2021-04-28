package com.example.gulof.bitirme_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class bolum_1 extends AppCompatActivity {
    View ekranrengi;
    ImageView ekrankarart;
    int sayi=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_bolum_1);


        ekrankarart= findViewById(R.id.ekrankarart);

        ekranrengi=this.getWindow().getDecorView();

        sayi=0;
        //1.bölümdeki üçgene basarak ekranı karartma
        ekrankarart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sayi==0){//tuşa tıklandığında  açık gri rengi yapıyo ekranı
                    ekranrengi.setBackgroundResource(R.color.bir);

                }
                if(sayi==1){
                    ekranrengi.setBackgroundResource(R.color.iki);

                }
                if(sayi==2){
                    ekranrengi.setBackgroundResource(R.color.uc);

                }
                if(sayi==3){
                    ekranrengi.setBackgroundResource(R.color.dort);

                }
                if(sayi==4){
                    ekranrengi.setBackgroundResource(R.color.bes);

                }
                if(sayi==5){//enson tüm renkler yapılınca sonraki bölüme geçmek için
                    Intent intent = new Intent(bolum_1.this,bolum_2.class);
                    startActivity(intent);
                }
                sayi++;


            }
        });
    }
}
