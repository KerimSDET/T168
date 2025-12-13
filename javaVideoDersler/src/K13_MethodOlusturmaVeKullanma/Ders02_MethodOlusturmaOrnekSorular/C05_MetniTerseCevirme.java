package K13_MethodOlusturmaVeKullanma.Ders02_MethodOlusturmaOrnekSorular;

public class C05_MetniTerseCevirme {

    public static void main(String[] args) {

        metniTerstenDondur("Ali Can");

        //metnin tersten yazılışını dönüren bir method yapınmetniTersten("Ali Can"); // ne consolda görünür ne de sonra kullnaılır.

        System.out.println(metniTerstenDondur("Bu iyiymiş"));
        // konsolda görünür ama sonra terar kullanılmaz

        String str = metniTerstenDondur("Java Candır");
        //kaydedildi konsoldu görünmez ama açağırılsa görünrü

        System.out.println(str);

        System.out.println(str.substring(0, 6));


    }

    public static String metniTerstenDondur (String metin) {

        String tersMetin = "";

        for (int i = metin.length() - 1; i >= 0; i--) {

            tersMetin += metin.charAt(i);

        } return tersMetin;
    }
}
