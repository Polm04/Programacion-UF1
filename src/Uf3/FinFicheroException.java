/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uf3;

/**
 *
 * @author pomo6989
 */
public class FinFicheroException extends Exception{

    public FinFicheroException(String nombre) {
        super("Final del fichero "+nombre);
    }
    
}
