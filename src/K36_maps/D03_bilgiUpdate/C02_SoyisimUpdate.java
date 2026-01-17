package K36_maps.D03_bilgiUpdate;

import K36_maps.D02_bilgilereUlasmaVeListeleme.OgrenciMap;

public class C02_SoyisimUpdate extends OgrenciMap {

    public static void main(String[] args) {

        //ogrenci map'inde numarası ve yeni soyismi verilen ogrencinin
        //eski soyisminin yerine yeni soyismini kaydedin


        int ogrenciNo =102;
        String yeniSoyisim = "Kaya";

        numaraIleSoyIsımUpdate(102,"Kaya");

        numaraIleSoyIsımUpdate(103,"Gunes");

        numaraIleSoyIsımUpdate(104,"Celik");

        System.out.println(ogrenciMap);
    }
}
