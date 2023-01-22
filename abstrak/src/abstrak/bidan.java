/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstrak;

/**
 *
 * @author ASUS
 */
public class bidan extends nakes{
    private String kategori;
    
    public bidan(String nama_nks,String unit, String kat){
        super(nama_nks,unit);
        this.kategori=kat;
    }
    
    @Override
    public void visitPasien(){
        System.out.println("Memberi Imunisasi");
    }
    @Override 
    public void piket(){
        System.out.println("memberikan vaksin covid");
    }
    public void printBidan(){
        System.out.println("Nama" + super.nama+"\n"+
                "unit"+super.unit_kerja+"\n"+
                "Kategori"+kategori+"\n"
               
        );
    }
    
    
    
}
