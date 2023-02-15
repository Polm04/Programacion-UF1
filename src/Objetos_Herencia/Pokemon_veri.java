/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos_Herencia;

import java.util.Random;

/**
 *
 * @author pomo6989
 */
public class Pokemon_veri extends Pokemon {

    private final String Tipus = "Veri";
    private boolean defensa;

    //constructor
    public Pokemon_veri(String NomPokemon) {
        super(NomPokemon);
        defensa = false;
        vida = 40;
    }

    //metodos
    private void ataca(int atac) {
        System.out.println(NomPokemon + " a ataca amb forca= " + atac);
    }

    public boolean defensa_veri() {
        if (vida < 15) {
            defensa = true;
            System.err.println("La defensa esta activada");
        }
        ataca(vida);
        return defensa;
    }

    public int atac() {
         Random rd = new Random();
        int atac = rd.nextInt(0, 10);
        
        
        ataca(atac);       
        return atac;
    }

    public boolean RebreAtac(int atac) {
        if (defensa == true) {
            vida -= (atac / 2);
        } else {
            vida -= atac;
        }
        if (vida <= 0) {
            viu = false;
        } else {
            viu = true;
        }
        return viu;
    }
}
