package K11_StringManupulations.Ders03;

import java.util.Scanner;

public class C06_kullanimSayisiBulma {
    public static void main(String[] args) {

        // Kullanicidan bir cumle ve cumlede aratilacak bir metin isteyin
        // girilen cumle ve metin'e gore asagidaki 3 sonucdan uygun olani yazdirin
        // 1- cumle aranan metni icermiyor
        // 2- cumle aranan metni sadece 1 adet iceriyor
        // 3- cumle aranan metni 1'den fazla iceriyor


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen mesajınızı giriniz :");
        String mesaj = scanner.nextLine();

        System.out.println("Lütfen cümlede aranacak kelime veya harfi giriniz :");
        String aranacak = scanner.nextLine();

        int birinciKullanim = mesaj.indexOf(aranacak);

        int ikinciKullanim = mesaj.indexOf(aranacak,birinciKullanim+1);

        //ikinci kullanım yoksa değeri -1 olur

        if (birinciKullanim ==-1){
            System.out.println("Aradıınız değer hiç bulunnmamaktadır");
        } else if (ikinciKullanim ==-1){
            System.out.println("Aradığınız değer sadece bir kez var");
        } else {
            System.out.println("Aranan değeri birden fazla içeriyor");
        }

    }
}
