package J07_StringManipulations;

import java.util.Scanner;

public class J06_SubString {
    public static void main(String[] args) {
        /*
        substring()
        Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.
        substring(i)->Method'a parametre olarak girilen  index'den sona kadar olan parcayi return eder

        substring(baslangicIndexi, bitisIndexi)->Method'a parametre olarak girilen  baslangicIndexi'den bitis
        indexi'e kadar parçayı return eder
        baslangic indexi ==> inclusive/dahil
        bitis indexi ==> eclusive/haric
         */
        String str = "Çalıştıkca daha cok sey bilmedigimi farkediyorum";
        System.out.println("str.substring(0,5) = " + str.substring(0, 4));

        //Stringin indexini 0 dan başlatıp 0 dahil eder 5 i etmez 5 dahil degildir.


        //TASK: str datasın ın son 12 karakterini print ediniz...
        //benimki
        System.out.println("str.substring(0, str.length() -12) = " + str.substring(str.length() - 12));

        //hocaninki
        int sonOnIkiKarakterIndexi = str.length() - 12;

        System.out.println("sonOnIkiKarakterIndexi = " + sonOnIkiKarakterIndexi);//sonOnIkiKarakterIndexi = 36

        System.out.println("str.charAt(sonOnIkiKarakterIndexi) = " + str.charAt(sonOnIkiKarakterIndexi));//str.charAt(sonOnIkiKarakterIndexi) = f

        System.out.println("str.substring(sonOnIkiKarakterIndexi) = " + str.substring(sonOnIkiKarakterIndexi));// str.substring(sonOnIkiKarakterIndexi) = farkediyorum

        //TASK : str datasının ilk 10 karakterini print ediniz.

        System.out.println("str.substring(0, 10) = " + str.substring(0, 10));

        //TASK : str datasının sadece ilk  karakterini print ediniz.

        System.out.println("str.substring(0, 1) = " + str.substring(0, 1));

        //TASK : girilen 4 harfli kelimeyi tersten yan yan print eden code yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("4 harfli bir kelime giriniz :");
        String str5 = input.nextLine();

        if (str5.length() != 4){
            System.out.print("yanlis kelime girdin 4 harfli girmelisin");
        }
        else{
            System.out.print(str5.substring(str5.length() - 1));
            System.out.print(str5.charAt(str5.length()-2));
            System.out.print(str5.charAt(str5.length()-3));
            //System.out.print(str5.substring(0, 1)); //aynii alttakiyle
            System.out.println(str5.charAt(str5.length()-4));

            System.out.print(str5.substring( (str5.length()-2), (str5.length()-1) ));
            System.out.print(str5.substring((str5.length()-3),  (str5.length()-2)));
            //bu metodu kullanarakda cözebiliriz.


        }







    }
}
