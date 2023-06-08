package J07_StringManipulations;

public class J08_equals_equalsIgnorCase {
    public static void main(String[] args) {
        /* equals()
         * 2 String metnin birbirine esit olup olmadigina bakar. büyük küçük harf farkı vardır. Sonuc boolean dir.
         *
         * equalsIgnorecase()
         * equals() ile ayni islevi gorur, tek farki buyuk kucuk harfe duyarliligi yoktur. Sonuc boolean dir.
         */
        /**
         * str.toLowerCase() verilen String'in tamamini kucuk harfe cevirir
         * str.toUpperCase() verilen String'in tamamini buyuk harfe cevirir
         */
         String str1 ="Merhaba;" ;
         String str2 ="merhaba";

        System.out.println("str1 replaceAll oncesi =" + str1); //str1 replace oncesi =Merhaba
        System.out.println("str1.replaceAll(\"w\",\" *\") = " + str1.replaceAll("\\w", " \\*"));
        //regex karakterler sadece reclaceAll da calişiyor.

        System.out.println("str1 replaceAll sonrasi = " + str1); //str1 replace sonrasi =Merhaba

        System.out.println(str1.equals(str2));//false
        System.out.println(str2.equals(str1));//false

        System.out.println(str1.equalsIgnoreCase(str2));//true

        str2 = "Merhaba";//str2 nin degeri update edildi yeniden atama yapildi

        System.out.println(str1.equals(str2));//true



    }
}
