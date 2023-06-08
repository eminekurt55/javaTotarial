package j01_Variables;

public class C01_Variables {

    //TASK  : Isminizi
    // yasinizi ve
    // ogrenci olup olmadiginizi uygun data type lara assign edip
    // konsolda print edin
    //note: assign (atama) = (esittir) atama operatoru ile yapilir

    public static void main(String[] args) {

        String      isim     =     "zafer"     ;
        //once data type yazilir String int double boolean
        //sonra variable name yazilir name isim yas. // identifier ile variable name ayi seyi ifade eder
        //atama operatoru ile = deger atamasi yapilir
        //data tipine gore deger atamasi yapildi
        //son vurus olarak ; ile bitirildi

        int age = 33;  ; //int=> data type, age=>variable name, 33=>value(değer)
        boolean isStudent = false; //boolean=>data tipi kendine has deger bekler ya true ister yada false  ;
        System.out.println(isim+ " "+age+" "+isStudent);

        System.out.println(isStudent);


        //TASK  : isim yas maas variableri create edip print ediniz

             //CTE String isim ="Rukiye hanım "; //Variable 'isim' is already defined in the scope
        String name = "Rukiye hanım";

        double salary =25000;
        age = 35;
        System.out.println(name+" "+age+" "+salary);
        boolean kadınMı =true;
        System.out.println(kadınMı);


        System.out.println(isim);
        System.out.println("name = " + name);
        System.out.println("kadınMı = " + kadınMı);
        System.out.println("age = " + age);
        System.out.println("isStudent = " + isStudent);

        //notes variable ismi yazılıp noktaya basıldıgında acılan pencereden soutv secilir

        //Variable nasıl olusturulur?

        // 1)Access Modifier   2)Data Type   3)Variable ismi   4)=    5)Deger    6);

        // Javada ";" İngilizcedeki "." gibidir
        //Ingilizcede "cümle" deriz, Java da "statement"deriz

        //"=" sembolu "Assigment (Atama) Operator" olarak adlandırılır
        //"Assigment (Atama) Operator" sagdaki degeri alır soldaki variable 'ın içine koyar


        //TASK: isim yas maas variableri creat edip print ediniz

        String name1 ="Emine";
        int age1 = 35;
        double salary1 =25000;
        System.out.println(name1+" "+age1+" "+salary1);

        System.out.println("name = " + name);//name = Rukiye Hanim
        System.out.println("age = " + age);//age = 33
        System.out.println("salary = " + salary);//salary = 25.000

        int boy ;//degeri atanmayan bir variable create edildi
        //CTE   System.out.println("boy = " + boy);//Variable 'boy' might not have been initialized
        boy = 180;//deger atamasi yapildigi icin artik kullanilabilir bir variable oldu
        System.out.println("boy = " + boy);//boy = 180

        //2. yol variable create etmede
        int yas2 , age2 , count;
        yas2 = 45;
        age1 = 55;
        count = 21;


        //3. yol variable create ederken
        int not = 100 , ucret = 36500 , chapter = 1;
        String okul ="Clarusway" , bolum = "Tester SDET" , derece = "A";
        System.out.println("okul = " + okul);//okul = Clarusway
        System.out.println("bolum = " + bolum);//bolum = Tester SDET
        System.out.println("derece = " + derece);//derece = A
        //variable create edildigi scope da dogar ve o scope da olur (vefat) eder
    }
}




