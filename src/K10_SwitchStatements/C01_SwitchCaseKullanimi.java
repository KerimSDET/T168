package K10_SwitchStatements;

import java.util.Scanner;

public class C01_SwitchCaseKullanimi {
    public static void main(String[] args) {

// kullaniciya haftanin kacinci gununu yazdirmak istedigini sorun
        // 1-7 arasindaki degerler icin pazartesi'den pazar'a kadar gun isimlerini yazdirin
        // 1-7 arasindaki sayilardan farkli bir sayi girerse hata mesaji verin


        Scanner scanner =new Scanner(System.in);
        System.out.println("Haftanin kacinci gununu yazdirmak istersiniz ?");
        int gunNo = scanner.nextInt();
/*
            switch(kontrolEdilecekVariable) {  }
            Java kontrolEdilecekVariable'in degerine
            uygun olan case'den calismaya baslar

            ve switch statement'in sonuna kadar calisir

            EGER case'lerin birbirinden bagimsiz olmasini isterseniz
            her case'in bitimine break; yazmaliyiz

            EGER kullanici case olarak belirlenen degerlerin disinda
            ne deger girerse girsin
            standart bir islem yapmasini istersek
            default :  ile bu islemi tanimlayabiliriz
             */


        switch (gunNo){

            case 1 : // gunNo == 1 true ise calisacak kodlar
                System.out.println("pazartesi");
                break;
            case 2 : // gunNo 2 oldugunda calisacak kodlar
                System.out.println("sali");
                break;
            case 3:
                System.out.println("carsamba");
                break;
            case 4 :
                System.out.println("persembe");
                break;
            case 5 :
                System.out.println("cuma");
                break;
            case 6 :
                System.out.println("cumartesi");
                break;
            case 7 :
                System.out.println("pazar");
                break;
            default: // yukardaki case'lerden hicbiri degilse varsayilan olarak calisacak kodlar
                System.out.println("Gun numarasi gecersiz");

        }

    }
}
