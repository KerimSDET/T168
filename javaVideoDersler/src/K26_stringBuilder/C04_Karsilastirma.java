package K26_stringBuilder;

public class C04_Karsilastirma {
    public static void main(String[] args) {

        String str = "Kerem";
        StringBuilder sb1 = new StringBuilder("Kerem");
        StringBuilder sb2 = new StringBuilder("Kerem");

        //aynı metne sahip olan str, sb1 ve sb2 uyi karşılaştıralım
        //1 - == ile karşılaştıralım
        System.out.println(sb1 == sb2);  // false
        //System.out.println(str ==sb1); //izin vermiyor
        /*
        Java nın primitive data türlerinden farklı data türlerinin == ile karşılaştırılmasına izin vermez.
        StringBuilder'lari == ile karşılaştırırsanız
        Java bu karşılaştırmaya itiraz etmez ama sonuç her zaman false döner.

         */

        System.out.println(str.equals(sb1)); //false itiraz etmez ama sonu. her zaman false döner
        System.out.println(sb1.equals(sb2)); // false


        // 3- compareTo() ile karsilastiralim

        StringBuilder sb3 = new StringBuilder("Java");
        StringBuilder sb4 = new StringBuilder("Tava");
        StringBuilder sb5 = new StringBuilder("java");
        StringBuilder sb6 = new StringBuilder("Tele");
        StringBuilder sb7 = new StringBuilder("Tema");
        StringBuilder sb8 = new StringBuilder("Java");

        /*
            StringBuilder'larin metinsel esitligi compare() kontrol edilir
            compareTo() ile 2 StringBuilder karsilastirildiginda sonuc 0 ise
            bu iki StringBuilder metinsel olarak AYNI demektir
            sonuc 0 degilse metinler ayni degil demektir

            compare() ilk karakterlerden baslayarak
            her iki StringBuilder'daki tum index'lerdeki karakterleri compare eder
            EGER bir index'de ayni olmayan karakterler bulursa
            bu iki karakter arasindaki ASCII deger farkini yazdirir

         */

        System.out.println(sb3.compareTo(sb4)); // Java <==> Tava   -10  J K L M N O P Q R S T
        System.out.println(sb3.compareTo(sb5)); // Java <==> java   -32
        System.out.println(sb3.compareTo(sb6)); // Java <==> Tele   -10
        System.out.println(sb6.compareTo(sb7)); // Tele <==> Tema   -1 T-T, e-e, l-m l m'den 1 geride ==> -1
        System.out.println(sb3.compareTo(sb8)); // Java <==> Java   J-J, a-a, v-v, a-a farkli karakter yok ==> 0

    }
}
