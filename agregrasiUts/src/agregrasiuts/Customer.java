package agregrasiuts;

public class Customer {
    private String nama, nomor_plat;
    private Alamat alamat;
    
    public Customer(String nama, String nomor_plat){
        this.nama=nama;
        this.nomor_plat=nomor_plat;
        alamat=null;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public void setNomorplat (String nomor_plat){
        this.nomor_plat=nomor_plat;
    }
    public void setAlamat(Alamat alamat){
        this.alamat=alamat;
    }
    public String getNama(){
        return nama;
    }
    public String getNomorplat(){
        return nomor_plat;
    }
}
