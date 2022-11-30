/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author pomo6989
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad;
        Scanner sc = new Scanner( System.in);
        
        System.out.println("introduce la edad");
        edad=sc.nextInt();
        
        if (edad>=18) //no se pone punto i coma porque si no te lee todo
        { // si es cierto la condicion if
            System.out.println("Eres mayor de edad, ya puedes ir al bingo");
          }
        else
        { 
            System.out.println("Eres menor de edad, no entras");
          }
    }
    
}
