/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uf3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author pomo6989
 */
public class FihceroEscribirByte {

    //variables
    File fichero;
    FileOutputStream fos;

    //constructor   
    public FihceroEscribirByte(String Ruta_Archivo) throws FileNotFoundException {
        this.fichero = new File(Ruta_Archivo);
        this.fos = new FileOutputStream(fichero);
    }

    //funciones
    public void cerrarFichero() throws IOException {
        fos.close();
    }

    public String dameNombreFichero() {
        return fichero.getName();
    }

    public void escribirByte(byte escribir) throws IOException {
        fos.write(escribir);
        fos.flush();
    }
}
