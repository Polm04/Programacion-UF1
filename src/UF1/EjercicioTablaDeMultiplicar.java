/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.tabla.de.multiplicar;

import java.util.Scanner;

/**
 *
 * @author pomo6989
 */
public class EjercicioTablaDeMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero, resultado;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("introduce un numero");
        numero=sc.nextInt();
        
        for (int i=1; i<=10; i++) 
        {
            resultado= numero*i;
            System.out.println(numero + "*"+ i+"="+ resultado);
        }
    }
    
}
