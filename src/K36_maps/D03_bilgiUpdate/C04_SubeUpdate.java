package K36_maps.D03_bilgiUpdate;

import K36_maps.D02_bilgilereUlasmaVeListeleme.OgrenciMap;

import java.util.Set;

public class C04_SubeUpdate extends OgrenciMap {
    public static void main(String[] args) {

        //10/K sinifindaki ogrencilerin subelerini Z yapin

        Integer sinif =10;
        String eskiSube ="K";
        String yeniSube ="Z";

        /*
        Key olmadan update yapamayacağımız için
        yola value collection ile değil
        keyset ile çıkmalıyız
         */

        //tum keyleri kaydedelim
        //ogrenciMap.keyset() methodu Set olarak tum key'leri getirir

        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();

        //bir for each loop ile her bir key'i ele alalım

        for (Integer key : ogrenciKeySeti) {

           //bizim oglanin getirdiği key'e ait value'yu kaydedelim

            String eachValue = ogrenciMap.get(key);

            //Value'yu split ile bolup
            //bir array olarka kaydedelim ki bilgilere direk ulaşabilelim

            String[] eachValueArr = eachValue.split("-");

            //kaydettiğimiz valueArr'sinde istenen bilgiyi kontrol edip
            //istenen şartı sağlayan ogrencilerin istenen bilgilerini update edip
            //10 K sinifindaki ogrencikerin subesini Z yapalim

            if (eachValueArr[2].equalsIgnoreCase(sinif+"") && eachValueArr[3].equalsIgnoreCase(eskiSube)) {
                eachValueArr[3] = yeniSube;
            }

            //bu değişiklik arrayde yapıldı bunu mape yüklemek için birleştirme yap

            String yeniValue = String.join("-", eachValueArr);

            //key ve yeniValue değeerini mape update edelim

            ogrenciMap.put(key,yeniValue);

        }

        /*
        6 ve 7. adımlar if içinde yazdık ki
        tüm öğrencileri yeniden map'e eklemeye çalışmasın
        sadece sinif ve subesi istenen degere esit olan
        ogrencileri guncellesin ve map'e ekleyip update etsin
         */
        System.out.println(ogrenciMap);
    }
}
