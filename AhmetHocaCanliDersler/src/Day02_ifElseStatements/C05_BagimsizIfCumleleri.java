package Day02_ifElseStatements;

import java.util.Scanner;

public class C05_BagimsizIfCumleleri {

    public static void main(String[] args) {


        // kullanicidan 2 tam sayi alin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 2 tam sayı giriniz : ");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        // 1- sayi1 < sayi2 ise "birinci sayi daha kucuk" yazdirin

        if (sayi1<sayi2){
            System.out.println("Birinci sayı daha küçük");
        }


        // 2- sayi1 pozitif ise "birinci sayi sifirdan buyuk" yazdirin

        if (sayi1>0){
            System.out.println("birinci sayı sıfırdan büyük");
        }

        // 3- sayi2 50'den buyuk ise "ikinci sayi 50'den buyuk" yazdirin

        if (sayi2>50){
            System.out.println("ikinci sayı 50'den büyük");
        }

        // 4- sayi2 5 ile bolunebiliyorsa "ikinci sayi 5'in tam kati" yazdirin

        if (sayi2%5==0){
            System.out.println("ikinci sayı 5'in tam katı");
        }


    }
}
