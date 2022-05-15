package com.example.portfolio_eniac.view;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;

import com.example.portfolio_eniac.R;
import com.example.portfolio_eniac.dao.DenunciaDAO;
import com.example.portfolio_eniac.model.Denuncia;

import java.util.List;

public class ListaDenuncia<textView> extends AppCompatActivity {

    View txtNomeDenuncia;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_denuncia);

        preenche();

    }

    private void preenche() {
        DenunciaDAO dao = new DenunciaDAO();
        List<Denuncia> list = dao.getAll();
        for (int i = 0; i < list.size(); i++){

        }
        }
    }