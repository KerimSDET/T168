package K36_maps.D07_computeMethodlari;

import java.util.Map;
import java.util.TreeMap;

public class C01_ElementleriSayma {
    public static void main(String[] args) {


        //verilen bir String array'de
        // her bir elemneti ve kaçar adefa kullanıldığını yazdırın


        String[] harfler = {"a", "b","d","a","r","a","b","d","d","a", "a" ,"d","t","d"};
        //Harf sayma: {a=5, b=2, d=5, r=1, t=1}

        Map<String, Integer> harfSayMap = new TreeMap<>();

        for (String eachHarf : harfler) {  //for each loop
            if (harfSayMap.containsKey(eachHarf)) {
                int eskiHarfSayma = harfSayMap.get(eachHarf);
                harfSayMap.put(eachHarf, eskiHarfSayma + 1);
                // daha önce Mapte var eski kulanim sayisini alip
                // eski kullanim sayisinin 1 fazlası olarak update ediyoruz.
            } else{
                harfSayMap.put(eachHarf, 1); // daha önce Map içinde yok. Değrieni 1 olarak Mape ekliyrouz
            }
        }
        System.out.println("Harf sayma: " + harfSayMap);

    }
}
