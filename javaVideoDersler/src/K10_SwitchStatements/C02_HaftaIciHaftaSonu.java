package K10_SwitchStatements;

import java.util.Scanner;

public class C02_HaftaIciHaftaSonu {

    public static void main(String[] args) {

        //kullanıcıdan gün ismini alın
        //büyük küçük harf frk etmez
        //girilen günün hafta içi veya hafta sonu olduğunu yazdırın
        //kullanıcı gün ismini yanlış girerse uyarın


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen gün ismini giriniz :");
        String gunIsmi = scanner.nextLine().toLowerCase();

        //Pazar, PAZAR, pazar, PAzar, PaZaR==> pazar

        switch (gunIsmi){
            case "pazartesi":
            case "salı":
            case "çarşamba":
            case "perşembe":
                case "cuma":
                System.out.println("Haftaiçi");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("Haftasonu");
                break;
            default:
                System.out.println("Girilen gün ismi hatalı");


                /*
                bir switch statement'da switch olarak kullanabileceğimiz variable'in
                data türü byte,short, int, char, String OLABILIR
                ama boolean, long, float, double OLAMAZ
                 */

        }
    }
}
