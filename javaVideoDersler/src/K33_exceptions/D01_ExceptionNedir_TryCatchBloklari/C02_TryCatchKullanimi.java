package K33_exceptions.D01_ExceptionNedir_TryCatchBloklari;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_TryCatchKullanimi {

    public static void main(String[] args) {





        boolean calismayaDevamEdeyimMi = true;

        while (calismayaDevamEdeyimMi) {


            Scanner scanner = new Scanner(System.in);
            System.out.println("Lütfen iki tam sayı giriniz");

            int sayi1 = 0;
            int sayi2 = 0;

            try {
                sayi1 = scanner.nextInt();
                sayi2 = scanner.nextInt();

                if (sayi2 !=0){
                    System.out.println("Sayıların bölümü : "+sayi1/sayi2);

                    calismayaDevamEdeyimMi = false;
                } else System.out.println("2. sayı 0 olamaz");


            } catch (InputMismatchException e) {

                System.out.println("Integer tam sayı değeri girmelisiniz.");

            }


        }

        System.out.println("Kod normal çalıştı");


    }
}
