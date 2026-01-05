package K08_ifElseStatements.D01_bigimsizIfCumleleri;

import java.util.Scanner;

public class C04_SusluParantezKullanimi {

    public static void main(String[] args) {


        //Soru 3: Kullanıcıdan bir sayı alın,
        //sayı 3 ile bölünüyorsa "Üç ile bölünebilen sayı,
        //5 ile bölünebiliyorsa "Beş ile bölünebilen sayı" yazdırın.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz : ");
        int sayi = scanner.nextInt();

        if (sayi %3 ==0){
            System.out.println("Sayı 3 ile bölünebilen sayıdır.");
            System.out.println("3 ile bölünen sayıları severim");

        }

        if (sayi%5==0){
            System.out.println("Sayı 5 ile bölünebilen sayıdır.");
            System.out.println("5 ile bölünens sayıları severim.");
        }

        /*
            if cumlelerinde eger if body'de sadece 1 satir kod olacaksa
            {} kullanilmayabilir

            ANCAK suslu parantez KULLANILMADIGINDA
            if body'nin ilk ;'e kadar olan kisim kabul edilecegi UNUTULMAMALIDIR
         */
    }
}
