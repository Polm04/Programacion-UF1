/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uf5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author pomo6989
 */
public class TeoriaExceptions {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variables
        try { //con el try aunque de error no petara i seguira el programa
            int numero_1 = 4;
            int numero_2 = 0;
            int division = numero_1 / numero_2;
            System.out.println(division);
        } catch (Exception e) {
            System.out.println("Exeption generada en main" + e.getMessage()); //muestra nuestro error
            e.printStackTrace();//muestra el error que da siempre java
        }
        //division
        //mostrar disision
        //array
        try {
            int[] numero = new int[3];
            for (int i = 0; i < 10; i++) {
                System.out.println(numero[i]);
            }
        } catch (Exception Err_arr) {
            System.out.println("Exception generada: no puedes poner o mostrar un numero de vezes mas grande que el propio array");
            Err_arr.printStackTrace();

        }

        //try para metodos
        try {
            metodoPedirEntero();
        } catch (InputMismatchException ex) { //InputMismatchException
            System.out.println("No has puesto un entero");
        }

        try {
            PausaUnSegundo();
        } catch (InterruptedException ex) {
            System.out.println("Pausa un segundo");
        }
    }

    //metodo
    private static void metodoPedirEntero() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pon un entero");
        int entero = sc.nextInt();
    }

    private static void PausaUnSegundo() throws InterruptedException {
        Thread.sleep(1000);
    }

}
