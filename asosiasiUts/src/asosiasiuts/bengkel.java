package asosiasiuts;

public class bengkel {
    private String fasilitas, spesialis;
    private customer Customer;
    
    public bengkel(String fasilitas, String spesialis){
        this.fasilitas=fasilitas;
        this.spesialis=spesialis;
        Customer=null;
    }
    
    public void setFasilitas(String fasilitas){
        this.fasilitas=fasilitas;
    }
    public void setSpesialis(String spesialis){
        this.spesialis=spesialis;
    }
    public void setCustomer(customer customer){
        this.Customer=customer;
    }
    public String getFasilitas(){
        return fasilitas;
    }
    public String getSpesialis(){
        return spesialis;
    }
}
