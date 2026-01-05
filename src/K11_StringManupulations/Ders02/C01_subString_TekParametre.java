package K11_StringManupulations.Ders02;

public class C01_subString_TekParametre {


    public static void main(String[] args) {

        String str = "Java gün geçtikçe güzelleşiyor";
        System.out.println(str.length());

        System.out.println("12. Karakteri :" +str.charAt(11));

        //10. karakterden sonuna kadar yazdırın

        System.out.println(str.substring(9));

        //ilk kelime hariç kalan metni yazdırın derse

        System.out.println(str.substring(5));

        //sondan 5. karakteri yazdıırınn deseydi

        System.out.println(str.charAt(str.length() - 5));

        //son 5 karakteri yazdırın
        System.out.println(str.substring(str.length() - 5));

        System.out.println(str.substring(str.length()));

    }}
