package K03_KullanicidanDataAlma;

import java.util.Scanner;

public class C05_CemberinCevresiniYazdirma {

    static void main() {

        //Soru-6 Kullacıdan bir öemberin yarıçapını alıp
         // çevresini ve alanını yazdırın
         // cevre = 2*PI * yaricap, alan = PI * yaricap*yaricap

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen yarıçapı cm olarak giriniz : ");
        double yaricap = scanner.nextDouble();
        double PI = 3.14 ;

        System.out.println("Çemberin Çevresi : " + (2 * PI * yaricap));
        System.out.println("Çemberin Alanı : " + (PI * yaricap * yaricap));




    }
}
