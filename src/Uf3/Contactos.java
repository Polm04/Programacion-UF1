/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uf3;

import java.io.Serializable;

/**
 *
 * @author pomo6989
 */
public class Contactos implements Serializable { // Serializable es la interface que permite que guardemos objetos contactos a ficheros

    //variables
    private String name;
    private int age;

    //constructor
    public Contactos(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getter i setter   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //funciones
    @Override
    public String toString() {
        return "name=" + name + ", age=" + age + '}';
    }

}
