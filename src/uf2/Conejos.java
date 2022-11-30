/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conejos;

import java.util.Scanner;

/**
 *
 * @author pomo6989
 */
public class Conejos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejercicios pares;
        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.println("Pon un numero");
        numero = sc.nextInt();

        int numero_par = par(numero);
        System.out.println(numero_par);

        //Ejercicios Potencia;
//        int numero, potencia;
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Pon un numero");
//        numero = sc.nextInt();
//        System.out.println("Pon la potencia");
//        potencia = sc.nextInt();
//
//        int suma = potencia(numero);
//        System.out.println(suma);

        //Ejercicios conejos;
//        int conejos;
//        int mes;
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("En que mes quieres ver cuantos conejos hay?");
//        mes = sc.nextInt();
//        conejos = conejos(mes);
//        System.out.println("en el mes " + mes + " tendras " + conejos + " conejos");
    }

//    public static int conejos(int mes) {
//        int resultado;
//        int conejos;
//        if (mes <= 1) {
//            conejos = 1;
//        } else {
//            resultado = conejos(mes - 1) + conejos(mes - 2);
//            return resultado;
//        }
//        return -1;
//
//    }
//    public static int potencia(int numero, int potencia) {
//        int basepotencia = 0;
//        if (potencia == 0) {
//            basepotencia = 1;
//            return basepotencia;
//        } else if (potencia >= 1) {
//           basepotencia = potencia*potencia(numero, potencia-1);
//            return basepotencia;
//        }
//        return -1;
//    }
    public static int par(int numero) {
        if (numero % 2 == 0) {       
            return +1;
        } else if (!(numero % 2 == 0)) {
            return -1;
        } else {
            return numero+par(numero-2);
        }
    }

}   