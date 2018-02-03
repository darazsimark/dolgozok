/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolgozok;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Darázsi Márk
 */
public class DB {
    Connection kapcs;
    PreparedStatement ekpar;
    ResultSet eredmeny;
    
    final String dbUrl = "jdbc:mysql://localhost:3306/"
            + "?useUnicode=true&characterEncoding=UTF-8";
    final String user = "root";
    final String pass = "";
    
    public DB() {
        try {
            // kapcsolódás
            kapcs = DriverManager.getConnection(dbUrl, user, pass);
            System.out.println("A kapcsolat létrejött.");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
