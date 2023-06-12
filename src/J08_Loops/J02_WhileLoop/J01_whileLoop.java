package J08_Loops.J02_WhileLoop;

import java.util.Scanner;

public class J01_whileLoop {
    public static void main(String[] args) {

        // task01-> 11 den 20'ye kadar olan tamasayıları print eden code create ediniz...








//Task02 7 kere javaCAN print eden code create ediniz...

int sayi = 1 ;

while (sayi <= 7){
    System.out.println(sayi +". javaCAN ");
    sayi++;
}

// TASK03 2 basamaklı tek sayilari yanyana print eden code creat ediniz.

       int task03Count = 11 ; //100 a kadar gidicek loop
        {
            while (task03Count < 100 ) {
                if (task03Count % 2 == 1)
                System.out.print(task03Count + " ");
                task03Count++;
            }


        }


// task04-> girilen metni while loop ile  tersden print eden code create ediniz

        Scanner input = new Scanner (System.in);
        System.out.println("bir metin gir :");
        String metin = input.nextLine();

        int index = metin.length() - 1;
        while (index >= 0) {
            System.out.print(metin.charAt(index));
            index--;
        }

for (int  i = metin.length()-1; i >=0 ;   i--) {
    System.out.println(metin.charAt(i));
}


        //TASK05 girilen tamsayiya kadar tamsayilarin toplamini print eden code creat ediniz....





//task06-- girilen tamsayinin faktöriyelini print eden code giriniz

        System.out.print("Bir tamsayı girin: ");
        int sayi3 = input.nextInt();
        input.close();

        int faktoriyel = 1;
        int i = 1;

        while (i <= sayi) {
            faktoriyel *= i;
            i++;
        }

        System.out.println(sayi + " sayısının faktöriyeli: " + faktoriyel);
    }
}





