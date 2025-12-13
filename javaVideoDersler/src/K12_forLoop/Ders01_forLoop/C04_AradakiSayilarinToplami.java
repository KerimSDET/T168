package K12_forLoop.Ders01_forLoop;

import java.util.Scanner;

public class C04_AradakiSayilarinToplami {
    public static void main(String[] args) {

        //  Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        //  sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        //  Bitis degeri baslangic degerinden kucuk olsa da program calissin


        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Lütfen bir başlangıç değeri olarak pozitif bir tamsayı giriniz :");
        int baslangicDegeri = scanner1.nextInt();

        System.out.println("Lütfen bir bitiş değeri olarak pozitif bir tamsayı giriniz :");
        int bitisDegeri = scanner1.nextInt();


        int toplam =0;

        if (baslangicDegeri<bitisDegeri){

            for (int i = baslangicDegeri; i <= bitisDegeri; i++) {
                toplam+=i;
            }
            System.out.println("Girdiğiniz değerler dahil tüm " +toplam);
        } else {
            for (int i = bitisDegeri; i <= baslangicDegeri; i++) {
                toplam+=i;
            }
            System.out.println("Girdiğiniz değerler dahil tüm " +toplam);

        }

    }
}
