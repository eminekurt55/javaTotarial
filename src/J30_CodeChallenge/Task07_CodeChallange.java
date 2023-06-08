package J30_CodeChallenge;

import java.util.Scanner;

public class Task07_CodeChallange {
    public static void main(String[] args) {

//Task-> girilen iki ayrı  kelimeyi iki farklı yol ile birlestiriniz.

        //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

        Scanner input = new Scanner(System.in);
        System.out.println("kelime gir :");
        String kelime1 = input.nextLine();
        System.out.println(" ikinci kelimeyi giriniz :");
        String kelime2 = input.nextLine();
        System.out.println("kelime1 ve kelime2 = " +kelime1 + " " + kelime2);
        
        String birleştir = kelime1.concat(" ").concat(kelime2);
        System.out.println("birleştir = " + birleştir);








    }
}
