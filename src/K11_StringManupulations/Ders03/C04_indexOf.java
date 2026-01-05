package K11_StringManupulations.Ders03;

public class C04_indexOf {
    public static void main(String[] args) {

        String str ="çok çalışmam lazım, çok";

        //str calış içeriyor mu?

        System.out.println(str.contains("çalış"));

        //str calış ile başlıyor mu?

        System.out.println(str.startsWith("çalış"));

        //str çalış ile mi bitiyor
        System.out.println(str.endsWith("çalış"));

        //PEKII bu çalış cümlenin neresinde

        System.out.println(str.indexOf("çalış"));

        //str da kullanılan ilk a harfinin index i  nedir

        System.out.println(str.indexOf("a"));

        //str da kullanılan ilk çok un indexi nedir?

        System.out.println(str.indexOf("çok"));
        System.out.println(str.indexOf("Çok"));

        System.out.println(str.indexOf(" "));
        //str da kullanılan ilk a nin indexinin 5 olduğu biliniyorsa
        //ikinci a indexi nedir

        System.out.println(str.indexOf('a',6));

        //str da kullanılan ilk çok un indexi 0 olduğu biliniyora
        //ikinci çokun indexi nedir

        System.out.println(str.indexOf("çok",1));

        //str'da kullanılan ilk x in indexi

        System.out.println(str.indexOf('x')); // -1 tüm olmayan elemanlara bunu döndürür

        System.out.println(str.indexOf("Java"));

    }
}
