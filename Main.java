package com.mycompany.main;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Musico> musicos_list = new ArrayList<>();
        
        Musico M1 = Musico.cadastrarMusico();
        
        System.out.println(M1);
        
        musicos_list.add(M1);
        System.out.println(musicos_list);
        
        for(int i=0; i<3; i++){
            Musico m = Musico.cadastrarMusico();
            musicos_list.add(m);
        }
    }
}
