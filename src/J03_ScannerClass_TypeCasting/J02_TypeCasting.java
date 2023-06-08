package J03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class J02_TypeCasting {
    public static void main(String[] args) {


         /*
         byte < short < int < long < float < double
            Auto Widening Casting -> Kucuk data type'larini buyuk data typlearina Java  otomatik olarak yapar.
         */
        //Type Casting: Bir numeric data type'ini diger numeric data type'ina cevirmek demektir.
        //              byte < short < int < long < float < double
        //Note 1: Kucuk data type'ini buyuk data type'ine cevirmeye "Auto Widening" denir
        //Note 2: Buyuk data type'ini kucuk data type'ine cevirmeye "Explicit Narrowing" denir

        boolean ogrenciMi = false;
        String basarı =String.valueOf(ogrenciMi); //boolean olan bir deger String olarak cevrildi
        System.out.println("basari = " + basarı);//basari = false

        double b = 17;
        System.out.println("b = " + b);// 17.0
        int sayi1 =33;
        int sayi2 =4;
        System.out.println("sayi1/sayi2 = " +sayi1/sayi2);


        //boolean basariliMi = true;
        //CTE  String basari = basariliMi; dogal uyum olmadigi icin hata verir
        //String basari = String.valueOf(basariliMi);//boolean olan bir degeri Stringe cevrildi
        //System.out.println("basari = " + basari);//basari = true
        //double d = 17 ;//double container ina  int olan 17 degeri atandi Auto Widening yapildi
        //System.out.println("d = " + d);// 17.0

        //Zeynep Aytop => sonuç tamsayı olmasada int olduğu için virgül sonrasını vermez
        /*
        java iki int sayiyi biribirine böldugunuzde sonucu int verir
         eğer bölme işleminde ondalık sonuç çıkarsa ondalık kısmı siler
         */



        /* task->
         * Kullanicidan bir character girmesini isteyin ve
         * girilen karakteri ve ascii degerini yazin
         *
         * Ornek : Input  : a
         *         Output : Girdiginiz ‘a’ karakterinin ascii degeri : 97
         */
     //1. adım
       Scanner input = new Scanner(System.in);
       //2.adım
       System.out.println("bir character girmesiniz : ");
       //3.adım
       char ch = input.nextLine().charAt(0); //kullanıcının girdigi ifadenin ilk karakteri alınıp char variable a
        //atandı tek bir carakter alınması icin charAt methodu kullanıldı.
        //4.adım
        System.out.println("ASKII degeri = " + (ch+0)); //ASKII degeri = 97 char variable ı bir sayı ile
                                                     //toplanırsa sonuc tam sayı olur.

        //4. adım 2.yol
        System.out.println("ASKII degeri = " + ch);
        System.out.println("ASKII degeri= " + (int) ch);

        //ASKII degeri bulma methodu
        String str = String.valueOf('a');
        System.out.println("str.hashCode() = " + str.hashCode());






        byte by =127;
        int number = by; // kucuk kutuyu buyuk kutuya atadık

        int num =123;
        double d1 =14;
        double d2 = d1/num;
        System.out.println("d2 = " + d2); //d2 = 0.11382113821138211


        double db1 =14.66;
        int i= (int) db1; // buyuk olan kutu kucuk olan kutuya eklenmeye calısıldı.
       // hatalı olan kırmızı yere mause getirip ordaki seçenege tıklarız sayıyı düzeltir

        int num3 = 150;
        byte by1 = (byte) num3;
        System.out.println("by1 = " + by1);//by1 = -106
        // byte 127 ye kadar olanı sayar sonra basa doner -128 den tekrar baslar.












    }

}
