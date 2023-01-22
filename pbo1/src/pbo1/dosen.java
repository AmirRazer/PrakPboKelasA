/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1;

/**
 *
 * @author ASUS
 */
public class dosen {
    	public String kodeDosen;
	public String departemen;

	public String getKodeDosen() {
		return this.kodeDosen;
	}

	/**
	 * 
	 * @param kodeDosen
	 */
	public void setKodeDosen(String kodeDosen) {
		this.kodeDosen = kodeDosen;
	}

	public String getDepartemen() {
		return this.departemen;
	}

	/**
	 * 
	 * @param departemen
	 */
	public void setDepartemen(String departemen) {
		this.departemen = departemen;
	}

	public void mengajar() {
		// TODO - implement Dosen.mengajar
		System.out.println("Mengajar Bahasa Java.");
		//throw new UnsupportedOperationException();
	}

}
