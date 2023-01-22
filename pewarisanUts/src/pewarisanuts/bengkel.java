
package pewarisanuts;

public class bengkel {
    protected int tarif;
    protected String plat_nomor, nama_customer;
    
    public bengkel(String platm, int tarifp, String namac){
        plat_nomor=platm;
        tarif=tarifp;
        nama_customer=namac;
    }
    
    public void printBengkel(){
        System.out.println("Plat Nomor : "+plat_nomor+"\n"+
                "Tarif : "+tarif+"\n"+
                            "Nama Customer : "+nama_customer);
    }
}
