package K36_maps.D02_bilgilereUlasmaVeListeleme;

import com.sun.security.jgss.GSSUtil;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class OgrenciMap {

    protected static Map<Integer,String> ogrenciMap = new HashMap<>();

    static {
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");
    }

    /*
        Öğrenci map'inde verilen öğrenci noya sahip
        sınıf, şube, isim ve soyismini yazdırın
         */

    public static void numaradanOgrenciBilgisiYazdir (int ogrenciNo){


        //1- ogrenci value'yu kaydedelim

        String ogranciValue =ogrenciMap.get(ogrenciNo); //Ali-Cem-11-K-TM

        //2- bilgilere rahat ulaşabilmek için value'yu Array'e split edelim

        String[] valueArr = ogranciValue.split("-");

        //3- bu aşamada Array'de isttenilen bilgileri alabiliriz.

        System.out.println(ogrenciNo+" numaralı öğrenci bilgileri : ");

        System.out.println(
                valueArr[2] + " " + valueArr[3] + " " + valueArr[0]+" "+ valueArr[1]
        );

    }
    /*
            verilen soyisim'e sahip öğrencilerin
            sınıf şube isim ve soyisimlerini
            alt alta yazdırın
             */
    public static void soyisimdenListeYAzdir (String verilenSoyisim) {
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

        }
        System.out.println();
    }


    public static void sinifSubeListesiYazdirma (Integer istenenSinif, String sube ){

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
