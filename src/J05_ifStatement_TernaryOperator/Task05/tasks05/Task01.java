package J05_ifStatement_TernaryOperator.Task05.tasks05;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        //Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu asagidaki tabloya gore ekrana yazdiriniz
        //0 - 4 => bebek
        //5 - 12 => cocuk
        //13 - 20 => genc
        //21 - 30 => yetiskin
        //Tanimlanmamis evre

        Scanner input = new Scanner (System.in);
        System.out.println("yas giriniz :");
        int yas = input.nextInt ();

        if ( yas >= 0 && yas <= 4 ){
            System.out.println("bebek");
        }else if ( yas >= 5 && yas <= 12 ){
            System.out.println("cocuk");
        }else if ( yas >= 13 && yas <= 20 ){
            System.out.println("genc");
        }else if ( yas >= 21 && yas <= 30 ){
            System.out.println("yetiskin");
        }else{
            System.out.println("tamamlanmamıs evre");
        }






    }
}
