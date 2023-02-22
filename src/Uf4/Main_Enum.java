/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Uf4;

import Enum.Demarcacion;
import Enum.Equipo;

/**
 *
 * @author mabardaji
 */
public class Main_Enum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //printDemarcacion();
        printEquipo();
    }

    private static void printDemarcacion() {
        Demarcacion jugador = Demarcacion.DEFENSA; // Instancia de un enum de la clase Demarcación
        Demarcacion jugador2 = Demarcacion.DELANTERO; // Instancia de un enum de la clase Demarcación
        //Demarcacion jugador3 = "DELANTERO"; //error no permet
        System.out.println("***name()***");
        System.out.println(jugador.name());//Devuelve un String con el nombre de la constante (DEFENSA)
        System.out.println(jugador2.name());// Devuelve un String con el nombre de la constante (DELANTERO)
        System.out.println("***toString()***");
        System.out.println(jugador.toString());//Devuelve un String con el nombre de la constante (DEFENSA)
        System.out.println(jugador2.toString());// Devuelve un String con el nombre de la constante (DELANTERO)
        System.out.println("***ordinal()***");
        System.out.println(jugador.ordinal());// Devuelve un entero con la posición del enum según está declarada(1).
        System.out.println(jugador2.ordinal());// Devuelve un entero con la posición del enum según está declarada(3).
        System.out.println("***values()***");
        Demarcacion[] lista = Demarcacion.values();//Devuelve un array que contiene todos los enum
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i].name()+ "-");
        }
        System.out.println("");
        Demarcacion jugador3 = lista[2];
        System.out.println(jugador3.name());
        Demarcacion jugador4 = Demarcacion.values()[0];
        System.out.println(jugador4.name());
    }

    private static void printEquipo() {
        Equipo lleida = Equipo.LLEIDA;
        
        System.out.println("lleida name " + lleida.name());
        System.out.println(lleida.getNombre_equipo());
        System.out.println(lleida.getPos_liga_anterior());
    }
    
}