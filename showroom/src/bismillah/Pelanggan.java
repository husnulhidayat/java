/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bismillah;

import java.sql.ResultSet;
import java.sql.PreparedStatement;


/**
 *
 * @author Husnul Hidayat
 */
public class Pelanggan {
    private int id;
    private String nama;
    private String alamat;
    
    public Pelanggan(){};

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public void savePelanggan(){
        database d = new database();
        String sql = "Insert INTO pelanggan values("+this.id+",'"+this.nama+"','"+this.alamat+"')";
        d.query(sql);
    }
    
    public ResultSet getPelanggan(){
        ResultSet result = null;
        database d = new database();
        String sql = "Insert INTO pelanggan values("+this.id+",'"+this.nama+"','"+this.alamat+"')";
        d.query(sql);
        return result;
    }
    
}
