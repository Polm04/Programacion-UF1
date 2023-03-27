/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uf3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pomo6989
 */
public class PruebaFicheros {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        try {
            FicheroEscrituraCaracteres fichero_escribir = new FicheroEscrituraCaracteres("C:\\Users\\pomo6989\\Documents\\NetBeansProjects\\NF1\\Programacion\\Ficheros\\Fichero_Prueba_copia.txt");
            FicheroLecturaCaracteres fichero_leerCaracteres = new FicheroLecturaCaracteres("Ficheros\\Fichero_Prueba.txt");

            // metodo_caracteristicas();
            System.out.println(fichero_leerCaracteres.LeerCaracterChar());
        } catch (FileNotFoundException ex) {
            System.out.println("fichero no encontrado");
        } catch (IOException ex) {
            System.out.println("errr escritura fichero");
        } catch (FinFicheroException ex) {
            System.out.println("Fin fichero");
        }
        System.out.println("fin");
    }

    private static void mostrarRutas(File archivo) {
        System.out.println("getParent()" + archivo.getParent());
        System.out.println("getName()" + archivo.getName());
        System.out.println("getAbsolutePath()" + archivo.getAbsolutePath());
    }

    private static void otrosMetodos(File archivo) {
        System.out.println("exists()" + archivo.exists());
        System.out.println("isDirectory()" + archivo.isDirectory());
        System.out.println("isFile()" + archivo.isFile());
        System.out.println("length()" + archivo.length());
    }

    private static void crearCarpeta(File Carpeta) {
        if (Carpeta.mkdir()) {
            System.out.println("Carpeta creada..." + Carpeta);
        } else {
            System.out.println("No se a creado la carpeta");
        }
    }

    private static void borrarCarpeta(File Carpeta) {
        if (Carpeta.delete()) {
            System.out.println("Carpeta borrada..." + Carpeta);
        } else {
            System.out.println("No se a borrado la carpeta");
        }
    }

    private static void leer_fichero() throws FileNotFoundException {
        File fichreo_a_leer = new File("Ficheros//Datos.txt");

        try {
            Scanner Lector_fichero = new Scanner(fichreo_a_leer);

            while (Lector_fichero.hasNextLine()) {
                String linea = Lector_fichero.nextLine();
                System.out.println("Frase Leida--> " + linea);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Fichero " + fichreo_a_leer.getName() + " no existe " + ex.getMessage());
        }
    }

    private static void leerFicheroHacerCopia() {
        Scanner lectorArchivo;
        File fichero_leer = new File("ficheros\\datos3.txt");
        File fichero_escritura = new File("ficheros\\copia_datos3.txt");
        String linea;
        FileWriter escritura;

        try {
            escritura = new FileWriter(fichero_escritura, true);
            lectorArchivo = new Scanner(fichero_leer);
            while (lectorArchivo.hasNextLine()) {
                linea = lectorArchivo.nextLine();
                System.out.println("Frase leida " + linea);
            }
            escritura.close();
        } catch (IOException ex) {
            System.out.println("Error al escribir fichero");
        }
    }

    private static void metodo_caracteristicas() throws FileNotFoundException {
        File archivoAbs = new File("C:\\Users\\pomo6989\\Documents\\NetBeansProjects\\NF1\\Programacion\\Fotos");
        File carpetaAbs = new File("C:\\Users\\pomo6989\\Documents\\NetBeansProjects\\NF1\\Programacion\\Fotos");
        File archivoRe1 = new File("Fotos\\descarga.jpg");
        File carpeta_crear = new File("Fotos\\paises");
        
        
        System.out.println("----------------------");
        System.out.println("MOSTRAR RUTAS");
        System.out.println("----------------------");

        mostrarRutas(archivoAbs);
        System.out.println("*************");
        mostrarRutas(archivoRe1);
        System.out.println("*************");
        mostrarRutas(carpetaAbs);

        System.out.println("----------------------");
        System.out.println("OTROS METODOS");
        System.out.println("----------------------");

        otrosMetodos(archivoAbs);
        System.out.println("*************");
        otrosMetodos(archivoRe1);
        System.out.println("*************");
        otrosMetodos(carpetaAbs);
        System.out.println("*************");

        System.out.println("----------------------");
        System.out.println("CREAR CARPETA");
        System.out.println("----------------------");

        crearCarpeta(carpeta_crear);

        System.out.println("----------------------");
        System.out.println("BORRAR CARPETA");
        System.out.println("----------------------");

        borrarCarpeta(carpeta_crear);

        System.out.println("----------------------");
        System.out.println("LEER FICHERO");
        System.out.println("----------------------");

        leer_fichero();
    }

}
