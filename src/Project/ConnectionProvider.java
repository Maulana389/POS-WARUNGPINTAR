/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Maulana
 */
public class ConnectionProvider {
    static Connection conn;
    public static Connection getCon(){
        if(conn == null){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
                conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bms","root","");
            }catch (Exception e){
                JOptionPane.showMessageDialog(null,"Koneksi Tidak Berhasil!","Pesan",JOptionPane.INFORMATION_MESSAGE);
                System.out.println("Error : "+e.getMessage());
            }
        }
        return conn;
    }
}
