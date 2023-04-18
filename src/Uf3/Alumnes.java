/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uf3;

/**
 *
 * @author pomo6989
 */
public class Alumnes {
   
    //variables
    private String nom;
    private int edad;
    private String password;
    
    //constructor
    public Alumnes(String nom, int edad, String password) {
        this.nom = nom;
        this.edad = edad;
        this.password = password;
    }
    
    public Alumnes(String nom, int edat) {
        this.nom = nom;
        this.edad = edat;
        this.password = "Sin password informado";
    }
    
    //getter i setter
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
