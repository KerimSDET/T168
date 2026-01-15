package K36_maps.D02_bilgilereUlasmaVeListeleme;

import java.util.Collection;

public class C02_SoyisimdenOgrenciBilgisiYazdirma extends OgrenciMap{

    public static void main(String[] args) {
        /*
        verilen soyisim'e sahip öğrencilerin
        sınıf şube isim ve soyisimlerini
        alt alta yazdırın
         */

        String verilenSoyisim = "Can";




         /*
        {}

        {101=Ali-Can-11-H-MF,
        102=Veli-Cem-10-K-TM,
        103=Ali-Cem-11-K-TM,
        104=Ayse-Can-10-H-MF,
        105=Sevgi-Cem-11-M-TM,
        106=Sevgi-Can-10-K-MF,
        107=Esra-Han-11-M-SOZ}

         */

        /*
        Sadece value'ya ihtiyacımız varsa
        orneğin: 10K sınıfındaki ogrencierin isim ve soyisimlerini yazdırın
        -tum value'leri kaydederiz
        ogrenciMap.values() methodu collection olarak tum value'leri getirir
        -bir for-each loop ile her biri value'u ele alalım
        -bizim oglann getirdiği value'yu split ile bölelim
        bir array olarak kaydedelim ki bilgiere direk ulaşabilelim

        -kaydettigimiz valueArr'inde sinif ve subeyi kontrol edip
        istenen sinif ve sube ile ayni ise
        ogrencinin isim ve soyismini yazdiralim.
         */

        Collection<String> ogrenciVeluleriCollection =ogrenciMap.values(); //valuleri kaydettik ama ham daha

        System.out.println(ogrenciVeluleriCollection);
        System.out.println();

        System.out.println("Soyismi : "+verilenSoyisim+" olan öğrenciler :");

        for (String each: ogrenciVeluleriCollection){ //ham value değerini liste hale getirdik.
            //System.out.println(each);
            String[] valueArr = each.split("-");

            if (valueArr[1].equalsIgnoreCase(verilenSoyisim)){
                System.out.println(valueArr[2]+" "+valueArr[3]+" "+valueArr[0]+" "+valueArr[1]);
            }
            System.out.println();
        }






    }
}
