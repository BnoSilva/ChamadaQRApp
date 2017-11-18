package br.com.fabricaapp.chamadaqr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaPrincipal extends AppCompatActivity {

    public Button btnQr;
    public int result = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);

        btnQr = (Button) findViewById(R.id.btnQr);
        btnQr.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent telaQr = new Intent(TelaPrincipal.this, TelaQr.class);
                startActivityForResult(telaQr, result);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        if(requestCode == result){
            if(resultCode == RESULT_OK){
                btnQr.setText(data.getStringExtra("nome"));
            }
        }
    }
}
