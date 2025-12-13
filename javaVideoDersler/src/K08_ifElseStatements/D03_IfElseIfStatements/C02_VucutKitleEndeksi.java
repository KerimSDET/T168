package K08_ifElseStatements.D03_IfElseIfStatements;

import java.util.Scanner;

public class C02_VucutKitleEndeksi {

    public static void main(String[] args) {

// Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini hesaplayin
        //         kilo*10000 / (boy *boy)
        //         vucut kitle endeksi
        //         30’dan buyukse obez,
        //         25-30 arasi ise kilolu,
        //         20-25 arasi ise normal,
        //         20’den kucukse zayif yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen kilonuzu kg olarak belirtiniz : ");
        double kg = scanner.nextDouble();

        System.out.println("Lütfen boyunuzu cm olarak belirtiniz :");
        int boyCm = scanner.nextInt();

        double vke = kg*10000/(boyCm*boyCm);


        System.out.println("Vücut Kitle Endeksiniz : " + vke);
        if (vke>30) {
            System.out.println("OBEZ");
        } else if (vke>25) {
            System.out.println("Kilolu");
        } else if (vke>20) {
            System.out.println("Normal Kilolu");
        } else {
            System.out.println("Zayıf");
        }


    }
}
