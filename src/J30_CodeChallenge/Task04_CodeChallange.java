package J30_CodeChallenge;

import java.util.Scanner;

public class Task04_CodeChallange {
    public static void main(String[] args) {

       /*

		task->
		Kullanicinın  yas ve kilo bilgileri için
		18 yasindan kucuk ise kan bagisi yapamaz.
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 ve 50 kilodan agir ise kan bagisi yapabilir.
		print eden code create ediniz.
      nested coz
		 */

        Scanner input = new Scanner(System.in);
        System.out.println("yas bilginizi giriniz :");
        int yas = input.nextInt();

        if (yas >=18) { //genel şart
            System.out.println("hele bir kilonu gir :");

            int kilo = input.nextInt();

            if (kilo > 0 && kilo < 50) { //özel şart
                System.out.println("kan bagısı yapamazsin");
            } else
                System.out.println("kan bagısı yapabilir");
            }else{
                System.out.println("kan bagısı yapamaz.");
            }

        }
    }
