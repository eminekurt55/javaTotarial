package J05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class J06_NestedOperator {
    public static void main(String[] args) {
          /*
        TASK :
       Kullanicidan bir sayi aliniz
       Sayi 0 dan buyuk esit ise //nested burada devereye giricek
       10 dan kucuk olup olmadigini kontrol ediniz.

       10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.

       Sayi 0 dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
        */

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");

        int sayi = input.nextInt();


      String result =sayi>=0 ?  //en distaki operator sarti
              (sayi<10 ? "rakam" : "pozitif tamsayı") //icteki ternary operator
               : //dıstaki sartın false olma ihtimali
                "negatif sayı";








    }
}
