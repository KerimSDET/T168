package K33_exceptions.D01_ExceptionNedir_TryCatchBloklari;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_CatchBlogundakiEninGorevi {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Lütfen iki tam sayı giriniz");

            int sayi1 = 0;
            int sayi2 = 0;

            try {
                sayi1 = scanner.nextInt();
                sayi2 = scanner.nextInt();

                if (sayi2 ==0){
                    System.out.println("Blecek sayı 0 olamaz");

                } else System.out.println("Sayıların bölümü : "+sayi1/sayi2);


            } catch (InputMismatchException e) {

                System.out.println("Integer tam sayı değeri girmelisiniz.");
                e.printStackTrace();            }

        System.out.println("Kod normal çalıştı");


        }




    }
