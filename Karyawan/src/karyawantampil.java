
public class karyawantampil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Objek kariawan
        karyawan ob=new karyawan(29, "Budi Gunawan");
        karyawan staf=new karyawan(34, "adi kurniadi", "hrd");
        karyawan accounting=new karyawan(55, "Hesti dwi kumalasari","keuangan");
        karyawan humas=new karyawan(76, "bambang geer", "humas");
        karyawan programer=new karyawan(82, "eno lerian","R&D");
        
        
        //karyawan tampil
        
        ob.tampilKaryawan();
        staf.tampilKaryawan();
        accounting.tampilKaryawan();
        humas.tampilKaryawan();
        programer.tampilKaryawan();
    }
    
}
