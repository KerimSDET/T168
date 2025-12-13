package K13_MethodOlusturmaVeKullanma.Ders02_MethodOlusturmaOrnekSorular;

import java.util.Scanner;

public class C08_DogruSifreAlma {

    public static void main(String[] args) {

        /*
        Kullanıcıdan bir şifre isteyim
        c07 deki methodu kullanarak şifreyi kontrol edin
        ve şifre uygun olarana kadar tekrar edin
        şifre uygun olana kadar kaç denemede uygun olduğuu yazıdırın
         */

        Scanner scanner =new Scanner(System.in);
        String sifre ="";
        boolean sifreGecerliMi =false;

        for (int i = 1; i < 10000; i++) {

            System.out.println("lÜtfen şifrenizi griiniz : ");

            sifre =scanner.nextLine();

            //şifre geçerli mi kontrol edelim sonucu kaydedelim

            sifreGecerliMi=C07_SifreKontrol.sifreGecerliMi(sifre);

            if (sifreGecerliMi == true){
                System.out.println(i+" denemede şifre oluşturdunuz");
                break;

            }

        }
    }
}
