package J05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class J08_NestedTernaryOperator {
    public static void main(String[] args) {

/*
		 Kullanıcıdan alacağı ürün miktarını ve ürünün birim fiyatını alın.
		  Eğer urun miktarı 100 den fazla ise %33  indirim yapıp
          ödemesi gereken toplam miktarı print eden code create ediniz.
		 */

     Scanner input = new Scanner (System.in);
     System.out.print("Ürün Miktarını giriniz: ");
     int urunMik = input.nextInt();

        System.out.println("urunun birim fiyatini gir");
        int urunFiyat =input.nextInt();


   double fatura =  urunMik > 100 ? (urunMik*urunFiyat*.67 ): (urunMik*urunFiyat);
        System.out.println("fatura=" +fatura);




    }
}
