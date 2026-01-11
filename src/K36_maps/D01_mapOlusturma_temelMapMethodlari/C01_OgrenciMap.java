package K36_maps.D01_mapOlusturma_temelMapMethodlari;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01_OgrenciMap {
    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap = new HashMap<>();


        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");

        System.out.println(ogrenciMap);

        /*
        {101=Ali-Can-11-H-MF,
        102=Veli-Cem-10-K-TM,
        103=Ali-Cem-11-K-TM,
        104=Ayse-Can-10-H-MF,
        105=Sevgi-Cem-11-M-TM,
        106=Sevgi-Can-10-K-MF,
        107=Esra-Han-11-M-SOZ}

         */

        //103 olu öğrencinin value'sini yazdırın.

        System.out.println(ogrenciMap.get(103)); //Ali-Cem-11-K-TM

        System.out.println(ogrenciMap.get(106)); //Sevgi-Can-10-K-MF

        System.out.println(ogrenciMap.get(117)); //null

        System.out.println(ogrenciMap.getOrDefault(103, "Aranan key Map'te yok"));

        System.out.println(ogrenciMap.getOrDefault(113, "Aranan key Map'te yok"));


        //bütün keyleri yazdırın
        System.out.println(ogrenciMap.keySet());

        //butun keyleri kaydedin

        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();

        System.out.println("Ogrenci Key Seti : "+ogrenciKeySeti);

        //örenci map'inde 107 numaralı ogrenci var mi=?

        System.out.println(ogrenciMap.containsKey(107));
        System.out.println(ogrenciMap.containsKey(116));

        //tum value'leri yazdirin
        System.out.println(ogrenciMap.values());
        //[Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Can-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF, Esra-Han-11-M-SOZ]


        //tum value'leri kaydedin
        Collection<String> ogrenciValueCollection = ogrenciMap.values();
        System.out.println("Ogrenci Value Collection : "+ogrenciValueCollection);

        //value'larda Ali var mi?
        System.out.println(ogrenciMap.containsValue("Ali")); //false


        /*
         value'larda Ali var mi ?
         bir loop ile value collection'indaki tum String value'leri kontrol edip
         Ali var mi bilgisine ulasabiliriz
         */


        System.out.println(ogrenciMap.size()); //7

        ogrenciMap.replace(101,"Kerem-Can-11-H-MF");
        System.out.println(ogrenciMap);

        ogrenciMap.replace(110,"Kerem-Can-11-H-MF"); //110 olmadığı için işlem yapmadı
        System.out.println(ogrenciMap);

        ogrenciMap.put(102,"Veli-CEM-10-K-TM"); //varsa update eder yoksa ekler
        System.out.println(ogrenciMap);

        ogrenciMap.put(110,"Kerem-Taner-11-H-MF"); //110 olmasığı için işlem yapmadı
        System.out.println(ogrenciMap);

        /*
         var olan key'ler icin put ile replace ayni islevi yapar
         olmayan bir key icin replace hicbir islem yapmaz ama put elemani ekler

         3 parametre kullanirsak,
         eski value'yu kontrol eder, verilen eski value ile ayni ise update eder
                                                            ayni degilse update etmez
        */

        ogrenciMap.replace(104,"Ayse-Can-10-H-MF","Ayse-Kan-10-H-MF"); //eski değer doğruysa yeni değerle değiştirir
        System.out.println(ogrenciMap);

        ogrenciMap.replace(104,"Ayse-Can-10-H-MF","Kemal-Can-10-H-MF");
        System.out.println(ogrenciMap); //eski değer doğru değilse değişiklik yapmaz

        ogrenciMap.remove(104);
        ogrenciMap.remove(117);

        ogrenciMap.remove(102,"Veli-CEM-10-K-TM"); // verilen key'e ait value verildigi gibi oldugundan ogrenciyi siler
        ogrenciMap.remove(105,"Veli-CEM-10-K-TM"); // verilen key'e ait value verilenden farkli oldugundan ogrenciyi silmez

        System.out.println(ogrenciMap);


    }

}
