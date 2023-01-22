/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author ASUS
 */
public class proyek {
    //instansi
    
    private String nama_proyek;
    private kontraktor kontraktor;
    
    
    
    public proyek(String nama_proyek){
        this.nama_proyek=nama_proyek;
    }
    public void setKontraktor(kontraktor K){
        kontraktor=K;
    }
    
    public String getNama(){
        return nama_proyek;
    }
    
    public void tampilData(){
        System.out.println("\ninformasi Proyek");
        System.out.println("Nama Proyek:"+ nama_proyek);
        System.out.println("Nama Kontraktor"+kontraktor.getNama());
    }
    
}
