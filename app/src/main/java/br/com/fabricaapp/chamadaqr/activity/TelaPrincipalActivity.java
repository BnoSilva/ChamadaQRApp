package br.com.fabricaapp.chamadaqr.activity;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
<<<<<<< HEAD
import android.widget.ImageView;
=======
>>>>>>> 2fe7c2bf6572e969e25683ccd96ef831882d647d
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import br.com.fabricaapp.chamadaqr.ClickRecyclerView;
import br.com.fabricaapp.chamadaqr.R;
import br.com.fabricaapp.chamadaqr.domain.Evento;
import br.com.fabricaapp.chamadaqr.adapter.EventoAdapter;

import static java.security.AccessController.getContext;


public class TelaPrincipalActivity extends AppCompatActivity implements ClickRecyclerView {

    private RecyclerView nRecyclerView;
    private RecyclerView.LayoutManager nLayoutManager;
    EventoAdapter adapter;
    private List<Evento> listaEvento = new ArrayList<>();
<<<<<<< HEAD

=======
    private FloatingActionButton floatingActionButton;
    private Button button;
>>>>>>> 2fe7c2bf6572e969e25683ccd96ef831882d647d

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);

        setRecyclerView();
    }

        public void setRecyclerView(){
        nRecyclerView = (RecyclerView) findViewById(R.id.recyclerEventos);
        nLayoutManager = new LinearLayoutManager(this);
        nRecyclerView.setLayoutManager(nLayoutManager);

        adapter = new EventoAdapter(listaEvento, this, this);

        nRecyclerView.setAdapter(adapter);

<<<<<<< HEAD
            for(int i = 0; i < 5; i++){
                Evento evento = new Evento();
                evento.nome = "Evento: " + i;
=======
            for(int i = 0; i < 3; i++){
                Evento evento = new Evento();
                evento.nome = "Teste";
>>>>>>> 2fe7c2bf6572e969e25683ccd96ef831882d647d
                listaEvento.add(evento);
            }
    }

<<<<<<< HEAD
=======
    public void setButtons(){
        floatingActionButton = (FloatingActionButton) findViewById(R.id.fab_fabteste);
    }

>>>>>>> 2fe7c2bf6572e969e25683ccd96ef831882d647d
    @Override
    public void onCustomClick(Object object) {

    }
<<<<<<< HEAD
=======

    public void listenerButtons(){
        floatingActionButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Evento evento = new Evento();

                listaEvento.add(evento);
                adapter.notifyDataSetChanged();
            }
        });
    }


>>>>>>> 2fe7c2bf6572e969e25683ccd96ef831882d647d
}
