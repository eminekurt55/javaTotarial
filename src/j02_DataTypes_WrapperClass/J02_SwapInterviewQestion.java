package j02_DataTypes_WrapperClass;

public class J02_SwapInterviewQestion {

    public static void main(String[] args) {

 /*  TASK: verilen sayı1 ve sayı2 variable larının değerini değiştiren (SWAP)code creat edip print ediniz
    a) 3. bir variable kullanarak
    b) 3. bir variable kullanmadan

    inpute : sayı1=20 ve sayı2=34
    outpute : sayı1=34 ve sayı2 =20

  */
        //1. adım 3. bir variable creat ederek başla

        int sayı1 =20;
        int sayı2 =34;
        int temp;


        System.out.println("swap isleminden once sayı1= "+sayı1+" sayı2 = "+sayı2);

        temp = sayı1 ;
        sayı1 = sayı2;
        sayı2 = temp ;

        System.out.println("swap isleminden sonra sayı1= " +sayı1+"  sayı2=  " + temp);


       // b) 3.variable atanmadan çözüm

        System.out.println("swap isleminden once sayı1 = " +sayı1+"  sayı2 = "+sayı2);

         sayı1 = sayı1+ sayı2 ; //54
         sayı2 = sayı1 - sayı2 ; //34
         sayı1 = sayı1- sayı2 ; //20

        System.out.println("swap işleminden sonra sayı1 = " + sayı1  + ", sayı2 = " + sayı2);








    }



}

