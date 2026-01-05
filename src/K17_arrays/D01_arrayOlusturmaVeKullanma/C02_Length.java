package K17_arrays.D01_arrayOlusturmaVeKullanma;

public class C02_Length {
    public static void main(String[] args) {


        String str ="Java Candır";

        int[] arr = {3,5,7,9,1,2,};

        //Stringdeki karakter saysıınız yazdırın
        System.out.println(str.length());

        //arr deki element sayısını yazıdrın
        System.out.println(arr.length);

        //String'in son karakterini yazdırın

        System.out.println(str.charAt(str.length()-1));

        //arr nin son elemnentini yazdır

        System.out.println(arr[arr.length-1]);

        //Stringin sondan 3. elementini yazdırın.

        System.out.println(str.charAt(str.length()-3));

        //arr'nin sondan 3. elementini yazdırın

        System.out.println(arr[arr.length-3]);



        //
    }
}
