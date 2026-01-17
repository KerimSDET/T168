package K36_maps.D03_bilgiUpdate;

import K36_maps.D02_bilgilereUlasmaVeListeleme.OgrenciMap;

public class C03_YeniOgrenciEkleme {

    public static void main(String[] args) {


        //kullanicidan numara isim soyisim sinif sube e bılum bilgilerini alin
        // ogrenci map'e kaydeden bir method oluşturun

        OgrenciMap.kullanicidanAlinanBilgilerleOgrenciEkle();
        System.out.println(OgrenciMap.ogrenciMap);
    }
}
