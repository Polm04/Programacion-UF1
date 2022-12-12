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
        for (int j = 0; j<5; j++) {
            System.out.println("La vocal "+j+" a salido "+vocales[j]);
        }

    }
}
