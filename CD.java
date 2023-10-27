package com.mycompany.main;

import java.util.ArrayList;

public class CD {
    
    private String titulo;
    private int ano;
    private boolean isDuplo;
    private boolean isColetanea;
    private ArrayList<Musica> listaMusicas;
    private Musico musico;
    
    public void cadastro(){};
    public void listarCDbyMusico(){};

    public CD() {}

    public CD(String titulo, int ano, boolean isDuplo, boolean isColetanea, ArrayList<Musica> listaMusicas, Musico musico) {
        this.titulo = titulo;
        this.ano = ano;
        this.isDuplo = isDuplo;
        this.isColetanea = isColetanea;
        this.listaMusicas = listaMusicas;
        this.musico = musico;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isIsDuplo() {
        return isDuplo;
    }

    public void setIsDuplo(boolean isDuplo) {
        this.isDuplo = isDuplo;
    }

    public boolean isIsColetanea() {
        return isColetanea;
    }

    public void setIsColetanea(boolean isColetanea) {
        this.isColetanea = isColetanea;
    }

    public ArrayList<Musica> getListaMusicas() {
        return listaMusicas;
    }

    public void setListaMusicas(ArrayList<Musica> listaMusicas) {
        this.listaMusicas = listaMusicas;
    }

    public Musico getMusico() {
        return musico;
    }

    public void setMusico(Musico musico) {
        this.musico = musico;
    }
}
