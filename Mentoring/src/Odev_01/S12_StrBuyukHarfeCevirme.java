package Odev_01;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class S12_StrBuyukHarfeCevirme {
    public static void main(String[] args) {


     /*12----
    Kullanıcının girdiği String değerlerini büyük harfe çeviren Java kodunu yazınız.

    Test Data:
    Java is fun

    Beklenen Sonuç:
    JAVA IS FUN
    */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz : ");
        String inputText =scanner.nextLine();

        System.out.println(inputText.toUpperCase(Locale.ROOT)); //ING I yazdırmak için kullandım


    }
}
