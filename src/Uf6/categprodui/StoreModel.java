/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uf6.categprodui;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author pomo6989
 */
public class StoreModel {

    private final ProductDAO productDao;

    public StoreModel() {
        this.productDao = new ProductDAO();
    }

    public int addProduct(Products add) throws SQLException {
        //validaciones si tengo que insertarlo
        int result = 0;
        boolean dataValid = true;

        if (add != null) {
            String code = add.getCode();

            if (code != null) {
                dataValid = false;
            } else {

                Products p = productDao.SelectWhereCode(code);//compruebo si el codigo no esta insertado ya
                if (p != null) {
                    dataValid = false;
                }
            }

        } else {
            dataValid = false;
        }
        if (dataValid = true) {
            result = productDao.insertProduct(add);
        } else {
            result = 0;
        }
        return result;
    }

    public List<Products> findAllProducts() throws SQLException {
        return productDao.SelectAll();
    }

    public Products findProductByCode(String code) throws SQLException {
        Products p = null;
        if (code != null) {
            p = productDao.SelectWhereCode(code);
        }
        return p;
    }

    public int updateCategoryByName(String code, String newName) {
        Categories cat;
        int rc = 0;
        if (code != null) {
            if (newName != null && newName.isEmpty()) {
                cat = CategoryDAO.selectWhereCode(code);

            }
        } else {

        }
        return rc;
    }
}
