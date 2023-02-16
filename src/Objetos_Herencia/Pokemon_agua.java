/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos_Herencia;

import java.util.Objects;
import java.util.Random;

/**
 *
 * @author pomo6989
 */
public final class Pokemon_agua extends Pokemon {

    private final String tipus = "Agua";
    private int corasses;

    //constrictor
    public Pokemon_agua(String NomPokemon) {
        super(NomPokemon);
        corasses = 2;
        vida = 45;
    }

    //metodos
    private void ataca(int atac) {
        System.out.println(NomPokemon + " a ataca amb forca= " + atac);
    }

    public int atac() {
        Random rd = new Random();
        int atac = rd.nextInt(0, 10);
        ataca(atac);
        return atac;
    }

    public boolean RebreAtac(int atac) {
        if (corasses > 0) {
            System.err.println("MENOS UNA CORAZA");
            corasses--;
            System.err.println("Te quedan= "+corasses);
        } else {
            vida -= atac;
            System.out.println("");
        }
        if (vida <= 0) {
            viu = false;
        } else {
            viu = true;
        }
        return viu;
    }
}
