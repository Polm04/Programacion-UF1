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
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero1;
        int numero2;
        int numero3;
        Scanner sc = new Scanner( System.in);
        
        System.out.println("introduce los numeros");
        numero1=sc.nextInt();
        numero2=sc.nextInt();
        numero3=sc.nextInt();
        
       if(numero1>numero2 && numero1>numero3)
       {
           System.out.println("es mayor " +numero1);
       } 
       else if (numero2>numero3 && numero2>numero1)
       {
       System.out.println("es mayor " +numero2);
       }     
       else
       {
           System.out.println("es mayor "+numero3);
       }
    }
    
}
