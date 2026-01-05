package K03_KullanicidanDataAlma;

import java.util.Scanner;

public class C01_ScannerClassKullanimi {


    static void main() {

        //Soru-2 Kullanıcıdan bir double, bir de int sayı alıp
        // bunların toplamını ve çarpımını yazdırın

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen ondalıklı bir sayı giriniz : ");

        double ondalikliSayi = scanner.nextDouble();

        System.out.println("Lütfen bir tam sayı giriniz : ");

        int tamSayi = scanner.nextInt();

        System.out.println( "Sayıların Toplamı : " + (ondalikliSayi + tamSayi));

        System.out.println("Sayıların Çarpımı : " + (ondalikliSayi * tamSayi));

    }
}
