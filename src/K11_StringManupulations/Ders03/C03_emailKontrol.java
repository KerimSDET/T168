package K11_StringManupulations.Ders03;

import java.util.Scanner;

public class C03_emailKontrol {
    public static void main(String[] args) {


        //SORU : kullanicidan bir mail alin
        //          - mail @ icermiyorsa "gecersiz mail"
        //          - mail @gmail.com icermiyorsa, "mail gmail olmali"
        //          - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var"  yazdirin.


        /*
            Eger tum kontrolleri yapmasini ve hatalari yazdirmasini istersek BAGIMSIZ IF cumleleri
            Eger buldugu ilk hatayi yazdirsin, ilk hata duzeltildikten sonra
            diger sartlari kontrol etsin diyorsaniz If Else Statement kullanmalisiniz
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen email adresinizi giriniz");
        String email = scanner.nextLine();


        if (!email.contains("@")) {
            System.out.println("Geçersiz mail");
        } else if (!email.contains("@gmail.com")) {
            System.out.println("mail adresi gmail olmalıdır");
        } else if (!email.endsWith("@gmail.com")) {
            System.out.println("mailde yazım hatası var");
        }

        System.out.println("--------------------");

        if (!email.contains("@")) {
            System.out.println("Geçersiz mail");
        }

        if (!email.contains("@gmail.com")) {
            System.out.println("mail adresi gmail olmalıdır");
        }

        if (!email.endsWith("@gmail.com")) {
            System.out.println("mailde yazım hatası var");
        }


    }
}
