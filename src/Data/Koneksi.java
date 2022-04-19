/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Probook 4420s
 */
public class Koneksi {
  Connection con;
    public Connection getConnection(){
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","");         
            return con;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Koneksi GAGAL \n"+e);
            return con;
        }
    }  
}