
package Latihan1;

public class buahBeraksi {

    public static void main(String[] args) {
        // membuat objek buah
        Buah mangga=new Buah("mangga kueni","kuning","kecut",200,150000);
        Buah salak=new Buah("Salak pondok","hitam","manis",5,60000);
        Buah duren=new Buah("Duren Montong","kuning","manis",8,80000);
        
        //mengakses objek
//        mangga.deskripsiBuah();
//        salak.deskripsiBuah();
//        duren.deskripsiBuah();
        
        //menganti 
        mangga.setNama("Mangga arum manis");
        mangga.setWarna("biru");
        mangga.setRasa("manis");
        mangga.setHarga(90000);
        mangga.setBerat(15);
        
        mangga.deskripsiBuah();
    }
    
   
    
    
}
