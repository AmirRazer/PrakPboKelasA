/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

/**
 *
 * @author ASUS
 */
public class Pegawai {
    
    //atribut
    String nama;
    int id;
    
    //construktor
    public Pegawai(int id,String nm){
        this.id = id;
        this.nama = nm;
    }
    //method
    public void tampilData(){
        System.out.println("### Data Pegawai ###");
        System.out.println("ID" + id);
        System.out.println("Nama" + nama);
}
}
