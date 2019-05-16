/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author JomyChen
 */
public enum DbConnection {

    @Deprecated
    instance;

    public static DbConnection getInstance() {
        return instance;
    }

    public Connection getConnection() {
        return createConnection();
    }

    private Connection createConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smart_court", "root", "jomy");
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
        return con;
    }

    public void closeConnection(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (Exception e) {

        }
    }

    public void closeConnection(Connection con, Statement st) {
        try {

            if (st != null) {
                st.close();
            }
        } catch (Exception e) {

        }

        try {

            if (con != null) {
                con.close();
            }
        } catch (Exception e) {

        }
    }

    public void closeConnection(Connection con, Statement st, ResultSet rs) {

        try {

            if (rs != null) {
                rs.close();
            }
        } catch (Exception e) {

        }

        try {

            if (st != null) {
                st.close();
            }
        } catch (Exception e) {

        }

        try {

            if (con != null) {
                con.close();
            }
        } catch (Exception e) {

        }
    }

}

