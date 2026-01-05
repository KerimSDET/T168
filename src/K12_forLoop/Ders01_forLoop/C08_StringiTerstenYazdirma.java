package K12_forLoop.Ders01_forLoop;

import java.util.Scanner;

public class C08_StringiTerstenYazdirma {
    public static void main(String[] args) {
        //Kullanıcıdan bir String isteyin ve Stringi tersten yazdırın
        //orn input : Sabri output : isbaS

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir isim giriniz :");
        String isim = scanner.nextLine();


        for (int i = isim.length()-1; i >=0; i--) {
            System.out.print(isim.charAt(i));
        }



    }
}
