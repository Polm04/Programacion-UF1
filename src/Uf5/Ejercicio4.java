/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uf5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pomo6989
 */
public class Ejercicio4 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        //variable
        int numero_elegido = 0;

        //array
        int[] array = new int[5];

        //inicializarlo
        for (int i = 0; i < array.length; i++) {
            int numero_random = rd.nextInt(1, 10);
            array[i] = numero_random;
        }

        //elegirlo
        do {
            try {
                System.out.println("Que numero quieres mostrar?");
                numero_elegido = sc.nextInt();
                //mostrarlo
                System.out.println(array[numero_elegido]);
            } catch (ArrayIndexOutOfBoundsException ex) { //ArrayIndexOutOfBoundsException sirve para el array cuando es sobrepasado
                System.out.println("As sobrepasado el array: no existe esta posicion");
            }
        } while (!(numero_elegido < 0));

        System.out.println("Fin");
    }

}
