package J04_JavaOperators.tasks04;

import java.util.Scanner;

public class Task09 {


    /*
     Çiftlikteki hayvanların ayaklarının toplam sayısını bulma.
     Çiftlikteki bulunun inek, koyun, tavukların ayark sayısını hesaplayalım.

     */

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("ciflikteki ineklerin sayisini girin :");
        int inek = input.nextInt();

        System.out.println("ciflikteki koyunlarin sayisini girin :");
        int koyun = input.nextInt();

        System.out.println("ciflikteki tavukların sayisini girin :");
        int tavuk = input.nextInt();

        int inekAyak = inek * 4 ;
        int koyunAyak = koyun * 4 ;
        int tavukAyak = tavuk * 2 ;

        System.out.println("Ayak toplami = " +(inekAyak+tavukAyak+koyunAyak));






    }

}
