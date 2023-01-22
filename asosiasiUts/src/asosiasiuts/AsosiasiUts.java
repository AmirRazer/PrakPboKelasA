package asosiasiuts;

public class AsosiasiUts {

    public static void main(String[] args) {
        // TODO code application logic here
     bengkel b1=new bengkel("Ruang Tunggu, Halaman Parkir, Minuman", "Matic");
        customer cs1=new customer("Amir", "K 4532 B");
        b1.setCustomer(cs1);
        cs1.setBengkel(b1);
        
        System.out.println("Nama : "+cs1.getNama()+"\n"+
                "Plat Nomor : "+cs1.getNomorplat()+"\n"+
                "Fasilitas : "+b1.getFasilitas()+"\n"+
                "Spesialis : "+b1.getSpesialis());
    }
    
}
