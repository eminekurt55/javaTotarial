package J30_CodeChallenge;

import java.util.Scanner;

public class Task12_CodeChallange {
    public static void main(String[] args) {
        /* Task->
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden code create ediniz.
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */

        Scanner input = new Scanner (System.in);
        System.out.println("bir dizim giriniz :");
        String xyz = input.nextLine();

        System.out.println("(xyz.contains(\"xyz\")) = " + (xyz.contains("xyz")));

    }




    }

