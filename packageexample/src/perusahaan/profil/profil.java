
package perusahaan.profil;
//profil perusahaan 
public class profil {
    private String nama,alamat;
    
    public profil(String nm, String almt){
        this.nama=nm;
        this.alamat=almt;
    }
    
    public String getNama(){
        return nama;
    }
    public String getAlamat(){
        return alamat;
    }
}
