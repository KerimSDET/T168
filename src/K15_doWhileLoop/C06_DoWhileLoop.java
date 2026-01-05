package K15_doWhileLoop;

import java.util.Scanner;

public class C06_DoWhileLoop {
    public static void main(String[] args) {
        /*
        Kullanıcıdan başlangıç ve bitiş harflerini alıp
        o harfleri ve aralarındanki harfleri yazdırın
        kullanıcı bir harf değil metin girerse uyarı verip yeniden harf girmesini
        isteyin kullanıcı harf girinceye kadar tekrar isteyin
         */
        Scanner scanner = new Scanner(System.in);


        char baslangic = 'a';
        char bitis = 's';
        String girilenBaslangic = "";
        String girilenBitis = "";

        do {

            System.out.println("LÜtfen başlangıç için bir harf giriniz : ");
            girilenBaslangic=scanner.nextLine();
            baslangic=girilenBaslangic.charAt(0);

            System.out.println("LÜtfen bitiş için bir harf giriniz : ");
            girilenBitis=scanner.nextLine();
            bitis = girilenBitis.charAt(0);

            if ((girilenBaslangic.length()>1) || girilenBitis.length()>1){
                System.out.println("Başlangıç değeri ve bitiş değeri olarak harf girmelisiniz.!");
            } else if (!Character.isLetter(baslangic) || !Character.isLetter(bitis)){ //girilenBaslangic ve girilenBitis tek karakter

                System.out.println("Girdiğiniz karakter harf olmalıdır.");

            } else {  // kullanıcı tek karakter girdi ve karakter de harf

                // a f girdi mesela
                while (baslangic<=bitis){
                    System.out.println(baslangic+" ");
                    baslangic++;
                }

            }



        } while (girilenBaslangic.length()>1 || girilenBitis.length()>1 || Character.isLetter(baslangic) || Character.isLetter(bitis)) ;



    }
}
