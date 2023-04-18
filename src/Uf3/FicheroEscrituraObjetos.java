/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uf3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author pomo6989
 */
public class FicheroEscrituraObjetos {

    //variables
    File fichero;
    ObjectOutputStream oos;
    int cont_objeto;
    //constructor
    public FicheroEscrituraObjetos(String Ruta_Archivo) throws FileNotFoundException, IOException {
        fichero = new File(Ruta_Archivo);
        oos = new ObjectOutputStream(new FileOutputStream(fichero));
        cont_objeto=0;
    }

    //funciones
    public void cerrarFichero() throws IOException {
        oos.close();
    }
    
    public void escribirObjetos(Contactos add) throws IOException{
        oos.writeObject(oos);
        cont_objeto++;
    }
}
