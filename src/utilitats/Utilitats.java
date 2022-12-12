/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package provesmetodespropis;

import java.util.Scanner;

/**
 *
 * @author pomo6989
 */
public class Utilitats {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here      
       
    }
    
    public static int pedirValorPositivo() {
        Scanner sc = new Scanner(System.in);
        int valor;
        do{
            System.out.println("Pon un valor positivo");
            valor=sc.nextInt();
        }while(valor<=0);
        return valor;
    }
    public static int pedirValorEntreDosNumeros(int min, int max) {
        Scanner sc = new Scanner(System.in);
        int valor;
        do{
            System.out.println("Pon un valor positivo");
            valor=sc.nextInt();
        }while(valor<min || valor>max);
        return valor;
    }
    

}
