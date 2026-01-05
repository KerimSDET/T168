package K34_iterator_ListIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C02_Iterator {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(4, 6, 7, 2, 3, 5, 6, 7, 2, 8));
        // INDEX kullanmadan sayilar listesindeki cift sayilari silin

        System.out.println(sayilar); // [  4,  6,  7,  2,  3,  5,  6,  7,  2,  8  ]



        System.out.println(sayilar);

        Iterator itr = sayilar.iterator();

        while (itr.hasNext()){
            //System.out.print(itr.next()+" ");

            if ((Integer)itr.next()%2==0){
                itr.remove();
            }

        }System.out.println("");
        System.out.println(sayilar);


        // sayilar listesinin yeni halinde
        // INDEX kullanmadan 5'den buyuk sayilari silin

        System.out.println(itr.hasNext());

        itr = sayilar.iterator();

        while (itr.hasNext()){

            if ((Integer)itr.next()>5){
                itr.remove();
            }
        }
        System.out.println(sayilar);
        /*
         yukarida olusturdugumuz itr objesini
         yeni soruda KULLANAMAYIZ
         bunun sebebi,
         iterator'in yapisi geregi next() ile sona kadar goturdugumuzden
         artik gidecek eleman kalmadigi icindir.
         yeni soru icin ya yeni obje olusturmali
         veya var olan itr'ye yeni deger atamaliyiz
         */

    }
}