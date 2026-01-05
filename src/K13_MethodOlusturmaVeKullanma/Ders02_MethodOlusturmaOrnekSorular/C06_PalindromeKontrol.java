package K13_MethodOlusturmaVeKullanma.Ders02_MethodOlusturmaOrnekSorular;

public class C06_PalindromeKontrol {
    public static void main(String[] args) {


        //verilen metnin palindrome olupolmadığını kontrol edip
        //palindrome ise true palindrome değilse false donduren bir method oluşturun


        System.out.println(isPalindrome("Java"));

        System.out.println(isPalindrome("madam"));

        System.out.println("123345");

    }

    public static Boolean isPalindrome (String metin){

        String tersMetin = C05_MetniTerseCevirme.metniTerstenDondur(metin);

        if (metin.equalsIgnoreCase(tersMetin)){

            return true;
        } else {return  false;}
    }
}
