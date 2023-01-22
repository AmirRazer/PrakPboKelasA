/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobaasosiasi;
import java.util.*;
/**
 *
 * @author ASUS
 */
public class Jalan {
   private String stateName;
     
    List<Kota> citys;
  
    public String getStateName() {
        return stateName;
    }
  
    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
    public List<Kota> getCities() {
        return citys;
    }
    public void setState(List<Kota> citys) {
        this.citys = citys;
    }
}
