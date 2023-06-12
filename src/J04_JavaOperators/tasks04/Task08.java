package J04_JavaOperators.tasks04;

import java.util.Scanner;

public class Task08 {
    /*
     * Saniyeyi saat, dk ve saniyeye çeviren bir program yazınız.
     * 		Örnek : 4250 - > 1 saat 10 dakika 50 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {
        int saniye = 4250 ;

        int saat = saniye / 3600 ;
        int dk = (saniye % 3600) / 60 ;
        int kalanSaniye = (saniye % 3600) % 60 ;

        System.out.println("cevir = " + saat +" saat "+ dk +" dakika "+ kalanSaniye+ " saniye " );


    }
}
