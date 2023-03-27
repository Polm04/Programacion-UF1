/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uf3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * clase para leer un fichero byte a byte
 *
 * @author pomo6989
 */
public class FicheroLecturaByte {

    //variables
    File fichero;
    FileInputStream fis;

    //constructor
    public FicheroLecturaByte(String Ruta_Archivo) throws FileNotFoundException {
        this.fichero = new File(Ruta_Archivo);
        this.fis = new FileInputStream(fichero);
    }

    //funciones
    public void cerrarFichero() throws IOException {
        fis.close();
    }

    public String dameNombreFichero() {
        return fichero.getName();
    }

    public int LeerByte() throws IOException {
        int x = fis.read();
        return x;
    }
}
