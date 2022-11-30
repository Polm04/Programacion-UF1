/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mostrarnuemeroinverversoconrecursividad;

import java.util.Scanner;

/**
 *
 * @author pomo6989
 */
public class MostrarNuemeroInverversoConRecursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        Scanner sc = new Scanner(System.in); 

        System.out.println("Pon un numero");
        numero = sc.nextInt();
        inverso(numero);
    }

    public static void inverso(int numero) {
        if (numero < 10) {
            System.out.println(numero);
        } else
        {
            System.out.print(numero%10);
            inverso(numero/10);
            
        }

    }
}
