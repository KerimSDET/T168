package K17_arrays.D01_arrayOlusturmaVeKullanma;

import java.util.Arrays;

public class C01_ArrayOlusturmaVeYazdirma {

    public static void main(String[] args) {


        //4 int değer kıyabileceğimiz sayılar arrayi oluşturun

        int [] sayilar = new int[4];

        //5 isim koyabileceğimiz bir array oluşturun

        String [] isimler =new String[5]; //default 5* null koyar

        //2 boolean değer koyabileceğimiz bir array oluşturun
        boolean [] sonuclar = new boolean[2]; ///default olarak false koyar değeri

        //içinde 56,67,23,97 değerlerinin olduğu notlar arry'i oluşturun

        int[] notlar = {56,67,23,97};


        //içinde mevsim isimlerinin olduğu mevsimleri array'i oluşturun.

        String[] mevsimler = {"Ilkbahar", "Yaz", "Sonbahar", "Kış"};


        //notlar arrayindeki 23 ü yazdırın
        System.out.println(notlar[2]); //23


        //mevsimler Arrayindeki Kışı yazdrıırn

        System.out.println(mevsimler[3]); //kış

        //sayılar arrayindeki ilk elementi yazdırın
        System.out.println(sayilar[0]);

        //isimler arrayindeki 2. elementi yazdırın
        System.out.println(isimler[1]);

        // notlar arrayindeki 2. sayıyı 45 yapın

        notlar[1]=45;

        //isimler arrayindeki ilk ismi MAhmut olarka değiştirin
        isimler[0]="Mahmut";


        //mevsimleri elemntindeki 5. elemnti yazdırın dersek hata verir
        //ya da 5. array eklemek istersek de hata verir.


        //isimler arrayindeki tümünü yazdır

        System.out.println(isimler); //yazdırmaz.. [Ljava.lang.String;@3feba861 yazdırdı

        System.out.println(Arrays.toString(isimler));


        System.out.println(Arrays.toString(sayilar));

        System.out.println(Arrays.toString(notlar));

        System.out.println(Arrays.toString(mevsimler));

    }
}
