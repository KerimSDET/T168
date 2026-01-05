package K17_arrays.D01_arrayOlusturmaVeKullanma;

import java.util.Arrays;

public class C04_TumElementleriKullanma {

    public static void main(String[] args) {

        int[] sayilar ={4,7,1,3,4,8,0,1};

        //sayılar arrayini yazdırın


        System.out.println(Arrays.toString(sayilar));


        //sayılar arrayinin tüm elementlerini yan yana yazdırın.

        for (int i = 0; i < sayilar.length; i++) {

            System.out.print(sayilar[i]+" ");



        }System.out.println();




        //sayılar array'indeki tüm elementerin toplamını yazdırın.

        int toplam = 0;

        for (int i = 0; i < sayilar.length; i++) {

            toplam+=sayilar[i];

        }
        System.out.println("Sayılar arrayindeki elemnelterin toplamı : "+toplam);



        //sayılar arrayindeki çift sayıların çarpımını yazdırın


        int carpim = 1;

        for (int i = 0; i < sayilar.length; i++) {

            if (sayilar[i]%2==0){
                carpim*=sayilar[i];
            }

        }
        System.out.println("Sayıların çarpımı : "+carpim);


    }
}
