package K11_StringManupulations.Ders04;

import java.util.Scanner;

public class C03_replace {
    public static void main(String[] args) {

        String str = "Java öğrenmek çok kolay";

        //metni a yerine A olacak şekilde yadırın

        System.out.println(str.replace("a", "A"));


        System.out.println(str.replace('e', 'E'));

        System.out.println(str.replace("öğrenmek","bilmek"));

        System.out.println(str.replace("k k", "abcd"));

        System.out.println(str.replace(" ", ""));



        /*
        kullanıcıdan cümledeki değiştirmek istediği kısmı ve yerine koymak istediği
        metni alın ve cümleyi yeni haliyle yazdırın
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Cümlede değiştirmek istediğiniz kızmı yazınnız :");
        String eskiMetin = scanner.nextLine();

        System.out.println("Yerine ne yazdırmak istersin : ");
        String yeniMetin = scanner.nextLine();

        System.out.println(str.replace(eskiMetin, yeniMetin));

    }
}
