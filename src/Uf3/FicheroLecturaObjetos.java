/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uf3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author pomo6989
 */
public class FicheroLecturaObjetos {

    File fichero;
    ObjectInputStream ois;

    public FicheroLecturaObjetos(String ruta_archivo) throws FileNotFoundException, IOException {
        fichero = new File(ruta_archivo);
        ois = new ObjectInputStream(new FileInputStream(fichero));
    }

    public void cerrarFichero() throws IOException {
        ois.close();
    }

    public Object leerObjeto() throws IOException, ClassNotFoundException {
        return ois.readObject();
    }
}
