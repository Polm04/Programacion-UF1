/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciodowhile;

import java.util.Scanner;

/**
 *
 * @author pomo6989
 */
public class EjercicioDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        Scanner sc = new Scanner(System.in);
       
       /*
        do
        {
         lo que hara 
        }while(condicion para que continue); //el ! es para negarlo para que si
                                             pones algo que no sea eso continue     
        */      
      do
      { 
        System.out.println("Pon numeros, para terminar escribe 0?");      
        num=sc.nextInt();
        System.out.println("Has escrito ->" +num);
      }while (num!=1);//condicion para que continue 
    }
    
}
