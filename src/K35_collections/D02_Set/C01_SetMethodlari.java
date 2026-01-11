package K35_collections.D02_Set;

import java.util.*;

public class C01_SetMethodlari {
    public static void main(String[] args) {

        Set<Integer> sayilar = new HashSet<>();

        System.out.println(sayilar);
        System.out.println(sayilar.hashCode());

        sayilar.add(1);
        System.out.println(sayilar);
        System.out.println(sayilar.hashCode());

        sayilar.add(2);
        System.out.println(sayilar);
        System.out.println(sayilar.hashCode());

        List<Integer> sayilarList = new ArrayList<>(Arrays.asList(4,5,6));
        System.out.println(sayilarList);
        System.out.println(sayilarList.hashCode());

        Set<String> harfler = new HashSet<>();
        harfler.add("Harf");
        harfler.add("k");
        harfler.add("e");
        harfler.add("r");
        harfler.add("e");
        harfler.add("m");

        System.out.println(harfler); //kendince bir karışıklıkta listeler
        System.out.println(harfler); //aynı çıktı


    }
}
