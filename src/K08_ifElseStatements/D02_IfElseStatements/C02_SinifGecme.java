package K08_ifElseStatements.D02_IfElseStatements;

import java.util.Scanner;

public class C02_SinifGecme {
    public static void main(String[] args) {
        //Soru - 2 Kullanıcıdan notunu alın,
        // 50 veya daha büyükse "Sııfı Geçtin",
        // 50'den küçükse "Maalesef Kaldın." yazdırın.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz : ");
        double not1 = scanner.nextDouble();

        if (not1 >= 50) {
            System.out.println("Sınıfı Geçtiniz.");
        } else {
            System.out.println("Maalesef kaldınız.");
        }
    }
}
