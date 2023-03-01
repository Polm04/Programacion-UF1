/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uf4;

import Objetos_Herencia.Pokemon;
import Objetos_Herencia.Pokemon_agua;
import Objetos_Herencia.Pokemon_electric;
import Objetos_Herencia.Pokemon_veri;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pomo6989
 */
public class pokemon_main_conArrayList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //añadir los pokemons sin el array list
        //Pokemon_agua agua = new Pokemon_agua("agua");
        //Pokemon_electric electric = new Pokemon_electric("electric");
        //Pokemon_veri veri = new Pokemon_veri("veri");

        //arraylist definida con la clase pokemon
        List<Pokemon> LLuitadors = new ArrayList<Pokemon>();

        //escojer el objeto a añadir en el arraylist
        System.out.println("Escojer el pokemon a poner(0-agua)(1-electrico)(2-veneno)");
        int opcion = sc.nextInt();
        
        LLuitadors.add(new Pokemon_veri("veri"));
        //añadir
        if (opcion == 0) {
            LLuitadors.add(new Pokemon_agua("agua"));
        } else if (opcion == 1) {
            LLuitadors.add(new Pokemon_electric("electrico"));
        } else if (opcion == 2) {
            LLuitadors.add(new Pokemon_veri("electrico"));
        }

        //mostrar
        for (Pokemon lluitadors : LLuitadors) {
            System.out.println(lluitadors);
        }
        
        //batalla
        //el 0 ataca al 1
        LLuitadors.get(1).RebreAtac(LLuitadors.get(0).atac());
        
        
        //equals
        //if (agua.equals(agua)) {
        //  System.out.println("Iguales");
        //} else {
        //System.out.println("Diferentes");
        //}
        
        //batalla sense arraylist       
        //agua.RebreAtac(veri.atac());//veri ataca a agua
        //electric.RebreAtac(agua.atac());//agua ataca a electric
        //veri.RebreAtac(electric.atac());//electric ataca a agua
    }

}
