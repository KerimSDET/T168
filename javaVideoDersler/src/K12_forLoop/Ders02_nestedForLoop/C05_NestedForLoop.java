package K12_forLoop.Ders02_nestedForLoop;

import java.util.Scanner;

public class C05_NestedForLoop {

    public static void main(String[] args) {

/*

        kullanicidan satir sayisini alip asagidaki sekli cizdirin
        orn satir = 5

                0
                0 1
                0 1 2
                0 1 2 3
                0 1 2 3 4

         */


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen satır sayısını giriniz : ");
        int satir = scanner.nextInt();

//        System.out.println("Lütfen sütun sayısını giriniz : ");
//        int sutun = scanner.nextInt();

        for (int i = 0; i <=satir; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
