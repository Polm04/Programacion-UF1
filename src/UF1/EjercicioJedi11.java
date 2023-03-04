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
public class EjercicioJedi11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeros;
        int acum_pares=0, acum_impar=0;
        for (numeros = 100; numeros <= 200; numeros++) 
        {
            System.out.println(numeros);
            if (numeros%2==0)
            {
            acum_pares=acum_pares+numeros;
                System.out.println("pares "+acum_pares);
            }
            else
            {
            acum_impar=acum_impar+numeros;
                System.out.println("impar" +acum_impar);
            }
        }
    }
    
}
