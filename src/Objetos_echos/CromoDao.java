/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos_echos;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 * DAO es el encarregado de tener la estructura de almacenamiento de objetos en
 * este caso cromo
 *
 * @author pomo6989
 */
public class CromoDao {
    //estructura de almacenamiento

    //variables
    List<Cromo> Album;
    List<Cromo> CartasRepes;
    int numero_max_coleccio;

    //constructor
    public CromoDao(int max) {
        Album = new ArrayList<Cromo>();
        CartasRepes = new ArrayList<Cromo>();
        this.numero_max_coleccio = max;
    }

    //==>Funciones
    //poner
    public boolean PonerCromo(Cromo add) {
        //Comprobar que el cromo que no este i que no supere el maximo de la coleccion
        if (!Album.contains(add)) {
            Album.add(add);
            System.out.println("Cromo añadido");
            return true;
        } else {
            CartasRepes.add(add);
            return false;
        }
    }

    //eliminar
    public void EliminarCromo() {

    }

    //canviar
    public void CambiarCromo() {

    }

    //buscar
    public void BuscarCromo() {

    }
}
