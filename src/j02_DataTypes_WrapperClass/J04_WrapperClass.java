package j02_DataTypes_WrapperClass;

import java.util.Locale;

public class J04_WrapperClass {
    public static void main(String[] args) {



    /*  Note : Java primitive data type larına methodlar ekleyerek yeni bir yapı oluşturdu.
       bu yapıya "WrapperClass"

           Primitive          WrapperClass
           byte                 Byte
           short                Short
           int                  Integer
           long                 Long
           float                Float
           double               Double
           boolean              Boolean
           char                 Character
           */

        String name = "Zeynep Hanım";
        int age = 33;

        System.out.println(name.toUpperCase(Locale.ROOT)); //ZEYNEP HANIM bu methot büyük harfle yazdırır.

        Integer age2 = 35 ; //Integer WrapperClass ından age2 i variable ı oluşturuldu.

        //non-prımıtıve data türleri data depolamak yanında kullanışlı bir çok methoda sahiptir
        //ancak pirimitive data türlerinin böyle bir özelliği yoktur
        //primitive data türleri sadece değerleri saklar (containar) ve herhangi bir özellik(method) vs bulundurmaz.
        //ancak pirimitiv data türleri için de bazı işlemler için (String den tamsayı çekme) mothodlarla
        //ihtiyaç oldugunda Java herbir primitive data türünü, non-primitive Wrapperclass oluşturarak
        //ilgili methodlarla ara çözüm imkanı sunmuştur.

        String number = "12345";



          //TASK: ıd ve tc String degerlerinin toplamını print eden code yazınız.

     String tc = "123456789";
     String ıd ="12345";
        System.out.println(tc + ıd); //12345678912345

        System.out.println(Integer.valueOf(tc)); //123456789

        System.out.println(Integer.valueOf(ıd)); //12345

        int yeniTc = Integer.valueOf(tc);
        int yeniID =Integer.valueOf(ıd);
        System.out.println(yeniTc +yeniID); //123469134
         //bu methoda (ınteger.valueof) gitmek için ctrl+sol click yapınız.gitiginiz classda method ile
        //ilgili verilen bilgiyi okuyunuz buna kütüphane okuma diyoruz.

        int ıdYeni = Integer.parseInt(ıd);

        int tcYeni = Integer.parseInt(tc);

        System.out.println(ıdYeni + tcYeni);


        String okulNo = "12345AB";

       //***hatalı kod RunTımeError int okulYeni = Integer.valueOf(okulNo);
        //Exception in thread "main" java.lang.NumberFormatException: For input string: "12345AB"

        //İnterview question hataları nasıl ayıklarız.


        //TASK: byte short ınt maximum ve minimum degerlerini print eden bir code yazınız.
        //wrapperClass ları kullanarak

        byte maxdegerbyte = Byte.MAX_VALUE;
        byte mindegerbyte = Byte.MIN_VALUE;

        System.out.println("maxdegerbyte = " + maxdegerbyte);//maxdegerbyte = 127
        System.out.println("mindegerbyte = " + mindegerbyte);//mindegerbyte = -128


        short maxdegershort = Short.MAX_VALUE;
        short mindegershort = Short.MIN_VALUE;
        System.out.println("maxdegershort = " + maxdegershort);//maxdegershort = 32767
        System.out.println("mindegershort = " + mindegershort);//mindegershort = -32768


        int maxDegerInt = Integer.MAX_VALUE;//
        int minDegerInt = Integer.MIN_VALUE;//
        System.out.println("maxDegerInt = " + maxDegerInt);//maxDegerInt = 2147483647
        System.out.println("minDegerInt = " + minDegerInt);//minDegerInt = -2147483648

       //Autoboxing
         boolean bPrimitive = true;
         Boolean bWrapper = bPrimitive;

         //boxing
        Integer numberWrapper = 55;
         //unboxing in java
        int numberPrimitive =numberWrapper;

         //Java5 öncesinde hata verirdi Java5 den sonra güncelleme geldi







    }








}
