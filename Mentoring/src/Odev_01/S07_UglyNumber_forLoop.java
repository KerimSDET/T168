package Odev_01;

import java.util.Scanner;

public class S07_UglyNumber_forLoop {

    public static void main(String[] args) {




        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tam sayı giriniz :");
        int girilenSayi = scanner.nextInt();

        if (girilenSayi<=0){
            System.out.println("0 veya negatif sayı girilemez. Lütfen başka bir sayı veriniz :");
            return; //hata varsa burada programı bitiriyoruz.

        }

        int uglyNumber =girilenSayi;


        for (; uglyNumber%2==0 ; uglyNumber/=2) {

        }

        for (; uglyNumber%3==0 ; uglyNumber/=3) {

        }

        for (; uglyNumber%5==0 ; uglyNumber/=5) {

        }



        System.out.println("Girilen rakam : "+girilenSayi+" Son hali :"+ uglyNumber);
        System.out.println();


        if (uglyNumber==1){
            System.out.println(girilenSayi+ " bir UGLY'dir");
        } else System.out.println(girilenSayi+" bir UGLY DEĞİLDİR. Bölme işlemleri sonrası kalan sayı :"+uglyNumber);



    }
    }

