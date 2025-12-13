package K11_StringManupulations.Ders05;

import java.util.Scanner;

public class C04_MetinDegistirme {
    public static void main(String[] args) {

        //  Kullanicidan bir String alin,
        //  String’in uzunlugu cift sayi ise tam ortasina :) ekleyin,
        //  String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :( yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir metin girin: ");
        String str = scanner.nextLine();

        int uzunluk =str.length();

        if (str.length()%2==0){
            System.out.println(
            str.substring(0,uzunluk/2)+":)"+
                    str.substring(uzunluk/2)
            );
        } else {
            System.out.println(
                    str.substring(0,uzunluk/2)+
                            ":("+
                            str.substring(uzunluk/2+1)

            );

        }

    }
}
