package j02_DataTypes_WrapperClass.tasks03;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /* TASK->
		 Ask user to enter mid-term grade, final grade, and project grade
		 Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)

		  Example:
		      INPUT: mid-term grade=78
		      		 final grade = 66
		      		 project grade = 90
		      OUTPUT: "Your grade is : 81,6"

Kullanıcıdan ara sınav notunu, final notunu ve proje notunu girmesini isteyin Genel notu hesaplayın
 (ara sınav : %30 , proje : %20, final : %50)
Örnek: İNPUT: ara sınav notu=78
              final notu = 66
              proje notu = 90
       OUTPUT: "Notunuz : 81,6"
		 */

        Scanner input = new Scanner(System.in);

        System.out.println("mid-term grade =");
        double not =input.nextDouble();

        System.out.println("final grade =");
        double not1 =input.nextDouble();

        System.out.println("project grade =");
        double not2 =input.nextDouble();

        System.out.println("ortalama="+( (not*30/100)+(not1*20/100)+(not2*50/100))); //ortalama=81.6


    }
}
