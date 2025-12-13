package Odev_01;

import java.util.Scanner;

public class S07_UglyNumber_method {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tam sayı giriniz :");
        int girilenSayi = scanner.nextInt();
        int uglyNumber = girilenSayi;

        if (girilenSayi <= 0) {
            System.out.println("0 veya negatif sayı girilemez. Lütfen başka bir sayı veriniz.");
        } else if (isUgly(girilenSayi)) {
            System.out.println(girilenSayi + " bir UGLY sayıdır.");
        } else {
            System.out.println(girilenSayi + " bir UGLY sayı değildir.");
        }

    }


    public static boolean isUgly(int number) {

        if (number<=0){
            return false;
        }

        while (number%2==0){
            number/=2;
        }

        while (number%3==0){
            number/=3;
        }

        while (number%5==0){
            number/=5;
        }
        return number==1;

    }
}


