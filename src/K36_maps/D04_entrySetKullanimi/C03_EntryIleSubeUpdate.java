package K36_maps.D04_entrySetKullanimi;

import K36_maps.D02_bilgilereUlasmaVeListeleme.OgrenciMap;

import java.util.Map;
import java.util.Set;

public class C03_EntryIleSubeUpdate extends OgrenciMap {

    public static void main(String[] args) {

        // Entry kullanarak 11/M sinifindeki ogrencileri
        // 11/T olarak guncelleyin


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

            if (eachValueArr[2].equalsIgnoreCase("11") &&eachValueArr[3].equalsIgnoreCase("M")) {
                eachValueArr[3] = "T";
            }


            //6. adim arrayde yaptigimiz degiskligi map de update yapabilmek icin
            //array i yeni vau olarka birlestirelim

            eachEntry.setValue(String.join("-", eachValueArr));


        }
        System.out.println(ogrenciMap);



    }
}
