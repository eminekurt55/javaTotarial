package j02_DataTypes_WrapperClass.tasks03;

import java.util.Scanner;

public class _28_Scanner7 {

    public static void main(String[] args) {

        /*    Bir boolean oluşturunuz.
              Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
              Varsa True , yoksa False olarak  konsoldan cevap veriniz.
              Boolean'ı yazdırınız.   */

        //Kodu aşağıya yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println("bir banka hesabınız varMı :");
        boolean varMi = input.nextBoolean();
        System.out.println(varMi);







    }
}
