package K15_doWhileLoop;

import java.util.Scanner;

public class C02_whileLoopVsDoWhileLoop {

    public static void main(String[] args) {


        /*
        kullanıcıdan toplamak üzere  pozitif tam sayılar isteyin
        kullanıcıya bitirmek istediğinde = a basmasını söyleyin
        kullanıcı bitirmek istediğinde toplam kaç adet pozitif tam sayı girdiğini
        ve bunların toplamının kaç olduğunu yazdırın
        kullanıcı negatif sayı girerse "negatif sayı kullanamazınız yazdırın
        bu degatif sayıyı sayı adedine ve toplama eklemeyin


         */

        Scanner scanner =new Scanner(System.in);


        int sayi = 0;
        int sayiToplam = 0;
        int sayac = 0;



        // while loop ile yapalım

        while (sayi!=0){

            System.out.println( "Lütfen toplanmak üzere pozitif tam sayı giriniz : "+
                    "\nBirirmek için 0'a basınız ... :");

            sayi=scanner.nextInt();

            if (sayi>0){
                sayiToplam+=sayi;
                sayac++;
            } else if (sayi<0){
                System.out.println("Negatif sayı kullanamazsınız..");
            }
            System.out.println("Girilen "+sayac+" adet pozitif tamsayının toplamı :" +sayiToplam);
        }

        do {
            System.out.println( "Lütfen toplanmak üzere pozitif tam sayı giriniz : "+
                    "\nBirirmek için 0'a basınız ... :");

            sayi=scanner.nextInt();

            if (sayi>0){
                sayiToplam+=sayi;
                sayac++;
            } else if (sayi<0){
                System.out.println("Negatif sayı kullanamazsınız..");
            }

        } while (sayi!=0);



        System.out.println("Girilen "+sayac+" adet pozitif tamsayının toplamı :" +sayiToplam);


    }
}
