/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciojedi13;

import java.util.Scanner;

/**
 *
 * @author pomo6989
 */
public class EjercicioJedi13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int minim=1, maxim=100, mitad, doble;
        char respuesta;
        Scanner sc = new Scanner(System.in);
        do{
        mitad=(minim+maxim)/2;
        System.out.println("el numero es "+mitad+ " ?");
        System.out.println("He acertado?(i,m,n)");
        respuesta= sc.next().charAt(0);
      
        if(respuesta=='m')
        {
        minim=mitad;
        }
        else if(respuesta=='n')
        {
        maxim=mitad;
        }            
        }while(respuesta!='i');
        System.out.println("Acertaste");
    }
    
}
