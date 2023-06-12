package J05_ifStatement_TernaryOperator.Task05.tasks05;

import java.util.Scanner;

public class _19_school_grade {

    public static void main(String[] args) {

        /*  Bir öğrencinin notunu belirleyen bir Java programı yazın.
    Program üç tür puan (sınav, ara sınav ve final puanı) okuyacak ve notu aşağıdaki kurallara göre belirleyecektir:

        Eğer ortalama not >=90% =>not=A
        Eğer ortalama not >= 70% ve<90% => not=B
        Eğer ortalama not >=50% ve <70% =>not=C
        Eğer ortalama not <50% =>note=F

        Aşağıdaki örnek çıktıya bakın:
        int Quiz_score: 80
        int mid_term_score: 68
        int Final_score: 90
        print (Your grade is B)
                  (Notunuz B'dir) */


        // Code start here DO NOT CHANGE THE CODE BEFORE THIS LINE

        Scanner input = new Scanner (System.in);
        System.out.println("Sınav puanını gir :");
        int sınav = input.nextInt();

        System.out.println("Ara sınav puanını gir :");
        int araSinav = input.nextInt();

        System.out.println("final puanını gir :");
        int final_score = input.nextInt();

        double ortalama = (sınav+araSinav+final_score)/3;

        if (ortalama<=0 ){
            System.out.println("geçerli not gir");
        } else if ( ortalama >= 90 && ortalama <= 100){
            System.out.println("A");
        }else if (ortalama < 90 && ortalama >= 70){
            System.out.println("B");
        }else if (ortalama < 70 && ortalama >= 50){
            System.out.println("C");
        }else if (ortalama < 50 ){
            System.out.println("F");
        }else {
            System.out.println("100 den kucuk not giriniz");
        }








    }
}
