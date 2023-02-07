/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos_Herencia;

/**
 *
 * @author pomo6989
 */
public class Persona {
    protected String DNI; //privado menos a los hijos
    protected String nombre; 
    
    
    //constructor
    public Persona(String DNI, String nombre) {
        this.DNI = DNI;
        this.nombre = nombre;
    }
    
    //get
    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }
    
    //set
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //metodos
    public void MostrarPersona() {
        System.out.println("Persona{" + "DNI=" + DNI + ", nombre=" + nombre + '}');      
    }
    
    
}
