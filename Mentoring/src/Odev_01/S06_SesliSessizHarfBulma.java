package Odev_01;

import java.util.Scanner;

public class S06_SesliSessizHarfBulma {

    public static void main(String[] args) {
        /*6----
    Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
    değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
    1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

    Sesli harfler: a,e,i,o,u

    Test Data:
    a

    Beklenen Çıktı:
    a harfi sesli harfdir.

    Test Data:
    d

    Beklenen Çıktı:
    d harfi sesiz harftir.

    Test Data:
    we  yada %

    Beklenen Çıktı:
    Yanlis karakter girdiniz!

    */

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz :");
        String girilenKarakter = scanner1.nextLine();

        if (girilenKarakter.length() !=1)
        {
            System.out.println("2 veya daha fazla data girdiniz. Fazlaya gerek yok.");
        }

        char ch = girilenKarakter.charAt(0);

        if (!((ch>='a' && ch<='z') ||(ch>='A' && ch<'Z'))) {

            System.out.println("Lütfen karakter giriniz..!!");

        }

         //Sesli harfler: a,e,i,o,u
        if (
                ch=='a' || ch=='A' ||
                ch=='e' || ch=='E' ||
                ch=='i' || ch=='I' ||
                ch=='o' || ch=='O' ||
                ch=='u' || ch=='U'
        ) {
            System.out.println("Girilen karakter sesli harftir.");
        } else  {
            System.out.println("Girilen karakter sesli harf değildir.");
        }

    }
}
