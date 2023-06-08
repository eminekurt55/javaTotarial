package J05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class J02_ifStatement {
    public static void main(String[] args) {
        //TASK: girilen yasın 18 den buyuklugunu kontrol edin code create ediniz.
        //18 den kucuk ise ehliyet alamaz print ediniz.

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen yasını giriniz: ");
        int yas = input.nextInt();

        if (yas>=18) { // yasın 18 ve daha buyuk olup olmadıgı kontrol edildi.
            System.out.println("ehliyet alma sansınız var");
        }
        else { //yukarıda sarttan sonra else yas 18 den kücük ise calışır
            System.out.println("ehliyet alamaz");
        }

    }
}
