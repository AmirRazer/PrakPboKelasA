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
import java.time.LocalDate;

public class MahasiswaMagang {
    private String nama,perusahaan;
    private LocalDate mulai;
    private int jam;
    
    public MahasiswaMagang(String nama_mhs, String nama_perusahaan, LocalDate tgl_mulai, int jml_jam){
        this.nama=nama_mhs;
        this.perusahaan=nama_perusahaan;
        this.mulai=tgl_mulai;
        this.jam=jml_jam;
    }
    
    public String getMahasiswaMagang(){
        return nama;
    }
        
    public void tampilMhsMagang(){
        System.out.println("-----------MAHASISWA MAGANG---------");
        System.out.println("Nama Mahasiswa:"+nama+"\n"+
                            "Nama Perusahaan:"+perusahaan+"\n"+
                            "Tanggal Memulai:"+mulai+"\n"+
                            "Total Jam Operasi:"+jam+"\n");
    }
    

}
