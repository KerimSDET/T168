package K03_KullanicidanDataAlma;

import java.util.Scanner;

public class C04_KullanicidanBilgiAlipYazdirma {

    static void main() {


        //Soru 5 - Kullanıcıdan ismini, soysimini ve yaşını alıp
        // aşağıdaki formatta yazdırınız.
        // Girilen bilgiler : J Doe, 44


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz : ");

        //String isim = scanner.next() //kullanıcının girdiği ilk boşluğa kadar olanı alır.

        String isim = scanner.nextLine() ; //kullanıcın girdiği bilginin tamamını alır

        System.out.println("Lütfen soyisminizi giriniz : ");

        String soyisim = scanner.nextLine();

        System.out.println("Lütfen yaşınızı giriniz : ");

        double yas = scanner.nextDouble();


        System.out.println(

                "Girilen Bilgiler : " + isim.charAt(0) + " " +
                        soyisim + ", " + yas
        );
    }
}
