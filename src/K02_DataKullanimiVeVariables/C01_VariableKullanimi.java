package K02_DataKullanimiVeVariables;

public class C01_VariableKullanimi {
    static void main() {

        int sayi =20 ;

        System.out.println("Hesabım : " +sayi +" TL");
        System.out.println("Benim adım Cemil, ne istersem yaparım...");
        System.out.println("Sayı");

        //Java'da bir metin yazdırmak ile
        //bir variable'in değerini yazdırmak farklı şeylerdir.
        /*
        Bir metin yazdırmak istediğimizde "" kullanırız.
       ve Java "" içinde ne görüyorsa konsolda onun aynısını yazdırır.
       variable'in değerini yazdırmak istediğimizde SADECE variable ismini yazarız.
         */

        System.out.println("Sayı Variable'inin değeri :" +sayi);

        int yas = 42;
        System.out.println("Benim yaşım : " +yas);

        System.out.println("Yaş variable'inin 23. satırdaki değeri : " +yas);
        //Yaş variable'inin 23. satırındaki değeri : 42


        yas = yas +5;

        System.out.println("Yaş variable'inin 28. satırdaki değeri : " + yas);
        //Yaş variable'inin 29. satırındaki değeri : 47

        yas = 2 * yas +2;

        System.out.println("Yaş variable'inin 34. satırdaki değeri : " + yas);
        //Yaş variable'inin 34. satırındaki değeri : 42


    }
}
