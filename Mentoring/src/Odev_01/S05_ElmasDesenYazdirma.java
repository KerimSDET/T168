package Odev_01;

import java.util.Scanner;

public class S05_ElmasDesenYazdirma {
    public static void main(String[] args) {
        /*5-----
    Aşağıdaki elmas deseni görüntüsünü çizen java kodunu yazınız.
    Test Data:
    Yarım elmas uzunluğu : 7
    Beklenen Çıktı:
          *
         ***
        *****
       *******
      *********
     ***********
    *************
     ***********
      *********
       *******
        *****
         ***
          *
    */


        Scanner scannerElmas =new Scanner(System.in);
        System.out.print("Lütfen elmas çizmek için yarım elmas uzunluğu değeri giriniz :");
        int girilenSayi = scannerElmas.nextInt();

        int katSayisi = girilenSayi*2-1;
        System.out.println("Elmas katSayisi :" +katSayisi);

        int kemerGenisligi =katSayisi;
        System.out.println("Kemer Genişliği :"+kemerGenisligi);

        String sus ="=";
        for (int e = 0; e <=kemerGenisligi; e++) {
            System.out.print(sus);

        }
        System.out.println();


        //bu kodlarla girilen elmas yarım kat sayısına gör eher katta olması gereken * adetlerini de gördüm.
        for (int i = 1; i <=girilenSayi ; i++) { //bu kod bana ORTA KEMERE KADAR elmaS yüksekliğini verdi.

            for (int s = 1; s <=girilenSayi-i ; s++) { //burada satır numarasına göre olması gereken boşluğu hesapladım
                System.out.print(" "); //çalışırken s tanımladığım yere şimdi " " koydum
            }

            for (int y = 1; y <=(2*i-1); y++) { //burada ise satır sayısına göre olması gereken * hesapladım
                System.out.print("*");

            }
            System.out.println();

        }


        for (int i = girilenSayi-1; i >=1 ; i--) { //bu kod bana ORTA KEMERDEN sonra elmaS yüksekliğini verdi.
            //(girilenSayi-i) tersine katlarda olması gereken yıldız sayısı
            for (int s = 1; s <=(girilenSayi-i); s++) { //burada satır numarasına göre olması gereken boşluğu hesapladım
                System.out.print(" "); //çalışırken s tanımladığım yere şimdi " " koydum
            }

            for (int y = 1; y <=(i*2-1); y++) { //burada ise satır sayısına göre olması gereken * hesapladım
                System.out.print("*");
            }
            System.out.println();

        }

    }


}











/*
en geniş kemek karakter sayısı

 */