package j02_DataTypes_WrapperClass.tasks03;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.

        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5                         a ve b
        hipotenus: 13                         c = √(a^2 + b^2)                  */

     Scanner input = new Scanner(System.in);
        System.out.println("birinci kenar: ");
        int kenar1 = input.nextInt();
        System.out.println("ikinci kenar :");
        int kenar2 = input.nextInt();
        System.out.println("hipotenus: "+ (((kenar1*2+kenar2*2)/2)));


            //buna bak hipotenüs formülüne



    }
}
