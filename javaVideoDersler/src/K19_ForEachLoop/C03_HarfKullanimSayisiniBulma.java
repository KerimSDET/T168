package K19_ForEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class C03_HarfKullanimSayisiniBulma {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir cümle ve bir harf alın
        harf cümlede kullanılmışsa kaç kere kullanıldığını yazdırın
        kullanılmadıysa "harf cümlede kullanılmamış" yazdırın
         */


        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen bir cümle giriniz :");
        String cumle = input.nextLine();
        //java bizi düşünür her türlü seçeneği hazırlar.

        System.out.println("Lütfen aranacak harfi giriniz :");
        String aranacakHarf = input.nextLine().substring(0,1);


        String[] karakterlerArr = cumle.split("");

        System.out.println(Arrays.toString(karakterlerArr));
        //j,a,v,a, ,b,i,z,i, ,d,ü,ş,ü,n,ü,r, ,h,e,r, ,t,ü,r,l,ü, ,s,e,ç,e,n,e,ğ,i, ,h,a,z,ı,r,l,a,r,.

        int sayac =0;

        for(String each :karakterlerArr) {

            if (each.equals(aranacakHarf)) {
                sayac++;
            }
        }

            if (sayac==0){
                System.out.println("Aranan harf cümlede hiç kullanılmamıştır.");
            } else {
                System.out.println("Aranan "+aranacakHarf+" harfi cümlede "+sayac+" defa kullanılmıştır.");
            }
        }


    }

