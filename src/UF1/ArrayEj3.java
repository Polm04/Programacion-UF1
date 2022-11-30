/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UF1;

import java.util.Scanner;

/**
 *
 * @author pomo6989
 */
public class ArrayEj3 {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           int []numero=new int[10];  
           introducir_datos(numero);
           int minimo, maximo;
           minimo=numero[0];
           maximo=numero[0];
           for (int index = 0; index < numero.length; index++) {
            if(numero[index]>maximo)
            {
                maximo=numero[index];               
            }
            if(numero[index]<minimo)
            {
                minimo=numero[index];
            }
        }
    }
    
    public static void introducir_datos(int []numero) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numero.length; i++) {   
            System.out.println("Pon numero"+(i+1)+"=");
            numero[i]=sc.nextInt();
        }    
        
    }
}
