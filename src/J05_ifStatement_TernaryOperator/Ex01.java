package J05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        //TASK: girilen bir sayının negatifligini ve pozitifligini kntrol eden code create ediniz...

        Scanner input = new Scanner(System.in) ;
        System.out.print("Bir sayı giriniz: ");
        int sayı = input.nextInt() ;

        if (sayı<0){
            System.out.println(" bu sayı negatiftir");
        }
        else if(sayı>0){
            System.out.println("sayı pozitiftir");
        }
        else {
            System.out.println("girdiğin sayı sifirdir");
        }
    }



}
