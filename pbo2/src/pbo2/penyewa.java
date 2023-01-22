/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2;

/**
 *
 * @author ASUS
 */
public class penyewa {
     private String nama, alamat;
    private buku buku;
    
    public penyewa(String nama, String alamat){
        this.nama=nama;
        this.alamat=alamat;
        buku=null;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public void setalamat (String alamat){
        this.alamat=alamat;
    }
    public void setbuku(buku buku){
        this.buku=buku;
    }
    public String getNama(){
        return nama;
    }
    public String getalamat(){
        return alamat;
    }
}
