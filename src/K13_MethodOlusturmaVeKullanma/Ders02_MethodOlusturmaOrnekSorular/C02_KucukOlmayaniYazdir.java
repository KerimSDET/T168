package K13_MethodOlusturmaVeKullanma.Ders02_MethodOlusturmaOrnekSorular;

public class C02_KucukOlmayaniYazdir {
    public static void main(String[] args) {
        //verilen iki tamsayının küçük olmayanı yazdıran bir method oluşturun


        kucukOlmayaniYAzdir(14,48);

        kucukOlmayaniYAzdir(-34,34);

        kucukOlmayaniYAzdir(22,9945);

    }

    public static void kucukOlmayaniYAzdir (int sayi1, int sayi2) {
        System.out.println(sayi1<sayi2? sayi2 :sayi1);
    }
}
