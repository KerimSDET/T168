package K03_KullanicidanDataAlma;

import java.util.Scanner;

public class C03_DiktortgenAlanHesaplama {

    static void main() {

        // Soru 4 - Kullanıcıdan bir dikdörtgenin 2 kenar uzunluğunu
        // diktörgenin alanını yazdırın.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen diktörtgenin kenar uzunlarını mt olarak giriniz : ");

        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();

        System.out.println("Dikdörtgenin Alanı : " + (kenar1*kenar2) + "mt2");
        System.out.println("Dikdörgenin çevre kenar uzunluğu : " + ( 2 * (kenar1 + kenar2)));
    }
}
