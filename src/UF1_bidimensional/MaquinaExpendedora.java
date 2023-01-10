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
        int columna_elegida, fila_elegida;
        int opcio;
        int[][] opcion_llaminadura = new int[fila][columna];
        String[][] nombresGolosinas = new String[4][4];
        NombresGolosinas(nombresGolosinas);
        
        double[][] precio = {
            {1.1, 0.8, 1.5, 0.9},
            {1.8, 1, 1.2, 1},
            {1.8, 1.3, 1.2, 0.8},
            {1.5, 1.1, 1.1, 1.1}

        };

        int[][] existencia = new int[4][4];
        inicializarExistencias(existencia);
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                existencia[i][j] = 5;
            }
        }
        opcio = menu();
        do {
            switch (opcio) {
                case 1:
                    pedirGolosina(nombresGolosinas);
                    break;
                case 2:
                    break;
            }
        } while (true);
        
    }

    public static void NombresGolosinas(String[][] nombresGolosinas) {
        nombresGolosinas = new String[][]{
            {"KitKat", "Chicles de fresa", "Lacasitos", "Palotes"},
            {"Kinder Bueno", "Bolsa variada Haribo", "Chetoos", "Twix"},
            {"Kinder Bueno", "M&M'S", "Papa Delta", "Chicles de menta"},
            {"Lacasitos", "Crunch", "Milkybar", "KitKat"}
        };
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
            System.out.println("0.- Apagar m�quina");
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

    private static void inicializarExistencias(int[][] existencia) {

    }
}
