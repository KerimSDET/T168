package K12_forLoop.Ders01_forLoop;

import java.util.Scanner;

public class C07_AsalMi {

    public static void main(String[] args) {


        /*
        Kullanıcıdan pozitif bir tamsayı isteyip
        sayının  asal sayı olup olmadığını kontrol edin ve sonucu yazdrın
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tam sayı giriniz :");
        int sayi = scanner.nextInt();

        for (int i = 2; i <sayi; i++) {

            if (sayi%i==0) {
                System.out.println("Asal Değil");
            break;
            }

            if (i==sayi-1){
                System.out.println("Sayı Asaldır");
            }

        }



    }
}
