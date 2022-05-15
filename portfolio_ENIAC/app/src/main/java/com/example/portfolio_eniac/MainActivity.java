package com.example.portfolio_eniac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.portfolio_eniac.dao.UsuarioDAO;
import com.example.portfolio_eniac.model.Usuario;

public class MainActivity extends AppCompatActivity {

    EditText txtUsuario, txtSenha;
    TextView lblResultado;
    Button btnLogar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUsuario = findViewById(R.id.txtUsuarioLogin);
        txtSenha = findViewById(R.id.txtSenhaLogin);
        lblResultado = findViewById(R.id.lblResultadoLogin);
        btnLogar = findViewById(R.id.btnLogar);
    }

    public void login(View v){
        String usuario = txtUsuario.getText().toString();
        String senha = txtSenha.getText().toString();

        Usuario usu = new UsuarioDAO().selecionaUsuario(usuario, senha);
        /*if(usu != null){
            lblResultado.setText("Login efetuado com sucesso!");
            Intent intent = new Intent(MainActivity.this, MenuPrincipal.class);
            startActivity(intent);

            finish();
        }else{
            lblResultado.setText("Usuário e/ou Senha inválida!");
            Limpar();
        }*/

        if(usuario.equalsIgnoreCase("admin")){
            if(senha.equalsIgnoreCase("1234")){
                lblResultado.setText("Login efetuado com sucesso!");
                Intent intent = new Intent(MainActivity.this, MenuPrincipal.class);
                startActivity(intent);

                finish();
            }else{
                lblResultado.setText("Senha inválida!");
                Limpar();
            }
        }else{
            lblResultado.setText("Usuário inválido!");
            Limpar();
        }
    }

    private void Limpar(){
        //txtUsuario.setText("");
        txtSenha.setText("");
        txtUsuario.requestFocus();
    };

}