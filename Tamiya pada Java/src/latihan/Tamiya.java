package latihan;

// Class Blueprint/Rancangan
public class Tamiya {
    // Atribut dari Tamiya
    protected String nama, model, merk; // + public; - private; # protected
    protected int kecepatan;
    protected Baterai baterai;
    
    // Constructor
    public Tamiya(String nama, String merk, String model, int kecepatan){
        this.nama = nama;
        this.merk = merk;
        this.model = model;
        this.kecepatan = kecepatan;
    }
    
    // ITAD (Interface to Access Data)
    // Method Setter
    public void setNama(String value){
        nama = value;
    }
    
    public void setMerk(String value){
        merk = value;
    }
    
    public void setModel(String value){
        model = value;
    }
    
    public void setKecepatan(int value){
        kecepatan = value;
    }
    
    public void setBaterai(Baterai bt){
        baterai = bt;
    }
    
    // Method Getter
    public String getNama(){
        return nama;
    }
    
    public String getMerk(){
        return merk;
    }
    
    public String getModel(){
        return model;
    }
    
    public int getKecepatan(){
        return kecepatan;
    }
    
    // Method/hal yang bisa dilakukan tamiya
    protected void nyalakanMesin(){
        if (baterai == null){
            System.out.println("Masukkan baterainya!");
        }
        else{
            System.out.println("Mesin sudah menyala..");
        }
    }
    
    protected void matikanMesin(){
        System.out.println("Mesin sudah mati..");
    }
    
    protected void tampilData(){
        System.out.println(
            "\n-- Informasi Tamiya --" +
            "\nNama\t\t: " + nama +
            "\nMerk\t\t: " + merk +
            "\nModel\t\t: " + model +
            "\nKecepatan\t: " + kecepatan
        );
        
        if (baterai != null){
            System.out.println("Baterai\t\t: " + baterai.getData());
        }
        else{
            System.out.println("Baterai\t\t: Kosong!");
        }
    }
}
