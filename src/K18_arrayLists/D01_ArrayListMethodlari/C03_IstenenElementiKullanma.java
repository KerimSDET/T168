

package K18_arrayLists.D01_ArrayListMethodlari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_IstenenElementiKullanma {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 6, 8, 1};
        int toplam = 0;

        for(int i = 0; i < arr.length; ++i) {
            toplam += arr[i];
        }

        System.out.println(toplam);
        List<Integer> sayilar = new ArrayList(Arrays.asList(3, 6, 8, 1, 4, 0));
        System.out.println(sayilar.get(2));
        System.out.println(sayilar.get(0));
        System.out.println(sayilar.get(4));
        System.out.println(sayilar.get(5));
        toplam = 0;

        for(int i = 0; i < sayilar.size(); ++i) {
            toplam += (Integer)sayilar.get(i);
        }

        System.out.println("Sayıları listinde tüm elementlerin toplamı : " + toplam);
        System.out.println(sayilar);
        sayilar.set(2, 5);
        System.out.println(sayilar);
        System.out.println(sayilar.get(4));
        sayilar.set(4, 11);
        System.out.println(sayilar);
        sayilar.add(4, 23);
        System.out.println(sayilar);
    }
}
