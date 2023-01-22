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

public class MahasiswaICT {
    private String nama,universitas,dpl;
    private LocalDate mulai,akhir;
    
    public MahasiswaICT(String nama_mhs, String nama_universitas, String nama_dpl, LocalDate tgl_mulai, LocalDate tgl_berakhir){
        this.nama=nama_mhs;
        this.universitas=nama_universitas;
        this.dpl=nama_dpl;
        this.mulai=tgl_mulai;
        this.akhir=tgl_berakhir;
    }
    
    public String getMahasiswaICT(){
        return nama;
    }
    
    public void tampilMhsICT(){
        System.out.println("---------------MAHASISWA ICT-----------\n"+
                            "Nama Mahasiswa:"+nama+"\n"+
                            "Nama Universitas:"+universitas+"\n"+
                            "Nama DPL:"+dpl+"\n"+
                            "Tanggal Memulai:"+mulai+"\n"+
                            "Tanggal Berakhir:"+akhir+"\n");
    }
    
    
}
