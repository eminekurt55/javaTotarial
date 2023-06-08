package J05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class J03_TernaryOperator {
    public static <object> void main(String[] args) {

        /*  Ternary ile yapilan tum islemler if-else blok ile de yapilabilir
        ternary tercih edilmesi yapinin basit okunabilir ve anlasilabilir olmasi içindir -> clean code
        Ternary icerisinde kompleks kodlar yerine dogrudan sonuç üreten veya sonucu veren
        daha basic code'lar bulunur.

        */
//TASK : bir sayının pozitif olup olamadıgını print eden bir code create ediniz.
        int a = 3;

        if (a > 0) {
            System.out.println("pozitif bir sayıdır");
        } else {
            System.out.println("negatif bir sayıdır");
        }

        //Ternary ile

        //CTE hata verir atama yapmak gerek a>0 ? "pozitif" : "negatif" ; not a statement

        String sonuc = a > 0 ? "pozitif" : " negatif ";
        System.out.println(sonuc);

        //Atama yapmadan nasıl kullanılır.
        System.out.println("atama yapmadan sonuc");
        System.out.println(a > 0 ? "pozitif" : " negatif ");

        //Example: iki sayıdan kucuk olanı secen kodu print ediniz.Ternary kullan.
        int a1 = 5;
        int b1 = 10;


        //Ternary ile
        int sayi1 = 23;
        int sayi2 = 53;
        int min = (sayi1>sayi2? sayi2 : sayi1 );//Can be replaced with 'Math.min()' call
        System.out.println("min = " + min);

        //Example 3: Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz
        //           Pozitif sayilarin ve sifirin mutlak degeri kendileridir.
        //           Negatif sayilarin mutlak degeri -1 ile carpilmis halleridir.


      int d = -1;
       int abs = d<0 ?  (-1*d)  :  (d);
        System.out.println("abs = " + abs);
        System.out.println("Math.abs(d)=" +Math.abs(d));

        //Example : iki tane sayi ayni isaretli ise bu sayilari carpınız.//Return type int
        //farkli isaretli ise "islem yapamam" mesajı verirniz. //return type String

        int s1 = 12;
        int s2 = -23;

       Object obj= (s1>0 && s2>0)  ||  (s1<0 && s2<0) ? s1*s2 :  "islem yapamam";
       //eger sartlar iki farklı deger return ediyorsa atamayı parent class dan yapamak gerekir.
        System.out.println("obj = " + obj);
        
        // TASK : girilen bir tamsayının tek-cift olmasını kontrol eden code create ediniz.

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int sayi = input.nextInt();

        //bu ne demek -> sayı % 2 ==0 sayının 2 ye bolumunden kalan 0 mı demek
        String result = sayi %2 ==0 ? "cift sayi"  :  "tek sayi";
        System.out.println("result = " + result);
        
        
    }

}
