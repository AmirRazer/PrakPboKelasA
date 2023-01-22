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
public class mahasiswa extends orang {
    public String NIM;
	public String jurusan;

	public String getNIM() {
		// TODO - implement Mahasiswa.getNIM
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param NIM
	 */
	public void setNIM(String NIM) {
		// TODO - implement Mahasiswa.setNIM
		throw new UnsupportedOperationException();
	}

	public String getJurusan() {
		return this.jurusan;
	}

	/**
	 * 
	 * @param jurusan
	 */
	public void setJurusan(String jurusan) {
		this.jurusan = jurusan;
	}

	public void belajar() {
		// TODO - implement Mahasiswa.belajar
		dosen d = new dosen();
		d.mengajar();
		//throw new UnsupportedOperationException();
	}

    
}
