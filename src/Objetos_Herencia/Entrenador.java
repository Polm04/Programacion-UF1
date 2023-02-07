/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos_Herencia;

/**
 *
 * @author pomo6989
 */
public class Entrenador  extends Equipo_de_Futbol{
      private boolean Tiene_titulo;
    
    //constructor
    public Entrenador(boolean Tiene_titulo, int id, String nom, int edad) {
        super(id, nom, edad);
        this.Tiene_titulo = Tiene_titulo;
    }
    
    //getter
    public boolean getTiene_titulo() {
        return Tiene_titulo;
    }
    
    //setter
    public void setTiene_titulo(boolean Tiene_titulo) {
        this.Tiene_titulo = Tiene_titulo;
    }  
    
    //metodos
    public void DirigirPartido(){    
    
    }
    
    public void Entrenar(){    
    
    }
}
