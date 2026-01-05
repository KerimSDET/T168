package K21_staticKeyword;

public class C02_HastaneRunner {

    public static void main(String[] args) {

        C01_Hastane hems1 =new C01_Hastane();

        System.out.println(hems1);

        //Instance özellikler : perIsım : isim atanmamış --- perAdres : adres atanmamış --- perTel : tel atanmamış
        //Static özellikler : hasnateIsmi : Yildiz Hastanesi --- hastaneAdresi : Çankaya --- bashekim : Dr. Esra

        System.out.println(hems1.hastaneIsmi);
        hems1.perIsim ="Ayşe";
        hems1.perAdres ="Cankaya";
        hems1.perTel = "5324343431";

        System.out.println(hems1);

        //Instance özellikler : perIsım : Ayşe --- perAdres : Cankaya --- perTel : 5324343431
        //Static özellikler : hasnateIsmi : Yildiz Hastanesi --- hastaneAdresi : Çankaya --- bashekim : Dr. Esra


        C01_Hastane hems2 =new C01_Hastane();
        hems2.perIsim="Fatma";
        hems2.perAdres ="Yenimahalle";
        hems2.perTel = "5324353535";

        hems2.hastaneAdresi ="Yenimahalle";
        hems2.bashekim="Dr Faruk";

        System.out.println(hems2);

        System.out.println(hems1);


        C01_Hastane hems3 =new C01_Hastane();
        System.out.println(hems3);
        hems3.perIsim="Leyla";
        hems3.hastaneAdresi ="Balgat";

        System.out.println(hems3);

        System.out.println(hems1.perIsim);
        System.out.println(hems2.perIsim);

    }
}
