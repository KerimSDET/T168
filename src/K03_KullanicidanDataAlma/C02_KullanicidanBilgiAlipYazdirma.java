package K03_KullanicidanDataAlma;

import java.util.Scanner;

public class C02_KullanicidanBilgiAlipYazdirma {

    static void main() {

        //Soru 3 - Kullanıcıdan ismini , soyismini ve yaşını alıp
        //aşağıdaki formatta yazdırınız.
        //      Isminiz     :   John
        //      Soyisminiz  :   Doe
        //      Yasiniz     :   44
        //      Kaydınız başarıyla tamamlanmıştır.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz : ");

        //String isim = scanner.next() //kullanıcının girdiği ilk boşluğa kadar olanı alır.

        String isim = scanner.nextLine() ; //kullanıcın girdiği bilginin tamamını alır

        System.out.println("Lütfen soyisminizi giriniz : ");

        String soyisim = scanner.nextLine();

        System.out.println("Lütfen yaşınızı giriniz : ");

        double yas = scanner.nextDouble();

        //      Isminiz     :   John
        //      Soyisminiz  :   Doe
        //      Yasiniz     :   44
        //      Kaydınız başarıyla tamamlanmıştır.

        System.out.println(

                "İsminiz : " + isim +
                "\nSoyisminiz : " + soyisim +
                "\nYaşınız : " + yas +
                "\nKaydınız başarıyla tamamlanmıştır."

        );




    }
}
