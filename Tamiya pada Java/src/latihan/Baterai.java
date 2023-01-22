package latihan;


public class Baterai {
    private String merk;
    private int kapasitas;
    
    public Baterai(String merk, int kapasitas){
        this.merk = merk;
        this.kapasitas = kapasitas;
    }
    
    public String getData(){
        return (merk + " | " + kapasitas + " mAh");
    }
}
