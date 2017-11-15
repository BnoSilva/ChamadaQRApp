package br.com.fabricaapp.chamadaqr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.widget.*;
import android.view.View;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {

    EditText txt_Login, txt_Senha;
    Button botao_Login, botao_Registrar;
    AlertDialog alertaLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_Login = (EditText) findViewById(R.id.txtUsuario);
        txt_Senha = (EditText) findViewById(R.id.txtSenha);

        botao_Login = (Button) findViewById(R.id.btnLogin);
        botao_Login.setOnClickListener(this);

        botao_Registrar = (Button) findViewById(R.id.btnRegistrar);
        botao_Registrar.setOnClickListener(this);
    }

        public void onClick (View view){
            switch (view.getId()) {
                case R.id.btnLogin:
                    String usuario = txt_Login.getText().toString();
                    String senha = txt_Senha.getText().toString();
                    if (usuario.equals("admin") && senha.equals("1234")) {
                        startActivity(new Intent(MainActivity.this, br.com.fabricaapp.chamadaqr.TelaPrincipal.class));
                    } else {
                        AlertDialog.Builder msgErro = new AlertDialog.Builder(this);
                        msgErro.setTitle("Erro");
                        msgErro.setMessage("Usuário ou Senha incorretos\nTente Novamente");
                        alertaLogin = msgErro.create();
                        alertaLogin.show();
                    }
                break;
                case R.id.btnRegistrar:
                    startActivity(new Intent(MainActivity.this, br.com.fabricaapp.chamadaqr.TelaCadastro.class));
                    break;
            }
        }

    }
