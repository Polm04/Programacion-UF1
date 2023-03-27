/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uf3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pomo6989
 */
public class GuardaObjetoEnFichero {

    public static void main(String[] args) {
        GuardaObjetoEnFichero objeto = new GuardaObjetoEnFichero();

        objeto.run();
    }

    private void run() {
        List<Contactos> agenda = new ArrayList<Contactos>();
        FicheroEscrituraObjetos fichero_escritura;

        try {
            fichero_escritura = new FicheroEscrituraObjetos("datos\\contactos.dat");
            cargarDatos(agenda);
            for (Contactos contactos : agenda) {
                fichero_escritura.escribirObjetos(contactos);
            }
            fichero_escritura.cerrarFichero();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    private void cargarDatos(List<Contactos> agenda) {
        agenda.add(new Contactos("Primero", 0));
        agenda.add(new Contactos("Sgundo", 0));
        agenda.add(new Contactos("Tercero", 0));
        agenda.add(new Contactos("Cuarto", 0));
        agenda.add(new Contactos("Quinto", 0));

    }
}
