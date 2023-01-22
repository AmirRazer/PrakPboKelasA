package tugas1;

public class magang extends mahasiswa{
 private int jml_jam;
 private String skema;
 private String unit;
 
 public magang(int nim, String nama_mhs, String program_studi, int jml_jam,
 String skema, String unit) {
 super(nim, nama_mhs, program_studi);
 this.jml_jam=jml_jam;
 this.skema=skema;
 this.unit=unit;
}
 public void setJmlJam(int jml_jam){
 this.jml_jam=jml_jam;
}
 public void setSkema(String skema){
 this.skema=skema;
}
 public void setUnit(String unit){
 this.unit=unit;
}
 public int getJmlJam(){
 return jml_jam;
}
 public String getSkema(){
 return skema;
}
 public String getUnit(){
 return unit;
}
 public void tampilMhs(){
 super.tampilMhs();
 System.out.println("Jumlah Jam\t: " + jml_jam);
 System.out.println("Skema\t\t: " + skema);
 System.out.println("Unit\t\t: " + unit);
}
}
