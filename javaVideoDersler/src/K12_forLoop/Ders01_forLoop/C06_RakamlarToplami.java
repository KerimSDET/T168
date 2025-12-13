package K12_forLoop.Ders01_forLoop;

import java.util.Scanner;

public class C06_RakamlarToplami {
    public static void main(String[] args) {
        /*
        Kullanıcıdan pozitif bir tam sayı alıp,
        rakamlar toplamını aşağıdaki gibi yazdırın
        input:1453 output 1+4+5+3=13
        output : Girilen 1453 sayısının rakamlar toplmaı : 13
         */

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Rakamlar toplamı için pozitif bir tamsayı giriniz :");
        int inputDigit = scanner1.nextInt();

        int total = 0;

        int digit =inputDigit;

        int basamakSayisi = (inputDigit + "").length();



        for (int i = 0; i <basamakSayisi; i++) {

            total+=digit%10;
            digit/=10;
            
        }
        System.out.println("Girilen "+ inputDigit + " sayısının rakamlar toplmaı :"+total);
    }
}
