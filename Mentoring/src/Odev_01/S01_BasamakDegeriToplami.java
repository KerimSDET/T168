package Odev_01;

import java.util.Scanner;

public class S01_BasamakDegeriToplami {
    public static void main(String[] args) {
         /*1---
    Sayinin Sayi degerlerinin toplamasini yapan Java kodu yaziniz.

    Test Data
    34
    Beklenen Cikti
    7
    */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Rakamlar toplamını hesaplamak için lütfen iki basamaklı bir sayi giriniz :");
        int girilenSayi = scanner.nextInt();


       int rakamlarToplami = 0;

        if (girilenSayi<0){
            girilenSayi =girilenSayi* (-1);
            rakamlarToplami +=girilenSayi%10;
            rakamlarToplami +=girilenSayi/10;
        } else {
       rakamlarToplami +=girilenSayi%10;
       rakamlarToplami +=girilenSayi/10;
        }
        System.out.println("Rakamlar toplamı : "+rakamlarToplami);
    }
}
