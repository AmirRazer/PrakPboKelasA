/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswaitervace;

/**
 *
 * @author ASUS
 */
public class Mahasiswaitervace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        mahasiswa mhs1= new mahasiswa("Amir Mahmmud");
        mhs1.displayMhs();
        mhs1.kuliahPagi();
        
        
        mahasiswa mhs2 = new mahasiswa("Hasan");
        mhs2.displayMhs();  
        mhs2.kuliahPagi();
        mhs2.bimbinganTugasAkir();
    }
    
}
