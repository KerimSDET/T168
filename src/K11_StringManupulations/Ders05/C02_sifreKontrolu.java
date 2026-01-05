package K11_StringManupulations.Ders05;

import java.util.Scanner;

public class C02_sifreKontrolu {
    public static void main(String[] args) {

        //Soru 4 : Kullanicidan bir sifre isteyip,
        //         asagidaki sartlari kontrol edin
        //         ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        //         eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        //         - ilk harf kucuk harf olmali
        //         - son karakter rakam olmali
        //         - sifre bosluk icermemeli
        //         - uzunlugu en az 10 karakter olmali


        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen bir şifre giriniz :");
        String sifre = scanner.nextLine();

        int sayac = 0;

        //         - ilk harf kucuk harf olmali

        char ilkHarf = sifre.charAt(0);

        if (!Character.isLowerCase(ilkHarf)){
            System.out.println("İlk harf küçük harf olmalı");
            sayac++;
        }

        //         - son karakter rakam olmali
        char sonKarakter = sifre.charAt(sifre.length()-1);

        if (!Character.isDigit(sonKarakter)){
            System.out.println("Son karakter rakam olmalı");
            sayac++;
        }

        if (sifre.contains(" ")){
            System.out.println("Şifre boşluk içermemeli");
            sayac++;
        }

        if (!(sifre.length()>10)){
            System.out.println("Şifre uzunluğu en az 10 karakter olmalı");
            sayac++;
        }

        if (sayac==0) {
            System.out.println("Şifre başarıyla kaydedildi");
        }




        //         - sifre bosluk icermemeli


        //         - uzunlugu en az 10 karakter olmali



    }
}
