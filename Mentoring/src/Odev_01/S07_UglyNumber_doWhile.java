package Odev_01;

import java.util.Scanner;

public class S07_UglyNumber_doWhile {

    public static void main(String[] args) {


        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tam sayı giriniz :");
        int girilenSayi = scanner.nextInt();
        int uglyNumber =girilenSayi;

        if (girilenSayi<=0){
            System.out.println("0 veya negatif sayı girilemez. Lütfen başka bir sayı veriniz :");
            return; //hata varsa burada programı bitiriyoruz.

        }


        if (uglyNumber%2==0){
            do {
                uglyNumber/=2;
            } while (uglyNumber%2==0);
        }

        if (uglyNumber%3==0){
            do {
                uglyNumber/=3;
            } while (uglyNumber%3==0);
        }

        if (uglyNumber%5==0){
            do {
                uglyNumber/=5;
            } while (uglyNumber%5==0);
        }

        if (uglyNumber==1){
            System.out.println(girilenSayi+ " bir UGLY'dir");
        } else System.out.println(girilenSayi+" bir UGLY DEĞİLDİR. Bölme işlemleri sonrası kalan sayı :"+uglyNumber);



    }
}
