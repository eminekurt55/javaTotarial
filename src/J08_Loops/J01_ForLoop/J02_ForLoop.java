package J08_Loops.J01_ForLoop;

import java.util.Scanner;

public class J02_ForLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("pozitif bir sayı gir :");
        int sayi = input.nextInt();

        if (sayi < 0 ){//girilen sayi negatif ise
            System.out.println("pozitif sayi girmelisin");
        }else {
            for (int i = sayi ; i <= 100  ; i++) {//i sayi dan baslar 100 e kadar artarak devam eder
                if (i % 4 ==0){//her bir i degeri 4 e tam bolunurse sarti
                    System.out.print(i +" ");
                }
            }
        }
    }
}








