package day01;

import java.util.Scanner;

public class P04_dataCasting {
    public static void main(String[] args) {


        /*
        Kullanıcıdan iki double sayı alın ve ilk sayıyı ikinci sayıya bölün ve
        sonucu tam sayı yadırın

         */

      // Scanner scanner =new Scanner(System.in);
      // System.out.println("2 adet ondalıklı sayı giriniz :");
      // System.out.println("1.Sayı :");
      // double sayi1= scanner.nextDouble();
      // System.out.println("2.Sayı :");
      // double sayi2= scanner.nextDouble();
      // int sonuc = (int)(sayi1/sayi2);

      // System.out.println("Sonuç :"+sonuc);




        /*
        Kullanıcıdan iki int sayı alın ve ilk sayıyı ikinci sayıya bölün ve
        sonucu double sayı yadırın

         */

        Scanner scanner1 =new Scanner(System.in);
        System.out.println("2 adet tam sayı giriniz :");
        System.out.println("1.Sayı :");
        int sayi3= scanner1.nextInt();
        System.out.println("2.Sayı :");
        int sayi4= scanner1.nextInt();
        double sonuc2 = sayi3/sayi4;

        System.out.println("Sonuç :"+sonuc2);
    }
}
