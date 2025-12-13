package K13_MethodOlusturmaVeKullanma.Ders02_MethodOlusturmaOrnekSorular;

public class C09_MethodCalistirma {
    public static void main(String[] args) {


        C01_AsalMiYazdir.asalMiYazdir(87);

        C01_AsalMiYazdir.asalMiYazdir(42);

        C02_KucukOlmayaniYazdir.kucukOlmayaniYAzdir(34,56);

        C03_MetniTerstenYazdir.metniTerstenYazdir("Kerem Taner TIRPAN");

        C03_MetniTerstenYazdir.metniTerstenYazdir("JAva Candır");
        System.out.println();

        System.out.println(C04_IsmiDuzenle.ismiDuzenleDondur("kEREM tANER", "TIRPAN"));


        //aşağıda verilen metnin palindrome  olup olmadığını yazdırın

        String metin = "Java çok güzel";

        String tersMetin = C05_MetniTerseCevirme.metniTerstenDondur(metin);

        if (metin.equalsIgnoreCase(tersMetin)){
            System.out.println("Verilen metin palindromdur");
        } else {
            System.out.println("Verilen metin palindrome değildir.");
        }

    String metin1 = "madam";

    String tersMetin1 = C05_MetniTerseCevirme.metniTerstenDondur(metin1);

        if (metin1.equalsIgnoreCase(tersMetin1))
    {
        System.out.println("Verilen metin palindromdur");
    } else {
        System.out.println("Verilen metin palindrome değildir.");
    }
    }
}
