/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos_Herencia;

/**
 *
 * @author pomo6989
 */
public class Futbolista extends Equipo_de_Futbol{
    private int goles;
    
    //constructor
    public Futbolista(int goles, int id, String nom, int edad) {
        super(id, nom, edad);
        this.goles = goles;
    }
    
    //getter
    public int getGoles() {
        return goles;
    }
    
    //setter
    public void setGoles(int goles) {
        this.goles = goles;
    }
    
    //metodos
    public void JugarPartido(){    
    
    }
    
    public void Entrenar(){    
    
    }
    
}
