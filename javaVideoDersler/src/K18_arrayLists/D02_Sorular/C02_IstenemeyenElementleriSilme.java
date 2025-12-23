package K18_arrayLists.D02_Sorular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_IstenemeyenElementleriSilme {
    public static void main(String[] args) {
        List<String> isimler = new ArrayList<String>(Arrays.asList("Ali","Veli","Cemil","Ayşe","Fatma","Hatice"));

        //isimler listesinde "e harfi içeren elementleri silin

        System.out.println(isimler);


        istenmeenElementleriSil(isimler,"l");

        System.out.println(isimler);


        for (int i = 0; i < isimler.size(); i++) {

            if (isimler.get(i).contains("e")){
                isimler.remove(isimler.get(i));

                i--;//index atlamasını engelleme için
            }

        }

        System.out.println(isimler); //[Ali, Cemil, Fatma] var neden Cemil si sislinmedi



    }

    /*
    soru3
    verilen String bir listede
    istenmeyen harf içeren elementleri silip
    kalan kısmını list larak bize döndüren bir methd oluşturun
     */

    public static List<String> istenmeenElementleriSil (List<String> isimler,String istenmeyenHarf){

        for (int i = 0; i < isimler.size(); i++) {

            if (isimler.get(i).contains(istenmeyenHarf)){
                isimler.remove(isimler.get(i));

                i--;//index atlamasını engelleme için
            }

        }
        return isimler;

    }


}
