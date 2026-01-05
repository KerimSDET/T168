package K18_arrayLists.D01_ArrayListMethodlari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C07_ArraydenTekrarEdenSayilar {

    public static void main(String[] args) {

        /*
        verilen bir araay'de tekrar eden sayı varsa
        tekrar eden sayıları silip,
        array'i her sayıdan sadece 1 tane bulunacak şekilde kaydedin
        ornek input: {2,3,4,5,2,4,2,2,4,2,4,3,5,1}
        output: {1,2,3,4,5=
         */


        int[] arr = {2,3,4,5,2,4,2,2,4,2,4,3,5,1};

        List<Integer> tekrarsizList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!tekrarsizList.contains(arr[i])){
                tekrarsizList.add(arr[i]);
            }
        }
        System.out.println("Tekrarsız Liste : "+tekrarsizList);

        Collections.sort(tekrarsizList);

        System.out.println(Arrays.toString(arr));

        //biz tekrarsız elementleri tekrarsısListeye koyduk.
        //görev listeyi tekrarsız hale getirmemizi istediği için
        //bu durumda array uunluğunu değiştirmeyeceğimiz için
        //array'e yeni bir değer atamalıyız

        arr = new int[tekrarsizList.size()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = tekrarsizList.get(i);
        }

        System.out.println("Array'in tekrarsız hali :"+tekrarsizList);




    }
}
