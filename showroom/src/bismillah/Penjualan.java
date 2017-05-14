/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bismillah;

import java.sql.ResultSet;

/**
 *
 * @author Husnul Hidayat
 */
public class Penjualan {
    private int id;
    private String nama;
    private String nopol;
    private String merk;
    private String jenis;
    private int harga;
    private String cicilan;
    private int perbulan;
    
    public Penjualan(){};

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNopol() {
        return nopol;
    }

    public void setNopol(String nopol) {
        this.nopol = nopol;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getCicilan() {
        return cicilan;
    }

    public void setCicilan(String cicilan) {
        this.cicilan = cicilan;
    }

    public int getPerbulan() {
        return perbulan;
    }

    public void setPerbulan(int perbulan) {
        this.perbulan = perbulan;
    }
    
    public void savePenjualan(){
        database d = new database();
        String sql = "Insert INTO penjualan values('"+this.nama+"','"+this.nopol+"','"+this.merk+"','"+this.jenis+"',"+this.harga+",'"+this.cicilan+"','"+this.perbulan+"')";
        d.query(sql);
    }
    
    
    public ResultSet getPenjualan(){
        ResultSet result = null;
        database d = new database();
        String sql = "Insert INTO penjualan values('"+this.nama+"','"+this.nopol+"','"+this.merk+"','"+this.jenis+"',"+this.harga+",'"+this.cicilan+"','"+this.perbulan+"')";
        d.query(sql);
        return result;
    }
    
}
