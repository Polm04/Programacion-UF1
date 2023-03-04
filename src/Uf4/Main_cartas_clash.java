/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uf4;

import Objetos_Herencia.Cofre_argent;
import Objetos_Herencia.Cofre_or;
import Objetos_Herencia.Cofre_or_corones;

/**
 *
 * @author pomo6989
 */
public class Main_cartas_clash {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Cofre_argent Cofre1 = new Cofre_argent();
        Cofre_or Cofre2 = new Cofre_or();
        Cofre_or_corones Cofre3 = new Cofre_or_corones();

        Cofre1.obrir_cofre();
        System.out.println(Cofre1.mostrarCofre());
        
        Cofre2.obrir_cofre();
        System.out.println(Cofre2.mostrarCofre());
        
        Cofre3.obrir_cofre();
        System.out.println(Cofre3.mostrarCofre());
    }
}
