package com.mycompany.main;

public class Musica {
    private String titulo;
    private float duracao;

    public Musica() {
    }

    public Musica(String titulo, float duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getDuracao() {
        return duracao;
    }

    public void setDuracao(float duracao) {
        this.duracao = duracao;
    }
    
    public void cadastrarMusica(){}  
}
