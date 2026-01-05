package K11_StringManupulations.Ders03;

import java.util.Scanner;

public class C05_IkıncıKullanimIndexiniBulma {
    public static void main(String[] args) {

        /*
        kullanıcıdan bir metin isteyin
        girilen metinde 2. a nın indexini yazdırın
        eğer ikinci a yoksa metin 2 a içermeli yazdırın
         */


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen metni giriniz :");
        String str = scanner.nextLine();


        int aHarfIlkIndex = str.indexOf("a");

        int aHarfIkinciIndex =str.indexOf('a',aHarfIlkIndex+1);

        if (aHarfIkinciIndex ==-1){
            System.out.println("metin 2 a harfi içermelidir");
        } else {
            System.out.println("Verilen metindeki ikinci a indexi :" +aHarfIkinciIndex);
        }


    }
}
