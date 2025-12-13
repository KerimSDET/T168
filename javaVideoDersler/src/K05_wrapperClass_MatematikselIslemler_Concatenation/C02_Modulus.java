package K05_wrapperClass_MatematikselIslemler_Concatenation;

import java.util.Scanner;

public class C02_Modulus {

    public static void main(String[] args) {

        System.out.println( 25 / 10); //2.5 olduğunu biliyoruz ama her iki sayıyı da int bildiği için cevao 2 olur

        System.out.println( 15 / 4); //3

        System.out.println(35 % 10);  //35 in 10 ile bölümündne kalan nedir demektir. cevap 5 dir

        System.out.println(15 % 4); //cevap 3 tür

        //girilen sayının çift olup olmadığını yazdırın
        //Sayı 2 'ye bölünüyorsa yani kalan 0 ise yani ½2 bize 0 veriyorsa sayı çifttir.

        System.out.println(24%2); //cevap 0

        int sayi =45;

        System.out.println(sayi%2); //cevap 1 oldu için çift değil.

        //girilen sayının 5'e bölünmediğini yazdırın

        System.out.println(sayi%5); //cevap 0

        //girilen sayının 3'un tam katı olup olmadığını yazdırınız

        System.out.println(sayi%3); // sonucu 0 ise 3'ün tam katıdır.



        //kullanıcıdan bir tamsayı isteyiniz

        Scanner scanner =new Scanner(System.in);

        System.out.println("Lütfen pozitif bir tam sayı giriniz : ");

        int girilenSayi= scanner.nextInt();

        //girilen sayının birler basamağını yazdırn
        System.out.println(girilenSayi%10); // sayının 10 ile bölümünde kalan bize birler basamağını verir.











    }
}
