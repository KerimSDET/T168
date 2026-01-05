package K11_StringManupulations.Ders04;


import java.util.Scanner;

public class C06_VerilenMetinTemizleme {

    public static void main(String[] args) {

        // kullanicidan bir metin isteyin
        // metindeki bosluk ve harf olmayan herseyi silin
        // ornek : input  : J1a4v*a )G*&^56uzel_!dir.
        //         output : Java Guzeldir

        Scanner scanner =new Scanner(System.in);

        System.out.println("Lütfen bir metin giriniz :");
        String metin = scanner.nextLine();



        //rakamlardan kurtlalım
        metin =metin.replaceAll("\\d", "");


//spacei koruma altına almalıyız
        //yukarıda sayıları yok ettiğimiz için metinde sayı olmadığını biliyoruz.
        //geçici olarka space yerine herhangi bir sayu yazdıralım sonra geri çevirelim

        metin = metin.replaceAll(" ","1");

        //w olmayanlardan kurtulalım
        metin = metin.replaceAll("\\W","");

        //_için özel kod yazmamız lazım
        metin = metin.replaceAll("_","");

        metin = metin.replaceAll("1"," ");

        System.out.println("Metnin son hali : " +metin);

    }



}
