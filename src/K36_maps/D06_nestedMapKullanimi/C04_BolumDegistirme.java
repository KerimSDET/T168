package K36_maps.D06_nestedMapKullanimi;

import java.util.Set;

public class C04_BolumDegistirme extends NestedOgrenciMap{

    public static void main(String[] args) {

        String eskiBolum = "TM";
        String yeniBolum = "EA";

        //ogrenciNestedMap te bolumu eskibloum olan ogrencilerin yenibolum olark update et


        //1. adim tum keyleri bir set olarak kaydedin


        Set<Integer> ogrenciNoSet = ogrenciNestedMapi.keySet();
        System.out.println(ogrenciNoSet); //[102, 103, 104, 105, 106, 107, 109, 110]

        //2. adim ogrenci no setindeki nolari bir for each loop ile gozden gecirip
        // istenen sartlari saglayan ogrenciler icin istenen islmleri yapin

        for (Integer eachNo:ogrenciNoSet) {
            String ogrEskiBolum = (String) ogrenciNestedMapi.get(eachNo).get("bolum");
            if (ogrEskiBolum.equalsIgnoreCase(eskiBolum)) {
                ogrenciNestedMapi.get(eachNo).put("bolum", yeniBolum);
            }
        }

        System.out.println(ogrenciNestedMapi);


    }
}
