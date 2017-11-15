package br.com.fabricaapp.chamadaqr.adapter;


import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

import br.com.fabricaapp.chamadaqr.ClickRecyclerView;
import br.com.fabricaapp.chamadaqr.R;
import br.com.fabricaapp.chamadaqr.domain.Evento;

import static android.os.Build.VERSION_CODES.M;

public class EventoAdapter extends RecyclerView.Adapter<EventoAdapter.EventoViewHolder> {
    public static ClickRecyclerView clickRecyclerView;
    private List<Evento> eventos;
    private Context context;

    public EventoAdapter(List<Evento> eventos, Context context, ClickRecyclerView clickRecyclerView){
        this.eventos = eventos;
        this.context = context;
        this.clickRecyclerView = clickRecyclerView;

    }

    @Override
    public EventoViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout, parent, false);
        //EventoViewHolder holder = new EventoViewHolder(view);
        return new EventoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(EventoViewHolder viewHolder, int position){
        //EventoViewHolder holder = (EventoViewHolder) viewHolder;
        Evento evento = eventos.get(position);
        viewHolder.nome.setText(evento.getNome());

    }

    @Override
    public int getItemCount(){
        return eventos.size();
    }

    /*public void setClickRecyclerView(ClickRecyclerView clickRecyclerView){
        this.
    }*/


    protected class EventoViewHolder extends RecyclerView.ViewHolder {
        final TextView nome;
        /*final TextView local;
        final TextView data;
        final TextView detalhes;*/
        CardView cardView;

        public EventoViewHolder(View view){
            super(view);

            nome = (TextView) view.findViewById(R.id.textview_nome);
            //cardView = (CardView) view.findViewById(R.id.card_view);

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clickRecyclerView.onCustomClick(eventos.get(getLayoutPosition()));
                }
            });
        }

    }
}
