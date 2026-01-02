package K26_stringBuilder;

public class C03_StringBuilderMethod {

    public static void main(String[] args) {


        StringBuilder sb=new StringBuilder("Java candır.");

        //sb a içerir mi?

        /*
        Not : StringBuilder'da olmayan ama String'de olan methodları kullanmak isterseniz
        toString() ile String dönüştürüp istediğimiz methodlari kullanabiliriz.
         */

        System.out.println(sb.toString().contains("a")); //true

        System.out.println(sb.substring(0,4)); //Java
        System.out.println(sb); //Java candır. değişiklikler kalıcı değiller
        //Stringbuilder methodları olursa kalıcı olurdu. ancak bunlar toString ile Stringe çevrilerek kullanıldı.

        System.out.println(sb.length());


    }


}
