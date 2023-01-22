/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pewarisanuts;

/**
 *
 * @author ASUS
 */
public class PewarisanUts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Service Motor Matic : \n");
        matic mtc1=new matic("K 7654 Gb", 100000, "Amir", "Daytona", "BRT", "AHM");
        mtc1.printMatic();
        
        System.out.println("\n========================\n");
        
        System.out.println("Service Motor Kopling : \n");
        kopling kpl1=new kopling("K 8765 AB", 150000, "Mahmud", "SSS", "SSS");
        kpl1.printKopling();
    }
    
}
