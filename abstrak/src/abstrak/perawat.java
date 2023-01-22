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
public class perawat extends nakes{
    private String shift;
    private String bagian;
    
    public perawat(String nama_nks, String unit, String shif_p,String bagian){
        super(nama_nks,unit);
        this.shift=shif_p;
        this.bagian=bagian;
    }
    
    @Override
    
    public void visitPasien(){
        System.out.println("Memberikan obat kepada pasien");
    }
    
    @Override 
    public void piket(){
        System.out.println("Menemani Dokter operasi");
    }
    
    //print perawat
    
    public void printPerawat(){
        System.out.println("Nama" + super.nama+"\n"+
                "unit"+super.unit_kerja+"\n"+
                "shift kerja"+shift+"\n"+
                "Ruang :"+bagian
        );
    }
    
}
