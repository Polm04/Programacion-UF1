/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos_Herencia;

/**
 *
 * @author pomo6989
 */
public class Masajista  extends Equipo_de_Futbol{
    private String titulacion;
    
    //constructor
    public Masajista(String titulacion, int id, String nom, int edad) {
        super(id, nom, edad);
        this.titulacion = titulacion;
    }
    
    //getter
    public String getTitulacion() {
        return titulacion;
    }
    
    //Setter
    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }
    
    //metodos
    public void Dar_Masajes(){
    
    }
    
}
