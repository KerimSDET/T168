package K21_staticKeyword;

public class C01_Hastane {



    static String hastaneIsmi = "Yildiz Hastanesi";
    static String hastaneAdresi ="Çankaya";
    static String bashekim = "Dr. Esra";

    String perIsim ="isim atanmamış";
    String perAdres = "adres atanmamış";
    String perTel = "tel atanmamış";


    @Override
    public String toString() {
        return "Instance özellikler : " +
                "perIsım : " + perIsim +
                " --- perAdres : " + perAdres +
                " --- perTel : " + perTel +
                "\nStatic özellikler : " +
                "hasnateIsmi : " + hastaneIsmi +
                " --- hastaneAdresi : " + hastaneAdresi +
                " --- bashekim : " + bashekim
                ;
    }
}
