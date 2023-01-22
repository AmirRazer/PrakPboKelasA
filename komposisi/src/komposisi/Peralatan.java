package komposisi;

public class Peralatan {
    private String kunci;
    Bengkel bengkel;
    
    public Peralatan(String kunci){
        this.kunci=kunci;
    }
    public void setKunci(String kunci){
        this.kunci=kunci;
    }
    public void setBengkel(Bengkel bengkel){
        this.bengkel=bengkel;
    }
    public String getKunci(){
        return kunci;
    }
}
