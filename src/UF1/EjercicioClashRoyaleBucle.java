/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UF1;

import java.util.Scanner;

/**
 *
 * @author pomo6989
 */
public class EjercicioClashRoyaleBucle {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        int leñador;
        int torre;
        final int nivel_leñador_Max=13, nivel_leñador_Min=9;
        final int nivel_torre_Max=5, nivel_torre_Min=1;
        int vida_torre=0, daño_torre=0;
        int daño_leñador=0, vida_leñador= 0;
        int contador = 0;
        Scanner sc = new Scanner(System.in);
        
        do
        {
        System.out.println("que nivel tiene la torre? Nvl "+nivel_torre_Min+"-"+ nivel_torre_Max );
        torre=sc.nextInt();  
        }while(!(torre>=nivel_torre_Min && torre<=nivel_torre_Max)); 
        
        do
        {
        System.out.println("que nivel tiene el leñador? Nvl 9-13");
        leñador=sc.nextInt();   
        }while(!(leñador>=nivel_leñador_Min && torre<=nivel_leñador_Max)); 
         
        System.out.println("---");
        switch (torre) {
            case 1:
                vida_torre=1400;
                daño_torre=50;
                System.out.println("el leñador tiene "+vida_torre+ " i de ataque "+ daño_torre);
                break;
            case 2: 
                vida_torre=1512;
                daño_torre=54;
                System.out.println("el leñador tiene "+vida_torre+ " i de ataque "+ daño_torre);
                break;
            case 3:
                vida_torre=1624;
                daño_torre=58;
                System.out.println("el leñador tiene "+vida_torre+ " i de ataque "+ daño_torre);
                break;
            case 4:
                vida_torre=1750;
                daño_torre=62;
                System.out.println("el leñador tiene "+vida_torre+ " i de ataque "+ daño_torre);
            case 5:
                vida_torre=1890;             
                daño_torre=67;
                System.out.println("el leñador tiene "+vida_torre+ " i de ataque "+ daño_torre);
        }     
        
        switch (leñador) {           
            case 9:
                vida_leñador=1060;
                daño_leñador=200;
                System.out.println("el leñador tiene "+vida_leñador+ " i de ataque "+ daño_leñador);
                break;            
            case 10:
                vida_leñador=1166;
                daño_leñador=220;
                System.out.println("el leñador tiene "+vida_leñador+ " i de ataque "+ daño_leñador);
                break;
            case 11: 
                vida_leñador=1282;
                daño_leñador=242;
                System.out.println("el leñador tiene "+vida_leñador+ " i de ataque "+ daño_leñador);
                break;               
            case 12:
                vida_leñador=1409;
                daño_leñador=266;
                System.out.println("el leñador tiene "+vida_leñador+ " i de ataque "+ daño_leñador);
                break;
            case 13:
                vida_leñador=1547;
                daño_leñador=292;
                System.out.println("el leñador tiene "+vida_leñador+ " i de ataque "+ daño_leñador);
                break;
        }
        
        System.out.println("---");
        
        do
        {
            vida_torre=vida_torre-daño_leñador;
            vida_leñador=vida_leñador-daño_torre;
            System.out.println("vida torre " +vida_torre + " vida leñador " +vida_leñador);
            contador++;
            Thread.sleep(500);//pausa de medio segundo
        }while(!(vida_torre<=0 || vida_leñador<=0));
        
        if(vida_torre<=0)
        {
            System.out.println("Felicidades!");
            System.out.println("As derrotado a la torre con "+contador+ " golpes");
        }
        else if(vida_leñador>=0)
        {
            System.out.println("Prueba otra vez");
            System.out.println("La torre a matado al leñador con"+contador+" golpes");
        }
                
    }
    
}
