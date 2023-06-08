package J30_CodeChallenge;

import java.util.Scanner;

public class task01_CodeChallenge {
    public static void main(String[] args) {
        /* Task->
        Girilen jobTitle data için : Eger jobTitle
        qa ise print "is unvaniniz Quality Analyst."
        dev ise print "is unvaniniz Developer."
        ba ise print "is unvaniniz Business Analyst."
        pm ise print "is unvaniniz Project Manager."
        code create ediniz...
         */

        Scanner input = new Scanner (System.in);
        System.out.println(" what is job :");
        String jobName = input.nextLine().toUpperCase().toLowerCase();

        if (jobName.equals("qa")) {
            System.out.println("Unvaniniz : Quality Analyst");

        }else if (jobName.equals("dev")){
            System.out.println("Unvaniniz : Developer");
        }else if (jobName.equals("ba")){
            System.out.println("Unvaniniz : Business Analyst");
        }else if (jobName.equals("pm")){
            System.out.println("Unvaniniz : Project Manager");
        } else{
           System.out.println("geçerli bir unvan giriniz");
        }

          //hocanın cozumu equalsIgnoreCase metodu gormezden gel diyor büyük kücük harfleri
        //if (jobTitle.equalsIgnoreCase("qa")) {//girilen jobTitle qa uncase sensitive  olma sartı kontrol edldi
        //    System.out.println("is unvaniniz Quality Analyst.");
//
        //} else if (jobTitle.equalsIgnoreCase("dev")) {
        //    System.out.println("is unvaniniz Developer.");
//
        //} else if (jobTitle.equalsIgnoreCase("ba")) {
        //    System.out.println("is unvaniniz Business Analyst.");
//
        //} else if (jobTitle.equalsIgnoreCase("pm")) {
        //    System.out.println("is unvaniniz Project Manager.");

        //} else System.out.println("aslanım adam gibi bi şey gir :( ");








    }
}
