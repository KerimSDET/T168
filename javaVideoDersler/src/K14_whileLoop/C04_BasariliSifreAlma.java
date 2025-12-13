package K14_whileLoop;

import K13_MethodOlusturmaVeKullanma.Ders02_MethodOlusturmaOrnekSorular.C07_SifreKontrol;

import java.util.Scanner;

public class C04_BasariliSifreAlma {

    public static void main(String[] args) {


        /*
        daha önce yaptığımız şifre kontrolü methodunu kullanma
        kullnaıcı hatasz bir şifre girinceye kadar tekrar tekrar şifre isteyin
        kabul edilebilir bir şifre girdiğinde şifreniz başarılı olarak kaydedildi yazıdırn

         */


        Scanner scanner=new Scanner(System.in);


        boolean tekrarSorayimMi = true;
        String girilenSifre ="";

        while (tekrarSorayimMi){
            System.out.println("Lütfen şifrenizi giriniz :");

            girilenSifre= scanner.nextLine();

            tekrarSorayimMi = !C07_SifreKontrol.sifreGecerliMi(girilenSifre);

        }

        System.out.println("Şifreniz başarılı olarak kaydedildi.");

    }
}
