package K08_ifElseStatements.D01_bigimsizIfCumleleri;

import java.util.Scanner;

public class C07_BagimsizIfCumleleri_FlagYontemi {
    public static void main(String[] args) {



        // Kullanicidan iki tamsayi isteyin

        // girilen sayilara gore asagidaki degerlendirmeleri yazdirin
        // 1- sayi1 < sayi2 ise "birinci sayi daha kucuk"
        // 2- sayi1 pozitif ise "birinci sayi sifirdan buyuk"
        // 3- sayi2 50'den buyuk ise "ikinci sayi 50'den buyuk"
        // 4- sayi2 5 ile bolunebiliyorsa "ikinci sayi 5'in tam kati"
        // 5- EGER konsolda yukardakilerden hicbiri yazdirilmazsa
        //    "Nasil sayi sectiniz , hicbir sarti saglamiyor" yazdirin
        //Sayılar tüm şartları karşılıyorsa sayılar mükemmel diyeceğiz.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 2 tam sayı giriniz :");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        int flag = 23;


        if (sayi1 < sayi2) {
            System.out.println("Birinci sayı daha küçük");
            flag =42;
        }

        if (sayi1 > 0) {
            System.out.println("Birinci sayı sıfırdan büyük");
            flag =42;
        }

        if (sayi2 > 50) {
            System.out.println("İkinci sayı 50'den büyük");
            flag =42;
        }

        if (sayi2 % 5 == 0) {
            System.out.println("İkinci sayı 5'in tam katı");
            flag =42;
        }


        // 5- EGER konsolda yukardakilerden hicbiri yazdirilmazsa
        //    "Nasil sayi sectiniz , hicbir sarti saglamiyor" yazdirin
        // şartını için 3 farklı yçntem uygulanır.

        //Sona gelindiğinde flag için 2 ihtimal var ya 23 ya da 42 olacak

        if (flag ==23){
            System.out.println("Sayılar Uygun Değil");
        }

        if (flag ==42) {
            System.out.println("Sayılar Mükemmel");
        }

    }
}
