/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UF1_bidimensional;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pomo6989
 */
public class Array {  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int Files=3;
        final int colum=2;
        int[][] mapa = new int [Files][colum];
        
        //primera fila
        mapa[0][0]=4;
        mapa[0][1]=14;
        //segunda fila
        mapa[1][0]=5;
        mapa[1][1]=15;
        //tercera fila
        mapa[2][0]=6;
        mapa[2][1]=16;
              
        System.out.println("**************************");
        for (int i = 0; i <mapa.length; i++) {
            for (int j = 0; j <mapa[i].length; j++) {
                System.out.print(mapa[i][j]+"-");
            }
            System.out.println("");
        }
        System.out.println("**************************");
        System.out.println("Valors a 4");  
        System.out.println("**************************");
        for (int i = 0; i <mapa.length; i++) {
            for (int j = 0; j <mapa[i].length; j++) {
                mapa[i][j]=4;
            }
        }
        //mostarlo
        for (int i = 0; i <mapa.length; i++) {
            for (int j = 0; j <mapa[i].length; j++) {
                System.out.print(mapa[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("**************************");
        System.out.println("Valors aleatorios entre 1 y 100");  
        System.out.println("**************************");
        Random rd = new Random();
        for (int i = 0; i <mapa.length; i++) {
            for (int j = 0; j <mapa[i].length; j++) {
                mapa[i][j]=rd.nextInt(100)+1;
            }
        }
        //mostarlo
        for (int i = 0; i <mapa.length; i++) {
            for (int j = 0; j <mapa[i].length; j++) {
                System.out.print(mapa[i][j]+"-");
            }
            System.out.println("");
        }
        
        int x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Fica la fila que vols veure: ");
        x=sc.nextInt();
        System.out.println("Fila la columna");
        y=sc.nextInt();
        
        System.out.println("El valor de la coordenada introduida es:"+mapa[x][y]);
        
        //pedir valores usuario
        for (int i = 0; i <mapa.length; i++) {
            for (int j = 0; j <mapa[i].length; j++) {
                System.out.println("Pon valor para "+i+"-"+j);
                mapa[i][j]=sc.nextInt();
            }
        }
    }
}
