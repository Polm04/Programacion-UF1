/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uf3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * clase para leer un fichero caracter a caracter en atributos contiene todas la
 * s clases necesarias para esta lectura
 *
 * @author pomo6989
 */
public class FicheroLecturaCaracteres {

    //variables
    File fichero;
    BufferedReader br;
    FileReader fr;

    //constructor
    public FicheroLecturaCaracteres(String ruta_fichero) throws FileNotFoundException {
        fichero = new File(ruta_fichero);
        fr = new FileReader(fichero);
        br = new BufferedReader(fr);
    }

    public FicheroLecturaCaracteres() {

    }

    //funciones
    public void prepararFicheroLectura(String ruta_fichero) throws FileNotFoundException {
        fichero = new File(ruta_fichero);
        fr = new FileReader(fichero);
        br = new BufferedReader(fr);
    }

    public int leerCaracteres() throws IOException {
        int codigo_ascii = br.read();
        return codigo_ascii;
    }

    public void cerrarFichero() throws IOException {
        br.close();
    }

    public char LeerCaracterChar() throws IOException, FinFicheroException {
        int codigo_ascii = br.read();
        
        if(codigo_ascii==-1){
            throw  new FinFicheroException(fichero.getName());
        }
        
        return (char) codigo_ascii;
    }
}
