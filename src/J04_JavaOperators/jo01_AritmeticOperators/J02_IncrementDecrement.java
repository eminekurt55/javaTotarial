package J04_JavaOperators.jo01_AritmeticOperators;

public class J02_IncrementDecrement {
    public static void main(String[] args) {

        int number = 7;

        //pre-increment
        System.out.println(++number);//8
        System.out.println("number = " + number);//8

        //post-increment
        System.out.println(number++);//8
        //post-increment sonrası deger guncellendi
        System.out.println("number = " + number);//9

        System.out.println(number++ + ++number); //9+11=20
        System.out.println("number = " + number); //11

        System.out.println(number++ + number++); //11+12=23
        //The value changed at 'number++' is never used







    }






}
