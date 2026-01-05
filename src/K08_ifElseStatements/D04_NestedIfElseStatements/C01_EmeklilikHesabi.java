package K08_ifElseStatements.D04_NestedIfElseStatements;

import java.util.Scanner;

public class C01_EmeklilikHesabi {
    public static void main(String[] args) {

// Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        // veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.
        // kullanici E ve K disinda bir cinsiyet girerse
        // veya 15 yasdan kucuk, 80 yasdan buyuk yas girerse uyarin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Cinsiyetinizi Giriniz. E:Erkek, K:Kadın");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        // kullanici kucuk buyuk harf girebilir diye
        // kontrolu kolay yapabilmek icin toUpperCase() kullandik


        System.out.println("Lütfen yaşınızı giriniz :");
        double yas = scanner.nextDouble();



        /*
            Eger bir if else'de karar vermek icin baktigimiz
            variable sayisi birden fazla ise nested if else statement tercih edilebilir

            Oncelikle bakacagimiz 2 degiskenden birini
            ana degısken kabul edip sadece ona gore bir if else olustururuz

            biz cinsiyeti ana degisken kabul edelim
         */



        if (cinsiyet=='K'){ //Bu süzgeçten sadege kadınlar geçeceği için yaşı kadınlara göre değerlendirebiliriz.
            if (yas<15 || yas>80){
                System.out.println("Girilen yaş için emeklilik kontrol edilemez.");
            } else if (yas>=60) {
                System.out.println("Kadın, 60 yaşınadna büyük, emekli olabilir.");
            } else {
                System.out.println("Emekli olmak için "+(60-yas)+" yıl daha çalışmalı");
            }


        } else if (cinsiyet=='E') {
            if (yas<15 || yas>80){
                System.out.println("Girilen yaş için emeklilik kontrol edilemez.");
            } else if (yas>=65) {
                System.out.println("Erkek, 60 yaşınadna büyük, emekli olabilir.");
            } else {
                System.out.println("Emekli olmak için "+(65-yas)+" yıl daha çalışmalı");
            }

            
        } else System.out.println("Cinsiyet olarak E veya K Seçmelisiniz.");
    }
}
