package J04_JavaOperators.tasks04;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

        /*
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin

         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8

         */


        Scanner input = new Scanner(System.in);

        System.out.print("3 basamakli bir sayi gir =");
        int sayi = input.nextInt();

        int basamak1 = sayi % 10 ;
        System.out.println("Girdiğiniz sayinin birler basamagi ="+ basamak1);

        int basamak2 = sayi % 100 / 10;
        System.out.println("Girdiginiz sayinin onlar basamagi : "+ basamak2);

        int basamak3 = sayi / 100 ;
        System.out.println("Girdiginiz sayinin yuzler basamagi : "+ basamak3);



    }
}
