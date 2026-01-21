package K36_maps.D08_treeMapMethodlari;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class C01_TreeMapMethodlari {

    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A",22);
        map1.put("Z",33);
        map1.put("B",44);
        map1.put("Y",55);
        map1.put("K",66);

        System.out.println(map1); //{A=22, B=33, C=44, D=55, E=66}

        map1.put("T",77);
        map1.put("L",88);
        System.out.println(map1); //{A=22, B=44, T=77, Y=55, Z=33, K=66, L=88} siralama garantisi yok


        Map<String, Integer> map2 = new TreeMap<>();
        map2.put("A",22);
        map2.put("Z",33);
        map2.put("B",44);
        map2.put("Y",55);
        map2.put("K",66);

        System.out.println(map2); //{A=22, B=33, C=44, D=55, E=66}

        map2.put("T",77);
        map2.put("L",88);
        System.out.println(map2); //{A=22, B=44, K=66, L=88, T=77, Y=55, Z=33} siralama garantisi var

        /*
        Constructor TreeMap secilmis olsa da Data turu olarak Map secildigi icin
        map2 BUTUN MAP'lerle ortak method isimlerine sahiptir.

        TreeMap class'ina sonradan eklenen ve sadece TreeMap'lerin sahip oldugu methodlar
        map2'de gorunmez
         */

        TreeMap <String, Integer> map3 = new TreeMap<>();
        map3.put("A",22);
        map3.put("Z",33);

        System.out.println(map3); //{A=22, Z=33}

        /*
        Constructor ve data turu TreeMap secildigi icin TreeMap'e eklenen ve parent'i olan Map'de olmayan
        pekcok ozelligi kullanabiliriz
         */


    }
}
