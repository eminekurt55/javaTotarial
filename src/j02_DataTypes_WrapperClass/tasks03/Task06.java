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
        System.out.print("birinci kenar: ");
        double kenar1 = input.nextInt();
        System.out.print("ikinci kenar :");
        double kenar2 = input.nextInt();
        double hipo = Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));
        System.out.println("hipotenus: "+hipo);     //hipotenus: 13.0


            //buna bak hipotenüs formülüne



    }
}
