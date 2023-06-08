package J07_StringManipulations;

import java.util.Scanner;

public class J05_startWith_endWith {
    public static void main(String[] args) {


/**
 * startsWith()
 *  Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
 *  String'in basladigi characteri dogrular
 * endsWith()
 * Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
 */

  String city = "Istanbul";
        System.out.println("city.startsWith(\"i\") = " + city.startsWith("i"));
     //kucuk buyuk harf duyarli oldugu icin...

        System.out.println("city.startsWith(\"Ist\") = " + city.startsWith("Ist"));
        System.out.println("city.startsWith(\"stanbu\") = " + city.startsWith("stanbu"));

        System.out.println("city.startsWith(\"t\",3) = " + city.startsWith("t", 3));

        System.out.println("city.startsWith(\"t\",2) = " + city.startsWith("t", 2));
        //2.parametre index i temsil eder o index in girilen dizi ile baslayip baslamadıgı kontrol edilir.

        //endsWith()
        System.out.println("city.endsWith(\"l\") = " + city.endsWith("l")); //true
        System.out.println("city.endsWith(\"bul\") = " + city.endsWith("bul")); //true

        //iki string variable in kontrol edilmesi

        String str = "ads";
        System.out.println("city.endsWith(str) = " + city.endsWith(str));//false

        //Task -> girilen e-mail hesabının  @gmail.com ile  bitiyorsa "hesabınız onaylandı"
        // aksi durumda "geçerli hesap giriniz
        // print edn code creae ediniz.

        //note contains ile yaparsaniz true olur iceren herhangi bir karater girse true olur
        //bunu endsWith() ile yapiniz


        Scanner input = new Scanner (System.in);
        System.out.println( "gecerli bir e-mail adresi giriniz :");
        String email = input.nextLine();

        String gmailsonu ="@gmail.com";

        if (email.endsWith(gmailsonu)){
            System.out.println(" hesabınız onaylandı ");
        }
        else{
            System.out.println("gecerli hesap giriniz ");
        }







    }
}
