package K36_maps.D06_nestedMapKullanimi;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class NestedOgrenciMap {


    public static Map<Integer, Map<String, Object>> ogrenciNestedMapi = new TreeMap<>();

    static {
        mapeOgrenciEkleme(102,"Veli","Cem",11,"M","Soz");
        mapeOgrenciEkleme(103,"Ali","Cem",11,"H","TM");
        mapeOgrenciEkleme(104,"Ayse","Can",10,"H","MF");
        mapeOgrenciEkleme(105,"Sevgi","Cem",11,"M","TM");
        mapeOgrenciEkleme(106,"Sevgi","Can",10,"K","MF");
        mapeOgrenciEkleme(107,"Esra","Han",11,"M","SOZ");
    }

    public static void mapeOgrenciEkleme (Integer ogrenciNo, String isim, String soyisim, Integer sinif, String sube, String bolum){

        Map<String, Object> ogrenciMap = new TreeMap<>();
        ogrenciMap.put("sinif", sinif);
        ogrenciMap.put("sube", sube);
        ogrenciMap.put("soyisim", soyisim);
        ogrenciMap.put("isim", isim);
        ogrenciMap.put("bolum", bolum);

        ogrenciNestedMapi.put(ogrenciNo, ogrenciMap);

    }


}
