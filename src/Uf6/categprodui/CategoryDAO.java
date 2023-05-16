/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uf6.categprodui;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pomo6989
 */
public class CategoryDAO {

    //variables
    private final DBconnect dbconnect;

    //constructor
    public CategoryDAO(DBconnect dbconnect) {
        this.dbconnect = dbconnect;
    }

    public static Categories selectWhereCode(String code) {
        Categories categori=null;

        try {
            Connection conn = DBconnect.getConnection();
            if (conn != null) {
                String query = "select * from categories where code=?";

                PreparedStatement Pst = conn.prepareStatement(query);
                Pst.setString(1, code);
                ResultSet cursor_rs = Pst.executeQuery();

                if (cursor_rs.next()) {
                    categori = categoryFromResultSet(cursor_rs);
                }
            }

        } catch (SQLException ex) {
            System.out.println("Error al conectarse..." + ex.getMessage());
        }
        return categori;
    }

    private static Categories categoryFromResultSet(ResultSet cursor_rs) throws SQLException {
        Categories Categories;
        int id = cursor_rs.getInt("id");
        String code = cursor_rs.getString("code");
        String name = cursor_rs.getString("name");
        Categories = new Categories(id, code, name);
        return Categories;
    }

    public static int updateNameCategory(String code, String newName) {
        int rows_affected = 0;
        try {
            Connection conn = DBconnect.getConnection();

            if (conn != null) {
                Statement st = conn.createStatement();

                String consulta = "update categoties SET name='" + newName + "' where code='" + code + "'";
                System.out.println(code);
                rows_affected = st.executeUpdate(consulta);

            } else {
                rows_affected = -1;
            }
        } catch (SQLException ex) {
            System.out.println("Error al conectarse..." + ex.getMessage());
        }
        return rows_affected;
    }
    
}
