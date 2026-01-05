package K10_SwitchStatements;

import javax.swing.*;
import java.util.Scanner;

public class C03_IkiBasamakliSayiyiYazdirma {
    public static void main(String[] args) {

        //kullanıcıdan 100^den küçük  pozitif bir sayı alıp, girilen sayıyı yazı ile yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 100'den küük poitif bir tam sayı giriniz :" );
        int sayi = scanner.nextInt();

        //29 ==> yirmi dokuz
        //87 ==> seksen yedi

        if (sayi>0 && sayi<100){

        int birlerBasamagi = sayi%10;
        int onlarBasamagi = sayi/10;

        System.out.println("Girdiğiniz Sayı :"+sayi);


        switch (onlarBasamagi){
            case 0:
                break;
            case 1:
                System.out.print("On ");
                break;
            case 2:
                System.out.print("Yirmi ");
                break;
            case 3:
                System.out.print("Otuz ");
                break;
            case 4:
                System.out.print("Kırk ");
                break;
            case 5:
                System.out.print("Elli ");
                break;
            case 6:
                System.out.print("Altmış ");
                break;
            case 7:
                System.out.print("Yetmiş ");
                break;
            case 8:
                System.out.print("Seksen ");
                break;
            case 9:
                System.out.print("Doksan ");
                break;
        }

        switch (birlerBasamagi) {
            case 0:
                break;
            case 1:
                System.out.println("bir");
                break;
            case 2:
                System.out.println("iki");
                break;
            case 3:
                System.out.println("üç");
                break;
            case 4:
                System.out.println("dört");
                break;
            case 5:
                System.out.println("beş");
                break;
            case 6:
                System.out.println("altı");
                break;
            case 7:
                System.out.println("yedi");
                break;
            case 8:
                System.out.println("sekiz");
                break;
            case 9:
                System.out.println("dokuz");
                break;
        }


    } else System.out.println("Girilen sayı istenilen aralıkta olmalıdır");

}}
