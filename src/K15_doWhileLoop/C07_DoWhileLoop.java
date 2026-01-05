package K15_doWhileLoop;

import java.util.Scanner;

public class C07_DoWhileLoop {

    public static void main(String[] args) {


        /*
        Kullanıcından bir pozitif sayı alın
        tam kare olup olmadığınnı yazdırın
        tam kare ise true değilse false ayzdırın

        Ornek: input 16 output 4
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tam sayı giriniz : ");
        int sayi =scanner.nextInt();


        int karekokDegeri =1;

        do {
            if (karekokDegeri*karekokDegeri==sayi){
                System.out.println("true");
            break;
            }
            karekokDegeri++;

            if (karekokDegeri*karekokDegeri>sayi){
                System.out.println("false");
            }
        } while (karekokDegeri*karekokDegeri<=sayi);

    }



}
