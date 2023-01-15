/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UF1_bidimensional;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pomo6989
 */
public class Conecta4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Jugadores = 2;
        final int Filas = 6;
        final int Columnas = 7;

        int[][] tablero = new int[Filas][Columnas];
        //pedir nombre
        String nombre1 = PedirNoms(Jugadores);
        System.out.println("El primer nom es " + nombre1);
        String nombre2 = PedirNoms(Jugadores);
        System.out.println("El primer segon es " + nombre2);
        System.out.println("*********************************");
        //Qui inicia
        int inici = tiraInici();
        if (inici == 1) {
            System.out.println("Comença " + nombre1);
        } else {
            System.out.println("Comença " + nombre2);
        }
        System.out.println("*********************************");
        //tauler inicialitzat
        int[][] tablero_inicialitzat = inicializarTaluer(tablero);
        //mostrar tauler inici
        Mostrar_tauler(tablero_inicialitzat);
        //tirada
//        tirada(tablero, inici, Columnas);
        //mostrar tauler
//        char tauler =Mostrar_casella_usuari(tablero_inicialitzat, Filas, Columnas);
//        System.out.println(tauler);
    }

    /**
     *
     * @param frase
     * @return
     */
    public static String PedirNoms(int Jugadores) {
        String nom;
        Scanner sc = new Scanner(System.in);
        if (Jugadores == 2) {
            System.out.println("Pon el nom");
            nom = sc.nextLine();
            PedirNoms(Jugadores - 1);
            return nom;
        } else if (Jugadores <= 0) {
            return "";
        }
        return "";
    }

    /**
     *
     * @return 1 si comença el 1 i el 2 si comença el 2
     */
    public static int tiraInici() {
        Random rd = new Random();
        int inici = rd.nextInt(2) + 1;
        return inici;
    }

    public static int[][] inicializarTaluer(int[][] tablero) {
        //inicializarlo
        for (int fila = 0; fila < tablero.length; fila++) {
            for (int columna = 0; columna < tablero.length; columna++) {
                tablero[fila][columna] = 0;
            }
        }
        return tablero;
    }

    /**
     * mostramos el tablero
     *
     * @param tablero_inicialitzat
     */
    public static void Mostrar_tauler(int[][] tablero_inicialitzat) {
        for (int i = 0; i < tablero_inicialitzat.length; i++) {
            for (int j = 0; (tablero_inicialitzat[i] != null && j < tablero_inicialitzat[i].length); j++) {
                System.out.print(tablero_inicialitzat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("*********************************");
    }

    /**
     * retorna char '-' si el valor es 0, 'x' si el valor es un 1,'0' si es un 2
     *
     * @param tablero
     * @param fila
     * @param columna
     * @return
     */
    public static char Mostrar_casella_usuari(int[][] tablero, int fila, int columna) {
        if (tablero[fila][columna] == 0) {
            return '-';
        } else if (tablero[fila][columna] == 1) {
            return 'x';
        } else {
            return '0';
        }
    }

//    public static void tirada(int[][] tablero, int turno, int columna) {
//        boolean trobat = false;
//        for (int i = 0; i < 10; i++) {
//            if (tablero[i][columna] == 0) {
//                tablero[i][columna] = turno;
//                trobat = true;
//            }
//        }
//    }
}
