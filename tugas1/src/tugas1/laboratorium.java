
package tugas1;

public class laboratorium {
 private String nama_lab;
 private int kapasitas;
 private asdos lab_asdos;
 
 public laboratorium(String nama_lab, int kapasitas, asdos lab_asdos){
 this.nama_lab=nama_lab;
 this.kapasitas=kapasitas;
 this.lab_asdos=lab_asdos;
}
 public String getNama(){
 return nama_lab;
}
 public int getKapasitas(){
 return kapasitas;
}
 public asdos getLabAsdos(){
 return lab_asdos;
}
 public void tampilMhs(){
 System.out.println("Nama Laboratorium\t: "+nama_lab);
 System.out.println("Kapasitas\t: "+kapasitas);
 System.out.println("Lab Asdos\t: "+lab_asdos);
}
}
