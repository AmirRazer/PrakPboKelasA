
package scanner2;

import java.util.Scanner;
public class Bekanja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //definisi atribut
        
        String nama_pelanggan;
        String nama_barang;
        int jml,discount;
        double harga;
        double total;
        
        Scanner input=new Scanner(System.in);
        System.out.println("Nama:");
        nama_pelanggan=input.next();
        System.out.println("Barang");
        nama_barang=input.next();
        System.out.println("Jumlah");
        jml=input.nextInt();
        System.out.print("Harga");
        harga=input.nextDouble();
        total=jml*harga;
        
        if(total >= 150000){
            discount = (int) (total*15/100);
            total=total-discount;
          
        }
        else if (total <= 100000) {
         discount = (int) (total*15/100);
            total=total-discount;
        }
        
        //output
        
        System.out.println("Daftar barang ");
                System.out.println("===================================== ");
        System.out.println("Pelanggan: "+nama_pelanggan);
        System.out.println("Barang"+nama_barang);
        System.out.println("Total Belanja "+total);

        
        
    }
    
}
