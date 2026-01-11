package K35_collections.D02_Set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class C03_RastgeleElemanlarlaSetOlusturma {

    public static void main(String[] args) {

        /*
        içinde 20'den küçük rastgele 7 adet pozitif tamsayının olduğu
        bir Set oluşturun.
         */

        Random random = new Random();

        Set<Integer> setSayilar = new TreeSet<>();

        for (int i = 1; i <= 7 ; i++) {

            setSayilar.add(random.nextInt(20));

        }
        System.out.println(setSayilar);

        // ayni sayilar geldiginde set onlari yeni bir sayi gibi eklemez
        // biz 7 sayi ekliyoruz ama random sayinin 7 farkli deger uretecegini garanti edemeyiz

        Set<Integer> setSayilar2 = new TreeSet<>();

        while (setSayilar2.size() < 7) {
            setSayilar2.add(random.nextInt(20));
        }
        System.out.println("While ile oluşturulan set : "+setSayilar2);



    }
}
