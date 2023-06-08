package J07_StringManipulations;

import java.util.Scanner;

public class J03_charAt {

    public static void main(String[] args) {


        /*
        charAt() methodu parametre int olarak girilen index'deki char değerini return eder.
        index değeri 0'dan başlar
         */
        //city variable nin birinci karakterini bulun
        String city = "Istanbul";
        System.out.println("city.charAt(0) = " + city.charAt(0));//city.charAt(0) = I

        //city variable inin birinci indexte ki elemani bulun

        System.out.println("city.charAt(1) = " + city.charAt(1));//s

        char cityBirinciIndexElemani = city.charAt(1);
        System.out.println("cityBirinciIndexElemani = " + cityBirinciIndexElemani);//s

        //task son karakteri alin atama ile yazdiran kod yaziniz.

        System.out.println("city.charAt(city.length()-1) = " + city.charAt(city.length() - 1));
        System.out.println("city.charAt(city.length()-1) = " + city.charAt(city.length() - 1));

        //hocanın cozumu
        int sonHarfIndexi = city.length() - 1;
        System.out.println("sonHarfIndexi = " + sonHarfIndexi);//sonHarfIndexi = 7

        System.out.println("city.charAt(sonHarfIndexi) = " + city.charAt(sonHarfIndexi));//

        //alinan son karakteri uygun bir variable a atama yaparak uazdirin

        int sonKarakter = city.length() - 1;
        System.out.println("son karakter =" + city.charAt(sonKarakter));

        char sonHarf = city.charAt(sonKarakter);
        System.out.println("son harf =" + sonHarf);

        System.out.println("her neyse =" + city.charAt(city.length() - 1));

        // System.out.println("city.charAt(21) = " + city.charAt(21));
        //Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 21


        // Task-> istanbul izmir  girilen kelimenin kelimesinin ortadaki karakteri
        // print eden code create ediniz...

        Scanner input = new Scanner (System.in);
        System.out.println("bir sehir ismi gir :");
        String sehir = input.nextLine();

        if(sehir.length() % 2 == 0){//harf sayisi iki nin tam kati ise ortanca harf yoktur
            System.out.println("senin sehirin ortasi yoktur");

        }else{ // girilen ifadenin length i tek sayili ise else calisacak
            //bu lengthi 2ye bolerek ortadaki index bulunur
            System.out.println("sehir.charAt(sehir.length()/2) = " + sehir.charAt(sehir.length() / 2));
        }






    }

}
