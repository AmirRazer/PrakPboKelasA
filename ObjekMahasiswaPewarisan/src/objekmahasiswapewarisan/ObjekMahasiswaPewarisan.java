
package objekmahasiswapewarisan;


public class ObjekMahasiswaPewarisan {

    
    public static void main(String[] args) {
        // Mahasiswa reguler
        mahasiswaReguler budi= new mahasiswaReguler(89,"Budi Gunadi",80,90);
        
        //Mahsiswa ekstensi
        mahasiswaEkstensi eno= new mahasiswaEkstensi(35,"Eno Letadi",78);
        
        //Tampil mahasiswa
        budi.printMhsReguler();
        eno.printMhsEkstensi();
        
    }
    
}
