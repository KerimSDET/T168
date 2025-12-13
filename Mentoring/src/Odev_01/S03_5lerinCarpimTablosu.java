package Odev_01;

import java.util.Scanner;

public class S03_5lerinCarpimTablosu {
    public static void main(String[] args) {
        /*3----
    Belirlenen sayının 1 den 10 a kadar çarpım sonuçlarını yapan Java programını yazınız.

    Örnek Sonuç:
    5 x 1 = 5
    5 x 2 = 10
    5 x 3 = 15
    5 x 4 = 20
    5 x 5 = 25
    5 x 6 = 30
    5 x 7 = 35
    5 x 8 = 40
    5 x 9 = 45
    5 x 10 = 50
    */

        int sayi5 = 5;
        for (int i = 1; i <=10 ; i++) {
            System.out.println(sayi5+" x "+i+" = "+sayi5*i);

        }


        System.out.println("------------");

        System.out.println("Bir değer alarak çarpım tablosu yapalım :");

        Scanner scanner1=new Scanner(System.in);
        System.out.println("Lütfen çarpım tablosunu görmek istediğiniz pozitif tam sayıyı giriniz :");
        int girilenSayi = scanner1.nextInt();

        if (girilenSayi<=0){
            System.out.println("Girdiğiniz rakam o veya negatif olduğu için uygun değildir. Lütfen pozitif bir syaı giriniz :");
        } else {

            for (int i = 1; i <=10 ; i++) {
                System.out.println(girilenSayi+" x "+i+" = "+girilenSayi*i);

            }
        }


    }
}
