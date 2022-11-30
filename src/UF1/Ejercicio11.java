/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author pomo6989
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero1;
        int numero2;
        Scanner sc = new Scanner( System.in);
        
        System.out.println("introduce los numeros");
        numero1=sc.nextInt();
        numero2=sc.nextInt();
        
        if (numero1>numero2)
        {
            System.out.println("numero 1 es mas grande");
        }
        else 
        {
        System.out.println("numero 2 es mas grande");
        }
    }
    
}
