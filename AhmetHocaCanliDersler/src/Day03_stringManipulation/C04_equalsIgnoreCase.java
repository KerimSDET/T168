package Day03_stringManipulation;

public class C04_equalsIgnoreCase {
    public static void main(String[] args) {
        //equals() ie benzer işleve sahiptir.
        //ancak equals()'dan farklı olarak
        //metinler aynı ise "BÜYÜK KÜÇÜK HARF farklılıklarını ignore eder. görmezden gelir



        String str1 = "Bulut";
        String str2 = "BULUT";
        String str3 = "bulut";
        String str4 = "BuluT";
        String str5 = "BULut";
        String str6 = "bUlUt";

        System.out.println(str1.equals(str2)); //
        System.out.println(str1.equals(str3)); //
        System.out.println(str1.equals(str4)); //
        System.out.println(str1.equals(str5)); //
        System.out.println(str1.equals(str6)); //


        System.out.println(str1.equalsIgnoreCase(str2)); //
        System.out.println(str1.equalsIgnoreCase(str3)); //
        System.out.println(str1.equalsIgnoreCase(str4)); //
        System.out.println(str1.equalsIgnoreCase(str5)); //
        System.out.println(str1.equalsIgnoreCase(str6)); //


        //Herşeyiyle birebir aynı olması lazım boşluk girerse false verir
    }
}
