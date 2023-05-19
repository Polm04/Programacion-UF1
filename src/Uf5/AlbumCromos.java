/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uf5;

import Objetos_echos.CromoDao;
import java.util.Scanner;
import Menu.menu;
import Objetos_echos.Cromo;
import java.util.InputMismatchException;
import Menu.OptionItem;

/**
 *
 * @author pomo6989
 */
public class AlbumCromos {

    /**
     * la part de la app, la que llança el programa fara la funció controlador
     * que es comunicarse amb DAO i informarà al usuari.
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlbumCromos app = new AlbumCromos();
        app.run();

    }

    /**
     * ja no estatic , i aix? ja ningu desde el fora el pugui cridar.
     *
     */
    private void run() {
        //ho deixo d'aquest form
        //creo un DAO (album)
        CromoDao album = new CromoDao(150);
        menu cromos_menu = new menu("Dragonball Collection");
        int option;
        anyadirOpcionesMenu(cromos_menu);
        anyadirCromos(album);
        Cromo aux;
        do {
            cromos_menu.DisplayMenu();
            option = cromos_menu.ChooseOption();
            switch (option) {
                case 1:
                    System.out.println("Adios");
                    break;
                case 2://afegir cromo
                    aux = CrearCromoUsuario();

                    try {
                        boolean ok = album.afegirCromo(aux);
                        if (ok) {
                            System.out.println("Cromo añadido al album. Num Cromos: " + album.getNumAlbum());
                        } else {
                            System.out.println("Cromo repetidos : " + album.getNumRepes());
                        }
                    } catch (Exception ex) {
                        System.out.println("El numero no esta en el album");
                    }

                    //crear un objecte cromo, amb els camps informats
                    //afegir-lo al album DAO
                    break;
                case 3://borrar cromo
                    aux = CrearCromoUsuario();
                    //hacer un metodo que solo pida elñ numero
                    int ok = album.removeCard(aux);
                    if (ok == 1) {
                        System.out.println("Cromo borrado " + album.getNumAlbum());
                    } else if (ok == 0) {
                        System.out.println("Cromo sacado repes " + album.getNumRepes());
                    } else {
                        System.out.println("No tengo el cromo");
                    }

                    break;
                case 4://Listar
                    for (Cromo cromo : album.getAlbum()) {
                        System.out.println(cromo.toString());
                    }
                case 5://Canviar cromos
                    canviarCromos(album);
                    break;

                //getAlbum
                //recorrer array list devuelto
                //mostrar el numero de cromos listado
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        } while (option != 1);

    }

    private void anyadirOpcionesMenu(menu cromos_menu) {
        cromos_menu.AddOption(new OptionItem("Sortir"));
        cromos_menu.AddOption(new OptionItem("Afegir Cromo"));
        cromos_menu.AddOption(new OptionItem("Borrar Cromo"));
        cromos_menu.AddOption(new OptionItem("Mostrar Album"));
    }

    /**
     * Pedira todos los datos de un cromo y creara un objeto cromo que retornara
     *
     * @return Cromo creado
     */
    private Cromo CrearCromoUsuario() {
        Scanner sc = new Scanner(System.in);
        boolean num_introducido_ok = false;
        int num = 0;
        Cromo card = null;
        while (!num_introducido_ok) {
            try {
                System.out.println("Pon el numero de cromo:");
                num = sc.nextInt();
                sc.nextLine();//eliminar buffer el return
                num_introducido_ok = true;
            } catch (InputMismatchException ex) {
                System.out.println("Valor no es numerico");
                sc.nextLine();
                num_introducido_ok = false;
            }
        }

        boolean description_ok = false;

        while (!description_ok) {
            System.out.println("Pon descripcion ");
            String descripcion = sc.nextLine();

            //card = new Cromo(num, descripcion);
            description_ok = true;

            System.out.println("Descripcion incorrecta");
            description_ok = false;
        }
        description_ok = true;

        return card;
    }

    private void anyadirCromos(CromoDao album) {
        try {
            album.afegirCromo(new Cromo(7, "Krilin"));
            album.afegirCromo(new Cromo(3, "Follet Tortuga"));
            album.afegirCromo(new Cromo(6, "Satanas Cor Petit"));
            album.afegirCromo(new Cromo(11, "Freezer"));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    private void canviarCromos(CromoDao album) {
        //demanar cromo obtens (NOU CROMO)
        Cromo new_card = CrearCromoUsuario();
        //demanar dades del que dones (CROMO VELL)
        System.out.println("Ahora el cromo que quieres dar");
        Cromo old_card = CrearCromoUsuario();
        //comprovar que no el tinc al album el nou

        //comprovar que SI TINC ALS REPES el vell
        //eliminar el vell
        //afegir el nou
        //informar usuari que han
    }
}
