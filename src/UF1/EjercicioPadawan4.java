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
public class EjercicioPadawan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeroTope; 
        Scanner sc = new Scanner(System.in);
        
        System.out.println("introduce un numero");
        numeroTope=sc.nextInt();
        
        for (int numero = 1; numero<=numeroTope; numero++) 
        {
            System.out.println("-" + numero);
        }
    }
    
}
