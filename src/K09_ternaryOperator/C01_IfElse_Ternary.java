package K09_ternaryOperator;

import java.util.Scanner;

public class C01_IfElse_Ternary {
    public static void main(String[] args) {

        // kullanicidan pozitif bir tamsayi alin
        // sayi cift ise "cift sayi", cift degilse "tek sayi" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz...");
        int sayi = scanner.nextInt();


        // if-else ile yapalim

        if (sayi%2==0) {
            System.out.println("Çift Sayı");
        } else {
            System.out.println("Tek Sayı");
        }


        // ternary ile yapalim

        System.out.println( sayi%2==0? "Çift sayı" : "tek sayı");

    }
}
