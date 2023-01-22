
package objekmahasiswapewarisan;


public class mahasiswaEkstensi extends mahasiswa{
    private double project;
    
    public mahasiswaEkstensi (int id, String nama,double project){
        super(id,nama);
        this.project=project;
    }
    
    public void printMhsEkstensi(){
        System.out.println("Output:");
        super.printMahasiswa();
        System.out.println("Nilai Project :"+project);
    }
    
}
