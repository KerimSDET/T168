package K14_whileLoop;

import java.util.Scanner;

public class C02_whileLoopVsForLoop {

    public static void main(String[] args) {

        /*
        kullanıcıya istediği kadar pozitif sayı girmesini söyleyin
        girilen sayılar pozitif ise sayıyı toplama ekleyin.
        girilen sayı negatif ise uyari verin ve sayıyı işleme almayın
        girilen sayı 0 olduğunda işlemi bitirin
        ve kaç tane pozitif sayı girildiğini ve
        toplamlarının kaç olduğunu söyleyin
         */


        Scanner scanner = new Scanner(System.in);


        int girilenSayi =10; // sıfırın dışında bir değer olmalı.
        // kullanıcı = değeri girince kodun bitmesi isteniyor.

        int toplam =0;
        int sayac=0;

        while (girilenSayi!=0){
            System.out.println("Lütfen toplanmak üzere pozitif bir tamsayı giriniz : "+
                    "\nbitirmek için 0'a basınız...:");

            girilenSayi= scanner.nextInt();

            if (girilenSayi>0){
                toplam+=girilenSayi;
                sayac++;
            }else if (girilenSayi<0){
                System.out.println("Negatif sayı kabul edilmez.!!");
            }
        }
        System.out.println("Girilen "+sayac+" adet pozitif tamsayının toplamı : "+toplam);








    }
}
