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
public class BucleDivisibleEntre3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, suma_numero=0; 
        int contador_divisible=0, contador_numero=0;
        Scanner sc = new Scanner(System.in);
        
        do
        {
        System.out.println("Pon numero cuando lleves 3 divisibles por 3 parare");
        num=sc.nextInt();        
        contador_numero++;
        if(num%3==0)
        {
            System.out.println(num +" Es divisible entre 3");
            contador_divisible++;
            suma_numero=suma_numero+num;
        }
        }while(contador_divisible<3);
        System.out.println("Has introducido en total "+contador_numero+ " numeros");
        System.out.println("La suma total de los divisibles entre 3 da "+suma_numero);
    }
    
}
