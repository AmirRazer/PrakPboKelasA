
package tugasppbo2;

import java.time.LocalDate;

public class ProgramStudi {
    private String akreditasi;
    private LocalDate tanggal;
    private Mahasiswa mahasiswa;
    
    public ProgramStudi(String no_akreditasi, LocalDate tgl_berdiri){
        this.akreditasi=no_akreditasi;
        this.tanggal=tgl_berdiri;
        mahasiswa=null;
    }
    
    public String getAkreditasi(){
       return akreditasi;
   }
 
    public void setMahasiswa(String Mahasiswa){
        this.mahasiswa=mahasiswa;
    }
        
    public void tampil_progdi(){
        System.out.println("---------------------PROGRAM STUDI TEKNIK INFORMATIKA----------------");
        System.out.println("Akkreditasi:\t"+akreditasi+"\n"+
                            "Tanggal Berdiri:\t"+tanggal+"\n"+
                            "\nNama\t\t:"+mahasiswa.getNama()+
                            "\nNIM\t\t:"+mahasiswa.getNim());
    }

}


