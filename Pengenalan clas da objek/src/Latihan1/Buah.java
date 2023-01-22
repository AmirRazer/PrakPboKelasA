/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1;

/**
 *
 * @author ASUS
 */
public class Buah {
    //properti objek
    public String nama;
    public String rasa;
    public String warna;
    public int berat;
    public double harga;
    
    //konstruktor 
    public Buah(String nm,String wr, String rs,int br,double hr){
        nama=nm;
        warna=wr;
        rasa=rs;
        berat=br;
        harga=hr;
        
    }
    //method untuk tampil buah
    public void deskripsiBuah(){
        System.out.println("Objek buah");
        System.out.println("-------------------------");
        System.out.println("Buah"+nama+"\n"+ "Warna"+warna+"\n"+"Rasa"+rasa+"\n"+
                "Berat"+berat+"\n"+"Harga"+harga+"\n"
        );
        
    }
     //metod setter
    //digunakan untuk menganti nilai atribut
    public void setNama(String nm){
        nama = nm;
    }
    public void setWarna(String wr){
        warna = wr;
    }
    public void setRasa(String rs){
        rasa = rs;
    }
    public void setBerat(int br){
        berat = br;
    }
    public void setHarga(double hr){
        harga = hr;
    }
}
