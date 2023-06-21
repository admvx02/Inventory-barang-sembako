/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventori_barang;

/**
 *
 * @author adam
 */

import java.sql.*;
import javax.swing.JOptionPane;

public class koneksi {

    static Object getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public Connection conn;
    public koneksi(){}

    public Connection openkoneksi() throws ClassNotFoundException{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String connURL = "jdbc:mysql://localhost/my_db3";
            String user = "root";
            String password = "";
            conn = DriverManager.getConnection(connURL, user, password);
            return conn;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Tidak ada koneksi yang terbuka atau salah konfigurasi database.");
            return null;
        }
    }
    
    public void closekoneksi() throws SQLException{
        try{
            if(conn != null){
                System.out.print("");
            }
        }catch(Exception ex){
        }
    } 
}
