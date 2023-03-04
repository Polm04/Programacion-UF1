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
public class EjercicioMultiple7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero=12, cont = 0;
        do
        {
           numero++;
           if(numero%7==0)
           {
           cont++;
           System.out.println(numero + "---" + cont);
           }
        
        }while(cont<10);
       
    }
    
}
