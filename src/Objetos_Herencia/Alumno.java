/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos_Herencia;

/**
 *
 * @author pomo6989
 */
public class Alumno extends Persona{
    private String ciclo;
    private int curso;
    
    //constructor
    public Alumno(String ciclo, int curso, String DNI, String nombre) {
        super(DNI, nombre); //llama al constructor padre con los parametros 
                       //con los parametros que necesita el constructor padre
        this.ciclo = ciclo;
        this.curso = curso;
    }

    @Override
    public void MostrarPersona() {
        super.MostrarPersona();
        System.out.println("ciclo: "+ciclo+" en el curso "+ curso);
    }

    @Override
    public String toString() {
        return "Alumno "+nombre+" "+DNI+"-"+curso+"-"+ciclo; 
    }
     
    
}
