package K18_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C02_ListMethodlari {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList(Arrays.asList(5, 7, 2, 9, 1, 2, 5, 9, 3));
        System.out.println(sayilar);
        System.out.println(sayilar.size());
        System.out.println(sayilar.contains(7));
        System.out.println(sayilar.contains(10));
        System.out.println(sayilar.indexOf(2));
        System.out.println(sayilar.lastIndexOf(2));
        System.out.println(sayilar.indexOf(11));
        if (sayilar.indexOf(2) == -1) {
            System.out.println("Listede 2 yok");
        } else if (sayilar.indexOf(2) == sayilar.lastIndexOf(2)) {
            System.out.println("Listede 2 sadece 1 tane var");
        } else {
            System.out.println("Listede 2 birden fazla var.");
        }

        if (sayilar.indexOf(1) == -1) {
            System.out.println("Listede 1 yok");
        } else if (sayilar.indexOf(1) == sayilar.lastIndexOf(1)) {
            System.out.println("Listede 1 sadece 1 tane var");
        } else {
            System.out.println("Listede 1 birden fazla var.");
        }

        Collections.sort(sayilar);
        System.out.println(sayilar);
        sayilar.clear();
        System.out.println(sayilar);
    }
}
