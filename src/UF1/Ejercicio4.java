/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UF1;

import java.util.Scanner;

/**
 *
 * @author pomo6989
 */
public class Ejercicio4 { //este es el ejercicio 3

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner( System.in);
        int lado;
        System.out.println("Pon la longuitud de el lado");
        lado = sc.nextInt(); //llegeix del teclat un sencer, i l'assigna a la variable lado
        
       int area =lado*lado;
        System.out.println("el lado mide " + lado);
        System.out.println("el area mide " + area);        
    }
    
}
