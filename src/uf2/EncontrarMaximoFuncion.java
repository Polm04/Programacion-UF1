/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf2;

import java.util.Scanner;

/**
 *
 * @author pomo6989
 */
public class EncontrarMaximoFuncion {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double num1, num2;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Pon dos numeros");
        num1=sc.nextInt();
        num2=sc.nextInt();
        
        double resutaldo_max= maximo(num1,num2);        
        System.out.println("el numero maximo es"+resutaldo_max);
        
        double resultado_min=minimo(num1,num2);
        System.out.println("el numero minimo es"+resultado_min);
    }   
    
    public static double maximo(double valor1, double valor2) {
        double max;
        if (valor1 > valor2)
        {
        max = valor1;
        }
        else
        {
        max = valor2;        
        }
        return max;
   }
    
    public static double minimo(double valor1, double valor2) {
        double min;
        if (valor1 < valor2)
        {
        min = valor1;
        }
        else
        {
        min = valor2;        
        }
        return min;
   } 

    
}
