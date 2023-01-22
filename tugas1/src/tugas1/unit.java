package tugas1;

public class unit {
 private String nama_unit;
 private String kepala_unit;
 private magang unit_magang;
 
 public unit(String nama_unit, String kepala_unit, magang unit_magang){
 this.nama_unit=nama_unit;
 this.kepala_unit=kepala_unit;
 this.unit_magang=unit_magang;
}
 public magang getUnitmagang(){
 return unit_magang;
}
 public String getKepalaUnit(){
 return kepala_unit;
}
 public String getNamaUnit(){
 return nama_unit;
}
 public void tampilMhs(){
 System.out.println("Kepala Unit\t: "+kepala_unit);
 System.out.println("Nama Unit\t: "+nama_unit);
 System.out.println("Unit Magang\t: "+unit_magang);
}
}
