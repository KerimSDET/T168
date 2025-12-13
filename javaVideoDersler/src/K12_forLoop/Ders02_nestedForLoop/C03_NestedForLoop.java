package K12_forLoop.Ders02_nestedForLoop;

import java.util.Scanner;

public class C03_NestedForLoop {

    public static void main(String[] args) {

        //kullanıcıdan satır ve sütunları alınız aşağıdaki şekli yazdırınız:

        //orn satır 3 sutun 6 olduğunda
        /*
        * * * * * *
        * * * * * *
        * * * * * *
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen satır sayısını giriniz : ");
        int satir = scanner.nextInt();

        System.out.println("Lütfen sütun sayısını giriniz : ");
        int sutun = scanner.nextInt();

        for (int i = 1; i <=satir ; i++) {

            for (int j = 1; j <= sutun; j++) {

                System.out.print("* ");

            } System.out.println();

        }


    }
}
