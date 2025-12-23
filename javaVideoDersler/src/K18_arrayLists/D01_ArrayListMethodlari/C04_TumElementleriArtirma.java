package K18_arrayLists.D01_ArrayListMethodlari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_TumElementleriArtirma {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(4,6,1,9,3));
        System.out.println(sayilar);

        System.out.println(elementleriArtir(sayilar, 5));


        //saylar listesindeki tüm elemetleri 4 artırın

        for (int i = 0; i < sayilar.size(); i++) {

            int eskiDeger = sayilar.get(i);
            sayilar.set(i, eskiDeger + 4);

        }
        System.out.println(sayilar);
    }

    //verilenInteger bir listedeki tüm elementleri
    //istenen bir değer kadar artırıp lsiteenin son halini döndüren
    //bir methdd oluşturun


    public static List<Integer> elementleriArtir(List<Integer> sayilar,int artisMiktari){

        for (int i = 0; i < sayilar.size(); i++) {

            int eskiDeger = sayilar.get(i);
            sayilar.set(i, eskiDeger + artisMiktari);

        } return sayilar;

    }



}
