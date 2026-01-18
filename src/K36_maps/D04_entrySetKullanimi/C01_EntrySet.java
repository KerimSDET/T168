package K36_maps.D04_entrySetKullanimi;

import K36_maps.D02_bilgilereUlasmaVeListeleme.OgrenciMap;


import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

public class C01_EntrySet extends OgrenciMap {


    public static void main(String[] args) {
        //ogrenci map'indeki key'leri yazdiriniz

        Set<Integer> ogrenciKeySet = ogrenciMap.keySet(); //burada tüm keyleri yazdırabiliriz

        System.out.println(ogrenciKeySet); //yazdırdık ve konsolda yazılan : [101, 102, 103, 104, 105, 106, 107] set olarak tamaını yazdırdık.

        for (Integer key : ogrenciKeySet) { //foreach loop yaptık,bu key deki her bir keyi yazdırmak için

            System.out.print(key+" "); //bütün key'lere ulaştık.

        }
        System.out.println();

        //ogrenci map'indeki tüm value'leri yazdıkmak istediğimizde:

        Collection<String> ogrenciValueCollection = ogrenciMap.values(); //tüm valueleri aldık

        System.out.println(ogrenciValueCollection); //[Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Can-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF, Esra-Han-11-M-SOZ]

        //tüm value'leri tek tek yazdırmak istersek de for each loop kullanırız

        for (String eachValue:ogrenciValueCollection){
            System.out.print(eachValue+" "); //Ali-Can-11-H-MFVeli-Cem-10-K-TMAli-Cem-11-K-TMAyse-Can-10-H-MFSevgi-Cem-11-M-TMSevgi-Can-10-K-MFEsra-Han-11-M-SOZ
        }
        System.out.println();

        //key'leri kullanarak value yazdırmak istersek

        for (Integer eachKey:ogrenciKeySet){
            System.out.print(ogrenciMap.get(eachKey) + " "); //Ali-Can-11-H-MF Veli-Cem-10-K-TM Ali-Cem-11-K-TM Ayse-Can-10-H-MF Sevgi-Cem-11-M-TM Sevgi-Can-10-K-MF Esra-Han-11-M-SOZ
        }

        System.out.println();

        /*
        biz bir map'deki keyeri e value leri ayri ayri elde edebilriz
        ve ayri ayri for each loop ile gozden geçirebiliriz.

        her bir ogrenciye ait key ve vlaue yu tek bir deger olarak ele alip
        tek bir for each loop ile gozden gecirebilri miyiz?

        Evet yaparız bunun icin EntrySet class vardır
         */

        /*
        Java'daki Entry class i key ve value yu birlike
        tek bir eleman olark ele almamiza imkan tanir
         */

        // ogrenciMap.entrySet(ogrenciKeySet,ogrenciValueCollection);
        System.out.println("Ogrenci map: "+ogrenciMap);

        /*
        {
        101=Ali-Can-11-H-MF,
        102=Veli-Cem-10-K-TM,
        103=Ali-Cem-11-K-TM,
        104=Ayse-Can-10-H-MF,
        105=Sevgi-Cem-11-M-TM,
        106=Sevgi-Can-10-K-MF,
        107=Esra-Han-11-M-SOZ}

         */

        System.out.println(ogrenciMap.size()); //7

        // Map yapisi gereği 7 ayrı key ve 7 ayrı value olarak tutar
        // key ve value leri birlikte tutabilmek icin java Entry Interface'ini oluşturmuştur

        Set<Map.Entry<Integer,String>> ogrenciEntrySeti = ogrenciMap.entrySet();
        System.out.println("Ogrenci Entry SEti : "+ogrenciEntrySeti);

//        goruntısı tamamen map gibi olsa sa bir set oldugu icin for each loop ile kullanılabilr.
//        boylece tum ogrencilerin key ve valuelerini birlikte ele alabilir ve dah aaz adim ile islemleri
//                yapabiliriz.

        //Entry seti kullanarak tum ogrencilern numara, isim ve soyisimlerini yazdirin

        // 1. adim entry set olustur
        //2. adim bir for each loop ile tum entry leri gozden gecirelim

        for (Map.Entry<Integer,String> eachEntry:ogrenciEntrySeti){
            //3. adim ogrenci vaue'sini kaydedelim
            String eachValue = eachEntry.getValue();
            //4. adim value verilene erişmek için split edelim

            String[] eachValueArr = eachValue.split("-");


            //istenen kontrollerri yapip istenen bilgileri yazdirin
            System.out.println(
                    eachEntry.getKey() +" "+
                            eachValueArr[0]+" "+
                            eachValueArr[1]
            );
        }
    }








}
