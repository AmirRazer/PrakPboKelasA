package asosiasiuts;

public class customer {
    private String nama, nomor_plat;
    private bengkel Bengkel;
    
    public customer(String nama, String nomor_plat){
        this.nama=nama;
        this.nomor_plat=nomor_plat;
        Bengkel=null;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public void setNomorplat (String nomor_plat){
        this.nomor_plat=nomor_plat;
    }
    public void setBengkel(bengkel bengkel){
        this.Bengkel=bengkel;
    }
    public String getNama(){
        return nama;
    }
    public String getNomorplat(){
        return nomor_plat;
    }
    
}
