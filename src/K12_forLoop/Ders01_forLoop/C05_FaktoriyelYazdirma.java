package K12_forLoop.Ders01_forLoop;

import java.util.Scanner;

public class C05_FaktoriyelYazdirma {

    public static void main(String[] args) {

        /*
        Kullanıcıdan 14'den küçük bir sayı alıp
        bu sayının faktoriyel değerini hesaplayın
        Konsolda faktoriyel hesabının yapılısını da yazdırın.
        örn: 6!=6*5*4*3*2*1=720 gibi
         */

        Scanner scanner1=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz :");
        int inputDigit= scanner1.nextInt();

        int faktoriyelDeger=1;


        System.out.print(inputDigit+"! =");

        for (int i = inputDigit; i >1 ; i--) {
        faktoriyelDeger*=i;
            System.out.print(inputDigit+" * ");
            --inputDigit;
        }

        System.out.println("1 ="+(faktoriyelDeger));

    }
}
