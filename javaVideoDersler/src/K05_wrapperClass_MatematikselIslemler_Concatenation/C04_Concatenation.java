package K05_wrapperClass_MatematikselIslemler_Concatenation;

public class C04_Concatenation {
    public static void main(String[] args) {

        //Stringde yapılan toplama işleminin adıdır. Kısaca Concat

        //İşin içinde String varsa devamı tamamen String olarak algılar java

        //Bir String ile herhangi bir primitive data türündeki değeri + toplarsak
        //Java String yanına geleni de String'leştirir.

        System.out.println("Ali" + 3 +4+5+6);
        System.out.println("A" + true + 'd' + 45.6 + 34.5f);
        System.out.println(3 +'a' +"Ali"); //a 'nın char değeri 97  olduğu için önce matematik işlemini yaptı

        System.out.println(" " +3+4); //34 olarak yazdırmak için bunu stringleştirmek lazım
        System.out.println(3+""+4); //34 olarak yazdırmak için bunu stringleştirmek lazım

        //herhangi bir değeri hi. değiştirmeden Stringleştirmek için "" hiçlik kullanılır


        //String  + işlemi CONCATENATION (birleştirme) demektir.
        // + dışında hiçbir matematiksel işlem String ile kullanılmaz.

        String str ="a";
        System.out.println(str+5); //a5


        // Aşağıda verilen variable'ları kullanarak
        //istenen Stringleri yazdırın

        String s1 = "Java";
        String s2 = " ";
        String s3 = "Candır";
        String s4 = "";

        int a = 3;
        int b = 4;

        //12 Java Candır
        System.out.println((a*b)+s2+s1+s2+s3);


        //7 Java

        System.out.println(a+b+s2+s1);


        //34 Candır

        System.out.println(s4+a+b+s2+s3);


        //Java12Candır

        System.out.println(s1+(a*b)+s3);


        //Java34Candır

        System.out.println(s1+a+b+s3);





    }
}
