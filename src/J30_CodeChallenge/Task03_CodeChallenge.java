package J30_CodeChallenge;

import java.util.Scanner;

public class Task03_CodeChallenge {
    public static void main(String[] args) {

        /*
   Task->
   Girilen not değeri için
              A => 90 ~100
              B => 80 ~ 89
              C => 70 ~ 79
              D => 60 ~ 69
              F =>  0 ~ 59
              sartlari aralik belirterek yaziniz
    */

        Scanner input = new Scanner (System.in);
        System.out.println("Bir not giriniz :");
        int not = input.nextInt();

        if (not>=90 && not<=100){
            System.out.println("A");
        }else if (not>=80 && not <=89){
            System.out.println("B");
        }else if (not>=70 && not <=79){
            System.out.println("C");
        }else if (not>=60 && not <=69){
            System.out.println("D");
        }else if (not>=0 && not <=59){
            System.out.println("F");
        }else{
            System.out.println("0 ile 100 arası bir sayı giriniz ....");
        }

        /*Girilen saat değeri için
        0 ~12 ==> good morning
        12 ~ 15 ==> good afternoon
        15 ~ 23 ==> good night
        12 ==> good noon
        print eden code create ediniz.
       */

        System.out.println("Saat kaç ?");
        int saat = input.nextInt();

        if (saat >= 0 && saat < 12 ){
            System.out.println("good morning");
        }else if (saat > 12 && saat < 15){
            System.out.println( "good afternoon" );
        }else if (saat >= 15 && saat <=23 ){
            System.out.println("good night");
        }else if (saat == 12){
            System.out.println("good noon");
        }else {
            System.out.println("geçeeli saat gir");
        }

       // int aslanNotu = input.nextInt();
       // if (aslanNotu >= 90 && aslanNotu <= 100) {//90,91,,,100
       //     System.out.println("A");
//
       // } else if (aslanNotu >= 80 && aslanNotu < 90) {//80,81,,,89
       //     System.out.println("B");
//
       // } else if (aslanNotu >= 70 && aslanNotu < 80) {//70,71,,,79
       //     System.out.println("C");
//
       // } else if (aslanNotu >= 60 && aslanNotu < 70) {//60,61,,,69
       //     System.out.println("D");
//
       // } else System.out.println("Aslanım Fener'in F'si hayırlı olsun seneye de bekleriz  :( ");//59,58,,,,






    }
}
