/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UF1;

import java.util.Random;

/**
 *
 * @author pomo6989
 */
public class ArrayCubiletes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[] cubiletes = new char[3];
        inicializarCubiletes(cubiletes);
        MostrarArrayChar(cubiletes);
        for (int i = 1; i <=10; i++) {
            System.out.println("Cambio: " + i);
            moverCubiletes(cubiletes);
            MostrarArrayChar(cubiletes);
        }
    }

    private static void inicializarCubiletes(char[] cubiletes) {
        Random rd = new Random();
        for (int i = 0; i < cubiletes.length; i++) {
            cubiletes[i] = 'x';
        }
        int bolita = rd.nextInt(3);
        if (bolita == 1) {
            cubiletes[1] = '0';
        } else if (bolita == 2) {
            cubiletes[2] = '0';
        } else {
            cubiletes[3] = '0';
        }
    }

    public static void MostrarArrayChar(char[] cubiletes) {
        for (int i = 0; i < cubiletes.length; i++) {
            System.out.println(cubiletes[i]);
            if (i != (cubiletes.length - 1)) {
                System.out.println("-");
            }
        }
    }

    public static void moverCubiletes(char[] cubiletes) {
        Random rd = new Random();
        int posicion_1, posicion_2;
        do {
            posicion_1 = rd.nextInt(3);
            posicion_2 = rd.nextInt(3);
        } while (posicion_1 == posicion_2);
        System.out.println("Cambio la posicion " + (posicion_1 + 1) + " por la posicion " + (posicion_2 + 1));
        char aux = cubiletes[posicion_1];
        cubiletes[posicion_1] = cubiletes[posicion_2];
        cubiletes[posicion_2] = aux;
    }
}
