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
public class Ejercicio2 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        try {
            ejercicio();
        } catch (InputMismatchException ex) { // InputMismatchException el valor no coincide con el valor que a puesto el usuario(haces que ponga un entero pero pone una letra)
            System.out.println("No se puede dividir: as puesto una letra");
        } catch (ArithmeticException ar) { //ArithmeticException es que el valor no puede ser 0
            System.out.println("El valor no puede ser 0");
        }
    }

    public static void ejercicio() {
        Scanner sc = new Scanner(System.in);
        //variables
        int a, b;
        //pedir numeros
        System.out.println("Pon el primer numero");
        a = sc.nextInt();
        System.out.println("Pon el segundo numero");
        b = sc.nextInt();
        int division = a / b;
    }
}
