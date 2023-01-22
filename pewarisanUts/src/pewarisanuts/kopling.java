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
public class kopling extends bengkel {
    private String rantai, gear;

    public kopling(String platm, int tarifp, String namac, String rantai, String gear) {
        super(platm, tarifp, namac);
        this.rantai=rantai;
        this.gear=gear;
    }
    
    public void printKopling(){
        super.printBengkel();
        System.out.println(
                "Merk Rantai :"+rantai+"\n"+
                "Merk Gear : "+gear);
    }
    
}
