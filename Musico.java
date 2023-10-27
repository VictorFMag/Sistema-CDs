package com.mycompany.main;

import java.util.Scanner;

public class Musico {
    private String nome;
    private boolean isSolo;

    public Musico() {
    }

    public Musico(String nome, boolean isSolo) {
        this.nome = nome;
        this.isSolo = isSolo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isIsSolo() {
        return isSolo;
    }

    public void setIsSolo(boolean isSolo) {
        this.isSolo = isSolo;
    }
    
    public static Musico cadastrarMusico(){
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o nome do músico: ");
        String nome = in.next();
        System.out.print("Digite se o músico é solo: ");
        boolean isSolo = in.nextBoolean();
        
        Musico m = new Musico(nome, isSolo);
        return m;
    }

    @Override
    public String toString() {
        return "Musico{" + "nome=" + nome + ", isSolo=" + isSolo + '}';
    }
}
