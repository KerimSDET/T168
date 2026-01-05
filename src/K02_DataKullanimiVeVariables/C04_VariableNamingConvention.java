package K02_DataKullanimiVeVariables;

public class C04_VariableNamingConvention {

    static void main() {
        int YAS = 40 ;
        int Yas = 41 ;
        int yas = 42 ;
        int yAS = 43 ;
        int yaS = 44 ;

        //Variable isimler küçük hafrle başlaması genel ve doğru kullanımdır.
        //Ama büyük harf ile başlarsa JAVA kodu hata olarak algılamaz, altınız çizmez


        System.out.println(YAS);
        System.out.println(Yas);
        System.out.println(yas);
        System.out.println(yAS);
        System.out.println(yaS);
        //System.out.println(YaS); //Böyle bir variable yok hatası verir.
        /*
        java: cannot find symbol
        symbol:   variable YaS
        location: class K02_DataKullanimiVeVariables.C04_VariableNamingConvention
         */



        //int int = 45; şeklinde daha önceden tanımlı terimler variable olarak kullanılamaz ancak;

        int int1 = 45; //kabul edilir.

        int ogrencininYasi = 12;  //camelCase kullanımı önemlidir.
        double sinifinNotOrtalamasi = 23.5;


        System.out.println(int1);
        System.out.println(ogrencininYasi);
        System.out.println(sinifinNotOrtalamasi);






    }
}
