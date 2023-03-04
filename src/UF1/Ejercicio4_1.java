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
public class Ejercicio4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           int numero1;
        int numero2;
        Scanner sc = new Scanner( System.in);
        
        System.out.println("introduce los numeros");
        numero1=sc.nextInt();
        numero2=sc.nextInt();
        
        double suma= numero1 + numero2;
        double resta= numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        double division = numero1 / numero2;
        
        System.out.println("la suma es " + suma);
        System.out.println("la resta es " + resta);
        System.out.println("la division es " + division);
        System.out.println("la multiplicacion es " + multiplicacion );
    }
    
}
