package K12_forLoop.Ders01_forLoop;

import java.util.Scanner;

public class C09_StringiTerstenCeviripKaydetme {

    public static void main(String[] args) {

        //Kullanıcıdan bir String isteyin ve bunu tersine çevirip kayededin


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen mesaj giriniz :");
        String mesaj = scanner.nextLine();

        String tersMesaj = "";


        for (int i = mesaj.length()-1; i >=0 ; i--) {

            tersMesaj+=mesaj.charAt(i);

        }

        System.out.println("Verilen emsajın tersten yazılışı : "+tersMesaj);


        //girilen metnin palindrome olup olmadığını yazdırın.
        //Palindrome tersi kendisine eşit olan metin madam=madam


        if (mesaj.equalsIgnoreCase(tersMesaj)){
            System.out.println("Girilen mesaj Palindrome'dur.");
        } else {
            System.out.println("Mesaj Palindrome değildir.");
        }

    }
}
