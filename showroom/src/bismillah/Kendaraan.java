/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bismillah;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Husnul Hidayat
 */
public class Kendaraan {
    private String merk;
    private String type;
    private String nopol;
    private int harga;
    private int id;
    
    public Kendaraan(){};

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int Harga) {
        this.harga = Harga;
    }

    public String getNopol() {
        return nopol;
    }

    public void setNopol(String nopol) {
        this.nopol = nopol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void saveKendaraan(){
        database d = new database();
        String sql = "Insert INTO data values("+this.id+",'"+this.nopol+"','"+this.merk+"','"+this.type+"',"+this.harga+")";
        d.query(sql);
    }
    
    public ResultSet getKendaraan(){
        ResultSet result = null;
        database d = new database();
        String sql = "Insert INTO data values("+this.id+",'"+this.nopol+"','"+this.merk+"','"+this.type+"',"+this.harga+")";
        d.query(sql);
        return result;
    }
    

}
