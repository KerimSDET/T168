package K18_arrayLists.D01_ArrayListMethodlari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_SonucVsReturn {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>(Arrays.asList(4,6,1,9,3));

        List<String> isimler = new ArrayList<>(Arrays.asList("Ali","Veli","Cemil","Fatma","Hatice"));



        System.out.println(sayilar); //[4, 6, 1, 9, 3]

        //sayılar listesindeki 2. index'deki elementi 5 yapın

        System.out.println(sayilar.set(2, 5));

        System.out.println(sayilar); //[4, 6, 5, 9, 3]


        System.out.println(isimler);

        //isimler listesinden Aliyi silin

        System.out.println(isimler.remove("Ali"));
        System.out.println(isimler);


        //isimler listesindeki Merti'i silin

        System.out.println(isimler.remove("Mert"));

        System.out.println(isimler);

        //isimler listesinden 2. indexdeki elementi sil
        System.out.println(isimler.remove(2));
        System.out.println(isimler);


        //sayilar listindeki 3. indexideki elementi silin

        System.out.println(sayilar);

        System.out.println(sayilar.remove(3));
        System.out.println(sayilar);


        //sayilar istesinden 4 ü silin

        Integer silindeceSayi = 4;

        System.out.println(sayilar.remove(silindeceSayi));

        System.out.println(sayilar);

    }
}
