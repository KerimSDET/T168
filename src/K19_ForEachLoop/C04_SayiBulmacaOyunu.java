package K19_ForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C04_SayiBulmacaOyunu {

    public static void main(String[] args) {

        /*
        0-100 arasıdna rastgele bir sayı oluşturun
        Kullanıcılardan herkesin bir sayı tahmin etmesini isteyin
        girilen sayıları bir liste olarak kaydedin
        kullanılar negatif bir sayı girdiğinde
        -oluşturulan rastgele sayıyı
        -yapılan tahminleri
        -rastgele sayıya en yakın tahmini yazıdırın
         */

        Random random = new Random();
        int tutulanSayi = random.nextInt(100);


        int girilenSayi=0;

        List<Integer> tahminlerListesi = new ArrayList<>();

        Scanner scanner =new Scanner(System.in);

        do {
            System.out.println("Lütfen bir tahmininizi giriniz : " +
                    "\n sonucu görmek için negatif sayı giriniz. ");
            girilenSayi = scanner.nextInt();
            if (girilenSayi>=0){
                tahminlerListesi.add(girilenSayi); //burada tutulan tahminler listesi yaptık
            }

        } while (girilenSayi>=0);

        //oluşturulan rastgele sayı:
        System.out.println("Tuttuğum sayı :"+tutulanSayi);

        //yapılan tahminler
        System.out.println("Yapılan tahminler listesi : "+tahminlerListesi);

        //rastgele sayıya en yakın tahmini yazdırın

        int tutulanSayiyaEnYakinTahmin = tahminlerListesi.get(0);
        int enYakinTahmininSayiIleFarki ;

        if (tutulanSayiyaEnYakinTahmin>tutulanSayi){
            enYakinTahmininSayiIleFarki = tutulanSayiyaEnYakinTahmin - tutulanSayi;
        } else {
            enYakinTahmininSayiIleFarki = tutulanSayi - tutulanSayiyaEnYakinTahmin ;
        }

        for (int each : tahminlerListesi) {
            int fark ;
            if (each >tutulanSayi){
                fark = each - tutulanSayi;
            } else {
                fark = tutulanSayi - each ;
            }

            if (fark < enYakinTahmininSayiIleFarki){

                tutulanSayiyaEnYakinTahmin=each;
                enYakinTahmininSayiIleFarki = fark;


            }

        } System.out.println("En Yakın Tahmin :"+tutulanSayiyaEnYakinTahmin);





    }
}
