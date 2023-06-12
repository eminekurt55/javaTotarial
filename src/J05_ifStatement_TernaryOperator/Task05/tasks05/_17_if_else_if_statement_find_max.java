package J05_ifStatement_TernaryOperator.Task05.tasks05;

public class _17_if_else_if_statement_find_max {

    public static void main(String[] args) {

      /* Oluşturulan bu 3 int içinde en yüksek değerli olanı bulun.
         Bu en yüksek numarayı yazdırın.

         Not: Num1 = 18 veya Num2 = 25 değerini değiştirdiğinizde kodunuz maksimum değeri yazmalıdır.
         Tüm farklı senaryolarda maksimum sayıyı yazdırmalıdır  */

            int sayi1 = 155 ;
            int sayi2 = 75 ;
            int sayi3 = 100 ;

            if ( sayi1 > sayi2 && sayi1 > sayi3 ){
                System.out.println(sayi1);
            }else if ( sayi2 > sayi1 && sayi2 > sayi3 ){
                System.out.println(sayi2);
            }else if ( sayi3 > sayi1 && sayi3 > sayi2 ){
                System.out.println(sayi3);
            }




    }
}
