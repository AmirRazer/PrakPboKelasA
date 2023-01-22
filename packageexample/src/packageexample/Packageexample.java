/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageexample;

/**
 *
 * @author ASUS
 */
public class Packageexample {

    public static void main(String[] args) {
       
        //objek profil
        perusahaan.profil.profil pt1=new perusahaan.profil.profil
        ("Pt. Sukamaju","Jl Pati-Kudus km 12");
        
        //objek direktur
        perusahaan.staf.direktur direkturpt=new perusahaan.staf.direktur
        ("Amir Mahmud", "10-12-2022", "Direktur Utama");
        
        //objek staf
        
        perusahaan.staf.staf stfpt=new perusahaan.staf.staf
        ("Hasan", "Supervisor lapangan");
        
        //tampil data
        
        System.out.println("Nama Perusahaan"+pt1.getNama()+"\n"+
                "Alamat"+pt1.getAlamat()+"\n"+
                    "Nama Direktur"+direkturpt.getDirektur()+"\n"+
                "Jabatab"+direkturpt.getJabatan()+"\n"+
                "------------------------------------------"+"\n"+
                "Nama Staf"+stfpt.getStaf()+"\n"+
                      "Jabatan "+stfpt.getJabatan()+"\n"  );
        
    }
    
}
