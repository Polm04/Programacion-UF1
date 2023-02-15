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
public final class Pokemon_electric extends Pokemon {

    private final String Tipus = "Electric";
    private int potenciador;

    //constructor
    public Pokemon_electric(String NomPokemon) {
        super(NomPokemon);
        potenciador = 2;
        vida = 50;

    }

    //metodos
    private void ataca (int atac){
        System.out.println(NomPokemon+" a ataca amb forca= "+atac);
    }
    public int atac() {
        Random rd=new Random();
        int atac =rd.nextInt(0, 10);
        if (atac <= 4 && potenciador > 0) {
            atac += 5;
            System.err.println("Atac potenciat");
        }       
        ataca(atac);
        return atac;
    }

    public boolean RebreAtac(int atac) {
        vida -= atac;
        if (vida <= 0) {
            viu = false;
        } else {
            viu = true;
        }
        return viu;
    }
}
