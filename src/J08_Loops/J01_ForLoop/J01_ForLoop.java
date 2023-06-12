package J08_Loops.J01_ForLoop;

import java.util.Scanner;

public class J01_ForLoop {
    public static void main(String[] args) {
        //task 33 defa java iyidir yazın.



        for (int i = 1; i <= 33; i++) {
            System.out.println(i+"java iyidir");
        }
      //Task 2 : 2 basamakli tek sayilari yan yana print eden code create ediniz 10,13,15

        for (int i = 11; i <100 ; i+=2) {
            System.out.print(i+" ");
        }
         int j;
         for (j =10 ; j < 100 ; j++){
              if (j% 2 == 1){
                  System.out.print(j+ " ");
              }
        }








    }
}
