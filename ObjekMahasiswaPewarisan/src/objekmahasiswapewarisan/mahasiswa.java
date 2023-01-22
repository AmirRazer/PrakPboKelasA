
package objekmahasiswapewarisan;


public class mahasiswa {
    
    //instance variabel
    protected int id;
    protected String nama;
    
    public mahasiswa (int idm, String namam){
        id=idm;
        nama=namam;
    }
    
    public void printMahasiswa(){
        System.out.println("Id" +id+ "\n"+
                            "Nama"+nama);
    }
    
    
    
}
