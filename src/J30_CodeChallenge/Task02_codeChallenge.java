package J30_CodeChallenge;

import java.util.Scanner;

public class Task02_codeChallenge {
    public static void main(String[] args) {


        /* Task ->
         * Girilen Y/N  degerlerini
         * print eden code create ediniz..
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */

        Scanner input = new Scanner (System.in);
        System.out.print(" Yes or No giriniz :");
        String yesNo = input.nextLine().toUpperCase();

        if (yesNo.equals("Y")){
            System.out.println("YES");
        }else if (yesNo.equals("N")){ //equalsignorcase methodu da kullanılır
            System.out.println("NO");
        }else {
            System.out.println("ERROR");
        }

        //hocanın çözumu CHAR ile
        System.out.println("Aslanım hele bir Y ya da N gir baken :");
        char aslanKarakter = input.next().charAt(0);

        if (aslanKarakter == 'Y'|| aslanKarakter =='y') {
            System.out.println("YES");
        } else if (aslanKarakter == 'N' || aslanKarakter =='n'){
            System.out.println("NO");
        }else {
            System.out.println("Aslanım hatalı giriş yaptın..neyseki fenerli degilsin");
            System.out.println("ASLANIMA BOLCA SELAM");
        }

    }
}
