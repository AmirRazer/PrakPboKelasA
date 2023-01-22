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
public class mahasiswa implements kuliah, bimbingan{
private String nama;

public mahasiswa(String nama){
    this.nama=nama;
}

@Override 
public void kuliahPagi(){
    System.out.println( "Sedang kuliah pbo");
}

@Override
public void kuliahUmum(){
    System.out.println("Kuliah umum IOT");
}
 
@Override
public void bimbinganTugasAkir(){
    System.out.println( "Sedang konsultasi skripsi");
}
public void displayMhs(){
    System.out.println("Nama"+nama);
}
}
