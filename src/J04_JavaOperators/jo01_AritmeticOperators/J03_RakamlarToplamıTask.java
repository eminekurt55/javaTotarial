package J04_JavaOperators.jo01_AritmeticOperators;

import java.io.InputStream;
import java.util.Scanner;

public class J03_RakamlarToplamıTask {

    public static void main(String[] args) {

        //kullacıdan alınan 3 basamaklı bir sayının rakamları toplamını print eden code creat ediniz.
        //input 127
        //output 3

        //1. adım scanner obje creat edilir
        //2. adım sout komut ile veri istenir
        //3. adim int degere atama yapilir input objesinden nexınt() metodu ile
        //4. adım % ve 10 aa bolme uygulanır

        Scanner input = new Scanner(System.in);
        System.out.println("3 basamaklı sayı gir :");
        int sayi = input.nextInt(); //user ın girdigi deger atandı

        int birlerBasamagi = sayi % 10; // sayının 10 a bolumundan lkalan birler basamagı atandı
        sayi /= 10; // sayinin birler basamagı atıldi

        int onlarBasamagi = sayi % 10; //iki basamaga dusen sayının birler basamagı alindi(ilk sayının onlar basamgı)

        int yuzlerBasamagi = sayi / 10; // sayinin yüzler basamagı alınmis oldu

        int toplam = birlerBasamagi + onlarBasamagi + yuzlerBasamagi;
        System.out.println("toplam = " + toplam);


    }



}




