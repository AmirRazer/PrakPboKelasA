/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author ASUS
 */
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
 // TODO code application logic here
 magang M1=new magang(202151101,"Andi Agfianto","Teknik Informatika",0,
 "Magang Beasiswa UMK","Progdi Teknik Informatika");
 magang M2=new magang(202151201,"Rifki Bagus Nugroho","Teknik Informatika",0,
 "Magang Luar Negeri","Univ Multimedia Malaysia");
 asdos A1= new asdos(202151300,"Firman Adi Nurpatin","Teknik Informatika",
 "Pemrograman Berorientasi Objek",3,"Laboratorium Pemrograman");
 asdos A2= new asdos(202151301,"Muhammad Ihdi Fahmi","Teknik Informatika",
 "Jaringan Komputer",2,"Laboratorium Jaringan");
 
 M1.tampilMhs();
 System.out.println(""); 
 M2.tampilMhs();
 System.out.println("");
 A1.tampilMhs();
 System.out.println("");
 A2.tampilMhs();
 }
}
