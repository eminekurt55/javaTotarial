package J30_CodeChallenge;

import java.util.Scanner;

public class Task10_CodeChallange {
    public static void main(String[] args) {

        /* Task->
         * Girilen 4 kelime  cumle haline getirip sonunda . ile print eden code create ediniz.
         *
         * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
         *         Output : Cesaret insana sinirlarini ogretir.
         *
         */

      Scanner input = new Scanner(System.in);
        System.out.println("1. kelimeyi gir :");
        String kelime1 = input.nextLine();

        System.out.println("2. kelime gir :");
        String kelime2 = input.nextLine();

        System.out.println("3. kelime gir :");
        String kelime3 = input.nextLine();

        System.out.println("4. kelime gir :");
        String kelime4 = input.nextLine();

        char nokta = '.';
        System.out.println(kelime1+" "+kelime2+" "+kelime3+" "+kelime4+nokta);

           //düzelt yanlış






    }
}
