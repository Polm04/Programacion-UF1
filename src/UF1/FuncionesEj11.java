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
public class FuncionesEj11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here      
        int numero;
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Pon un numero para ver la tabla de multiplicar");
        numero=sc.nextInt();
        tabla(numero);
        
    }
    
    public static void tabla(int n)
    {
        for (int i = 1; i <=10; i++) {
            int multiplicar=i*n;
            System.out.println(n+"*"+i+"="+multiplicar);
        }     
    }
}
