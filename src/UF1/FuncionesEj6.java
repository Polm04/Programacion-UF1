/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionesej6;

import java.util.Scanner;

/**
 *
 * @author pomo6989
 */
public class FuncionesEj6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here       
        int contador=0;
        Scanner sc = new Scanner(System.in);            
        
        System.out.println("pon 5 precios:");
       do
       {
            int precio;
            System.out.print("precio=");
            precio=sc.nextInt();            
            double precios=precioConIVA(precio);
            System.out.println("el precio es "+precios); 
            contador++;
       }while(!(contador==5));    
        System.out.println("FIN");
    }
    
    public static double precioConIVA(double precio)
    {
        precio=precio+(precio*0.21);       
        return precio;
    }
}
