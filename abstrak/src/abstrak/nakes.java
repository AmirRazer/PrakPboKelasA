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
public abstract class nakes {
    
    protected String nama;
    protected String unit_kerja;
    
    public nakes (String nama_nks,String unit){
        this.nama=nama_nks;
        this.unit_kerja=unit;
    }
    
    //method abstrak
    
    public abstract void piket();
    public abstract void visitPasien();
    
}
