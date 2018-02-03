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
        String s1 = "CREATE DATABASE IF NOT EXISTS dolgozok";
        String s2 = "USE dolgozok";
        String s3 = "CREATE TABLE IF NOT EXISTS adatok (" +
                    "id int(4) NOT NULL AUTO_INCREMENT," +
                    "nev varchar(50)," +
                    "szulido date," +
                    "fizetes int(7)," +
                    "PRIMARY KEY(id) " +
                    ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4" +
                    " COLLATE=utf8mb4_hungarian_ci;";
        try {
            // kapcsolódás
            kapcs = DriverManager.getConnection(dbUrl, user, pass);
            
            // adatbázis létrehozása
            ekpar = kapcs.prepareStatement(s1);
            ekpar.execute();
            
            // adatbázis kijelölése
            ekpar = kapcs.prepareStatement(s2);
            ekpar.execute();
            
            // tábla létrehozása
            ekpar = kapcs.prepareStatement(s3);
            ekpar.execute();
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
