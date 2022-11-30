/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciohora;

import java.util.Scanner;

/**
 *
 * @author pomo6989
 */
public class Ejerciciohora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int hora;
        int minuto;
        int segundo;
        Scanner sc = new Scanner( System.in);
        
        System.out.println("introduce la hora");
        hora=sc.nextInt();
        System.out.println("introduce los minutos");
        minuto=sc.nextInt();
        System.out.println("introduce los segundos");    
        segundo=sc.nextInt();
       
       segundo=segundo+1;
       
       if(segundo==60)
        {
           segundo=0;
           minuto=minuto+1;
           if(minuto==60)
           {
               minuto=0;
               hora=hora+1;
               if(hora==23)
                 {
                 hora=0;
                  }
            }
        } 
           
        System.out.println("hora " +hora +" minuto " +minuto +" segundo " +segundo);

    }
    
}
