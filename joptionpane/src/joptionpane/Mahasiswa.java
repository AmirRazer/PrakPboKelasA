
package joptionpane;
import javax.swing.JOptionPane;

public class Mahasiswa {

    public static void main(String[] args) {
        // TODO code application logic here
        String nama,jurusan,tgl_masuk;
        int id;
        
//        nama=JOptionPane.showInputDialog("Nama :");
//        id=Integer.parseInt(JOptionPane.showInputDialog("id :"));
//        jurusan=JOptionPane.showInputDialog("Jurusan :");
//        tgl_masuk=JOptionPane.showInputDialog("Tanggal Masuk :");
        
        //output
        
//        JOptionPane.showInputDialog(null,  + "Nama :" + nama + "\n"+ )
                
        int angka = JOptionPane.showConfirmDialog(null, "Apakah kamu yakin ?");
        switch (angka){
            case JOptionPane.YES_OPTION: //angka 0
                JOptionPane.showMessageDialog(null, "Kamu Memulih Yes");
                break;
                
            case JOptionPane.NO_OPTION:  //angka 1
                JOptionPane.showMessageDialog(null, "Kamu Memulih no");
                break;
            case JOptionPane.CANCEL_OPTION: //angkaa == 2
                JOptionPane.showMessageDialog(null, "Kamu Memulih cencel");
                break;
            default:
                    JOptionPane.showMessageDialog(null,"Kamu Tidak Memilih Apapun");
        }
        
    }
    
}
