package Day03_stringManipulation;

import java.util.Scanner;

public class C02_charAt_Length {

    public static void main(String[] args) {
        String metin = "Java gun gectikce guzellesiyor." ;

        System.out.println(metin.charAt(0)); // J ilk harfi verir

        System.out.println(metin.charAt(3));
        System.out.println(metin.charAt(7));
        System.out.println(metin.charAt(11));
        System.out.println(metin.charAt(19));


        //CarAt() method'u index kullanır.
        //Java'nin genelinde olduğu gibi index 0' dan başlar
        //NOT : bir karakterin metinde kaçıncı karakter olduğunu söylerken 1 den başlarız. 2,3,4 diye devam ederiz
        // AMMA Javadan bir karakter istediğimizde o dan başlarayarak sayaarız inde = ile başlar
        // Hata yapmamak için sıra mı index mi istendiğine dikkat etmek gerekir


        // metnin 10. karakterini yazdırın diyorsa
        // indez 9 olarak yazarız

        System.out.println(metin.charAt(9));


        // metin kaç karakterden oluşuyor.

        System.out.println(metin.length());


        // metnin 31 karakter olduğu bilindiğine göre
        // metnin son karakterini yazdırın.

        System.out.println(metin.charAt(31-1));

        //sondan 6 . karakter dersek

        System.out.println(metin.charAt(metin.length()-6));


        // kullanıcıdan bir cümle isteyin sonra kullanıcının girdiği metnin
        // baştan  ve sonran 1. 3. ve 5. karakterlerini yazdırın


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Lütfen bir cümle giriniz : ");
//        String girilenCumle = scanner.nextLine();
//
//        System.out.println("Baştan 1. karakter :" + girilenCumle.charAt(0));
//        System.out.println("Baştan 3. karakter :" + girilenCumle.charAt(2));
//        System.out.println("Baştan 5. karakter :" + girilenCumle.charAt(4));
//
//        System.out.println("Sondan 1. karakter :" + girilenCumle.charAt(girilenCumle.length()-1));
//        System.out.println("Sondan 3. karakter :" + girilenCumle.charAt(girilenCumle.length()-3));
//        System.out.println("Sondan 5. karakter :" + girilenCumle.charAt(girilenCumle.length()-5));


        // Eğer chatAt() methodunda length veya daha büyük değer girilirse
        String isim ="Leyla";

        System.out.println(isim.length()); //5

        System.out.println(isim.charAt(4)); // 5

        // System.out.println(isim.charAt(isim.length())); // hata verir : java.lang.StringIndexOutOfBoundsException

        //Noy: charAt() de kullanılacak en büyük index son harfin de index'i length-1 olur






    }
}
