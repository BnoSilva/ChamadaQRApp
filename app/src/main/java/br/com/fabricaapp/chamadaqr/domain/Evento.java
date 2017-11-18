package br.com.fabricaapp.chamadaqr.domain;


public class Evento {
    public String nome;
    public String local;
    public String data;
    public String detalhes;

    /*public Evento(String nome, String local, String data, String detalhes) {
        this.nome = nome;
        this.local = local;
        this.data = data;
        this.detalhes = detalhes;
    }*/

    public String getNome() {
        return nome;
    }

    public String getLocal() {
        return local;
    }

    public String getData() {
        return data;
    }

    public String getDetalhes() {
        return detalhes;
    }
}
