package komposisi;

public class Bengkel {
     private String fasilitas, spesialis;
    private Peralatan peralatan;
    
    public Bengkel(String fasilitas, String spesialis){
        this.fasilitas=fasilitas;
        this.spesialis=spesialis;
        this.peralatan=peralatan;
    }
    
    public void setFasilitas(String fasilitas){
        this.fasilitas=fasilitas;
    }
    public void setSpesialis(String spesialis){
        this.spesialis=spesialis;
    }
    public void setPeralatan(Peralatan peralatan){
        this.peralatan=peralatan;
    }
    public String getFasilitas(){
        return fasilitas;
    }
    public String getSpesialis(){
        return spesialis;
    }
}
