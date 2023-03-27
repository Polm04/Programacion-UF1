/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uf5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author pomo6989
 */
public class HashMap_Prueba {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Map<String, Integer> lletres = new HashMap<>();

        //añadir al diccionario
        //put
        lletres.put("A", 1);
        lletres.put("B", 1);
        lletres.put("C", 1);
        lletres.put("D", 1);
        lletres.put("E", 1);
        lletres.put("F", 11);
        lletres.put("I", 1);
        lletres.put("H", 1);
        lletres.put("Z", 1);

        //recorrer el hashmap con iterator
        Set<Map.Entry<String, Integer>> set = lletres.entrySet();//CONJUNT
        Iterator<Map.Entry<String, Integer>> iterator = set.iterator();//ITERATOR SIRVE PARA RECORRER CUALQUIER ESTRUCTURA DE DATOS

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            String key = entry.getKey();
            Integer valor = entry.getValue();
            System.out.println("{" + key + "}=>" + "{" + valor + "}");
        }

        //recorrer el hashmap amb les claus
        //mostrar todo
        Set<String> keys = lletres.keySet();

        for (String key : keys) {
            Integer valor = lletres.get(key);
            System.out.println("Foreach" + "{" + key + "}=>" + "{" + valor + "}");
        }

        //mostrar el valor de la clave f
        Integer valor_recuperado = lletres.get("F");
        System.out.println("=>" + valor_recuperado);

        //Foreach
        for (Map.Entry<String, Integer> entrada : lletres.entrySet()) {
            System.out.println("Foreach" + "{" + entrada.getKey() + "}=>" + "{" + entrada.getValue() + "}");
        }

        //borrar la letra i
        lletres.remove("I");
        System.out.println("Despres de borrar la i");
        for (String key : keys) {
            Integer valor = lletres.get(key);
            System.out.println("Foreach" + "{" + key + "}=>" + "{" + valor + "}");
        }

        //canviar valores
        lletres.replace("A", 4);
        System.out.println("Despres de canviar el valor de a");
        for (String key : keys) {
            Integer valor = lletres.get(key);
            System.out.println("Foreach" + "{" + key + "}=>" + "{" + valor + "}");
        }
    }
}
