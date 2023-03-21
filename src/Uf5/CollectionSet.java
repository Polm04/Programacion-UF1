/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uf5;

import Objetos_echos.Cromo;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author pomo6989
 */
public class CollectionSet {

    public static void main(String[] args) {
        Set<Integer> conjunt = new HashSet<Integer>();
        Set<Integer> conjunt2 = new HashSet<Integer>();
        Set<Integer> conjunt_ord = new TreeSet<Integer>();
        
        boolean add;

        //HashSet
        add = conjunt.add(3);
        System.out.println("Sa afegit el 3?" + add);
        add = conjunt.add(7);
        System.out.println("Sa afegit el 7?" + add);
        add = conjunt.add(17);
        System.out.println("Sa afegit el 17?" + add);
        for (Integer num : conjunt) {
            System.out.println(num);
        }
        
        System.out.println("TreeSet");
        //TreeSet(Ordenado)
        add = conjunt_ord.add(17);
        System.out.println("Sa afegit el 17?" + add);
        add = conjunt_ord.add(3);
        System.out.println("Sa afegit el 3?" + add);
        add = conjunt_ord.add(7);
        System.out.println("Sa afegit el 7?" + add);
        for (Integer num : conjunt_ord) {
            System.out.println(num);
        }
        
        //Union
        add = conjunt2.add(7);
        add = conjunt2.add(100);
        add = conjunt2.add(50);
        
        conjunt.addAll(conjunt2);
        System.out.println("Union poner todos los elementos del primer i el segundo");
        for (Integer valor : conjunt) {
            System.out.println( valor);
        }
        
        //Retain all
        conjunt2.retainAll(conjunt_ord);
        System.out.println("RetainAll es igual a intersect");
        for (Integer valor : conjunt2) {
            System.out.println(valor);
        }
        
        //Remove all
        conjunt_ord.removeAll(conjunt2);
        System.out.println("Remove all: minus, tots els elements que no estan en el conjunt2");
        for (Integer num : conjunt_ord) {
            System.out.println(num);
        }
        
    }
}
