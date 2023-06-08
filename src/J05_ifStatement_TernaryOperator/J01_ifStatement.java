package J05_ifStatement_TernaryOperator;

public class J01_ifStatement {
    public static void main(String[] args) {

        int yasMeryem =35;
        int yasAhmet =33;

        if (yasMeryem==yasAhmet) { //meryem ve ahmetin yaslari esitmi? esit ise bu if calısır degilse calısmaz
            //Condition 'yasMeryem==yasAhmet' is always 'false'

            System.out.println("aynı yastasiniz");
        }
            if (yasMeryem>40) { //bur// ada meryemin yası kirkdan buyukmu kontrol edildi.
                System.out.println("yas kırkdan buyuk" );
            }
            if (yasMeryem + yasAhmet >50)
                System.out.println("ikisinin yası 50 den buyuktur" );

             //if else bloklarında her zaman suslu parantezler olmayabilir.
             //if in scopu ilk ; noktalı virgüle kadardır.



    }
}
