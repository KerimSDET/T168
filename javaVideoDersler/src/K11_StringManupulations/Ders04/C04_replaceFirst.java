package K11_StringManupulations.Ders04;

import java.util.Scanner;

public class C04_replaceFirst {
    public static void main(String[] args) {
        String str = "Java ile yazılım dünyasna giriş yap";

        //Sadece ilk a harfini A ile değiştir

        System.out.println(str.replaceFirst("a", "A"));


        //sadece ilk e yi E ile değiştir.

        //System.out.println(str.replaceFirst('e','E')); replace sadece String kabul eder char kabul etmez
        System.out.println(str.replaceFirst("e","E"));


        str = "Java 1-3 ayda öğrenilir";

        System.out.println(str.replace("1", "2"));

        System.out.println(str.replaceFirst("\\d","0")); //str deki ilk rakamı bul 0 ile değiştir demek


        //kullanıcıdan bir cümle isteyiniz.
        //eğer cümle içinde rakam varsa ilk rakam yerien X yazdırın

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz :");
        String girilenMetin = scanner.nextLine();

        System.out.println(girilenMetin.replaceFirst("\\d","X"));

        /*
            regex regular expression  ==> belirlenmis kisaltmalar
                \\d	Bir rakam (0-9)
                \\D	Rakam olmayan karakter
                \\w	Bir kelime karakteri (a-z, A-Z, 0-9 ve _ )
                \\W	Kelime karakteri olmayan bir karakter
                \\s	Beyaz boşluk karakteri (boşluk, tab, yeni satır vb.)
                \\S	Beyaz boşluk olmayan karakter
                \\s+ Yanyana birden fazla space
         */


    }
}
