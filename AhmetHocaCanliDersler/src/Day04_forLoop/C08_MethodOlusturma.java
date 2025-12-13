package Day04_forLoop;

import java.util.Scanner;

public class C08_MethodOlusturma {

    public static void main(String[] args) {
        /*
        kullanıcıdan alınan bir metinden
        kullanıcının girdiği başlangı. ve bitiş indeksi arasındaki kısmı yazdırın

        Kurallar:
        1-eğer başlangı veya bitiiş indeksi negatif veya metnin sinirlari dışında ise hata verin
        2-başlangıç ndeksi biriş indeksinden büyükse uyarı verin
        3-başlangı indeksini karakter dahil bittiş indexini karakter hari olmalıdır
         */

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen bir mesaj giriniz :");
        String girilenMesaj =scanner.nextLine();

        System.out.println("Başlangıç indeksini giriniz :");
        int basIndex = scanner.nextInt();

        System.out.println("Bitiş indeksini giriniz :");
        int bitIndex = scanner.nextInt();

        if (basIndex<0|| bitIndex<0||basIndex>=girilenMesaj.length() || bitIndex>=girilenMesaj.length()){
            System.out.println("Girilen index kullanılabiler sınırlar dışında");
        } else if (basIndex>bitIndex) {
            System.out.println("Başlangıç indeksi bitiş indeksinden büyük olamaz.");
        } else {
            for (int i = basIndex; i < bitIndex; i++) {
                System.out.print(girilenMesaj.charAt(i));
            }

            System.out.println("");
            System.out.println(girilenMesaj.substring(basIndex,bitIndex));

        }
    }
}
