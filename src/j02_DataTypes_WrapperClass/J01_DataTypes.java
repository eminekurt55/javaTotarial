package j02_DataTypes_WrapperClass;

public class J01_DataTypes {
    public static void main(String[] args) {

        /*
         Java'da  2 farkli data type vardir.
         1)Primitive Data Type (8 tane)
           a)boolean: Sadece True veya False değerlerini alabilir. sadece iki farkli deger alabildigi icin
           memory'de
           az(bir bit'lik) alan kaplar
           b)char :Tek character'li (S, ?, 3, * gibi her bir sembol) ifadeler icin char data type'i kullanilir.
                her bir char memory'de 16 bit'lik yer kaplar.char deger mutlaka tek tirnak icine konulmalıdilir.
                char değerler aritmetik islemler için charlarin ASCII ("American Standard Code for Information
                 Interchange") Table'daki degerlerini alır.
           c)byte : -128'den +127 ye kadar tum tam sayi degerlerini alır.
                byte variable -> memory'de 8 bitlik alan kaplar.
           d)short : -32768'den 32767'ye kadar tum tam sayi degerlerini alır.
                short variable -> memory'de 16 bıt alan kaplar.
           e)int : -2,147,483,648'den 2,147,483,647'ye kadar tum tam sayi degerlerini alır.
                int variable -> memory'de 32 bit alan kaplar.
           f)long : -9,223,372,036,854,755,808'den 9,223,372,036,854,755,807'ye kadar tum tam sayi degerlerini
            alır.
                long variable -> memory'de 64 bit alan kaplar.
           g)float : ondalikli sayilar icin kullanilır.
                float variable -> memory'de 32 bit kullanir.
                float variable -> ondalik kisimlarinda en fazla 7 rakam barindirabilir.
                0.1234567
                Bir ondalikli sayinin float oldugunu belirlemek icin en sona(1.23f veya 1.23F) 'f' veya 'F'
                yazılmalıdır aksi halde variable double olarak tanımlanır.
           h)double : ondalikli sayilar icin kullanılır.
                double variable -> memory'de 64 bit kullanir.
                double variable -> ondalik kisimlarinda en fazla 16 rakam barindirabilirler.
                0.1234567890123456
         2)Non-Primitive Data Type
            String: Cift tirnak arasina yazilan sifir veya daha fazla character'lerden olusan variable.
         */
            /*
        1)Java'da iki turlu "memory" var
            i)Stack Memory:
                a)Kucuk memory'dir
                b)Primitve ve Non-Primitive'lerin adreslerini(Reference) icerir
           ii)Heap Memory:
                a)Buyuk Memory'dir
                b)Non-Primitive'leri icerir
        2)Java Heap Memory'ye yerlestirilen her non-primitve data icin bir address(Reference) olusturur ve bu
        adresi(Reference)
         Stack Memory'ye koyar. Herhangi bir sebeple address(Reference) silinirse Java adresi(Reference)
         olmayan Heap deki
         non-primitive data yi otomatik siler.  Memory'nin temizligini saglayan "Garbage Collector" vardir.
     */


        String name = "Hasan Bey";
        String yas = "23";
        int age = 35;
        int yıl = 2023;
        boolean emekliMi = false;
        boolean testerMı = true;
        // char ch= '$a'; chara tek karakter girilir yoksa bu hatayı alıyoruz too many characters in characters literal hatası alır

        char ch = '$';
        char harf = 'A';

        // TASK -> 1999 yılında dogan bir kişinin yaşını yazdırınız...
        // variable creat ederek hesaplayınız hepsini atama yapınız

        int dogumYılı = 1999;
        int suankiYıl = 2023;
        int yası = suankiYıl - dogumYılı;
        System.out.println("yası=" + yası); //yası =24

        float f1 = 12.45f; //ondalıklı sayılar koyulurken nokta koyulur.bazı bilgisayarlarda virgül olarak kabul eder
        float f2 = 15.45f;

        double d = 25.55;

        System.out.println(f1 * f2); // f1*f2 =192.3525

        //TASK iki farklı byte tanımlayıp toplam ve farkını print ediniz.

        byte b1 = 100;
        byte b2 = 29;
        byte toplam = (byte) (b1 + b2);
        System.out.println("toplam = " + toplam);//toplam = -127 burda byte ın değeri 128e kadar olduğundan tekrar geri dönüp eksi degerinden saymaya başlıyor

        byte fark = (byte) (b1 - b2);//burada byte dönüştürmeye gerek yok çünkü byte değerini aşmıyor toplam
        System.out.println("fark = " + fark);

        System.out.println(b1 + b2);//bu sayıyı int a dönüştürüyor.
        System.out.println(b1 - b2); //fark için bu metod yeterli.
        //byte içinde -128 ile 127 arasında değer tutar 127 yi aştığında tekrar -128den devam eder.

        byte sayı3 = 100;
        byte sayı4 = 50;
        System.out.println(sayı3 - sayı4);//50

        //TASK: iki farklı tam sayı türünde sayı tanımlayıp toplamını print ediniz.

        int c = 33;
        byte by =120;
        System.out.println("c+by = " +( c + by)); //c+by = 153
        System.out.println("c+by = " + c + by);//c+by = 33120 baştaki string bir ifade oldugu için diğerlerinide
        //otomatik olarak concate eder.toplama işleminde dikkat edilmeli çünkü toplama işleminin öncesinde string
// ifadeler var ise sayıysa değerler toplanmaz yanyana yazılır (concate edilir)

        //TASK: tam sayı ve ondalık sayı tanımlayıp toplamı print ediniz.

        int sayı5 =10;
        double sayı6 =10.5;
        System.out.println("toplam = " +( sayı5 + sayı6));//toplam = 20.5 büyük konteynırımız double olduğu için
                                                       //sayımızı double atayacak ve çıktımızı ondalıklı vericek
        //TASK: tamsayı ve char data type iki variable tanımlayıp toplam print ediniz

        int sayı7= 45;
        char para ='$';
        System.out.println(sayı7 + para);//81
        System.out.println(para+1);//37

        //$ in ascii degeri 36 oldugu icin char ve int variable toplama islemine dahil oldular
        //sayi7+para = 45$   concatination

        //variable in uzerine gelinip (hover olundugunda) variable in syntax(sözdizimi) ini gosterrir

        System.out.println("sayı7+para = " + sayı7 + para);//sayi7+para = 45$   concatination(birleştirme)yanayana yazar
        System.out.println("sayı7+para = " + (sayı7 + para));

        // Task ad ve soyadınızı ve yasınızı print ediniz.

        String ad = "emine";
        String soyad="kurt";
        int yasınız= 35;
        char cinsiyet='K';
        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
        System.out.println("yasınız = " + yasınız);
        System.out.println("cinsiyet = " + cinsiyet);


        //concational birleştirme yan yana yazma

        System.out.println(ad+"\n"+soyad+"\n"+"\t"+yasınız+"\t"+cinsiyet);

        System.out.println(cinsiyet + 0); //K nın ASKII değeri  75 ASKII değererine göre işlem yapar

        System.out.println(    '('   + 1   +   " " +1  +  ')'); //41 1)
      //strıngden önceki ifadeler toplanır stringden sonrakiler concat edilir " " boşluk string bir ifadedir



    }


}
