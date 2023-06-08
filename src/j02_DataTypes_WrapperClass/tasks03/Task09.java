package j02_DataTypes_WrapperClass.tasks03;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz

        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */

        Scanner input = new Scanner(System.in);

        System.out.println("a sayısını giriniz: ");
        double a = input.nextDouble();
        System.out.println("b sayısını giriniz: ");
        double b = input.nextDouble();
        System.out.println("c sayısını giriniz: ");
        double c = input.nextDouble();

        double islem = ((a * a) - (b * b));
        double sonuc = islem / (c * 3);
        System.out.println("sonuc=" + sonuc);

      /*a sayısını giriniz:
       5
       b sayısını giriniz:
       3
       c sayısını giriniz:
       1
       sonuc=5.333333333333333

       */


    }
}
