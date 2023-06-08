package j02_DataTypes_WrapperClass;

public class J03_concatination {

    public static void main(String[] args) {


        /*
       NOT: char variable'ları matematiksel islemlerde kullanırsanız, java onların ASKII degerlerini kullanır.
            örneğin ; System.out.println('A'+'C'); ekrana AC yerine 132 yazdirir.
            Note : Java'da + sembolunun iki anlamı vardır.
            1) toplama islemi
            2) Birlestirme islemi (concatination)
            Java "+" sembolü görünce once toplama yapmaya calısır, yapamazsa birleştirme islemi yapmaya calısır
            o da  olmazsa hata verir.

         */

    char ch = 'A';
    char ch2 = 'C';

        System.out.println( ch + ch2); //132
        System.out.println ('A'+ 'C'); //132
        System.out.println ("A" + "B"); // cift tırnak String bir ifade oldugu için java bu iki ifadeyi concat eder

        String name = "zeynep hanım";
        String lastName = "Fitnat";

        int a = 7 ;
        int b = 11 ;
        System.out.println (name+lastName+a+b); //zeynep hanımFitnat711
          // String den sonrasını tamsayı olsa bile concate eder.çünkü bu bir kural
          // başta integer bir ifade olsaydı toplama işlemi yapardı

        System.out.println(a + name+ lastName+ b); //7zeynep hanımfitnat11

        System.out.println(a+b + name+ lastName); //başlangıç int değerler olduğu içinjava bunları önce toplam işlemine alır
                                               // string gördükten sonrakileri toplar

        //birden cok data type nda variable + ile işleme alındıgında islem oncelegine göre sonucu alırız.
        //bastakinin data tipine göre ilk işem yapılır.
        //bastaki string ise sondakiler integer dahi olsa cancat işlemi yapılır matematiksel işlem yapılmaz.

        System.out.println(name + lastName +(a+b)); //zeynep hanımFitnat18

       // TRICK : Aritmetik islemlerde String kullanılırsa aritmetik işlem önceliğine göre java bunu derler.
        //ona göre işlem yapar çıktı String variable gibi olur cancatination yapar.

        System.out.println(name + (a-b)+ (a-b)); //zeynep hanım-4-4
        System.out.println(name+(    (a-b)+ (a-b)  )  ); //zeynep hanım-8
         char num = '1';
        System.out.println(name +num); //zeynep hanım1

        System.out.println(a+num+name); //56zeynep hanım
        //1 in ASKII degeri 49 dur.yukarıda 7+49=56 islem sonucu alındı.
        //int + char olunca sonuç toplama işlemine göre deger alır.

       // name = zeynep hanım ;
        //lastName = Fitnat ;  int a=7;  int b =11;

        System.out.println(name +( num + b) ); //zeynep hanım60
        System.out.println(a+ name + num); // 7zeynep hanım1













    }






}
