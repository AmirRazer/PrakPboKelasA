package tugas1;

public class mahasiswa {
    protected int nim;
 protected String nama_mhs;
 protected String program_studi;
 
 public mahasiswa(int nim, String nama_mhs, String program_studi){
 this.nim=nim;
 this.nama_mhs=nama_mhs;
 this.program_studi=program_studi;
}
 public void setNim(int nim){
 this.nim=nim;
}
 public void setNama(String nama_mhs){
 this.nama_mhs=nama_mhs;
}
 public void setProdi(String program_studi){
 this.program_studi=program_studi;
}
 public int getNim(){
 return nim;
}
 public String getNama(){
 return nama_mhs;
}
 public String getProdi(){
 return program_studi;
}
 public void tampilMhs(){
 System.out.println("NIM\t\t: "+nim);
 System.out.println("Nama Mahasiswa\t: "+nama_mhs);
 System.out.println("Program Studi\t: "+program_studi);
}
}
