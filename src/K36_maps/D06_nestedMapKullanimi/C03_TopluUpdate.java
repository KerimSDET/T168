package K36_maps.D06_nestedMapKullanimi;

import java.util.Set;

public class C03_TopluUpdate extends NestedOgrenciMap{


    public static void main(String[] args) {


       //tum ogrencilerin soyisimlerini Buyuk harf yapin



        //1. adim tum keyleri bir set olarak kaydedin


        Set<Integer> ogrenciNoSet = ogrenciNestedMapi.keySet();
        System.out.println(ogrenciNoSet); //[102, 103, 104, 105, 106, 107, 109, 110]

        //2. adim ogrenci no setindeki nolari bir for each loop ile gozden gecirip
        // istenen sartlari saglayan ogrenciler icin istenen islmleri yapin

        for (Integer eachNo:ogrenciNoSet) {
            String eskiSoyisim = (String) ogrenciNestedMapi.get(eachNo).get("soyisim");
            ogrenciNestedMapi.get(eachNo).put("soyisim", eskiSoyisim.toUpperCase());
        }

        System.out.println(ogrenciNestedMapi);


    }


}
