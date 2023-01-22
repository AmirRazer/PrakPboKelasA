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
public class buku {
    private String judul, jenis;
    private penyewa penyewa;
    
    public buku(String judul, String jenis){
        this.judul=judul;
        this.jenis=jenis;
        penyewa=null;
    }
    
    public void setjudul(String judul){
        this.judul=judul;
    }
    public void setjenis(String jenis){
        this.jenis=jenis;
    }
    public void setpenyewa(penyewa penyewa){
        this.penyewa=penyewa;
    }
    public String getjudul(){
        return judul;
    }
    public String getjenis(){
        return jenis;
    }
    
}
