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
public class ArrayEj7 {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon valor minimo");
        int minimo=sc.nextInt();
        System.out.println("Pon valor maximo");
        int maximo=sc.nextInt();
        
        int[] valores= new int [maximo-minimo+1];
        for (int i = 0; i < valores.length; i++) {
            valores[i]=minimo;         
        }
        
    }
        
}
