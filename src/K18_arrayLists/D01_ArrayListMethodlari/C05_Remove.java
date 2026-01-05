package K18_arrayLists.D01_ArrayListMethodlari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_Remove {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(4,6,1,9,3));

        List<String> isimler = new ArrayList<>(Arrays.asList("Ali","Veli","Cemil","Fatma","Hatice"));


        //isimler listesinden Ali'yi silin

        isimler.remove("Ali");

        System.out.println(isimler);


        //isimler listesinden2.index'deki elementleri silin

        isimler.remove(2);
        System.out.println(isimler);


        System.out.println(sayilar);

        //sayilar listesindeki 1'i silin

        sayilar.remove(1);

        System.out.println(sayilar );


        //sayilar listesindeki 9'i silin

        //sayilar.remove(9);

        //System.out.println(sayilar);

        //hata verir
//        Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 9 out of bounds for length 4
//        at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
//        at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
//        at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
//        at java.base/java.util.Objects.checkIndex(Objects.java:385)
//        at java.base/java.util.ArrayList.remove(ArrayList.java:551)


        /*
        Eğer list sayılardan oluşuyorsa
        Java girilen değeri direkt index olarak alır.
        Eğer sayı olan 4'ü silmek isterseniz
        bunu önce object (non primitive) olarak oluşturmalısınız

         */


        Integer silinecekSayi = 9;

        sayilar.remove(silinecekSayi);

        System.out.println(sayilar);
    }
}
