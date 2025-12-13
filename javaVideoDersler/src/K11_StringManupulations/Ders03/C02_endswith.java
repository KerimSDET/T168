package K11_StringManupulations.Ders03;

public class C02_endswith {
    public static void main(String[] args) {

        String str ="Java öğrenmek çok zevkli";

        //str zevkli ile mi bitiyor
        System.out.println(str.endsWith("zevkli"));

        //str zevkli içeriyor mu?
        System.out.println(str.contains("zevkli"));

        //str zevkli ile mi başlıyor

        System.out.println(str.startsWith("zevkli"));

        //str zevkli mi?
        System.out.println(str.equals("zevkli"));

        //str li ile mi bitoyr
        System.out.println(str.endsWith("li"));

        //str vkli ile mi bitiyor?
        System.out.println(str.endsWith("vkli"));

        //str Java öğrenmek çok zevkli ile mi bitiyor

        System.out.println(str.endsWith("Java öğrenmek çok zevkli"));





    }
}
