package K11_StringManupulations.Ders03;

import java.util.Scanner;

public class C08_lastIndexof {
    public static void main(String[] args) {
        // Kullanicidan bir cumle ve cumlede aratilacak bir metin isteyin
        // girilen cumle ve metin'e gore asagidaki 3 sonucdan uygun olani yazdirin
        // 1- cumle aranan metni icermiyor
        // 2- cumle aranan metni sadece 1 adet iceriyor
        // 3- cumle aranan metni 1'den fazla iceriyor


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz...");
        String cumle = scanner.nextLine();

        System.out.println("Lutfen cumlede aranacak metni girin...");
        String metin = scanner.nextLine();

        int metinIlkIndex = cumle.indexOf(metin);
        int metinSonIndex = cumle.lastIndexOf(metin);

        if (metinIlkIndex == -1){
            System.out.println("cümle arananı içermiyor");
        } else if (metinIlkIndex == metinSonIndex) {
            System.out.println("cümle arananı bir kez içeriyor");
            }
        else {
            System.out.println("cümle aranan metni birden fazla içeriyor" );
        }

    }
}
