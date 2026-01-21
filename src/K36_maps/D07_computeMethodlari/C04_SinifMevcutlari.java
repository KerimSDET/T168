package K36_maps.D07_computeMethodlari;

import K36_maps.D06_nestedMapKullanimi.NestedOgrenciMap;
import com.sun.source.doctree.SeeTree;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C04_SinifMevcutlari extends NestedOgrenciMap {

    public static void main(String[] args) {


        //nested ogrenci mapinde her sinifta kacar kisi oldugunu yazdirin
        //orn: 9:2 , 10:1, 11:3

        System.out.println(ogrenciNestedMapi);

        /*
        {102={bolum=Soz, isim=Veli, sinif=11, soyisim=Cem, sube=M},
        103={bolum=TM, isim=Ali, sinif=11, soyisim=Cem, sube=H},
        104={bolum=MF, isim=Ayse, sinif=10, soyisim=Can, sube=H},
        105={bolum=TM, isim=Sevgi, sinif=11, soyisim=Cem, sube=M},
        106={bolum=MF, isim=Sevgi, sinif=10, soyisim=Can, sube=K},
        107={bolum=SOZ, isim=Esra, sinif=11, soyisim=Han, sube=M}}
         */

        //tüm ogremcileri gocaden gecirmek icin keyset kaydetmeliyiz

        Set<Integer> ogrenciKeySet = ogrenciNestedMapi.keySet();

        Map<Integer,Integer> sinifOgrenciSayilariMap = new HashMap<>();

        //ikinic adim bir for each loop ile tum keyleri gozden gecirip o keylere ait sinif bilgilerini alip kullandik

        for (Integer eachKey : ogrenciKeySet){
            int ogrenciSinif = (Integer) ogrenciNestedMapi.get(eachKey).get("sinif");
            sinifOgrenciSayilariMap.computeIfPresent(ogrenciSinif, (k,v)-> v+1);
            sinifOgrenciSayilariMap.putIfAbsent(ogrenciSinif,1);
        }

        System.out.println(sinifOgrenciSayilariMap);
        //{10=2, 11=4}

    }
}
