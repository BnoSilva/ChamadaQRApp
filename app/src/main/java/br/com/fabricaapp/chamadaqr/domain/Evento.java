package br.com.fabricaapp.chamadaqr.domain;


public class Evento {
    private final String nome;
    private final String local;
    private final String data;
    private final String detalhes;

    public Evento(String nome, String local, String data, String detalhes) {
        this.nome = nome;
        this.local = local;
        this.data = data;
        this.detalhes = detalhes;
    }

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
