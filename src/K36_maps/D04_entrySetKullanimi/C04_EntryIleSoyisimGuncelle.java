package K36_maps.D04_entrySetKullanimi;

import K36_maps.D02_bilgilereUlasmaVeListeleme.OgrenciMap;

import java.util.Map;
import java.util.Set;

public class C04_EntryIleSoyisimGuncelle extends OgrenciMap {

    public static void main(String[] args) {

        // Tum Ogrencilerin soyisimlerini buyuk harf yapin



       System.out.println(ogrenciMap);



    // 1. adim entry set olustur

    Set<Map.Entry<Integer, String>> ogrenciEntrySeti = ogrenciMap.entrySet();

    //2. adim bir for each loop ile tum entry leri gozden gecirelim

        for (Map.Entry<Integer, String> eachEntry : ogrenciEntrySeti) {
            //3. adim ogrenci vaue'sini kaydedelim
            String eachValue = eachEntry.getValue();
            //4. adim value verilene erişmek için split edelim

            String[] eachValueArr = eachValue.split("-");


            //istenen kontrollerri yapip istenen bilgileri yazdirin

           eachValueArr[1] = eachValueArr[1].toUpperCase();


            //6. adim arrayde yaptigimiz degiskligi map de update yapabilmek icin
            //array i yeni vau olarka birlestirelim

            eachEntry.setValue(String.join("-", eachValueArr));

        }
        System.out.println(ogrenciMap);
    }

}
