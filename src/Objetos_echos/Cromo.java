/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos_echos;

/**
 *
 * @author pomo6989
 */
public class Cromo {
    
    //variables
    private int Numero;
    private String Descripcion;

    //constructor
    public Cromo(int Numero, String Descripcion) {
        this.Numero = Numero;
        this.Descripcion = Descripcion;
    }
    
    //getter i setter
    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    
}
