/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uf4;

import Objetos_echos.Alumno;
import Objetos_echos.Persona;
import Objetos_echos.Profesor;

/**
 *
 * @author pomo6989
 */
public class Herencia_Persona_Alumno {
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) { 
        Alumno alumno=new Alumno("sadad", 0, "12313", "asda");
        System.out.println(alumno.toString());
        
        Profesor profesor=new Profesor(01, "Informatica","456757", "Pol");
        System.out.println(profesor.toString());
        
    }
}
