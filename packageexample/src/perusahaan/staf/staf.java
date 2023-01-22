package perusahaan.staf;

/**
 *
 * @author ASUS
 */
public class staf {
   private String nama,jabatan;
   
   public staf(String namas,String jab){
       this.nama=namas;
       this.jabatan=jab;
   }
   public String getStaf(){
       return nama;
   }
   
   public String getJabatan(){
       return jabatan;
   }
}
