/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13.random;

import java.util.Random;

/**
 *
 * @author pomo6989
 */
public class Ejercicio13Random {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rd = new Random();
        int ale;
        
        System.out.println("del 1 al 10");
        for (int i = 0; i < 10; i++) 
        {
            //ale=rd.nextxxx(numero maximo)+1 //le indicas que empieze por el 1 
            ale=rd.nextInt(10)+1;
            System.out.println(ale+"*");
        }
        System.out.println("");
        System.out.println("del 5 al 15");
        for (int i = 0; i < 10; i++) 
        {
            ale=rd.nextInt(15)+10;
            System.out.println(ale+"*");
        }
    }
    
}
