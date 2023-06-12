package J05_ifStatement_TernaryOperator.Task05.tasks05;

public class _06_if_else_if_statement6 {

    public static void main(String[] args) {

        /*      8. satırda int number oluşturulmuştur.
                Eğer int number 0 yazdırılırsa "Im neutral",
                Eğer int number 0'dan büyükse "I m positive",
                Eğer int number 0'dan küçükse "I am negative" yazdırılsın.   */

    int num = -1;


     if ( num > 0 ) {
        System.out.println("I m positive");
    }else if ( num < 0 ) {
        System.out.println("I am negative");
    }else {
         System.out.println("Im neutral");
     }

    }
}
