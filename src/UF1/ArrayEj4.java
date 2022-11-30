/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UF1;

import java.util.Scanner;

/**
 *
 * @author pomo6989
 */
public class ArrayEj4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numero = new int[20];
        pedir_valor(numero);
    }

    public static void pedir_valor(int numero[]) {
        int suma_negativos = 0;
        int suma_positivos = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon 20 numeros");
        for (int i = 0; i < numero.length; i++) {
            System.out.println("Pon el " + (i + 1) + " numero");
            numero[i] = sc.nextInt();
            if (numero[i] >=0) {
                 suma_positivos= suma_positivos+numero[i];
            }
            else
            {
                suma_negativos=suma_negativos+numero[i];
            }          
        }
        System.out.println("La suma de los positivos es " + suma_positivos);
        System.out.println("La suma de los negativos es "+suma_negativos);
    }
}
