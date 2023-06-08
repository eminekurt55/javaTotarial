package j02_DataTypes_WrapperClass.tasks03;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /*
         * TASK->
         *
         * Kullaniciya gunde kac saat uyudugunu sorun,
         * ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin
         *
         * Ornek : Input : 8
         *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
         *
         */

        Scanner input = new Scanner(System.in);
        System.out.print("günde kaç saat uyuyorsun:");
        int uyku = input.nextInt();

        int ayda = uyku*30/24;
        int yilda = uyku*365/24;
        int kirkSene = yilda*40;

        System.out.println("Ayda : " + ayda);
        System.out.println("yilda = " + yilda);
        System.out.println("kırkSene = " + kirkSene);



    }
}
