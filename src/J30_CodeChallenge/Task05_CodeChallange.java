package J30_CodeChallenge;

import java.util.Scanner;

public class Task05_CodeChallange {
    public static void main(String[] args) {

/* Task->
   Girilen  yas data için
	    oy kullanma yasi :
	 	age >= 18  ==> oy kullanmaya uygun
	 	age >= 70  ==> uc kez oy kullanabilir
	 	70 > age >=50 ==> iki kez oy kullanabilir
	 	50 > age >=18 ==> bir kez oy kullanabilir,
	 	print eden code create ediniz...
	 */

        Scanner input = new Scanner (System.in); //genel şart kontrolu
              System.out.println("yas giriniz :");
        int age =input.nextInt();

        if (age >=18){ //&& age > = 70 die de bu satırdan devam edebilirdik
            System.out.println("oy kullanmaya uygun"); //genel şart kontrolu
                  }if ( age>=70){ //genelşartın true halinde özel şart kontrolu
            System.out.println(" üc kez oy kullanabilir");
        }else if (age >=50 && age <70 ){
            System.out.println("iki kez oy kullanabilir");
        }else if (age<50 && age >=18) {
            System.out.println("bir kez oy kullanabilir");
        }else {
                System.out.println("oy kullanamaz");
            }








    }
}
