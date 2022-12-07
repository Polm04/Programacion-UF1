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
public class ArrayEj17 {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
        int[] array_1=new int[10];
        int[] array_2=new int[10];
        System.out.println("Pon 20 numeros");
        Array_pedir(array_1);
//        System.out.println("");
        
        Array_pedir(array_2);
//        System.out.println("");
        
    }
   public static void Array_pedir (int []valores) {
        Scanner sc = new Scanner(System.in);             
        for (int i = 0; i <valores.length; i++) {
            System.out.println("Pon el " + (i + 1) + " numero");
            valores[i] = sc.nextInt();
        }     
    }
    public static boolean Array_comparar (int []valores_1, int []valores_2) {
        for (int i = 0; i <valores_1.length; i++) {
            if(valores_1[i]!=valores_2[i])
            {
                return false;
            } 
        }
            return true;
    }
            
}
