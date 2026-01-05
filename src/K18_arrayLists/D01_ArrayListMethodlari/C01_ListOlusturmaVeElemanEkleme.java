package K18_arrayLists.D01_ArrayListMethodlari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ListOlusturmaVeElemanEkleme {
    public static void main(String[] args) {
        List<String> isimler = new ArrayList();
        System.out.println(isimler);
        List<Integer> sayilar = new ArrayList();
        sayilar.add(3);
        sayilar.add(6);
        sayilar.add(8);
        sayilar.add(9);
        System.out.println(sayilar);
        sayilar.add(3, 2);
        sayilar.add(1, 5);
        System.out.println(sayilar);
        List<Integer> yeniList = new ArrayList(Arrays.asList(3, 4, 5, 6, 2, 3, 4, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println(yeniList);
        List<Integer> ekList = new ArrayList(Arrays.asList(10, 20, 30));
        System.out.println(ekList);
        sayilar.addAll(ekList);
        System.out.println(sayilar);
        sayilar.addAll(3, yeniList);
        System.out.println(sayilar);
    }
}
