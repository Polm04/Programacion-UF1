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
public class ArrayTirarDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] dado = new int[6];
        for (int i = 1; i < dado.length; i++) {
            dado[i] = 0;
        }
        int lanzamiento=simularLanzamiento(dado);
        int[] contadorCaras=contadorTiradas(dado, lanzamiento);
        for (int i = 0; i <dado.length; i++) {
            System.out.println("La cara "+(i+1)+ " a salido "+dado[i]);
        }
          
    }

    private static int simularLanzamiento(int[] dado) {
        Random rd = new Random();
        int lanzamiento = rd.nextInt(6)+1;
        System.out.println(lanzamiento);
        return lanzamiento;
    }
    public static int[] contadorTiradas(int[] dado, int lanzamiento) {
        if (lanzamiento == 1) {
            dado[1-1]++;
        } else if (lanzamiento == 2) {
            dado[2-1]++;
        } else if (lanzamiento == 3) {
            dado[3-1]++;
        } else if (lanzamiento == 4) {
            dado[4-1]++;
        } else if (lanzamiento == 5) {          
            dado[5-1]++;
        } else {
            dado[6-1]++;
        }       
        return dado;
    }
}
