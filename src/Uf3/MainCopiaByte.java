/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uf3;

import Uf3.FihceroEscribirByte;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pomo6989
 */
public class MainCopiaByte {

    public static void main(String[] args) {
        MainCopiaByte app = new MainCopiaByte();

        app.run();
    }

    private void run() {
        FicheroLecturaByte fichero_byte;
        FihceroEscribirByte Fichero_Escritura_Byte;
        int int_byte;
        try {
            fichero_byte = new FicheroLecturaByte("fotos\\prueba.jpg");
            do {
                System.out.println("empezando a leer");
                int_byte = fichero_byte.LeerByte();
                if(int_byte!=-1){
//                    Fichero_Escritura_Byte.escribirByte();
                };
            } while (!(int_byte == - 1));
            fichero_byte.cerrarFichero();
            System.out.println("Fichero leido cerrado");
        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no existe..."+ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
