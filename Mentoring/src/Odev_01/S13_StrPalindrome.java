package Odev_01;

import java.util.Scanner;

public class S13_StrPalindrome {

    public static void main(String[] args) {


        /*13----
    Bir palindrom, madam veya racecar veya 10801 sayısı gibi
    ileriye doğru geriye doğru okuyan bir kelime, sayı, kelime öbeği veya diğer karakter dizisidir.

    Girilecek kelimenin palindrom olup olmadığını doğrulayacak bir Java Kodu yazın.

    Test Data:
    madam

    Beklenen Çıktı:
    True
    */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Palindrome denetimi için lütfen bir kelime giriniz : ");
        String inputText =scanner.nextLine();




        for (int i = inputText.length()-1; i >=0; i--) {

            String tersineYazi = (inputText.charAt(i));

            System.out.print(tersineYazi);


        }



    }
}
