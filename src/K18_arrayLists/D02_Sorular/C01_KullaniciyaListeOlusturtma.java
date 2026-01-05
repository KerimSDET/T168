package K18_arrayLists.D02_Sorular;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_KullaniciyaListeOlusturtma {
    public static void main(String[] args) {

        List<String> isimler = stringListeOlustur();

        System.out.println("Oluşturulan liste :"+isimler);

    }

    /*
    kullanıcıdan istediği kadar String alıp
    Q'ya bastığında girdiği isimleri bize liste olarak döndürecek
    bir method oluşturun
     */

    public static List<String> stringListeOlustur () {
        List<String> isimler = new ArrayList<String>();

        Scanner scanner=new Scanner(System.in);

        String girilenIsım ="";

        do {
            System.out.println("Lütfen listeye eklemek için bir isim giriniz :"+
                    "\nbitirmek için Q'ya basınız.");

            girilenIsım = scanner.nextLine();

            if (!girilenIsım.equalsIgnoreCase("Q")){
                isimler.add(girilenIsım);
            }


        } while (!girilenIsım.equalsIgnoreCase("Q"));

            return isimler;
    }
}
