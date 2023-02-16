/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uf4;

import Objetos_Herencia.Pokemon_agua;
import Objetos_Herencia.Pokemon_electric;
import Objetos_Herencia.Pokemon_veri;

/**
 *
 * @author pomo6989
 */
public class pokemon_main {

    public static void main(String[] args) {
        Pokemon_agua agua = new Pokemon_agua("agua");
        Pokemon_electric electric = new Pokemon_electric("electric");
        Pokemon_veri veri = new Pokemon_veri("veri");

        //equals
        if (agua.equals(agua)) {
            System.out.println("Iguales");
        } else {
            System.out.println("Diferentes");
        }

        //batalla   
        agua.RebreAtac(veri.atac());//veri ataca a agua
        electric.RebreAtac(agua.atac());//agua ataca a electric
        veri.RebreAtac(electric.atac());//electric ataca a agua
    }

}
