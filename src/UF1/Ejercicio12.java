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
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        Scanner sc = new Scanner( System.in);
        
        System.out.println("introduce los numeros");
        numero=sc.nextInt();
        
        if (numero>=0)
        {
            System.out.println("positivo");
        }
        else
        {
             System.out.println("negativo");
        }
        
    }
    
}
