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
public class Lista {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        List<Integer> llista = new ArrayList<Integer>();
        
        llista.add(7);
        //llista.add(new Integer(5));
        llista.add(17);
        llista.add(2);
        
        System.out.println("Numero de elementos: "+llista.size());
        
        //recorre Arraylist
        
        //1 forma
        for (Integer valor: llista) {
            System.out.println(valor);
        }
        
        System.out.println("Recorrer iterador");
        //2 forma
        Iterator<Integer> iter= llista.iterator();
        while(iter.hasNext())
        {
            Integer i = iter.next();
            System.out.println(i);
        }
        
        System.out.println("Recorrer llista metodo get");
        //3 forma
        for (int i = 0; i <llista.size(); i++) {
            System.out.println(llista.get(i));
        }
    }
}
