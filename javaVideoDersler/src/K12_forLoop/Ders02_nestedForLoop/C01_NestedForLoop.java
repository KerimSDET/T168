package K12_forLoop.Ders02_nestedForLoop;

public class C01_NestedForLoop {

    public static void main(String[] args) {

        //bir for loop kullanarak 1 2 3 4 yazdırın

        for (int i = 1; i <=4 ; i++) {

            System.out.print(i+" ");

        }
        System.out.println();

        //bir for loop kullanaarak 2 4 6 8 yazdırın

        for (int i = 1; i <=4 ; i++) {

            System.out.print(i*2+" ");

        }

        System.out.println();
        // bir for loop kullanarak 3 6 9 12 yazdırın

        for (int i = 1; i <=4 ; i++) {

            System.out.print(i*3+" ");

        }

        System.out.println();
        // bir for loop kullanarak 4 6 8 12 yazdırın

        for (int i = 1; i <=4 ; i++) {

            System.out.print(i*4+" ");

        }


        System.out.println();
        System.out.println("==================");


          /*
        for loop ile bunu yazdırın

        1 2 3 4
        2 4 6 8
        3 6 9 12
        4 8 12 16
         */


        for (int i = 1; i <=4 ; i++) { // outer Loop satırları kontrol eder

            for (int j = 1; j <=4; j++) {  //inner loop her satırdaki sütunları kontrol eder.

                System.out.print(i*j+" ");

            }
            System.out.println();
        }

    }
}
