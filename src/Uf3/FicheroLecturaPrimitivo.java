/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uf3;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author pomo6989
 */
public class FicheroLecturaPrimitivo {

    //variables
    File fichero;
    DataInputStream dis;
    FileInputStream fis;
    
    //constructor
    public FicheroLecturaPrimitivo(String Ruta_fichero) throws FileNotFoundException {
        this.fichero = new File(Ruta_fichero);
        this.fis = new FileInputStream(fichero);
        this.dis = new DataInputStream(fis);
    }

    //variables
    public int LeerInt() throws IOException {
        return dis.readInt();
    }

    public double Leerdouble() throws IOException {
        return dis.readDouble();
    }

    public String LeerString() throws IOException {
        return dis.readUTF();
    }

    public void cerrarFichero() throws IOException {
        dis.close();
    }
    
    public boolean BytesPorLeer() throws IOException
    {
        return dis.available()>0;
    }
}
