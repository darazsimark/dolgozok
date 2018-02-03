/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolgozok;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
}
