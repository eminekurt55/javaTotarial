package J04_JavaOperators.tasks04;

import java.util.Scanner;

public class Task03 {
	
	public static void main(String[] args) {
		
		/* Soru
		 * Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz.
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("3 basamakli bir sayi gir =");
		int sayi = input.nextInt();

		int ilkRakam = sayi / 100 ;
		int sonRakam = sayi % 10 ;

		int result = ilkRakam + sonRakam ;
		System.out.println("result = " + result);




		
	}

}
