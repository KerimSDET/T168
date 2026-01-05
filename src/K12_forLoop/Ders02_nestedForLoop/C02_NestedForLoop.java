package K12_forLoop.Ders02_nestedForLoop;

import java.util.Scanner;

public class C02_NestedForLoop {

    public static void main(String[] args) {


        /*
        Kullanıcıdan satır ve sürun sayısını alıp aşağıdaki şekli yazdırın.
        orneğin satır =4 ve sütun =5 olduğunda

         2 3 4 5 6
         3 4 5 6 7
         */


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen satır sayısını giriniz : ");
        int satir = scanner.nextInt();

        System.out.println("Lütfen sütun sayısını giriniz : ");
        int sutun = scanner.nextInt();


        for (int i = 1; i <=satir ; i++) { // outer Loop satırları kontrol eder

            for (int j = 1; j <=sutun; j++) {  //inner loop her satırdaki sütunları kontrol eder.

                System.out.print(i+j+" ");

            }
            System.out.println();
         }

    }
}
