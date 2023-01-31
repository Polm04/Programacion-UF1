/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos_echos;

import java.util.Scanner;

/**
 *
 * @author pomo6989
 */
public class Articulo {

    private String nombre;
    private int precio;
    private final int iva = 21;
    private int cuantosQuedan;

    //constructor
    public Articulo(String nombre, int precio, int cuantosQuedan) {
        this.nombre = nombre;
        this.precio = precio;
        this.cuantosQuedan = cuantosQuedan;
    }

    //get
    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public int getIva() {
        return iva;
    }

    public int getCuantosQuedan() {
        return cuantosQuedan;
    }

    //set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setCuantosQuedan(int cuantosQuedan) {
        this.cuantosQuedan = cuantosQuedan;
    }

    //funciones
    public void mostrar() {
        System.out.println("Nombre: " + nombre + ", precio: " + precio + " , iva: " + iva + " , inventario: " + cuantosQuedan);
    }

    public int getPVP() {
        int precio;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuanto vale este producto= " + this.nombre);
        precio = sc.nextInt();
        this.precio = precio + (precio * iva) / 100;
        return this.precio;
    }

    public int getPVPDescuento() {
        int descuento;
        Scanner sc = new Scanner(System.in);
        System.out.println("Que descuento tiene este producto= " + this.nombre);
        descuento = sc.nextInt();
        this.precio = precio - (precio * descuento) / 100;
        return this.precio;
    }
    public boolean existencias(){      
        Scanner sc = new Scanner(System.in);
        System.out.println("Quieres comparlo?");
        String compra=sc.nextLine();
        if("Si".equalsIgnoreCase(nombre)||this.cuantosQuedan==0)
        {
            System.out.println("NO HAY EXISTENCIAS");
            return false;
        }
        else{
            cuantosQuedan--;
            return true;
        }
    }
}
