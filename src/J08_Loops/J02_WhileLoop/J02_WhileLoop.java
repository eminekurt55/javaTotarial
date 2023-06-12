package J08_Loops.J02_WhileLoop;

import java.util.Scanner;

public class J02_WhileLoop {
    public static void main(String[] args) {

// task-> girilen tamsayını pozitif tam bolen sayısını print eden code create ediniz...
// 20 -> 1,2,4,5,10,20: 20'nin 6 tane tam böleni var
// 30 -> 1,2,3,5,6,10,15,30: 30'nin 8 tane tam böleni var


        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir tamsayı girin: ");
        int sayi = scanner.nextInt();

        int tamBolenSayisi = 0;
        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                tamBolenSayisi++;
            }
        }


        int tamBolenSayisi1 = 0;
        int i = 1;
        while (i <= sayi) {
            if (sayi % i == 0) {
                tamBolenSayisi1++;
            }
            i++;
        }

        System.out.println(sayi + "'nin " + tamBolenSayisi1 + " tane tam böleni vardır.");





    }
}
