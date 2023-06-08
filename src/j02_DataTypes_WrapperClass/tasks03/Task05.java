package j02_DataTypes_WrapperClass.tasks03;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {


        // kullanicidan 2 tam sayi alip bu 2 tamsayinin  dort islem sonucunu yazdiriniz.

        Scanner input = new Scanner (System.in);

        System.out.print("Sayıyı giriniz: ");
        int sayı1 = input.nextInt();

        System.out.println("Sayıyı giriniz: ");
        int sayı2 = input.nextInt();

        int tolama = sayı1+sayı2;
        int cıkarma = sayı1-sayı2;
        int bölme = sayı1/sayı2;
        int carpma = sayı1*sayı2;

        System.out.println("Toplam: "+tolama);
        System.out.println("cıkarma = " + cıkarma);
        System.out.println("bölme = " + bölme);
        System.out.println("carpma = " + carpma);

    }

}
