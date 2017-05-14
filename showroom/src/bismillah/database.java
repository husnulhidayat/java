/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bismillah;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Husnul Hidayat
 */
public class database {
     private String dbuser = "root";
    private String dbpasswd ="";
    private Statement stmt  =null;
    private Connection con = null;
    private ResultSet rs =null;
    private static Connection koneksi;

    
    public database(){
        try{
            Class.forName("org.gjt.mm.mysql.Driver");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,""+e.getMessage(), "JDBC DRIVER ERROR",JOptionPane.WARNING_MESSAGE);
        }
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/showroom",dbuser,dbpasswd);
            stmt = con.createStatement();
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, ""+e.getMessage(),"Connection Error",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public static Connection getkoneksi() {
        if (koneksi==null) {
            try {                              
                String url="jdbc:mysql://localhost:3306/showroom";
                String user="root";
                String password="";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi=DriverManager.getConnection(url,user,password);
            }catch (SQLException t) {
                System.out.println("Error membuat koneksi");
            }
        }
     return koneksi;
    }
    
    
    public ResultSet getData(String SQLString){
        try{
           rs = stmt.executeQuery(SQLString);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error"+e.getMessage(),"Communication Error",JOptionPane.WARNING_MESSAGE);
        }
        return rs;
    }
    
    public void query(String SQLString){
        try{
            stmt.executeUpdate(SQLString);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error"+e.getMessage(),"Communication Error",JOptionPane.WARNING_MESSAGE);
        }
    }
    
        public void deleteKendaraan() throws SQLException{
        database d = new database();
        Kendaraan k = new Kendaraan();
        String sql = "delete from data where Jenis = ?"+k.getType();
        PreparedStatement preparedStmt = koneksi.prepareStatement(sql);
        preparedStmt.execute();
    }
}
