package K11_StringManupulations.Ders03;

public class C01_startWith {
    public static void main(String[] args) {
        String str = "Java çok güzel";

        //str Java ile mi başlıyor?

        System.out.println(str.startsWith("Java")); //True

        //str J ile mi başlıyor?

        System.out.println(str.startsWith("J")); //True
        System.out.println(str.startsWith("j")); //False

        //str Ja ile mi başlıyor?
        System.out.println(str.startsWith("Ja")); //True
        System.out.println(str.startsWith("ja")); //False

        //str Java çok ile mi başlıyor?

        System.out.println(str.startsWith("Java çok")); //true
        System.out.println(str.startsWith("Java yok")); //false

        //Java çok güzel ile mi başlıyor?
        System.out.println(str.startsWith("Java çok güzel"));

        //"" ile mi başlıyor
        System.out.println(str.startsWith(""));//true

        //5.index ve sonrası çok ile mi başlıyor?
        System.out.println(str.startsWith("çok",5));

        //8.index ve sonrası " " ile mi başlıyor
        System.out.println(str.startsWith(" ",8));





    }
}
