package latihan;

public class TamiyaRC extends Tamiya{
    private int frekuensi;
    
    // Constructor
    public TamiyaRC(String nama, String merk, String model, int kecepatan, int f) {
        super(nama, merk, model, kecepatan);
        frekuensi = f;
    }
    
    // Method Setter dan Getter
    public void setFrekuensi(int value){
        frekuensi = value;
    }
    
    public int getFrekuensi(){
        return frekuensi;
    }
    
    // Method yang diwariskan
    @Override
    public void tampilData(){
        super.tampilData();
        System.out.println("Frekuensi\t: " + frekuensi);
    }
}
