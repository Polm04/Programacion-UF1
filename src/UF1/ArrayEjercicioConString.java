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
public class ArrayEjercicioConString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vocales = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon una frase para mostrar cuantas vocales tiene");
        String frase = sc.nextLine();       
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a') {
                vocales[0]++; //LETRA A
            } else if (frase.charAt(i) == 'e') {
                vocales[1]++; //LETRA E
            } else if (frase.charAt(i) == 'i') {
                vocales[2]++; //LETRA I
            } else if (frase.charAt(i) == 'o') {
                vocales[3]++; //LETRA O
            } else if (frase.charAt(i) == 'u') {
                vocales[4]++; //LETRA U
            }

        }
//            char[] letras={'a','e','i','o','u'}; 
            System.out.println("La vocal A a salido "+vocales[0]);
            System.out.println("La vocal E a salido "+vocales[1]);
            System.out.println("La vocal I a salido "+vocales[2]);
            System.out.println("La vocal 0 a salido "+vocales[3]);
            System.out.println("La vocal u a salido "+vocales[4]);                   
    }
}
