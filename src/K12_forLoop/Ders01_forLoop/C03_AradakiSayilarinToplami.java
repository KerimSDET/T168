package K12_forLoop.Ders01_forLoop;

import java.util.Scanner;

public class C03_AradakiSayilarinToplami {

    public static void main(String[] args) {
        /*
        Kullanıcıdan başlangıç ve bitiş değeri olarak pozitif sayılar alın (aldık)
        Sınırlar dahil olarak aralarındaki tüm sayıların toplamını yazdırın
        Bitiş değeri başlangıç değerinden küçükse uyarı yazdırıp işlemi sonlandırın. (eğer) - yaptık
         */

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Lütfen bir başlangıç değeri olarak pozitif bir tamsayı giriniz :");
        int baslangicDegeri = scanner1.nextInt();

        System.out.println("Lütfen bir bitiş değeri olarak pozitif bir tamsayı giriniz :");
        int bitisDegeri = scanner1.nextInt();

        if (bitisDegeri<baslangicDegeri) {
            System.out.println("Bitiş değeri, başlangıç değerinden küçük olamaz!! Yeniden denemelisin");
        } else {

            int toplam =0;  // en başta bi toplam değeri atadık sıfır dedik.

            for (int i = baslangicDegeri; i <= bitisDegeri; i++) {
                toplam+=i;
            }
            System.out.println("Girdiğiniz değerler dahil tüm " +toplam);
        }




    }
}
