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
public class MayorDeEdad {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here    
        int edad;
        boolean mallor;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos años tienes?)");
        edad=sc.nextInt();
       
        mallor=años(edad);
        if(mallor==true)
        {
            System.out.println("Eres Mallor");
        }
        else
        {
            System.out.println("Eres menor");
        }

    }
    public static boolean años (int años){
        boolean mallor;     
        if(años>=18)
        {
            mallor=true;
        }
        else
        {
            mallor=false;
        }    
        return mallor;
    }
}
