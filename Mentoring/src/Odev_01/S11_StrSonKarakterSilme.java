package Odev_01;

import java.util.Scanner;

public class S11_StrSonKarakterSilme {
    public static void main(String[] args) {

 /*11----
    Kullanıcıdan alınan Stringin son karakteirini silip ekrana yazan Java kodunu yazınız.

    Test Data:
    good

    Beklenen Çıktı:
    goo
    */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz : ");
        String inputText =scanner.nextLine();

        System.out.println(inputText.substring(0, inputText.length() - 1));




    }
}
