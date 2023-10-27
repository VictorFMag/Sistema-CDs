/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.main;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
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
