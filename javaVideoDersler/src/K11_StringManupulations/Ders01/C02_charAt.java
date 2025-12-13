package K11_StringManupulations.Ders01;

public class C02_charAt {

    public static void main(String[] args) {

        String str = "JAva Güzeldir";


        //str'nin ilk harfini yazdırın

        System.out.println(str.charAt(0));

        //str'daki baştan 9. harfi yazdırın

        System.out.println(str.charAt(8));


        //str son harfi yazdırın

        System.out.println((str.charAt(str.length()-1)));

        //sondan 5. harfi yazdırın

        System.out.println((str.charAt(str.length()-6)));






    }
}
