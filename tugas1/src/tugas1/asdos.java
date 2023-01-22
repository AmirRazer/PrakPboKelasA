package tugas1;

public class asdos extends mahasiswa {
 
 private String matkul;
 private int sks;
 private String laboratorium;
 
 public asdos(int nim, String nama_mhs, String program_studi, String matkul,
 int sks, String laboratorium) {
 super(nim, nama_mhs, program_studi);
 this.matkul=matkul;
 this.sks=sks;
 this.laboratorium=laboratorium;
}
 public void setMatkul(String matkul){
 this.matkul=matkul;
}
 public void setSks(int sks){
 this.sks=sks;
}
 public void setLaboratorium(String laboratorium){
 this.laboratorium=laboratorium;
} 
 public String getMatkul(){
 return matkul;
} 
 public int getSks(){
 return sks;
}
 public String getLaboratorium(){
 return laboratorium;
}
 public void tampilMhs(){
 super.tampilMhs();
 System.out.println("Matkul\t\t: " + matkul);
 System.out.println("SKS\t\t: " + sks);
 System.out.println("Laboratorium\t: " + laboratorium);
}
}
