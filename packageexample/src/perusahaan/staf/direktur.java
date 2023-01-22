/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perusahaan.staf;

/**
 *
 * @author ASUS
 */
public class direktur {
    private String nama;
    private String tgl_masuk,jabatan;
    
    public direktur (String nama,String tgl,String jab){
        this.nama=nama;
        this.tgl_masuk=tgl;
        this.jabatan=jab;
    }
    public String getDirektur(){
        return nama;
    }
    public String getTgl_masuk(){
        return tgl_masuk;
    }
    public String getJabatan(){
        return jabatan;
    }
    
}
