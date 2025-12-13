package Day04_forLoop;

import java.util.Scanner;

public class C07_RakamlarToplamiBulma {
    public static void main(String[] args) {
        //Kullanıcıdanbir tam sayı alıp rakamlar toplamını yazıdırn

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı giriniz :");
        int tamSayi = scanner.nextInt();

        int birlerBasamagindakiRakam = 0;
        int rakamlarToplami = 0;
        int sayi = tamSayi;
        
        //Aşağıdaki 3 adımı basamak sayısı kadar tekrar etmeliyiz.


        int basamakSayisi =(sayi+"").length();

        for (int i = 1; i <= basamakSayisi; i++) {

            birlerBasamagindakiRakam =sayi%10;
            rakamlarToplami=rakamlarToplami+birlerBasamagindakiRakam;
            sayi=sayi/10;
        }
        System.out.println("Girilen "+tamSayi+" sayısının rakamlar toplamı: "+rakamlarToplami);

        
    }
}
