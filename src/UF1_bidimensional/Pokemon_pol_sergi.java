/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UF1_bidimensional;

import java.util.Scanner;

/**
 *
 * @author jupr7227
 */
public class Pokemon_pol_sergi {

    /**
     * @param args the command line arguments
     *
     *
     * 1-Mostrar impacto de atacante 1 al atacante 2 (Pedir 2 tipos de pokemon)"
     * + "2-Mostrar debilidades para un tipo pokemon (los que tienen doble)
     * (Pedir tipo pokemon)\n" + "3-Mostrar todos los daños para un tipo de
     * pokemon. (Pedir tipo pokemon)\n" + "4-Mostrar con que pokemons es mas
     * efectivo un tipo pokemon y contar cuantos hay. (Pedir tipo pokemon)\n" +
     * "5-Mostrar todas las combinaciones de ataques que tenga la efectividad
     * buscada y contar cuantos hay (pedir efectividad a buscar)");
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        Scanner sc = new Scanner(System.in);
        String[] tiposPokemon = tipospokemon();      
        double[][] efectividadesPokemon=efectividadesPokemon();
        System.out.println("1-Mostrar Tipos pokemon");
        System.out.println("2-Mostrar tabla de efectividat");
        System.out.println("3-Mostrar debilidades Pokemon");
        System.out.println("4-Mostrar fortalezas");
        System.out.println("5-Mostrar tipo de efectividat a elegir");
        System.out.println("6-Lucha");
        System.out.println("7-Salir");
        System.out.println("****************************");
        do{
        System.out.println("Elige la opcion");
        opcion=sc.nextInt();       
        }while(!(opcion>=1 && opcion<=7));
        switch (opcion) {
            case 1:
                MostrarPokemons(tiposPokemon);
                break;
            case 2:
                for (int i = 0; i < efectividadesPokemon().length; i++) {
                    for (int j = 0; j < efectividadesPokemon().length; j++) {
                        System.out.println(efectividadesPokemon[i][j]);
                    }
                }
                
                break;
            default:
              break;
        }
        menuElegirPokemon(tiposPokemon,efectividadesPokemon);
        menuDebilidadesPokemon(tiposPokemon, efectividadesPokemon); 
        
    }

    public static double[][] efectividadesPokemon() {
        double[][] efectividadesPokemon = {
            /*ACERO   AGUA   BICHO   DRAGON   ELÉC   FANT   FUEGO   HADA   HIELO   LUCHA   NORMAL   PLANTA   PSI   ROCA   SINIE  TIERRA   VENENO   VOLADOR   */
            {0.5, 0.5, 1, 1, 0.5, 1, 0.5, 2, 2, 1, 1, 1, 1, 2, 1, 1, 1, 1}, //ACERO
            {1, 0.5, 1, 0.5, 1, 1, 2, 1, 1, 1, 1, 0.5, 1, 2, 1, 2, 1, 1}, //AGUA
            {0.5, 1, 1, 1, 1, 0.5, 0.5, 0.5, 1, 0.5, 1, 2, 2, 1, 2, 1, 0.5, 0.5}, //BICHO
            {0.5, 1, 1, 2, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, // DRAGÓN
            {1, 2, 1, 0.5, 0.5, 1, 1, 1, 1, 1, 1, 0.5, 1, 1, 1, 0, 1, 2}, // ELÉCTRICO
            {1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 0, 1, 2, 1, 0.5, 1, 1, 1}, // FANTASMA
            {2, 0.5, 2, 0.5, 1, 1, 0.5, 1, 2, 1, 1, 2, 1, 0.5, 1, 1, 1, 1}, // FUEGO
            {0.5, 1, 1, 2, 1, 1, 0.5, 1, 1, 2, 1, 1, 1, 1, 2, 1, 0.5, 1}, // HADA
            {0.5, 0.5, 1, 2, 1, 1, 0.5, 1, 0.5, 1, 1, 2, 1, 1, 1, 2, 1, 2}, // HIELO
            {2, 1, 0.5, 1, 1, 0, 1, 0.5, 2, 1, 2, 1, 0.5, 2, 2, 1, 0.5, 0.5}, // LUCHA
            {0.5, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0.5, 1, 1, 1, 1}, // NORMAL
            {0.5, 2, 0.5, 0.5, 1, 1, 0.5, 1, 1, 1, 1, 0.5, 1, 2, 1, 2, 0.5, 0.5}, // PLANTA
            {0.5, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 0.5, 1, 0, 1, 2, 1}, // PSÍQUICO
            {0.5, 1, 2, 1, 1, 1, 2, 1, 2, 0.5, 1, 1, 1, 1, 1, 0.5, 1, 2}, // ROCA
            {1, 1, 1, 1, 1, 2, 1, 0.5, 1, 0.5, 1, 1, 2, 1, 0.5, 1, 1, 1}, // SINIESTRO
            {2, 1, 0.5, 1, 2, 1, 2, 1, 1, 1, 1, 0.5, 1, 2, 1, 1, 2, 0}, // TIERRA
            {0, 1, 1, 1, 1, 0.5, 1, 2, 1, 1, 1, 2, 1, 0.5, 1, 0.5, 0.5, 1}, // VENENO
            {0.5, 1, 2, 1, 0.5, 1, 1, 1, 1, 2, 1, 2, 1, 0.5, 1, 1, 1, 1} // VOLADOR
        };
        return efectividadesPokemon;
    }

    public static String[] tipospokemon() {
        String[] tiposPokemon = {
            "ACERO",
            "AGUA",
            "BICHO",
            "DRAGÓN",
            "ELÉCTRICO",
            "FANTASMA",
            "FUEGO",
            "HADA",
            "HIELO",
            "LUCHA",
            "NORMAL",
            "PLANTA",
            "PSÍQUICO",
            "ROCA",
            "SINIESTRO",
            "TIERRA",
            "VENENO",
            "VOLADOR"
        };
        return tiposPokemon;
    }

    public static void menuElegirPokemon(String[] tiposPokemon,double [][]daño) {
        int pokemon_elegido, pokemon_atacado;
        Scanner sc = new Scanner(System.in);
        //elegir pokemon tuyo
        System.out.println("Que tipo de pokemon quieres elegir?");
        pokemon_elegido = sc.nextInt();
        System.out.println(tiposPokemon[pokemon_elegido]);
        //elegir a quien atacas
        System.out.println("A que tipo de pokemon quieres atacar?");
        pokemon_atacado = sc.nextInt();
        System.out.println(tiposPokemon[pokemon_atacado]);
        //mostrar daño
        System.out.println("El daño es :"+daño[pokemon_elegido][pokemon_atacado]);

    }
    public static void MostrarPokemons(String[] tipospokemon) {     
        for (int i = 0; i <tipospokemon.length; i++) {
            System.out.print(i+":"+tipospokemon[i]+" - ");
        }
        System.out.println("");
    }
    public static void menuDebilidadesPokemon(String[] tiposPokemon,double [][]daño) {
        System.out.println("******************************");
        for (int i = 0; i <daño.length; i++) {
            for (int j = 0; j <daño.length; j++) {
                if(daño[i][j]==2)
                {
                    System.out.println("Pokemon elegido: "+tiposPokemon[i]);
                    System.out.println("Pokemon atacado: "+tiposPokemon[j]);
                    System.out.println("------");
                }
            }
        }
    }
    
}
