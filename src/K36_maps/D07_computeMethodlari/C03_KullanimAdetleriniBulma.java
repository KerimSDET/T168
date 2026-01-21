package K36_maps.D07_computeMethodlari;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C03_KullanimAdetleriniBulma {
    public static void main(String[] args) {

        //verilen STring bir array'de her bir elementi ve kaçar defa kullanildigini yazdirin



        String[] harfler = {"a", "b","d","a","r","a","b","d","d","a", "a" ,"d","t","d"};


        Map<String,Integer> harfSaymaMap = new TreeMap<>();

        for (String herHarf:harfler){

            harfSaymaMap.computeIfPresent(herHarf,(k,v)->v+1);
            harfSaymaMap.putIfAbsent(herHarf,1);
        }
        System.out.println(harfSaymaMap); //{a=5, b=2, d=5, r=1, t=1}





    }
}
