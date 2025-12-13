package K04_dataCasting;

import java.util.Scanner;

public class C04_DataCasting {

    static void main() {


        // kullanicidan iki tamsayi alin
        // sayilari birbirine bolup, islem sonucunu ondalikli olarak yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen 2 adet pozitif tamsayi giriniz...");

        int sayi1 = scanner.nextInt(); // 34
        int sayi2 = scanner.nextInt(); // 10


        System.out.println( "Iki sayiyi bolersek sonuc : " + (sayi1 / sayi2) ); // 3.4 ==> 3


        System.out.println( "Sonucu double'a cast edelim : " + (double)(sayi1 / sayi2) ); // 3.4 ==> 3.0


        System.out.println( "Sayilardan birini double'a cast edelim : " + (  (double)sayi1 / sayi2   ) ); // 3.4


        System.out.println( "Sayilarin ikisini de double'a cast edelim : " + (  (double)sayi1 / (double)sayi2   ) ); // 3.4


        // bir tamsayiyi 10'a bolerseniz birler basamagi gider
        System.out.println(    2457 / 10 ); // 245,7 ==> 245
        System.out.println(    245 / 10 ); // 24.5 ==> 24
        System.out.println(    24 / 10 ); // 2.4 ==> 2
        System.out.println(    2 / 10 ); // 0.2 ==> 0





    }
}
