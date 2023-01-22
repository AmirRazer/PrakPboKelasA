/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asosiasi;

/**
 *
 * @author ASUS
 */
public class Asosiasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //objek mhs
        mahasiswa mhs1=new mahasiswa("Amir Mahmud", 100);
        mahasiswa mhs2= new mahasiswa("Rina kususma",90);
        mahasiswa mhs3= new mahasiswa ("gendut doni",88);
        
        
        //objek dosen
        dosen dosen1=new dosen("Paiman Wikcaksono ,ST,Mt");
        dosen dosen2=new dosen("Dr.Selamet");
        dosen dosen3=new dosen("Dr.Retnatyo");
        
        
        //asosiasi dosen mhs
        dosen1.setMhsumk(mhs1);
        dosen2.setMhsumk(mhs2);
        dosen3.setMhsumk(mhs3);
        
        //tampil data
        
        System.out.println("Output");
        System.out.println("Dosen-1"+dosen1.getDosen()+"\n"+"Mhs1"+
                            dosen1.getMhsumk()+"\n"+
                "--------------------------------"
                            +"\n"+
                            "Dosen-2"+dosen2.getDosen()+"\n"+"Mhs2"+
                            dosen2.getMhsumk()+"\n"+
                "--------------------------------"
                            +"\n"+
                              "Dosen-3"+dosen1.getDosen()+"\n"+"Mhs3"+
                            dosen3.getMhsumk()+"\n"+
                "--------------------------------"
                            +"\n");
    }
    
}
