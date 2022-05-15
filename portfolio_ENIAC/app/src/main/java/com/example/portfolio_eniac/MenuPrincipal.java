package com.example.portfolio_eniac;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.portfolio_eniac.view.ListaDenuncia;

public class MenuPrincipal extends AppCompatActivity {

    Button btnDenuncias = null;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        btnDenuncias = findViewById(R.id.btnMenuDenuncias);
        btnDenuncias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuPrincipal.this, ListaDenuncia.class);
                startActivity(intent);

            }
        });

    }
}