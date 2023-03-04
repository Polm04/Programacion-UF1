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
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        Scanner sc = new Scanner( System.in);
        
        System.out.println("introduce el numero");
        numero=sc.nextInt();

        if (numero>=0 && numero<3)
        {
            System.out.println("muy deficiente");
        }
        else if(numero>=3 && numero<5)
        {
            System.out.println("insuficiente");
        }
        else if(numero>=5 && numero<6)
        {
            System.out.println("bien");
        }
        else if(numero>=6 && numero<9)
        {
            System.out.println("notable");
        }
        else if(numero==9 && numero<10)
        {
            System.out.println("excelente");
        }  
    }
    
}
