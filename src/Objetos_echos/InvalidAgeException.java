/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos_echos;

/**
 *
 * @author pomo6989
 */
public class InvalidAgeException extends Exception {

    public InvalidAgeException() {
        super("Valor no permes per una edat");
    }
}

class DescripcioIncorrecta extends Exception {

    public DescripcioIncorrecta() {
        super("Descripcio demasiado corta");
    }    
}