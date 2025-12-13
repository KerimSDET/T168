package T168;

import java.util.Scanner;

public class S01 {
    public static void main(String[] args) {

//        Soru 1 – Sayı Aralığındaki Çift ve Tek Sayıları Yazdırma
//        Kullanıcıdan 1 adet pozitif sayı isteyin.
//        1’den başlayarak girilen sayıya kadar olan tüm sayıları yazdırın.
//                Sayı tek ise → "X tektir"
//        Sayı çift ise → "X çifttir"

//        Bu soruda:
//:heavy_check_mark: Scanner
//        :heavy_check_mark: for loop
//        :heavy_check_mark: if–else
// :heavy_check_mark: Mod (%)
// :heavy_check_mark: Sayı kontrolü
//        kullanman gerekiyor.


        Scanner scanner1= new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tam sayı giriniz :");
        int tamSayi = scanner1.nextInt();

        if (tamSayi<=0){
            System.out.println("Girilen sayı bizim için uygun değildir.");
        } else {
            for (int i = 1; i <=tamSayi ; i++) {
                //System.out.println(i);

                if (i%2==0){
                    System.out.println(i+" sayısı çifttir.");
                } else {
                    System.out.println(i+" sayısı tektir.");

                }


            }


        }

    }
}
