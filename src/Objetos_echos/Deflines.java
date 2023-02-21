/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos_echos;

import java.util.Random;

/**
 *
 * @author pomo6989
 */
public class Deflines {
    private int Age;
    private String Raza;
    private double Speed;
    private int distancia_recorreguda;

    //constructor

    public Deflines(int Age, String Raza, double Speed, int distancia_recorreguda) {
        this.setAge(Age);
        this.setRaza(Raza);
        this.setSpeed(Speed);
        this.distancia_recorreguda = distancia_recorreguda;
        sprint_final();
    }
   

    //get
    public int getAge() {
        return Age;
    }

    public String getRaza() {
        return Raza;
    }

    public double getSpeed() {
        return Speed;
    }

    public int getDistancia_recorreguda() {
        return distancia_recorreguda;
    }

    //set
    public void setAge(int Age) {
        if (Age > 0) {
            this.Age = Age;
        } else {
            System.err.println("ERROR AL CREAR LA EDAT");
            System.out.println("La edat sera: 30");
            this.Age = 30;
        }
    }

    public void setRaza(String Raza) {
        if (Raza.equalsIgnoreCase("fosc") || Raza.equalsIgnoreCase("Austral")) {
            this.Raza = Raza;
        } else {
            System.err.println("ERROR AL CREAR LA RAZA");
            System.out.println("Ahora la raza es dofi fosc");
            this.Raza = "Fosc";
        }
    }

    public void setSpeed(double Speed) {
        if (this.Raza.equalsIgnoreCase("Fosc")) {
            this.Speed = this.Age * 10;
        } else if (this.Raza.equalsIgnoreCase("Austral")) {
            this.Speed = this.Age * 22;
        }
    }

    public void setDistancia_recorreguda(int distancia_recorreguda) {
        this.distancia_recorreguda = distancia_recorreguda;
    }

    //funciones
    public void Mostrar_delfin() {
        System.out.println("La edat es: " + this.Age + ", la Raza es: " + this.Raza + " , la velaciodad es: " + this.Speed);
    }

    public void Mostrar_Age() {
        System.out.println("La edat es: " + this.Age);
    }

    public void Mostrar_Raza() {
        System.out.println("La Raza es: " + this.Raza);
    }

    public void Mostrar_Speed() {
        System.out.println("La velaciodad es: " + this.Speed);
    }

    public void Mostrar_Distancia_recorreguda() {
        System.out.println("la distancia recoreguda: " + this.distancia_recorreguda);
    }

    public int sprint_final() {
        int sprint;
        Random rd = new Random();
        sprint=rd.nextInt(100)+25;
        return sprint;
    }
}
