package Odev_01;

import java.util.Scanner;

public class S10_KelimeBulma {

    public static void main(String[] args) {
        /*10-----
    Kullanıcıdan alınan String kümesi içerisinde aranan String i bulan Java Kodunu yazınız.

    Test Data:
    Java is easy

    Aranan String: is

    Bektenen Çıktı:
    True

    Aranan String: and

    Beklenen Çıktı:False

    */


        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen mesajınızı giriniz :");
        String inText = scanner.nextLine();

        System.out.println("Lütfen aranacak değeri giriniz :");
        String aranan = scanner.nextLine();

        boolean netice = strBul(inText, aranan);{
            System.out.println("Sonuç : "+netice);
    }

            }

    public static boolean strBul (String text, String aranan) {
        return text.contains(aranan) ;
    }}