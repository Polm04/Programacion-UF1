/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uf4;

import Objetos_echos.empleado;
import java.util.*;
/**
 *
 * @author pomo6989
 */
public class MainEmpleado {
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        
        /*       
        empleado[] lista_empleados= new empleado[3];
               
        lista_empleados[0]=new empleado("ana", 45,2500);
        lista_empleados[1]=new empleado("antonio", 55,2000);
        lista_empleados[2]=new empleado("maria", 25,2600);
        */
        ArrayList <empleado> lista_empleados =new ArrayList<empleado>();
        
        lista_empleados.add(new empleado("ana", 45,2500));
        lista_empleados.add(new empleado("antonio", 55,2000));
        lista_empleados.add(new empleado("maria", 25,2600));
        
        System.out.println(lista_empleados.size());
        for (empleado e: lista_empleados) {
            System.out.println(e.damedatos());
        }    
        
    }

}
