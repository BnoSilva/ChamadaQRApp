package br.com.fabricaapp.chamadaqr.activity;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import br.com.fabricaapp.chamadaqr.ClickRecyclerView;
import br.com.fabricaapp.chamadaqr.R;
import br.com.fabricaapp.chamadaqr.domain.Evento;
import br.com.fabricaapp.chamadaqr.adapter.EventoAdapter;


public class TelaPrincipalActivity extends AppCompatActivity implements ClickRecyclerView {

    private RecyclerView nRecyclerView;
    private RecyclerView.LayoutManager nLayoutManager;
    EventoAdapter adapter;
    private List<Evento> listaEvento = new ArrayList<>();
    private FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);

        setRecyclerView();
        setButtons();
        listenerButtons();
    }

        public void setRecyclerView(){
        nRecyclerView = (RecyclerView) findViewById(R.id.recyclerEventos);
        nLayoutManager = new LinearLayoutManager(this);
        nRecyclerView.setLayoutManager(nLayoutManager);

        adapter = new EventoAdapter(listaEvento, this, this);
        nRecyclerView.setAdapter(adapter);

            for(int i = 0; i < 3; i++){
                Evento evento = new Evento("Teste", "Teste", "Teste", "Teste");
                listaEvento.add(evento);
            }
    }


    public void setButtons(){

        floatingActionButton = (FloatingActionButton) findViewById(R.id.fab_fabteste);

    }

    @Override
    public void onCustomClick(Object object) {

    }

    public void listenerButtons(){
        floatingActionButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Evento evento = new Evento("Teste", "Teste", "Teste", "Teste");

                listaEvento.add(evento);
                adapter.notifyDataSetChanged();
            }
        });
    }

}
