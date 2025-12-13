package day01;

import static java.lang.System.err;
import static java.lang.System.setErr;

public class P01_HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");

        //ekrana "Hello World" yazdırır


        System.out.println("\"Hello World\"");
        System.out.println("'Hello World'");


        /*
        Hello World
            Merhaba Dünya

         */
        System.out.println("Hello World" +
                "Merhaba Dünya");

        //bit alt satıra inerek yazmak. bir alt satıra inerek yazdırmak için \n ifadesi
        //bir TAB boşluk için \t ile yazılır

        System.out.println("Hello World \n\tMerhaba Dünya");

        //System.out.println(); --> bunun içindekini yazar ve sonraki işleme alt satırdan devam eder
        //System.out.print(); --> bunun içindekini yazar ve sonraki işleme aynı satırdan devam eder

        System.out.println("Hello World");
        System.out.println("Merhaba T168");
        System.out.println("-----------------------");

        System.out.print("Hello World");
        System.out.println(" Merhaba T168");
        System.out.println("-----------------------");

        int a=71;
        String isim="Kerim";

        System.out.println("isim = " + isim);
        System.out.println("a = " + a);

    }
}
