package K33_exceptions.D01_ExceptionNedir_TryCatchBloklari;


import java.util.Scanner;

public class C01_IfElseIleOnleme {


    //Kullanıcıdan iki tmasayı isteyip
    // sayıları birbirine bölün ve sonucu yazdırın
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen iki tam sayı giriniz");

        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        if (sayi2 !=0){
            System.out.println("Sayıların bölümü : "+sayi1/sayi2);
        } else System.out.println("2. sayı 0 olamaz");

        System.out.println("Kod normal çalıştı");
    }
}
