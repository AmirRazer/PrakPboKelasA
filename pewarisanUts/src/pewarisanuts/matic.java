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
public class matic extends bengkel {
    private String vanbelt, roller, pully;

    public matic(String platm, int tarifp, String namac, String vanbelt, String roller, String pully) {
        super(platm, tarifp, namac);
        this.vanbelt=vanbelt;
        this.roller=roller;
        this.pully=pully;
        
    }
    
    public void printMatic(){
        super.printBengkel();
        System.out.println(
                "Merk Vanbelt :"+vanbelt+"\n"+
                "Merk Roller : "+roller+"\n"+
                "Merk Pully : "+pully);
    }

}
