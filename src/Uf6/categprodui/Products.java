/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uf6.categprodui;

/**
 *
 * @author pomo6989
 */
public class Products {
    
    //variables
    private int id;
    private String code;
    private String name;
    private int Stock;
    private int price;
    private int category_id;
    
    //constructor
    public Products(int id, String code, String name, int Stock, int price, int category_id) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.Stock = Stock;
        this.price = price;
        this.category_id = category_id;
    }
    
    public Products(Products other) {
        this.id = other.id;
        this.code = other.code;
        this.name = other.name;
        this.Stock = other.Stock;
        this.price = other.price;
        this.category_id = other.category_id;
    }
    
    //Getter i Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }
    
    //Metodos
    @Override
    public String toString() {
        return "id=" + id + ", code=" + code + ", name=" + name + ", Stock=" + Stock + ", price=" + price + ", category_id=" + category_id + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Products)) {
            return false;
        }
        final Products other = (Products) obj;
        return this.code.equalsIgnoreCase(other.code);
    }
    
    
}
