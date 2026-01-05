package K34_iterator_ListIterator;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C03_ListIterator {


    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>( Arrays.asList(4, 6, 7, 2, 3, 5, 6));
        // INDEX kullanmadan sayilar listesindeki sayilari
        // 1'er artirin

        ListIterator listIterator = sayilar.listIterator();

        System.out.println("Artırmadan önce değerler :"+sayilar);
        while (listIterator.hasNext()) {

            Integer eskiDeger = (Integer) listIterator.next();

            listIterator.set(eskiDeger+1);

        }

        System.out.println("Artırmadan sonra değerler : "+sayilar);


        //sayilar listesindeki sayıları
        //INDEX kullanmadan sondan başa doğru yazdırın

        //sayılar listesindeki sayıları
        //INDEX kullanmadan sondan başa doğru yazıdrın.

        System.out.print("Sondan başa doğru değerler : ");

        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous()+" ");
        }

        System.out.println("");
        System.out.println("Tersten elemanları yazdırdıkdan sonra : "+sayilar);


        /*
        Index kullanmadan sayılar listesindeki çift sayıalrı siliniz.
        Iterator nereden ? şuan en başta
         */

        while (listIterator.hasNext()){
            if ((Integer)listIterator.next() %2 ==0){
                listIterator.remove();
            }
        }
        System.out.println("Çift sayıları sildikten sonra sayıları : "+sayilar);
    }
}
