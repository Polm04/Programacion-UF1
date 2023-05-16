/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uf6.categprodui;

/**
 *
 * @author pomo6989
 */
public class Categories {
    
    //variables
    private int id;
    private String code;
    private String name;
    
    //constructor
    public Categories(int id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    Categories(int catId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
    
    //Metodos
    @Override
    public String toString() {
        return "id=" + id + ", code=" + code + ", name=" + name + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Categories)) {
            return false;
        }
        final Categories other = (Categories) obj;
        return this.code.equalsIgnoreCase(other.code);
    }
    
    
}
