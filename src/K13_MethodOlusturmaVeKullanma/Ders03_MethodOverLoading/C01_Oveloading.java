package K13_MethodOlusturmaVeKullanma.Ders03_MethodOverLoading;

public class C01_Oveloading {

    public static void main(String[] args) {


        /*
        Java'da bir class içerisinde aynı isim ve aynı parametrelere sahip,birden fazla method OLUŞTURULAMAZ


         Java'da AYNI CLASS içerisinde AYNI ISIMDE method oluşturmak isterseniz
         bu methodların SIGNATURE'ları farklı olmalıdır.

         Method Signatur = method adi + parametrelerin dizilişi

         Bir class'da ISMI AYNI ama SIGNATURE'i farklı methodlar oluşturulmasına
         OVERLOADING denir.


         */




    }

    public static void topla(int sayi1, int sayi2){
        System.out.println("İki int sayının toplamı . "+ (sayi1+sayi2));
    } //topla int int

    public static void tplm(int sayi1, int sayi2){
        System.out.println("İki int sayının toplamı . "+ (sayi1+sayi2));
    } //topla int int bu overloading değil!!

    public static void topla(int sayi1, int sayi2, int sayi3){
        System.out.println("İki int sayının toplamı . "+ (sayi1+sayi2+sayi3));
    } //topla int int int

    public static void topla(int sayi1){ //izin verir
        System.out.println("İki int sayının toplamı . "+ (sayi1+sayi1));
    } //topla int

    public static void topla(double sayi1, int sayi2){ //izin verir
        System.out.println("İki int sayının toplamı . "+ (sayi1+sayi2));
    } //topla double int

    public static void topla(int sayi1, double sayi2){ //izin verir
        System.out.println("İki int sayının toplamı . "+ (sayi1+sayi2));
    } //topla  int double

}
