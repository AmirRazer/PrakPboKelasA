
package latihan;


public class Latihan {

    
    public static void main(String[] args) {
        // TODO code application logic here
        proyek gedung_j=new proyek("Renovasi gedung j");
        proyek parkiran_tingkat=new proyek("Parkiran Elit");
        
        kontraktor asep=new kontraktor("Asep Properti");
        kontraktor pt=new kontraktor("PT Lancarjaya tak terlambat");
        
        gedung_j.setKontraktor(asep);
        asep.SetProyek(gedung_j);
        
        parkiran_tingkat.setKontraktor(pt);
        pt.SetProyek(parkiran_tingkat);
        
        
        gedung_j.tampilData();
        parkiran_tingkat.tampilData();
        asep.tampiData();
        pt.tampiData();
    }
    
}
