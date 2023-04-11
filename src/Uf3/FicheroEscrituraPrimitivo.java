/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uf3;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author pomo6989
 */
public class FicheroEscrituraPrimitivo {

    //variables
    File fichero;
    DataOutputStream dos;
    FileOutputStream fos;

    //constructor    
    public FicheroEscrituraPrimitivo(String Ruta_fichero) throws FileNotFoundException {
        this.fichero = new File(Ruta_fichero);
        this.fos = new FileOutputStream(fichero);
        this.dos = new DataOutputStream(fos);
    }

    //variables
    public void escribirEntero(int add) throws IOException {
        dos.write(add);
    }
    
    public void escribirDouble(double add) throws IOException {
        dos.writeDouble(add);
    }
    
    public void escribirString(String add) throws IOException {
        dos.writeUTF(add);
    }
    
    public void cerrarFichero() throws IOException {
        dos.flush();
        dos.close();
    }
}
