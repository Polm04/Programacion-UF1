/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringg;

import java.util.Scanner;

/**
 *
 * @author pomo6989
 */
public class Stringg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase = "hola que tal";
        System.out.println(frase);
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una frase");
        frase = sc.next();
        System.out.println("frase con next " + frase);
        System.out.println("Escribe una frase");
        frase = sc.nextLine();
        System.out.println("frase con nextLine " + frase);
        if (frase.isEmpty()) {
            System.out.println("String vacio");
        } else {
            System.out.println("String no vacio");
        }
    }

}
