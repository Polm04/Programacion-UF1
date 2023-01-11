/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UF1_bidimensional;

import java.util.Scanner;

/**
 *
 * @author pomo6989
 */
public class MaquinaExpendedora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int columna = 4;
        final int fila = 4;
        int opcio;

        String[][] Golosinas=NombresGolosinas();
        inicializarExistencias(fila, columna);

        double[][] precio = {
            {1.1, 0.8, 1.5, 0.9},
            {1.8, 1, 1.2, 1},
            {1.8, 1.3, 1.2, 0.8},
            {1.5, 1.1, 1.1, 1.1}
        };
        
        opcio = menu();       
        do {
            switch (opcio) {
                case 1:
                    pedirGolosina(NombresGolosinas());
                    break;
                case 2:
                    for (int i = 0; i<Golosinas.length; i++) {
                        for (int j = 0; j<Golosinas.length; j++) {
                            System.out.println("Columna "+i+" fila "+j+"= "+Golosinas[i][j]);
                        }
                    }                    
                    break;
                case 3:
                    inicializarExistencias(fila, columna);
                    break;
                case 4:
                    System.out.println();
                    break;
            }
        } while (opcio==0);

    }

    public static String[][] NombresGolosinas() {
        String[][] Golosinas = {
            {"KitKat", "Chicles de fresa", "Lacasitos", "Palotes"},
            {"Kinder Bueno", "Bolsa variada Haribo", "Chetoos", "Twix"},
            {"Kinder Bueno", "M&M'S", "Papa Delta", "Chicles de menta"},
            {"Lacasitos", "Crunch", "Milkybar", "KitKat"}

        };
        return Golosinas;
    }

    private static int menu() {
        int opcion;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("*****************************");
            System.out.println("1.- Demanar llaminadura");
            System.out.println("2.- Mostra llaminadures");
            System.out.println("3.- Omplir llaminadures");
            System.out.println("4.- Mostrar existencias maquina");
            System.out.println("0.- Apagar maquina");
            System.out.println("Escull opcio");
            opcion = sc.nextInt();
        } while (!(opcion >= 0 && opcion <= 4));
        return opcion;
    }

    private static void pedirGolosina(String[][] nombresGolosinas) {
        int columna_elegida, fila_elegida;
        Scanner sc = new Scanner(System.in);
        System.out.println("Que llaminadura vols demanar?(hi ha 4 columnes i 4 files)");
        System.out.println("Que fila vols?");
        columna_elegida = sc.nextInt();
        System.out.println("Que columna vols?");
        fila_elegida = sc.nextInt();
        System.out.println(nombresGolosinas[fila_elegida][columna_elegida]);

        
    }

    private static void inicializarExistencias(int fila, int columna) {
        int[][] existencia = new int[4][4];
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                existencia[i][j] = 5;
            }
        }
    }
}
