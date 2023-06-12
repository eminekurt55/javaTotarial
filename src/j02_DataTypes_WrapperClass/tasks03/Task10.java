package j02_DataTypes_WrapperClass.tasks03;

import java.util.Scanner;

public class Task10 {
// Write a Java program to convert temperature from Fahrenheit to Celsius degree.

// formula
//Sıcaklığı Fahrenheit derecesinden Celsius derecesine çeviren bir Java programı yazınız.
    // c = (f-32)*5/9

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Derece cinsinden sicaklik giriniz : ");
        double Fahrenheit = input.nextDouble();
        
        double Celsius =(Fahrenheit-32) *5/9 ;
        System.out.println("Celsius = " + Celsius);






    }


}
