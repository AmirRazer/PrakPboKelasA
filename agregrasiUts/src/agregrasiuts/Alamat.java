package agregrasiuts;

public class Alamat {
    private String desa, kabupaten;
    private Customer customer;
    
    public Alamat(String desa, String kabupaten){
        this.desa=desa;
        this.kabupaten=kabupaten;
    }
    public void setDesa(String desa){
        this.desa=desa;
    }
    public void setKabupaten (String kabupaten){
        this.kabupaten=kabupaten;
    }
    public void setCustomer(Customer customer){
        this.customer=customer;
    }
    public String getDesa(){
        return desa;
    }
    public String getKabupaten(){
        return kabupaten;
    }
}
