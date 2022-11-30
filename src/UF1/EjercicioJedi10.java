/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciojedi10;

import java.util.Scanner;

/**
 *
 * @author pomo6989
 */
public class EjercicioJedi10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nota;
        boolean nota_10=false;
        Scanner sc = new Scanner(System.in);
        
        do
        {
            System.out.println("Que nota tens");
            nota = sc.nextInt();
            
            if (nota==10)
             {
                nota_10=true;                
             }
        }while(nota!=-1);
        System.out.println("as puesto -1 se a acabado el programa");
        
            if(nota_10==true)
            {
                System.out.println("Alguien a sacado un 10");
            }
            else
            {
                System.out.println("Nadie a sacado un 10");
            }
    }
    
}
