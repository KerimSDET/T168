package K03_KullanicidanDataAlma;

import java.util.Scanner;

public class C06_Swap {

    static void main() {

        // Soru 7 (Interview) - Kullanıcıdan ik sayı alıp
        // ikisinin değerlerini değiştirin. (swap)

        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci tamsayıyı giriniz : ");
        int sayi1 = scanner.nextInt(); //25

        System.out.println("İkinci tamsayıyı giriniz : ");
        int sayi2 = scanner.nextInt(); //40



        int swap = 0; //s1=25 s2=40 swap=0
        swap = sayi2 ;//s1=25, s2=40, swap=40
        sayi2 = sayi1 ;//s1=25 s2=25 swap=40
        sayi1 = swap ; //s1=40 s2=25 swap 40



        System.out.println("Sayı1'in yeni değeri : " +sayi1);
        System.out.println("Sayı2'nin yeni değeri : " + sayi2);
    }
}
