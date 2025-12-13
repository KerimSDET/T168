package K08_ifElseStatements.D02_IfElseStatements;

import java.util.Scanner;

public class C04_KucukHarfDegistirme {
    public static void main(String[] args) {

        //Soru : Kullanıcıdan bir karakter isteyin
        // Girilen karakter küçük harf ise onu büyük harf olarak yazdırın.
        // yoksa girilen karakteri girildiği gibi yazdırın.


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz : ");
        char harf = scanner.next().charAt(0);

        //1. yöntem ascii table kullanarak yazdırma

        if (harf >='a' && harf <='z') {
            System.out.println((char)(harf-32));
        } else {
            System.out.println(harf);
        }


        //2. Yöntem Wrapper Class özelliklerini kullanarak yazdır

        if (Character.isLowerCase(harf)){
            System.out.println(Character.toUpperCase(harf));
        } else {
            System.out.println(harf);
        }



    }
}
