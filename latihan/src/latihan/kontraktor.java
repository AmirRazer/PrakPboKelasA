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
public class kontraktor {
    //instanis
    
    private String nama_kontraktor;
    private proyek proyek;
    
    public kontraktor(String nama){
        nama_kontraktor=nama;
    }
    public void SetProyek(proyek Proyek){
        this.proyek=Proyek;
    }
    public String getNama(){
        return nama_kontraktor;
    }
    
    public void tampiData(){
        System.out.println(
                           "\nInformasi Kontraktor"+
                           "\nNama : "+ nama_kontraktor
                            +"\nProyek:"+proyek.getNama());
    }
}

