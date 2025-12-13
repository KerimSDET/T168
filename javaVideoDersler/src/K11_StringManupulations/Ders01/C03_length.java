package K11_StringManupulations.Ders01;


import java.util.Scanner;

public class C03_length {

    public static void main(String[] args) {

        //Kulllanıcıdan bir metin isteyin
        //ve girilen  metinde ka karakter kullanıldığını yazdırın


        Scanner scanner =new Scanner(System.in);
        System.out.println("Lüten bir metin giriniz : ");
        String str = scanner.nextLine();


        System.out.println(str.length()); // kaç karaker?

        System.out.println(str.charAt(2)); // baştan 3. karakter

        System.out.println(str.charAt(str.length()-1)); //son  karakteri yazdırır

        System.out.println(str.charAt(str.length()-3)); //sondan 3. karakter  karakteri yazdırır

        System.out.println((str.charAt(1))+" ve " + (str.charAt(str.length()-3))); //son  karakteri yazdırır



    }
}
