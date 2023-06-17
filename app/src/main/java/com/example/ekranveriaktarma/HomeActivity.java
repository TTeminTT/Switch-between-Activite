package com.example.ekranveriaktarma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ekranveriaktarma.databinding.ActivityHomeBinding;

import org.w3c.dom.Text;

public class HomeActivity extends AppCompatActivity {
    private String txtKullanici;

    private ActivityHomeBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        txtKullanici = binding.txtViewKullanici.getText().toString();
    }
}