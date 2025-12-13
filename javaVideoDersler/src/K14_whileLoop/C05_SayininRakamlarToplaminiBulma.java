package K14_whileLoop;

import java.util.Scanner;

public class C05_SayininRakamlarToplaminiBulma {

    public static void main(String[] args) {


        //while loop kullanılarak kullanıcıdan alınan sayının rakamlar toplamını bulun


        Scanner scanner = new Scanner(System.in);
        System.out.println("Rakamlar toplamını nulmak için pozzitif bir tam sayı giriniz :");
        int girilenSayi = scanner.nextInt();


        int sayi =girilenSayi;

        int rakamlarToplami =0;

        while (sayi>0){

            rakamlarToplami+=sayi%10;
            sayi/=10;


        }
        System.out.println("Girilen "+girilenSayi+" sayısının rakamlar toplamı :"+rakamlarToplami);
    }
}
