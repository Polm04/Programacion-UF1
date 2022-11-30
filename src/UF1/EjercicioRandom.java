/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciorandom;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pomo6989
 */
public class EjercicioRandom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        int aleatori;
        Random rd = new Random();
        
        System.out.println("Adivina el numero"); 
          aleatori=rd.nextInt(10)+1;
          Scanner sc = new Scanner(System.in);  
          
          System.out.println("Pon un numero");
        do
        {         
            numero=sc.nextInt();
            
            if(numero<aleatori)
            {
                System.out.println("el numero es mallor");
            }
            else if(numero>aleatori)
            {
                System.out.println("el numero es menor");
            }
                    
        }while(numero!=aleatori);
        
        
        System.out.println("Lo as acertado");
    }
    
}
