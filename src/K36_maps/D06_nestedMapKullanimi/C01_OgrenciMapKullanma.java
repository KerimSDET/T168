package K36_maps.D06_nestedMapKullanimi;

import java.util.Map;
import java.util.TreeMap;

public class C01_OgrenciMapKullanma {

    public static void main(String[] args) {


        /*
            {
             101={sinif=10, sube=H, soyisim=Can, Isim=Ali, bolum=MF},
             102={sinif=11, sube=M, soyisim=Cem, Isim=Veli, bolum=Soz},
             103={sinif=11, sube=H, soyisim=Cem, Isim=Ali, bolum=TM},
             }

         */

        Map<Integer, Map<String, Object>> ogrenciNestedMapi = new TreeMap<>();

        Map<String, Object> ogrenciMap101 = new TreeMap<>();
        ogrenciMap101.put("sinif", 10);
        ogrenciMap101.put("sube", "H");
        ogrenciMap101.put("soyisim", "Can");
        ogrenciMap101.put("isim", "Ali");
        ogrenciMap101.put("bolum", "MF");

        ogrenciNestedMapi.put(101, ogrenciMap101);



        Map<String, Object> ogrenciMap102 = new TreeMap<>();
        ogrenciMap102.put("sinif", 11);
        ogrenciMap102.put("sube", "M");
        ogrenciMap102.put("soyisim", "Cem");
        ogrenciMap102.put("isim", "Veli");
        ogrenciMap102.put("bolum", "Soz");

        ogrenciNestedMapi.put(102, ogrenciMap102);


        Map<String, Object> ogrenciMap103 = new TreeMap<>();
        ogrenciMap103.put("sinif", 11);
        ogrenciMap103.put("sube", "H");
        ogrenciMap103.put("soyisim", "Cem");
        ogrenciMap103.put("isim", "Ali");
        ogrenciMap103.put("bolum", "TM");

        ogrenciNestedMapi.put(103, ogrenciMap103);

        System.out.println(ogrenciNestedMapi);

        /*
        {
        101={bolum=MF, isim=Ali, sinif=10, soyisim=Can, sube=H},
        102={bolum=Soz, isim=Veli, sinif=11, soyisim=Cem, sube=M},
        103={
            bolum=TM,
            isim=Ali,
            sinif=11,
            soyisim=Cem,
            sube=H
            }
        }
         */

        //103 numarali ogrencinin soyismini yazdirin

        System.out.println(ogrenciNestedMapi.get(103)); //{bolum=TM, isim=Ali, sinif=11, soyisim=Cem, sube=H}

        System.out.println(ogrenciNestedMapi.get(103).get("soyisim")); //Cem

        //101 numarali ogrencinin bolumunu yazdirin

        System.out.println(ogrenciNestedMapi.get(101).get("bolum")); //MF

        //102 numaralı ogrencinin subesi K olsun

        System.out.println(ogrenciNestedMapi);
        System.out.println(ogrenciNestedMapi.get(102).put("sube", "K"));

        System.out.println(ogrenciNestedMapi);

        //101 numarali ogrencinin bolumunu TM yap

        ogrenciNestedMapi.get(101).put("bolum", "TM");
        System.out.println(ogrenciNestedMapi);


    }
}
