package K22_passByValue;

public class C04_IndirimliFiyatYadirma {
    public static void main(String[] args) {


        // 3 farkli method olusturup
        // verilen fiyat variable'ina %10, %20 ve %40 indirim yapin
        // method'larda fiyatin indirimli halini kaydedip
        // "urunun %10 indirimli fiyati : 90" seklinde yazdirin


        double fiyat = 200;

        indirimliFiyatYazdir10(fiyat);

        indirimliFiyatYazdir20(fiyat);

        indirimliFiyatYazdir30(fiyat);
        indirimliFiyatYazdir10(fiyat);

    }

    public static void indirimliFiyatYazdir10 (double fiyat) {
        fiyat = fiyat * 90/100;

        System.out.println("%10 indirimli fiyat = " + fiyat);
    }

    public static void indirimliFiyatYazdir20 (double fiyat) {
        fiyat = fiyat * 80/100;
        System.out.println("%20 indirimli fiyat = " + fiyat);
    }

    public static void indirimliFiyatYazdir30 (double fiyat) {
        fiyat = fiyat * 70/100;
        System.out.println("%30 indirimli fiyat = " + fiyat);
    }



}
