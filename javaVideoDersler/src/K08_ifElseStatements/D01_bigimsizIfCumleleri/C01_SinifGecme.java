package K08_ifElseStatements.D01_bigimsizIfCumleleri;

import java.util.Scanner;

public class C01_SinifGecme {


    public static void main(String[] args) {

        //kullanıcıdan notunu alın
        //notu 50 veya daha büyükse "Sınıfı Geçtin" yazdırın

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz : ");
        double not = scanner.nextDouble();

        if (not>=50) {
            System.out.println("Sınıfı Geçtin");
        }

    }
}
