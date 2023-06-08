package J07_StringManipulations;

public class J02_length {
    public static void main(String[] args) {
         /*
        length() methodu girilrn string'in uzunluğunu:içinde bulunan karakter sayısını return eder
        butun karakterleri(boşluk vs) sayıp adedini verir
         */

        String str = "clarusway ile java";
        System.out.println("str.length() = " + str.length()); //str.length() = 18

        //method parantezi bos ise bu method parametresizdir
        //length methodu karakter uzunlugunu olcer.

        int lengthOfStr = str.length();
        System.out.println("lengthOfStr = " + lengthOfStr); //lengthOfStr = 1

        String str1 = "";
        System.out.println("str1.length() = " + str1.length()); //0

        String str2 = " ";
        System.out.println("str2.lenght() = " + str2.length()); //1

        String str3 = null;
        //RTE System.out.println("str3.length() = " + str3.length());
        //Method invocation 'length' will produce 'NullPointerException'
        //Exception in thread "main" java.lang.NullPointerExceptio

        //RTE  System.out.println("str3.concat(str2) = " + str3.concat(str2));
        //Exception in thread "main" java.lang.NullPointerException

         String str4 = "null";
         System.out.println("str4.length() = " + str4.length()); //str4.length() = 4
        System.out.println("str4 = " + str4);//str4 = null

        String str5 ;
       // System.out.println("str4.concat(str5) = " + str4.concat(str5)); //CTE run time eror atama yapılmadıgı icin
            //CTE atama yapaılmamıs bir variable kullanılmaz cünkü
        

    }
}
