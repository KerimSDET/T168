package K18_arrayLists.D02_Sorular;

import java.util.ArrayList;
import java.util.List;

public class C03_TamBolenSayilarListesi {

    public static void main(String[] args) {


        System.out.println(pozitifTamBolenlerListesi(50));

        System.out.println(pozitifTamBolenlerListesi(90));

        System.out.println(pozitifTamBolenlerListesi(9000));

/*
    tamBolenlerListesi methodunu kullanarak
    2 basamaklı asal sayilari yazdırın
 */

        for (int i = 10; i <100 ; i++) {

            int tamBolenSayisi = pozitifTamBolenlerListesi(i).size();

            if (tamBolenSayisi ==2){
                System.out.print(i+" ");
            }

        }


    }

    /*
    verilen pozitif bir tamsayıyı
    tam bölebilen tüm pozitif tamsaları bir liste olraak
    bize döndüren bir method oluşturun

     */

    public static List<Integer> pozitifTamBolenlerListesi (int sayi){
        List<Integer> tamBolenlerListesi = new ArrayList<>();

        for (int i = 1; i <= sayi; i++) {

            if (sayi % i ==0){
                tamBolenlerListesi.add(i);
            }

        }
        return tamBolenlerListesi;
    }
}
