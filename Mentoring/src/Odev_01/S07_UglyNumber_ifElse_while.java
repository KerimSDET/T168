package Odev_01;

import java.util.Scanner;

public class S07_UglyNumber_ifElse_while {

    public static void main(String[] args) {



        /*7-----
    Ugly Number:

    Girilen bir sayının  ugly number olup olmadığını kontrol etmek için bir Java programı yazın.


    Sayı sisteminde,  ugly number  sadece asal faktörleri carpanlari 2, 3 veya 5 olan pozitif sayılardan olusur...
    İlk 10  ugly number 1, 2, 3, 4, 5, 6, 8, 9, 10, 12'dir. Kural olarak, 1 dahil.

    Test Data:
    13

    Beklenen çıktı:
    ugly number  degildir

    Test Data:
    25
    Beklenen Çıktı:

    ugly number

    */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tam sayı giriniz :");
        int girilenSayi = scanner.nextInt();
        int uglyNumber = girilenSayi;

        if (girilenSayi <= 0) {
            System.out.println("0 veya negatif sayı girilemez. Lütfen başka bir sayı veriniz :");
            return; //hata varsa burada programı bitiriyoruz.
        }



            while (uglyNumber % 2 == 0) {
                uglyNumber /= 2;
            }
            while (uglyNumber % 3 == 0) {
                uglyNumber /= 3;
            }

            while (uglyNumber % 5 == 0) {
                uglyNumber /= 5;
            }


            System.out.println("Girilen rakam : " + girilenSayi + " Son hali :" + uglyNumber);
            System.out.println();


            if (uglyNumber == 1) {
                System.out.println(girilenSayi + " bir UGLY'dir");
            } else
                System.out.println(girilenSayi + " bir UGLY DEĞİLDİR. Bölme işlemleri sonrası kalan sayı :" + uglyNumber);


        }
    }
