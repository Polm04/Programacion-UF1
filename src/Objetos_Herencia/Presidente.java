/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos_Herencia;

/**
 *
 * @author pomo6989
 */
public class Presidente extends Equipo_de_Futbol{
    private int Años_cargo;
    
    //constructor
    public Presidente(int Años_cargo, int id, String nom, int edad) {
        super(id, nom, edad);
        this.Años_cargo = Años_cargo;
    }
    
    //Getter
    public int getAños_cargo() {
        return Años_cargo;
    }
    
    //Setter
    public void setAños_cargo(int Años_cargo) {
        this.Años_cargo = Años_cargo;
    }
    
    //metodos
    public void ir_al_palco(){
    
    }
    
     public void Tratar_contrato(){
    
    }
}
