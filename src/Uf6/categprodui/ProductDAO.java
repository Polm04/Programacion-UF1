/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uf6.categprodui;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * CRUD (CREATE,READ,UPDATE,DELETE)
 *
 * @author pomo6989
 */
public class ProductDAO {

    //variables
    private final DBconnect dBconnect;

    //constructor
    public ProductDAO() {
        this.dBconnect = new DBconnect();
    }

    //metodos
    /**
     *
     * @param code
     * @return
     */
    public Products SelectWhereCode(String code) throws SQLException {
        Products prod;
        Connection conn = dBconnect.getConnection();//dBconnect= variable
        if (conn != null) {
            /*Statement stmt = conn.createStatement();
            String query = "select * from products where code ='" + code + "'";*/
            String query2 = "select * from products where code=?";
            PreparedStatement pst = conn.prepareStatement(query2);
            pst.setString(1, code);

            ResultSet cursor_rs = pst.executeQuery();
            if (cursor_rs.next()) {
                prod = productFromResultSet(cursor_rs);
            } else {
                prod = null;
            }
            conn.close();
            cursor_rs.close();
            pst.close();
            return prod;
        } else {
            return null;
        }
    }

    /**
     * devuelve todos los productos de la base de datos
     *
     * @return
     * @throws java.sql.SQLException
     */
    public List<Products> SelectAll() throws SQLException {

        List<Products> Result = new ArrayList<>();
        Connection conn = DBconnect.getConnection();//DBconnect= la clase, al ser 
        //estatica el metodo getConecction no hace falta hacer un objeto para llamarla
        if (conn != null) {
            Statement stmt = conn.createStatement();//obj para hacer las instrucciones
            String query = "select * from products";

            ResultSet cursor_rs = stmt.executeQuery(query);

            while (cursor_rs.next()) {

                //crear producte
                Products prod = productFromResultSet(cursor_rs);

                //ponerlo en la lista
                Result.add(prod);
            }

            conn.close();
            cursor_rs.close();
            stmt.close();
            return Result;
        } else {
            return null;
        }

    }

    public int insertProduct(Products add) throws SQLException {
        int numRowsAffected;
        Connection conn = DBconnect.getConnection();
        if (conn != null) {           
            String query = "INSERT INTO products VALUES(null,?,?,?,?,?)";//ponemos la instruccion           
            PreparedStatement stmt = conn.prepareStatement(query);// creamos la instruccion
            
            stmt.setString(1, add.getCode());
            stmt.setString(2, add.getName());
            stmt.setInt(3, add.getStock());
            stmt.setDouble(4, add.getPrice());
            stmt.setInt(5, add.getCategory_id());
            
            
            ResultSet cur = stmt.executeQuery(query);//la ejecutamos
            
            
            numRowsAffected = stmt.executeUpdate(query);//para ver cuantas columnas a efectado
            
            System.out.println("insert..."+ numRowsAffected);
            
            conn.close();
            cur.close();
            stmt.close();
            
        }else{
            return 0;
        }

        return numRowsAffected;
    }

    private Products productFromResultSet(ResultSet cursor_rs) throws SQLException {
        Products prod;
        int id = cursor_rs.getInt("id");
        String code = cursor_rs.getString("code");
        String name = cursor_rs.getString("name");
        int Stock = cursor_rs.getInt("Stock");
        int price = cursor_rs.getInt("price");
        int category_id = cursor_rs.getInt("category_id");

        prod = new Products(id, code, name, Stock, price, category_id);
        return prod;
    }
}
