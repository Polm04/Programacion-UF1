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
public class Ejercicio3OtrosAños {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int anchura,longitud;
        int area=0;
        char estancia;
        Scanner sc = new Scanner(System.in);
        
        do
        {
            System.out.println("pon la longiutd");
            longitud=sc.nextInt();
            System.out.println("pon la anchura");
            anchura=sc.nextInt();
            System.out.println("existe otra estancia?(S/N)");
            estancia=sc.next().charAt(0);   
            area=area+area;
        }while(estancia=='s' || estancia=='S');
           
        System.out.println("tiene"+area+"metros ");
    }
    
}
