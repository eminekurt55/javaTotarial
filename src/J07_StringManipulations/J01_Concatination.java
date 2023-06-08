package J07_StringManipulations;

public class J01_Concatination {
    public static void main(String[] args) {

    /*
        concat() methodu içine(parametee) aldığı string variable'ı çalıştşğı stringin sonuna ekler..
        java'da + işlemi yapılırken eğer en az bir string variable varsa java toplama değil concat yapar.
         */

        String name ="Batu";
        String title="SDET QA";
        int age =30;

        System.out.println(name+title);
        System.out.println("name.concat(title) = " + name.concat(title));

        System.out.println("age = " + age);
        System.out.println(age);


        //String i int a nasıl ceviririz.
         String number ="123456";
        System.out.println("number = " +number+1); //1234561

        //output 123456 olmalı

        Integer.valueOf(number+1);
        System.out.println ("valueOf(number+1=" + (Integer.valueOf(number+1) +1));//valueOf(number+1=1234562

        System.out.println("name.concat(true+ \":)\") = " + name.concat(true+ ":)" ) );//name.concat(true+ ":)") = Batutrue:)

        System.out.println("name.concat(true+ \":)\") = " + name.concat(100+ ":)" ) );//name.concat(true+ ":)") = Batu100:)

        System.out.println("title.concat(false+\"Kasim\")=" +title.concat(false + "Kasim"));
    }
}
