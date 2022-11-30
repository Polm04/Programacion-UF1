/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.wii;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pomo6989
 */
public class EjercicioWii {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        int petardo1, petardo2 = 0, petardo3 = 0;
        int petardo_elegido;
        boolean resultado=false;
        Scanner sc = new Scanner(System.in);
        Random rd  = new Random();
        
        System.out.println("elije petardo (1-3)");
        petardo_elegido=sc.nextInt();
        
        petardo1=rd.nextInt(10)+1;
        petardo2=rd.nextInt(10)+1;
        petardo3=rd.nextInt(10)+1;      
        
        switch (petardo_elegido) {
            case 1:
                if (petardo1>=petardo2 && petardo1>=petardo3)
                {
                    resultado=true;
                }
                break;
            case 2:
                if(petardo2>=petardo1 && petardo2>=petardo3)
                {
                    resultado=true;
                }               
                break;
            case 3:
                if(petardo3>=petardo1 && petardo3>=petardo2)
                {
                    resultado=true;
                }                
                break;
        }
        
        for (int linea=1; linea<=10; linea++)
        {
           if(linea<=petardo1)
           {
               System.out.print("*");
           }
           else
           {
               System.out.println("-");
           }
           
           if(linea<=petardo2)
           {
               System.out.print("*");
           }
           else
           {
               System.out.println("-");
           }
           
            if(linea<=petardo3)
           {
               System.out.print("*");
           }
           else
           {
               System.out.println("-");
           }
            
           Thread.sleep(500);
        }
        
        if(resultado=true)
        {
            System.out.println("As Ganado");
        }
        else
        {
            System.out.println("As Perdido");
        }
    }   
    
}
