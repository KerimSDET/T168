package T168;

import java.util.Scanner;

public class Krm {

    public static void main(String[] args) {

        System.out.println("Merhaba oğlum hadi seninle ilk kodlamamızı yapalım. Kodumuzu yazdık. Hadi cevabı görelim :");

        Scanner scannerKerem =new Scanner(System.in);
        System.out.println("Hangi sayının katını almak istersin :");
        int katAlinacaksayi = scannerKerem.nextInt();

        System.out.println("Kaç katını alalım paşam : ");
        int kacKati = scannerKerem.nextInt();

        System.out.println("Bu sayıya kaç ekleyelim :");
        int eklenecekSayi = scannerKerem.nextInt();

        int sonuc = katAlinacaksayi*kacKati+eklenecekSayi;

        System.out.println(katAlinacaksayi+" sayısının "+kacKati+" katının "+eklenecekSayi+" fazlası : "+sonuc);

    }
}
