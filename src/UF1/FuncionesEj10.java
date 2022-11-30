/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funciones.ej10;

import java.util.Scanner;

/**
 *
 * @author pomo6989
 */
public class FuncionesEj10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        // TODO code application logic here
        int dia, mes, año;
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Pon el dia: ");
        dia=sc.nextInt();
        System.out.print("Pon el mes: ");
        mes=sc.nextInt();
        System.out.print("Pon el año: ");
        año=sc.nextInt();
        
        boolean validacion=validacion(dia, mes, año);
        if(validacion==true)
        {
            System.out.println("la fecha es valida");
        }
        else
        {
            System.out.println("la fecha es incorrecta");
        }
    }
    
    public static boolean validacion(int d, int m, int a)
    {
        boolean validacion = false;
        boolean dia=false, mes=false, año=false;
        if(d<=30 && d>0)
        {        
            dia=true;
        }     
        
        if (m<=12 && m>0)
        {        
            mes=true;
        }      
        
        if (a>=1900)
            
        {        
            año=true;
        }      
        if(dia==true && mes==true && año==true)
        {
            validacion=true;
        }
        return validacion;
    }
}
