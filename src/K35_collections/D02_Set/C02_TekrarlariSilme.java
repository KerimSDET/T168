package K35_collections.D02_Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class C02_TekrarlariSilme {

    public static void main(String[] args) {


        int[] sayilar = {2,4,5,4,3,5,6,7,3,2,4,5,8,2,3,4,5,1,2,3};

        sayilar =arrayiTekrarsizYap(sayilar);
        System.out.println("Method çağırınca : "+Arrays.toString(sayilar));

        int [] arr = {3,3,3,4,4,4,4,5,6,5,5,55,66,6,4,33};

        arr = arrayiTekrarsizYap(arr);

        System.out.println("arr methodar düzelttik  : " +Arrays.toString(arr));

        Set<Integer> tekrarsizSet = new TreeSet<>();

        for (int each : sayilar) {
            tekrarsizSet.add(each);
        }

        System.out.println("Tekrarsız Set'in son hali : "+tekrarsizSet); //[1, 2, 3, 4, 5, 6, 7, 8]
        System.out.println("Sayılar arrayinin son hali : "+Arrays.toString(sayilar)); //[2, 4, 5, 4, 3, 5, 6, 7, 3, 2, 4, 5, 8, 2, 3, 4, 5, 1, 2, 3]

        /*
        bizden istenen elementleri bir Set olarak elde ettik
        bize görevde sayılar arry'ini bu hale getirmemiz söyleniyor
        o zaman array'i tekrarsisSet'deki elemanlardan oluşan hale dönüştürelim
         */

        sayilar =new int[tekrarsizSet.size()]; // sayıilar arrayine yeni bir değer atadık
                                            // ARrayde eleman sayısı belirtlmesi zorunlu olduğu için
        //tekrarsizSet eleman  sayisi kadar Array kapasitesini belirteceğiz

        int index=0;
        for (int each : tekrarsizSet) {
            sayilar[index++]=each;
        }
        System.out.println("Sayılar arrayinin son hali : "+Arrays.toString(sayilar));


        // verilen bir array'de tekrar eden elementleri silip
        // array'i her elementin sadece 1 tane oldugu hale donusturen
        // ve bize donduren bir method olusturun


    }
    public static int[] arrayiTekrarsizYap (int[] sayilar){
        Set<Integer> tekrarsizSet = new TreeSet<>();

        for (int each : sayilar) {
            tekrarsizSet.add(each);
        }

        System.out.println("Tekrarsız Set'in son hali : "+tekrarsizSet); //[1, 2, 3, 4, 5, 6, 7, 8]
        System.out.println("Sayılar arrayinin son hali : "+Arrays.toString(sayilar)); //[2, 4, 5, 4, 3, 5, 6, 7, 3, 2, 4, 5, 8, 2, 3, 4, 5, 1, 2, 3]

        /*
        bizden istenen elementleri bir Set olarak elde ettik
        bize görevde sayılar arry'ini bu hale getirmemiz söyleniyor
        o zaman array'i tekrarsisSet'deki elemanlardan oluşan hale dönüştürelim
         */

        sayilar =new int[tekrarsizSet.size()]; // sayıilar arrayine yeni bir değer atadık
        // ARrayde eleman sayısı belirtlmesi zorunlu olduğu için
        //tekrarsizSet eleman  sayisi kadar Array kapasitesini belirteceğiz

        int index=0;
        for (int each : tekrarsizSet) {
            sayilar[index++]=each;
        }
        return sayilar;

} }
