package j02_DataTypes_WrapperClass.tasks03;

import java.util.Scanner;

public class _27_Scanner6 {

    public static void main(String[] args) {

    /*    Bir string oluşturunuz.
          Doğum gününüzü konsola giriniz.
          String'i yazdırınız.  */

        //kodu aşağıya yazınız.
        Scanner input = new Scanner(System.in);
        System.out.println("dogum gününüzü giriniz :");
        String tarih = input.nextLine();
        System.out.println(tarih);

    }
}
