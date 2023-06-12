package j02_DataTypes_WrapperClass.tasks03;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        /*
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */

        Scanner input = new Scanner (System.in);

        System.out.println("vize1 gir :");
        int v1 = input.nextInt();
        System.out.println("vize2 gir :");
        int v2 = input.nextInt();
        System.out.println("final notlarını gir=");
        int fnl = input.nextInt();

        int vizeOrtalama = (v1+v2)*30/100;
        System.out.println("vize ortalaması ="+ vizeOrtalama);
        int finalNot = fnl*70/100;
        System.out.println("final notun="+ finalNot);

        int gecmeNotu = vizeOrtalama+finalNot;

        System.out.println("gecme notunu ="+ gecmeNotu);







    }
}
