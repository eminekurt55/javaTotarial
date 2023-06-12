package j02_DataTypes_WrapperClass.tasks03;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /* TASK ->
        Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Isim soyisim: ");
        String isimsoyad =input.nextLine();
        System.out.print("yas =");
        int yas = input.nextInt();
        System.out.print("kilo =");
        int kilo = input.nextInt();
        System.out.print("boy =");
        double boy = input.nextDouble();
        System.out.print("salona devam edeceginiz ay süreniz =");
        int süre= input.nextInt();

        Integer tutar = süre*20;
        char paraBirimi = '$';
        System.out.println("tutar = " + tutar + paraBirimi);




    }
}
