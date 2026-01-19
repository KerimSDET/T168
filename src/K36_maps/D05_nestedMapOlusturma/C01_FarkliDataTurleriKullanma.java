package K36_maps.D05_nestedMapOlusturma;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class C01_FarkliDataTurleriKullanma {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

//        sayilar.add(12);
//        //sayilar.add("Kerim"); int olan liste başka tür eleman eklenemez

        List<Object> herseyListe = new ArrayList<>(); //Object herşeyin parenti oldugu için artık herşeyi liste ekleriz

        herseyListe.add(12);
        herseyListe.add("Kerem");
        herseyListe.add('k');
        herseyListe.add(true);

        Integer[] arr = {4,5,6,7,8};
        herseyListe.add(arr);
        List<String> isimler = new ArrayList<>(Arrays.asList("Kerem","Taner","Tirpan"));

        herseyListe.add(isimler);

        /*
        sayilar listesi deklare edilirken Integer'lardan olusagi soylendigi icin
        Integer olmayan hic bir datayi ekleyemedik.
         */

        /*
        bir listeye herseyi eklemek KOLAYLIK gibi gorunse de elemanlara ulasma ve
        kullanma acisindan zorluk olusturabilir
         */

        System.out.println(herseyListe);
        //[12, Kerem, k, true, [Ljava.lang.Integer;@3feba861, [Kerem, Taner, Tirpan]]
        //Arrayler toString methoduyla cagirilabildigi icin bu sekilde dogru veri alinamadi

        System.out.println((Integer)herseyListe.get(0)*2); //0 indexteki elemanı çarp dedik , cast edersek sorun kalmaz 24 verdi

        //System.out.println((Integer)herseyListe.get(1)*2); //hata verir. java.lang.ClassCastException çünkü stringi çarpak istedik

        //1. index'deki String'in  length'ini yazdirin.

        System.out.println(((String) herseyListe.get(1)).length()); //ilk elemanı yazdırmak istedigimizde o elemaiinin turunu vermeden islem yapmaz
        //cunku kendisi object tir.

        //4. indexteki array'i yazdıralım

        System.out.println(Arrays.toString((Integer[]) herseyListe.get(4))); //[4, 5, 6, 7, 8]

        //4. indexteki arrayin length ini yazdıralim

        System.out.println(((Integer[]) herseyListe.get(4)).length); //5


    }
}
