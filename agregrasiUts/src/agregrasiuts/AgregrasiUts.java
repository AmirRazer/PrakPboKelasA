package agregrasiuts;

public class AgregrasiUts {

    public static void main(String[] args) {
       Customer cs1=new Customer("Amir", "K 6575 A");
        Alamat almt1=new Alamat("Gembong", "Pati");
        
        cs1.setAlamat(almt1);
        almt1.setCustomer(cs1);
        
        System.out.println("Nama : "+cs1.getNama()+"\n"+
                "Plat Nomor : "+cs1.getNomorplat()+"\n"+
                "Desa : "+almt1.getDesa()+"\n"+
                "Kabupaten : "+almt1.getKabupaten());
    
    }
    
}
