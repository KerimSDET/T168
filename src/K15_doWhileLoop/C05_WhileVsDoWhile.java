package K15_doWhileLoop;

public class C05_WhileVsDoWhile {

    public static void main(String[] args) {

        //verilen sayıdan başlayarak birer arttırarak, 10'a kadar 10 hariç olan sayıları yazdırın

        int sayi =15;

        //while loop

        while (sayi<10){
            System.out.print(sayi+" ");
            sayi++;
        }

        System.out.println("");

        // do while loop ile


        sayi =15;

        do {

            System.out.print(sayi+" ");
            sayi++;

        } while (sayi<10);

    }
}
