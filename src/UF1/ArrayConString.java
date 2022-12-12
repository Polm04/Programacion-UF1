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
public class ArrayConString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon una frase para mostrar-la letra por letra");
        String frase = sc.nextLine();
        
        for (int i = 0; i < frase.length(); i++) {
            System.out.println(frase.charAt(i));
        }
        
//        String[] paraules=frase.split(frase);
//        
//        for (int i = 0; i <paraules.length; i++) {
//            System.out.println(paraules[i]);
//        }
    }
}