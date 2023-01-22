/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2;

/**
 *
 * @author ASUS
 */
public class Pbo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        buku b1=new buku("cinta", "romance");
        penyewa cs1=new penyewa("Umi Fatimah", "Pati");
        b1.setpenyewa(cs1);
        cs1.setbuku(b1);
        
        System.out.println("Nama : "+cs1.getNama()+"\n"+
                "alamat : "+cs1.getalamat()+"\n"+
                "judul : "+b1.getjudul()+"\n"+
                "jenis : "+b1.getjenis());
    }
    }
    

