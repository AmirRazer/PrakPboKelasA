package latihan;

public class Jalankan {

    // Main method
    public static void main(String[] args) {
        // Membuat objek
        Tamiya tm1 = new Tamiya("Tamiya 2000", "TAMIYA KW", "JJ2000", 20);
        Tamiya tm2 = new Tamiya("Tamiya 5000", "TAMIYA ASLI", "CSW 100", 60);
        TamiyaRC bot = new TamiyaRC("Spy", "Sony", "Spy Car 2000", 25, 80);
        Baterai bt1 = new Baterai("ABC", 500);
        Baterai bt2 = new Baterai("Alkaline", 750);
                
        // Menjalankan method
//        tm1.nyalakanMesin();
//        tm1.matikanMesin();
//        tm2.nyalakanMesin();
//        tm2.matikanMesin();
        bot.nyalakanMesin();
        bot.matikanMesin();
        
        // Memberikan informasi pada objek
        tm1.setNama("Tamiya X-3000");
        tm1.setMerk("TAMIYA");
        tm1.setModel("Juggernaut");
        tm1.setKecepatan(30);
        tm1.setBaterai(bt1);
        
        bot.setBaterai(bt2);
        
        // Menampilkan informasi
        tm1.tampilData();
        tm2.tampilData();
        bot.tampilData();
        
        // Coba Setter & Getter
        bot.setFrekuensi(90);
        System.out.println("Tamiya Bot frekuensinya " + bot.getFrekuensi());
        
        bot.tampilData();
    }
    
}
