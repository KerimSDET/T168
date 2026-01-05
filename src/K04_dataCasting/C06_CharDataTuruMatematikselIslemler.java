package K04_dataCasting;

public class C06_CharDataTuruMatematikselIslemler {

    public static void main(String[] args) {

        String str1 = "java";
        String str2 = "candir";

        System.out.println(str1 + str2); // javacandir

        // char data turundeki variable'lar veya degerler
        // MATEMATIKSEL islemlerde kullanirsa
        // harf veya karakter olarak degil
        // ASCII table'daki int degerleri ile isleme girerler

        char chr1 = 'a';
        char chr2 = 'b';
        char chr3 = 'c';

        System.out.println( chr1 + chr2 + chr3 ); // 97 + 98 + 99 ==> 294
        System.out.println( 'a' + 'b' + 'c'); // 97 + 98 + 99 ==> 294



        // sayi olarak verilmis bir degerin char karsiligini yazdirin

        int sayi = 120;

        System.out.println(  (char)sayi  ); // x

        System.out.println(  (char)(65) + ", " +  (char)(66) + ", " + (char)(67)   );

        // verilen bir harfin sonrasindaki 3 karakteri yazdirin
        // Orn : verilen harf : k ise sonraki 3 karakter : l, m, n

        char verilenharf = 't';

        System.out.println(

                (char)(verilenharf + 1) + ", " +
                        (char)(verilenharf + 2) + ", " +
                        (char)(verilenharf + 3)

        );


        // verilen bir karakterin 'k' dan sonra olup olmadigini yazdirin

        System.out.println(  'k' < 'm'  ); // 108 < 110 ==> true
        System.out.println(  'k' < 'a'  ); // 108 < 97 ==> false
        System.out.println(  'x' < 'z'); // true



    }
}