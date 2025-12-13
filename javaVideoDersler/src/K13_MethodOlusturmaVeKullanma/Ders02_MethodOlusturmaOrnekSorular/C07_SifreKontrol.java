package K13_MethodOlusturmaVeKullanma.Ders02_MethodOlusturmaOrnekSorular;

public class C07_SifreKontrol {

    public static void main(String[] args) {


        /*
        Soru:
        aşağıda verilen şartları kontrol edip
        kullanıcıya düzeltmesi gereken tüm eksiklikleri yazdıran,
        tüm şartları kontrol ettikten sonra
        şifrede hata yoksa true hata varsa false donduren
        bir method oluşturun

        -ilk harf kucuk olmalı
        -son karakter rakam olmalı
        -sifre bosluk içermemeli
        -uzunluğu en az 10 karakter olmalı

         */

        System.out.println(sifreGecerliMi("dgksdkgfds2"));
    }

    public static boolean sifreGecerliMi (String sifre){
        int sayac = 0;

        //         - ilk harf kucuk harf olmali

        char ilkHarf = sifre.charAt(0);

        if (!Character.isLowerCase(ilkHarf)){
            System.out.println("İlk harf küçük harf olmalı");
            sayac++;
        }

        //         - son karakter rakam olmali
        char sonKarakter = sifre.charAt(sifre.length()-1);

        if (!Character.isDigit(sonKarakter)){
            System.out.println("Son karakter rakam olmalı");
            sayac++;
        }

        if (sifre.contains(" ")){
            System.out.println("Şifre boşluk içermemeli");
            sayac++;
        }

        if (!(sifre.length()>=10)){
            System.out.println("Şifre uzunluğu en az 10 karakter olmalı");
            sayac++;
        }

        if (sayac==0){

            //System.out.println("Şifre başarıyla kaydedildi");

            return true;
        } else {
            return false;
        }

    }


}
