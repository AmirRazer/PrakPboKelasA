
package latihan3;

public class pegawaiTampil {

    public static void main(String[] args) {
        // TODO code application logic here
        //objek pegawai
        Pegawai ob=new Pegawai(213,"joko Susilo");
        Pegawai staf=new Pegawai(412,"Adi Gunadi");
        Pegawai gardener=new Pegawai(903,"Slamet");
        
        //tampil pegawai
        ob.tampilData();
        staf.tampilData();
        gardener.tampilData();
    }
    
}
