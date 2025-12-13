package K05_wrapperClass_MatematikselIslemler_Concatenation;

import java.util.Scanner;

public class C03_rakamlarToplami {

    public static void main(String[] args) {

        //Kullanıcıdan 3 basamaklı pozitif bir tamsayı isteyin
        //sayının rakamlar toplamını bulun
        //Örnek input 245 ise output 11 olmalı

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Lütfen 3 basamaklı poziif bir tamsayı giriniz : ");

        int sayi = scanner.nextInt(); //245

        int birlerBasamagindakiRakam = 0;
        int rakamlarToplami = 0;

        birlerBasamagindakiRakam = sayi%10;

        System.out.println("Birler Başamağındaki Rakam : " + birlerBasamagindakiRakam);

        rakamlarToplami = rakamlarToplami + birlerBasamagindakiRakam;

        sayi = sayi/10;

        System.out.println("Sayı değeri 10'a bölününde sonuç :" + sayi);

        birlerBasamagindakiRakam = sayi%10;

        rakamlarToplami = rakamlarToplami +birlerBasamagindakiRakam;

        System.out.println("Bu aşamada 2.Rakam Bulundu : " + birlerBasamagindakiRakam);

        sayi =sayi /10;

        System.out.println("Bu aşamada sayi değeri :" + sayi);

        rakamlarToplami = rakamlarToplami + sayi;

        System.out.println("Girilen sayının rakamlar toplamı : " + rakamlarToplami);




    }
    }
