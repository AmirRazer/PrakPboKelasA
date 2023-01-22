
package asosiasi;


public class mahasiswa {
    //instance variabel
    private String nama;
    private int nim;
    
    //konstruktor
    
    public mahasiswa(String mhs_nama, int mhs_nim){
        this.nama=mhs_nama;
        this.nim=mhs_nim;
    }
    
    //method interface to acces data
    
    public void setNama(String mhs_nama){
        this.nama=mhs_nama;
    }
    public void setNim(int mhs_nim){
        this.nim=mhs_nim;
    }
    public String getNama(){
        return nama;
    }
    public int getNim(){
        return nim;
    }
}
