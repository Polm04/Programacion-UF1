/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciobucles;

/**
 *
 * @author pomo6989
 */
public class EjercicioBucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        
        System.out.println("bucle en un for");
        //for(valor inicial; condicion que continue; incremento variable
        for ( i = 0; i < 6; i++) {
            System.out.println("--->" + i);
            //aumento variable, pero ya lo hace el i++ del for
        }//fin del for
        
        System.out.println("bucel en un while");
        i=0;
        //While (condicion) 
        while(i <6)
        {
            System.out.println("*" + i);
            i++;//i =i+1
        }//fin del while   
        
    }
    
}
