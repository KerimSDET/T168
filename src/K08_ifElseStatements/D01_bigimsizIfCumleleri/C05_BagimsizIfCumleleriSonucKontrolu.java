package K08_ifElseStatements.D01_bigimsizIfCumleleri;

import java.util.Scanner;

public class C05_BagimsizIfCumleleriSonucKontrolu {
    public static void main(String[] args) {


// Kullanicidan iki tamsayi isteyin

        // girilen sayilara gore asagidaki degerlendirmeleri yazdirin
        // 1- sayi1 < sayi2 ise "birinci sayi daha kucuk"
        // 2- sayi1 pozitif ise "birinci sayi sifirdan buyuk"
        // 3- sayi2 50'den buyuk ise "ikinci sayi 50'den buyuk"
        // 4- sayi2 5 ile bolunebiliyorsa "ikinci sayi 5'in tam kati"
        // 5- EGER konsolda yukardakilerden hicbiri yazdirilmazsa
        //    "Nasil sayi sectiniz , hicbir sarti saglamiyor" yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 2 tam sayı giriniz :");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        if (sayi1<sayi2) {
            System.out.println("Birinci sayı daha küçük");
        }

        if (sayi1>0) {
            System.out.println("Birinci sayı sıfırdan büyük");
        }

        if (sayi2>50) {
            System.out.println("İkinci sayı 50'den büyük");
        }

        if (sayi2%5==0){
            System.out.println("İkinci sayı 5'in tam katı");
        }


        // 5- EGER konsolda yukardakilerden hicbiri yazdirilmazsa
        //    "Nasil sayi sectiniz , hicbir sarti saglamiyor" yazdirin
        // şartını için 3 farklı yçntem uygulanır.


        System.out.println("Birinci Yöntem");

        if (!(sayi1<sayi2) && !(sayi1>0)  && !(sayi1>0)  && !(sayi2%5==0)) {
            System.out.println("Nasıl sayı seçtiniz, hiçbir şartı karşılamıyor.");}


//        System.out.println("İkinci Yöntem");
//
//        if () {
//            System.out.println("Nasıl sayı seçtiniz, hiçbir şartı karşılamıyor.");}





    }
}
