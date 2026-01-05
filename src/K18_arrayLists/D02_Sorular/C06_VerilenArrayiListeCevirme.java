package K18_arrayLists.D02_Sorular;

import java.util.ArrayList;
import java.util.List;

public class C06_VerilenArrayiListeCevirme {
    public static void main(String[] args) {

        int[] arr ={3,5,6,7,8,9,2,3,5,3,4,6,2,7};

        //arr array'ini bir List olarak kaydedin

        //boş bir list oluşturup
        //for loop ile arraydeki elementleri listeye ekleyin.


        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            sayilar.add(arr[i]);

        }

        sayilar.add(10);
        sayilar.add(20);

        sayilar.remove(0);
        sayilar.remove(0);

        System.out.println("For loop ile oluşan liste :"+sayilar);



    }
}
