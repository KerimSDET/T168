package K19_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ForEachLoop {
    public static void main(String[] args) {


        int[] arr = {3,4,5,2,3,4,5,1,2,3};
        List<Integer> sayilar = new ArrayList<>(Arrays.asList(2,8,5,6,7,4,2,3,4,5,6,4,5,4,13));

        //arr'deki elementlerin toplamını yazdırın

        int toplam=0;

        for (int i = 0; i < arr.length; i++) {

            toplam+=arr[i];

        }

        System.out.println("Arr'deki sayıların For Loop ile toplamı :" +toplam);



        toplam =0;

        for (int each :arr){

            toplam+=each;

        }


        System.out.println("For each loop ile toplamı :" + toplam);



        //sayılar listesindeki çift sayıların toplamını yazdırın

        toplam =0;

        for (int i = 0; i < sayilar.size(); i++) {

            if (sayilar.get(i)%2==0){
                toplam+=sayilar.get(i);
            }

        }System.out.println("Sayılar listesindeki çift sayıların for loop ile toplamı :"+toplam);

        //for each ile yapımı

        toplam=0;
        for (Integer each:sayilar){

            if (each%2==0){
                toplam+=each;
            }

        }
        System.out.println("Sayıların listesindeki  çift sayilarin for each ile toplamı :"+toplam);


        //sayılar listesindeki en büyük elementi yazdırın

        int enBuyukElement = sayilar.get(0);

        for (int i = 0; i < sayilar.size(); i++) {
            if (enBuyukElement<sayilar.get(i)){
                enBuyukElement = sayilar.get(i);
            }
        }
        System.out.println("En büyük element for loop ile : "+enBuyukElement);


        //for each ile yapalım

        enBuyukElement = sayilar.get(0);

        for (int each:sayilar){

            if (each>enBuyukElement){
                enBuyukElement=each;
            }

        }
        System.out.println("For each ile en büyük element : "+enBuyukElement);

    }
}
