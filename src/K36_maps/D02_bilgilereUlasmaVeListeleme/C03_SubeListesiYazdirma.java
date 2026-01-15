package K36_maps.D02_bilgilereUlasmaVeListeleme;

import java.util.Collection;
import java.util.Set;

public class C03_SubeListesiYazdirma extends OgrenciMap{

    public static void main(String[] args) {

        /*
        sinif ve sube verildiginde
        o siniftaki ogrencilerin
        numara, isim, soyisimlerini liste olarak
        alt alta yazdiren bir METHOD olusturun

         */
        Integer istenenSinif = 10;
        String sube ="K";


        ogrenciMap.keySet();

//            1 - tum key'leri kaydederiz
//                ogrenciMap.keySet() method'u Set olarak tum key'leri getirir
        Set<Integer> ogrenciKeyseti = ogrenciMap.keySet();

//            2- bir for-each loop ile her bir key'i ele alalim
        //ogrenciKeyseti .forEach(System.out::println);

        System.out.println(istenenSinif+"/"+sube+" subesindeki ogrenci listesi :");

        for (Integer key : ogrenciKeyseti) {

//            3- bizim oglanin getirdigi key'e ait value'yu kaydedelim
        String eachValue =ogrenciMap.get(key);

//            4- value'yu split ile bolup
//               bir array olarak kaydedelim ki bilgilere direk ulasabilelim
            String[] eachValueArray = eachValue.split("-");

//            5- kaydettigimiz valueArr'inde istenen bilgiyi kontrol edip
//               istenen sarti saglayan ogrencilerin, istenen bilgilerini yazdirin


//            1 - tum key'leri kaydederiz
//                ogrenciMap.keySet() method'u Set olarak tum key'leri getirir

//        Collection<Integer> ogrenciKeySet =ogrenciMap.keySet();
//        ogrenciKeySet.forEach(System.out::println);
//        String eachKeySetValue = ogrenciMap.get(ogrenciKeySet);
//
//        Collection<String>  ogrenciValueDegerleri = ogrenciMap.values();
//        ogrenciValueDegerleri.forEach(System.out::println);


            if (eachValueArray[2].equalsIgnoreCase(istenenSinif+"")
                    && eachValueArray[3].equalsIgnoreCase(sube)) {

                System.out.println(
                        key+ " "+eachValueArray[0]+" "+eachValueArray[1]+""
                );

            }

    }
    }
}
