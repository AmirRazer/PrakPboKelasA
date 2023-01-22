/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objekmahasiswapewarisan;

/**
 *
 * @author ASUS
 */
public class mahasiswaReguler extends mahasiswa {
    //atribut mhs reguler
    private double uts;
    private double uas;
    String grade;
    
    public mahasiswaReguler(int id,String namam,double uts,double uas){
        super(id,namam);
        if(namam==""){
            throw new IllegalAccessError("Nama tidak boleh kosong");
        }
        this.uts=uts;
        this.uas=uas;
        
        if (uas >= 90){
            grade = "A";
            System.out.println("Anda luar biasa");
        }else if (uas >= 80){
            grade = "B";
            System.out.println(" luar biasa");
        }else if (uas >= 70){
            grade = "C";
            System.out.println("  biasa");
        }else if (uas >= 60){
            grade = "D";
            System.out.println("  biasa aja");
        }
    }
    
    //tampil data
    public void printMhsReguler(){
        super.printMahasiswa();
        System.out.println("Grade:"+grade);
        System.out.println("Nilai Uts: "+uts+"\n"+
                            "Nilai Uas"+uas+"\n");
        
    }
}
