/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uf5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author pomo6989
 */
public class Array_list {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        //definir araylist
        List<Integer> llista = new ArrayList<Integer>();
        // List<Tipo de dato> nombre_Arraylist= new ArrayList<Tipod de dato>();

        //poner datos
        llista.add(7);
        //llista.add(new Integer(5));
        llista.add(17);
        llista.add(2);

        //mirar cuantos elementos hay en el arraylist
        System.out.println("Numero de elementos: " + llista.size());

        //recorre Arraylist
        //1 forma
        for (Integer valor : llista) { //for(Tipo//obj,Integer... nombre: arraylist)
            System.out.println(valor);
        }

        System.out.println("Recorrer iterador");
        //2 forma
        Iterator<Integer> iter = llista.iterator();
        while (iter.hasNext()) {
            Integer i = iter.next();
            System.out.println(i);
        }

        System.out.println("Recorrer llista metode get");
        //3 forma
        for (int i = 0; i < llista.size(); i++) {
            System.out.println(llista.get(i));
        }
        
        //añadir datos en la posicion que queramos
        System.out.println("Pongo un 100 a la posicio 2");
        llista.set(2, 100);

        for (Integer numero : llista) {
            System.out.println(numero);
        }

        System.out.println("Pongo un 1000 a la posicion 0 i lo demas se meueve para abajo");
        llista.add(0, 1000);
        for (Integer num : llista) {
            System.out.println(num);
        }
      
        System.out.println("ToString"+llista.toString());
        
        //buscar valor con index of
        System.out.println("Index of busquem el 1000 i es troba en la posicio: "+llista.indexOf(100));
        
        //preguntamos si existe este objeto
        System.out.println("Conteins busquem el 1000 i preguntem si existeix: "+llista.contains(1000));
    }
}
