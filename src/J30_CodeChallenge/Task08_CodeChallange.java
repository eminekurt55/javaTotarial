package J30_CodeChallenge;

public class Task08_CodeChallange {
    public static void main(String[] args) {


        // Task-> asagidaki fiyatlarin toplamini print eden code create ediniz.
        // String  str 1= "$13.99"
        // String str 2= "$10.55"
        // ipucu: Double parseDouble() methodunu kullanabilirsiniz.

     /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar
		  	 \\D    ==> tum rakam disi character ler
		 2) \\w   ==> A->Z		a->z			0->9    _
		 	 \\W  ==> A->Z		a->z			0->9    _ disindaki hersey
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey  */


        String  str1= "$13.99" ;
        String str2=  "$10.55" ;


        double d1 = Double.parseDouble(str1.replace("$", ""));
        double d2 = Double.parseDouble(str2.replace("$", ""));

        System.out.println("toplam = "+ (d1 + d2));




    }
}
