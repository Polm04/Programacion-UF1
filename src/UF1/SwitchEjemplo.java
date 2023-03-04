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
public class SwitchEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("***************************");
        System.out.println("1.-Jugar Partido Rapido");
        System.out.println("2.-Multijugador");
        System.out.println("3.-Carrera");
        System.out.println("4.-Ultimate");
        System.out.println("5.-Salir");
        System.out.println("****************************");
        System.out.println("Escoje opcion");
        
        char opcion = sc.nextLine().charAt(0);
        
        switch (opcion) {
            case 'a': 
                System.out.println("Vamos a jugar un partido rapido");
                break;
            case 'b': 
                System.out.println("opcion multijugador");
                break;
            case 'c': 
                System.out.println("carrera");
                break;
            case 'd': 
                System.out.println("Ultimate");
                break;
            case 'e':
                System.out.println("seguro que quieres salir?");
                break;
            default: 
                System.out.println("opcion no valida");
  
        }
    }
    
}
