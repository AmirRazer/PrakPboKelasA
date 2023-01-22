/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasppbo2;

/**
 *
 * @author ASUS
 */
public class Mahasiswa {
    private String nama;
    private int nim;
    
    public Mahasiswa(String nama_mhs, int nim_mhs){
        this.nama=nama_mhs;
        this.nim=nim_mhs;
    }
    
    public String getNama(){
        return nama;
    }
    
    public int getNim(){
        return nim;
    }
    
    public void tampil_mhs(){
        System.out.println("-----------------NAMA MAHASISWA----------------");
        System.out.println("Nama Mahasiswa:\t"+nama+"\n"+
                            " Nim Mahasiswa:\t"+nim+"\n");
    }
}
