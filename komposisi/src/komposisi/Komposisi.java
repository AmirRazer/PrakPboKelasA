package komposisi;

public class Komposisi {

    public static void main(String[] args) {
        Bengkel b1=new Bengkel("Ruang Tunggu, Halaman Parkir, Minuman", "Kopling");
        Peralatan p1=new Peralatan("Tang, Obeng, Kunci L, Kunci Pas, Kunci Inggris");
        
        System.out.println("Fasilitas : "+b1.getFasilitas()+"\n"+
                "Spesialis : "+b1.getSpesialis()+"\n"+
                "Peralatan : "+p1.getKunci());
    
    }
    
}
