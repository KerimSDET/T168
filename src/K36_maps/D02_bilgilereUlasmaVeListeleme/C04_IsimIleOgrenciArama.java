package K36_maps.D02_bilgilereUlasmaVeListeleme;

import java.util.Set;

public class C04_IsimIleOgrenciArama extends OgrenciMap {


    public static void main(String[] args) {

        //1 - tum key'leri kaydederiz
//                ogrenciMap.keySet() method'u Set olarak tum key'leri getirir


        String verilenIsım = "Ali";

        Set<Integer> ogrenciKeySet = ogrenciMap.keySet();


        //            2- bir for-each loop ile her bir key'i ele alalim


        System.out.println("Ismi "+verilenIsım+" olan öğrencilerin listesi");
        for(Integer each:ogrenciKeySet){
            //            3- bizim oglanin getirdigi key'e ait value'yu kaydedelim
            String eachValue =ogrenciMap.get(each);


            //ogrenciKeyseti .forEach(System.out::println);


            //            4- value'yu split ile bolup
//               bir array olarak kaydedelim ki bilgilere direk ulasabilelim

            String[] eachValueArr = eachValue.split("-");




        //            5- kaydettigimiz valueArr'inde istenen bilgiyi kontrol edip
//               istenen sarti saglayan ogrencilerin, istenen bilgilerini yazdirin

            if (eachValueArr[0].equalsIgnoreCase(verilenIsım)){
                //numara sinif sube isim ve soyisimlerini yazdirin
                System.out.println(
                        each+" "+
                                eachValueArr[2]+" "+
                                eachValueArr[3]+" "+
                                eachValueArr[0]+" "+
                                eachValueArr[1]
                );
            }
    }

    }


}
