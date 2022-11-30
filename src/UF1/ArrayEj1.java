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
public class ArrayEj1 {   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int []numero=new int[10];
        Scanner sc = new Scanner(System.in);
              
        for (int i = 0; i < numero.length; i++) {   
            System.out.println("Pon numero"+(i+1)+"=");
            numero[i]=sc.nextInt();
        }    
    }
}
