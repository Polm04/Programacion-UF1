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
public class FuncionesEj8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in); 
        System.out.println("Pon un numero");
        int numero=sc.nextInt();
        int producto,mitad2numeros;
        double mitad;
        producto=producto1aN(numero);
        System.out.println("El producto de 1 a "+numero+ " es "+producto);
        mitad=intermedio1aN(numero);
        System.out.println("La mitad de 1 a "+numero+ " es "+mitad);
    }  
            
    public static int producto1aN(int n)
    {
        int producto=1;
            for (int i = 1; i <=n; i++) {
                producto=producto*i;
            }
        return producto;
    }
    
    public static double intermedio1aN(int n)
    {
        double mitad=(double) (1+n)/2;
        return mitad;
    }
    
    
}
