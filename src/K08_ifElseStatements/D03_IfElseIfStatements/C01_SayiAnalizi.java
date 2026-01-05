package K08_ifElseStatements.D03_IfElseIfStatements;

import java.util.Scanner;

public class C01_SayiAnalizi {
    public static void main(String[] args) {


        // kullanicidan pozitif bir tamsayi isteyin
        // kullanici
        // negatif sayi girerse uyarin
        // tek basamakli bir sayi girerse "girdiginiz sayi rakam"
        // kullanici 10-99 arasinda (sinirlar dahil) sayi girerse "iki basamakli sayi"
        // kullanici 100-999 arasinda (sinirlar dahil) sayi girerse "uc basamakli sayi"
        // kullanici 1000 veya daha buyuk sayi girerse "cok buyuk sayi" yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tam sayı giriniz : ");
        int girilenSayi = scanner.nextInt();


        if (girilenSayi<0) System.out.println("Pozitif sayı girmelisiniz..!");

        else if (girilenSayi<=9) {
            System.out.println("Girdiğiniz sayı rakam");
        } else if (girilenSayi<=99) {
            System.out.println("İki basamaklı sayı");
        } else if (girilenSayi<=999) {
            System.out.println("Üç Basamaklı Sayı");
        } else {
            System.out.println("Çok büyük sayı" );
        }


    }
}
