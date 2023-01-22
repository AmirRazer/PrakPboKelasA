package tugasppbo2;

import java.time.LocalDate;
import java.time.Month;

public class Tugasppbo2 {
    public static void main(String[] args) {
        MahasiswaICT mict1=new MahasiswaICT("AMIR", "UMK", "BAPAK IMRON", LocalDate.of(2010, 10, 10), LocalDate.of(2022, 10, 10));
        MahasiswaICT mict2=new MahasiswaICT("BAGUS", "UGM", "BAPAK DANI", LocalDate.of(2020, 9, 9), LocalDate.of(2022, 9, 9));
        mict1.tampilMhsICT();
        mict2.tampilMhsICT();
        System.out.println("");
        
        MahasiswaMagang mg1=new MahasiswaMagang("RAKA", "PT.TANAH ABANG",LocalDate.of(2020, 10, 1), 100000);
        MahasiswaMagang mg2=new MahasiswaMagang("ERIKA", "PT.Furniture Jaya",LocalDate.of(2021, 1, 1), 300000);
        mg1.tampilMhsMagang();
        mg2.tampilMhsMagang();
        System.out.println("");
    }
}