/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos_Herencia;

/**
 *
 * @author pomo6989
 */
public abstract class Equipo_de_Futbol {
    protected int id;
    protected String nom;
    protected int edad;
    
    //constructor
    public Equipo_de_Futbol(int id, String nom, int edad) {
        this.id = id;
        this.nom = nom;
        this.edad = edad;
    }
    
    //getter
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getEdad() {
        return edad;
    }
    
    //setter
    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //metodos
    public void Viajar(){
   
    }
    
    public void Concentrarse(){
        
    }
    
}
