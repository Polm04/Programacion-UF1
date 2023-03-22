/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uf3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author pomo6989
 */
public class FicheroEscrituraCaracteres {

    //variables
    File fichero;
    BufferedWriter bw;
    FileWriter fw;

    //constructor
    public FicheroEscrituraCaracteres(String ruta_fichero) throws FileNotFoundException, IOException {
        fichero = new File(ruta_fichero);
        fw = new FileWriter(fichero);
        bw = new BufferedWriter(fw);
    }

    //funciones
    public void escribirFichero(char letra) throws IOException {
        bw.write(letra);
    }

    public void cerrarFichero() throws IOException {
        bw.close();
    }
    
}
