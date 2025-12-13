package K11_StringManupulations.Ders04;

import static java.util.Collections.replaceAll;

public class C05_replaceAll {
    public static void main(String[] args) {

        String str = "Ali okula gitti, 3 saat sonra gelecek";


        //tüm t leri T yapın

        //3ün yerine 2 yazın

        System.out.println(str);
        System.out.println(str.replace("t","T"));
        System.out.println(str.replace("3","2"));
        System.out.println(str.replaceAll("a","A"));


        str ="Kredi kartı numaram 1234 3456 3421 6754";

        //tum sayilari * yapın

        System.out.println(str.replaceAll("\\d","*"));

        str = "ali mert SAHIN";

        /*
        sayı ve boşluklar adokunmadan ilk harfi büyük harf kalan tüm harfleri * olarak yaz
         */

        System.out.println(
                str.substring(0,1).toUpperCase()+
                        str.substring(1).replaceAll("\\w","*"));

    }
}
