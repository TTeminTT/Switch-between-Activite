package com.example.ekranveriaktarma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import com.example.ekranveriaktarma.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private String kullaniciAdi,sifre;
    private ActivityMainBinding bagla;
    private String sonuc;
    private String kAdi , kParola , dogruKAdi = "EMİN" , dogruKparola="1234A";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bagla = ActivityMainBinding.inflate(getLayoutInflater());
        View view = bagla.getRoot();
        setContentView(view);

        kullaniciAdi=bagla.editTxtKullaniciAdi.getText().toString();
        sonuc=bagla.txtSonuc.getText().toString();
        sifre=bagla.editTxtSifre.getText().toString();




    }
    public void btnGirisYap(View v){
        if (!TextUtils.isEmpty(kAdi)){
            if (!TextUtils.isEmpty(kParola)){
                if (kAdi.equals(dogruKAdi)){
                    if (kParola.equals(dogruKparola)){

                    }else

                }
            }
        }



    }
}