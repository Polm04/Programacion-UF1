/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos_echos;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
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
    private List<Cromo> Album;
    private List<Cromo> CartasRepes;
    private int numero_max_coleccio;
    private boolean ordenado;

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
            System.err.println("Cromo Repetido");
            return false;
        }
    }

    //canviar
    public void CambiarCromo() {

    }

    //buscar
    public void BuscarCromo() {
        
    }

    public List<Cromo> getAlbum() {
        if (!ordenado) {
            Collections.sort(Album);
            ordenado = true;
        }
        return Album;
    }

    public List<Cromo> getRepes() {
        if (!ordenado) {
            Collections.sort(CartasRepes);
            ordenado = true;
        }
        return CartasRepes;
    }

    public int getNum_max_coleccio() {
        return numero_max_coleccio;
    }

    public boolean afegirCromo(Cromo cromo_add) {

        if (!(Album.contains(cromo_add))) {
            CartasRepes.add(cromo_add);
            return false;
        } else {
            Album.add(cromo_add);
            return true;
        }
    }

    public int getNumAlbum() {
        return Album.size();
    }

    public int getNumRepes() {
        return CartasRepes.size();
    }

    /**
     *
     * @param del card con numero informado
     * @return 0 l'he boorat de repes 1 l'he tret del album i -1 no el tinc
     */
    public int removeCard(Cromo del) {
        if (CartasRepes.remove(del)) {
            return 0;
        } else if (Album.remove(del)) {
            return 1;
        } else {
            return -1;
        }
    }

    public void Listar_cromos_pares(CromoDao album) {
        for (Cromo pares : album.getAlbum()) {
            if (pares.getNumero() % 2 == 0) {
                System.out.println(pares.toString());
            }
        }
    }
}
