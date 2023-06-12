package J05_ifStatement_TernaryOperator.Task05.tasks05;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        /*
          TASK -> Kuualanıcının ehliyetinin varlığını kontrol ediniz.
          Ehliyeti varsa yıl tecrübesi 7 yıl ve üstü ise aldıgı mesafe 100000 km ve üzeri ise
           kontak anahtarını veriniz
          aksi durumda tecrübe yılı ve mesafe eksiklerini print eden code create ediniz
         */

        Scanner input = new Scanner (System.in);
        System.out.println("ehliyet var mı :");
        boolean ehliyet = input.nextBoolean();
        System.out.println("kac yillik ehliyetin var :");
        int tecrube = input.nextInt();
        System.out.println("kac km yol aldin :");
        int km = input.nextInt();

        if ( ehliyet == true && tecrube >= 7 && km >= 100000 ){
            System.out.println("kontak anahtarini alabilirsin ");
        }else {
            if (tecrube<7){
                System.out.println(tecrube+" yıllık tecrübeniz yeterli değil");
            }
            if (km < 100000) {
                System.out.println(km+" yeterli mesafe değil");
            }
        }







    }
}
