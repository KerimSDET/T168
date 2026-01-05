package K34_iterator_ListIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C01_Iterator {

    public static void main(String[] args) {


        int[] arr = {3,5,6,1,2,4,5};

        //arr'nin tüm elementlerini 1'er artırın


//        for (int i = 0; i < arr.length; i++) {
//
//            arr[i] +=1;
//
//        }
//
//        System.out.println( Arrays.toString(arr) );

        for (int each:arr){
            System.out.print((each += 2) + " ");
        }

        /*
         INDEX kullanmadan array'deki tum elemanlari
         for-each loop ile elden gecirebiliriz
         ANCAKKK for-each loop ile kalici degisiklik yapamayiz
         */

        List<Integer> sayilar = new ArrayList<>( Arrays.asList(5, 6, 7));

        Iterator itr = sayilar.iterator();

        System.out.println(itr.hasNext());
        //System.out.println(itr.next());

        if (((Integer)itr.next()%2!=0)){

            itr.remove();
        }

        if (((Integer)itr.next()%2!=0)){

            itr.remove();
        }

        if (((Integer)itr.next()%2!=0)){

            itr.remove();
        }
        System.out.println(sayilar);
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }
    }
}
