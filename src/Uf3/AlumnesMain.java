/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uf3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pomo6989
 */
public class AlumnesMain {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlumnesMain app = new AlumnesMain();
        
        app.run();
    }

    private void run() {
        List<Alumnes> llista = new ArrayList<Alumnes> ();
        
        loadAlumnes(llista);
        guardarFitxer(llista);
        recuperarAlumnesFitxer();
        
    }

    private void loadAlumnes(List<Alumnes> llista) {
        llista.add(new Alumnes("nom1",1,"pw1"));
        llista.add(new Alumnes("nom2",2,"pw2"));
        llista.add(new Alumnes("nom3",3,"pw3"));
        llista.add(new Alumnes("nom4",4,"pw4"));
        llista.add(new Alumnes("nom5",5,"pw5"));
        llista.add(new Alumnes("nom6",6,"pw6"));
        llista.add(new Alumnes("nom7",7,"pw7"));
        System.out.println("Alumnos cargados en lista...");
        
    }

    private void guardarFitxer(List<Alumnes> llista) {
        final String RUTA = "";
        try {
            FicheroEscrituraPrimitivo escribir = new FicheroEscrituraPrimitivo(RUTA+"alumnes.txt");
            for (Alumnes alum : llista) {
                escribir.escribirString(alum.getNom());
                escribir.escribirEntero(alum.getEdad());
            }
//            for (int i = 0; i < llista.size(); i++) {
//                escribir.escribirString(llista.get(i).getNom());
//            }
            System.out.println("alumnos guardados... " + llista.size());
            escribir.cerrarFichero();
        } catch (FileNotFoundException ex) {
            System.out.println("1-Fichero no encontrado" + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error Input/output" + ex.getMessage());
        }    
    }

    private void recuperarAlumnesFitxer() {
        List<Alumnes> recuperados = new ArrayList<>();
        final String RUTA = "";
        String nom_recuperat;
        int edat_recuperada;
        System.out.println("Alumnes recuperats del fitxer .... ");
        try {
            FicheroLecturaPrimitivo leer_fichero = new FicheroLecturaPrimitivo(RUTA+ "alumnes.txt");
            while (leer_fichero.BytesPorLeer())
            {
                nom_recuperat = leer_fichero.LeerString();
                edat_recuperada = leer_fichero.LeerInt();    
                System.out.println(nom_recuperat + "-" + edat_recuperada);
                recuperados.add(new Alumnes(nom_recuperat, edat_recuperada));
            }
            leer_fichero.cerrarFichero();
        } catch (FileNotFoundException ex) {
             System.out.println("recuperarAlumnesFitxer-Fichero no encontrado " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("recuperarAlumnesFitxer-Error Input/output" + ex.getMessage());
        }
        
    }
}
