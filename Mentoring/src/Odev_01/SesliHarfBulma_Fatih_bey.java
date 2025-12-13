package Odev_01;

import java.util.Scanner;

public class SesliHarfBulma_Fatih_bey {

    public static void main(String[] args) {


        //        Kullanıcıdan bir harf girmesini isteyiniz.
//        Girilen harf sesli ise Sesli harf olduğunu, değilse sessiz harf olduğunu ekrana yazdırsın.
//        Girdiği değer harf değilse yada 1 karakterden fazla ise hata mesajı göstersin.
//        (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
//
//        Sesli harfler: a,e,i,o,u
//        Test Data: a
//        Beklenen Çıktı:
//        a harfi sesli harfdir.
//
//        Test Data: d
//        Beklenen Çıktı:
//        d harfi sesiz harftir.
//
//        Test Data:
//        we  yada %
//        Beklenen Çıktı:
//        Yanlis karakter girdiniz!
            Scanner verial = new Scanner(System.in);
            System.out.print("Bir harf giriniz: ");
            String girilenharf = verial.nextLine();
            //Baş ve sondaki boşlukları atalım
            girilenharf = girilenharf.trim();
            if  (
                    (girilenharf.length() > 1) ||   // Birden fazla karakter girildi mi?
                            (!girilenharf.matches("[\\wçÇğĞıİöÖşŞüÜ]")) || // Kelime karakteri hariç girildi mi?
                            (girilenharf.matches("[\\d_]")) // Rakam veya _ girildi mi?
            ) {
                System.out.println("Yanlış karakter girdiniz!");
            }
            // Sesli harf girildi mi kontrol edelim, ekrana yazalım.
            else if (girilenharf.matches("[aeıiöuüAEIİÖUÜ]")) {
                System.out.println(girilenharf + " harfi sesli bir harftir.");
            }
            // Geriye sadece sessiz harfler kaldığı için yazdıralım
            else {
                System.out.println(girilenharf + " harfi sessiz harftir.");
            }
        }
    }

