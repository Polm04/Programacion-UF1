/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Uf6.ShowCountries;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author pomo6989
 */
public class ShowCountries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ShowCountries app = new ShowCountries();

        app.run();
    }

    private void run() {
        boolean exit = false;
        try {
            //load the driver (only once).
            DBconnect.LoadDriver();
            do {
                int optNumber = promptMenu();
                switch (optNumber) {
                    case 0:
                        exit = true;
                        break;
                    case 1:
                        printAllCountries();
                        break;
                    case 2:
                        printAllCountriesAndMetadata();
                        break;
                    case 3:
                        insertANewCountry();
                        break;
                    case 4:
                        modifyACountry();
                        break;
                    case 5:
                        deleteACountry();
                        break;
                    default:
                        System.out.println("Bad option!");
                        break;
                }
            } while (!exit);
        } catch (ClassNotFoundException ex) {
            System.out.println("Classe no encontrada");
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }

    private int promptMenu() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] options = {
            "Quit", "Print all countries", "Print all countries and metadata",
            "Insert a new country", "Modify a country", "Delete a country",};
        for (int i = 0; i < options.length; i++) {
            System.out.format("[%d]. %s\n", i, options[i]);
        }
        System.out.print("Choose a test to execute: ");
        int op;
        try {
            op = Integer.parseInt((reader.readLine()));
        } catch (NumberFormatException | IOException e) {
            op = -1;
        }
        return op;
    }

    private void printAllCountries() {
        System.out.println("Listing all countries...");

        try {
            //get a connect to database
            Connection conn = DBconnect.getConnection();

            if (conn != null) {

                //create a statment to perform Queris
                Statement stmt = conn.createStatement();

                //execute query
                String query = "SELECT * FROM countries";
                ResultSet resCursor = stmt.executeQuery(query);

                //write headers.
                System.out.println("");
                System.out.format("%s\t%-25s\t%-15s\t%-10s\t%-10s\t%-10s\t%s\n",
                        "id",
                        "name", "capital",
                        "surface", "inhabitants",
                        "pib", "life expectancy");
                System.out.println("");

                int cont = 0;
                //fetch . iterate cursor
                while (resCursor.next()) {
                    cont++;
                    int id = resCursor.getInt("id");
                    String name = resCursor.getString("name");
                    String capital = resCursor.getString("capital");
                    double surface = resCursor.getDouble("surface");
                    int inhabitants = resCursor.getInt("inhabitants");
                    double pib = resCursor.getDouble("pib");
                    int lifeexpectancy = resCursor.getInt("lifeexpectancy");

                    Country pais = new Country(id, name, capital, surface, inhabitants, pib, lifeexpectancy);
                    //System.out.println(pais);

                    System.out.format("%d\t%-25s\t%-15s\t%8.0f\t%10d\t%8.2f\t%d\n",
                            pais.getId(),
                            pais.getName(), pais.getCapital(),
                            pais.getSurface(), pais.getInhabitants(),
                            pais.getPib(), pais.getLifeexpectancy());

                }
                resCursor.close();
                stmt.close();
                System.out.println("Countries Listed..." + cont);
            } else {
                System.out.println("Error Conecction....");
            }

        } catch (SQLException ex) {
            System.out.println("Error conexion sql...");
        }
    }

    private void printAllCountriesAndMetadata() {
        System.out.println("Executing: " + (new Exception()).getStackTrace()[0].getMethodName());
        try ( Connection conn = DBconnect.getConnection()) { //get a connection to database.
            if (conn != null) {
                //create a statement to perform queries.
                Statement stmt = conn.createStatement();
                //execute the query and get a resultset.
                String query = "SELECT * FROM countries WHERE lifeexpectancy > 77";
                ResultSet res = stmt.executeQuery(query);
                //get and write metadata.
                ResultSetMetaData rsmd = res.getMetaData();
                int numCol = rsmd.getColumnCount();
                System.out.println("Number of columns: " + rsmd.getColumnCount());
                System.out.println("Label \t Name \t Type \t Type name \t Auto increment \t Null \t Precision");
                for (int i = 0; i < numCol; i++) {
                    System.out.print(rsmd.getColumnLabel(i + 1) + " \t ");
                    System.out.print(rsmd.getColumnName(i + 1) + " \t ");
                    System.out.print(rsmd.getColumnType(i + 1) + " \t ");
                    System.out.print(rsmd.getColumnTypeName(i + 1) + " \t ");
                    System.out.print(rsmd.isAutoIncrement(i + 1) + " \t ");
                    System.out.print(rsmd.isNullable(i + 1) + " \t ");
                    System.out.print(rsmd.getPrecision(i + 1) + " \t ");
                    System.out.println("");
                }
                //write headers.
                System.out.println("");
                for (int i = 0; i < numCol; i++) {
                    System.out.print(rsmd.getColumnLabel(i + 1) + "\t");
                }
                System.out.println("");
                //iterate the resultset and write the rows.
                while (res.next()) {
                    //convert data to java format.
                    int id = res.getInt("id");
                    String name = res.getString("name");
                    String capital = res.getString("capital");
                    double surface = res.getDouble("surface");
                    int inhabitants = res.getInt("inhabitants");
                    double pib = res.getDouble("pib");
                    int lifeexpectancy = res.getInt("lifeexpectancy");
                    //instantiate a country object.
                    Country country = new Country(id, name, capital, surface, inhabitants, pib, lifeexpectancy);
                    //write data.
                    System.out.format("%d\t%-15s\t%-15s\t%8.0f\t%10d\t%8.2f\t%d\n",
                            country.getId(),
                            country.getName(), country.getCapital(),
                            country.getSurface(), country.getInhabitants(),
                            country.getPib(), country.getLifeexpectancy());
                }
                System.out.println("");
                //close resources.
                res.close();
                stmt.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void insertANewCountry() {
        System.out.println("Insertinf new country...");

        try {
            Connection conn = DBconnect.getConnection();

            if (conn != null) {
                Statement stmt = conn.createStatement();

                //pefir datos usuario para crear country
                String query = "INSERT INTO countries values" + "(102,'AndorraImaginaria','Andorra2000',"
                        + "1000, 25, 3, 90)";
                System.out.println(query);
                int numRowsAffected = stmt.executeUpdate(query);
                System.out.println(numRowsAffected + "inserted...");

                stmt.close();
                conn.close();
            }
        } catch (SQLException ex) {
            System.out.println("Conexion error..." + ex.getMessage());
        }
    }

    private void modifyACountry() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Modify country...");

        try {
            Connection conn = DBconnect.getConnection();

            if (conn != null) {
                Statement stmt = conn.createStatement();

                System.out.println("Que nombre quieres poner?");
                String nuevoNombre = sc.nextLine();

                String query = "UPDATE countries SET name='" + nuevoNombre + "' where id=102";
                System.out.println(query);
                int numRowsAffected = stmt.executeUpdate(query);
                System.out.println(numRowsAffected + " modified...");

                stmt.close();
                conn.close();
            }

        } catch (SQLException ex) {
            System.out.println("Conexion error..." + ex.getMessage());
        }
    }

    private void deleteACountry() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Delete a country...");

        try {
            Connection conn = DBconnect.getConnection();

            System.out.println("Que pais quieres borrar?");
            System.out.println("Pon la id");
            int id_borrar = sc.nextInt();

            if (conn != null) {
                Statement stmt = conn.createStatement();

                //pefir datos usuario para crear country
                String query = "DELETE FROM countries WHERE id =" + id_borrar;
                int numRowsAffected = stmt.executeUpdate(query);
                System.out.println(numRowsAffected + "Delete...");

                stmt.close();
                conn.close();
            }

        } catch (SQLException ex) {
            System.out.println("Conexion error..." + ex.getMessage());
        }

    }

}
