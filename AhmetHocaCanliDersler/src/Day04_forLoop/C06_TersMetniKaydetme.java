package Day04_forLoop;

import java.util.Scanner;

public class C06_TersMetniKaydetme {

    public static void main(String[] args) {


        //Kullanıcıdan bir yazı alın ve bunu tersine çevirin ve kayydedin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir metni giriniz:" );
        String metni =scanner.nextLine();


        String tersMetin="";

        for (int i = metni.length()-1; i >=0 ; i--) {
            tersMetin+= metni.charAt(i);
        }
        System.out.println(tersMetin);

        //girilen metnin bir palindrome olup olmadığını yazdırın.
        //palindrom düz yazılışı ver ters yazılışı aynı olan metinlerdir.
        //madam kavak adanada

        if (tersMetin.equalsIgnoreCase(tersMetin)){
            System.out.println("Girilen metin bir palindromdur");
        } else {
            System.out.println("Palindrom değildir");
        }



    }
}
