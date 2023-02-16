/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos_echos;

import Interface.figura;

/**
 *
 * @author pomo6989
 */
public class Interface_circulo  implements figura{
    private float diametro;

    //constructor
    public Interface_circulo(float diametro) {
        this.diametro = diametro;
    }
    
    //metodos
    @Override
    public float area() {
        return pi*diametro/4f;
    }

    @Override
    public float perimetro() {
        return pi*diametro;
    }
    
}
