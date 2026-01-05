package K33_exceptions.D02_MultipleUncheckedExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_SayiToplama {

    /*
    Kullanıcıdan toplanmak üzere tamsayılar isteyin
    ve kullanıcı q veya Q ya basıncaya kadar işlemi devam ettirin
    kullnaıcı 1 ya basıpında
    ka adet sayı girdiğini ve toplamının ne olduğnu yazıdrın
     */

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int toplam = 0;
        int sayac = 0;
        int girilenSayi = 0;
        String girilenMetin ="";


        while (!girilenMetin.equalsIgnoreCase("q")){
            System.out.println("Lütfen toplanmak üzere tam sayılar giriniz : \n Bitirmek için Q ya basınız.");

            try {
                girilenSayi = scanner.nextInt();
                toplam += girilenSayi;
                sayac ++;

            } catch (InputMismatchException e) {

                girilenMetin = scanner.nextLine();
                if (!girilenMetin.equalsIgnoreCase("q")) {
                    System.out.println("Girilen değer ya tamsayı ya da Q olmalıdır.");
                }
            }

        }
        System.out.println("Girilen "+sayac+" adet sayının toplamı :"+toplam);
    }
}
