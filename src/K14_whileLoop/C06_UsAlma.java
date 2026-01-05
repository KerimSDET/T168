package K14_whileLoop;

public class C06_UsAlma {
    public static void main(String[] args) {

        /*
        verilen bir sayı ve pozitif us için
        while loop kullanarak verilen sayının istnen
        ussunu hesaplayıp yazdıran
        bir method oluşturun

         */
        usHesaplaYazdir(2,5);

        usHesaplaYazdir(9,4);

        usHesaplaYazdir(2,8);

    }

    public static void usHesaplaYazdir (double sayi, int pozitifUs){

        double sonuc =1;
        while (pozitifUs>0){
            sonuc*=sayi;
            pozitifUs--;
        }
        System.out.println(sonuc);
    }
}
