package Odev_01;

import java.util.Scanner;

public class S09_StrConcat {

    public static void main(String[] args) {

        /*9----
    2 farklı String'i  ucuca ekleyen Java Kodunu yazınız.

    Test Data:
    str1: Java is
    str2: fun

    Beklenen Çıktı:
    java is fun

    */

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz :");
        String str1= scanner.nextLine();
        String str2= scanner.nextLine();;


//        String str1 ="Java is";
//        String str2 ="fun";

        System.out.println(str1+" ".concat(str2));
    }
}
