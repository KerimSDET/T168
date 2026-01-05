package K18_arrayLists.D02_Sorular;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_FibonacciSayilariYazdir {

    public static void main(String[] args) {

    /*
    kullanıcıdan pozitif bir n tamsayı alıp
    ilk n tane Fibonacci sayisini bir liste olarak
    yazdırın
    0 1 1 2 3 5 8 13 21 34 55 89 144 233
     */
        System.out.println(fibonacciSerisiOlustur(4));

        System.out.println(fibonacciSerisiOlustur(20));

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen kaç adet Fibonacci sayısı istediğinizi giriniz:");
        int n = scanner.nextInt();
        List<Integer> fibonacciSerisi =new ArrayList<>();

        if (n<=0){
            System.out.println("O veya negatif sayı girdiniz.");
        } else if (n==1) {

            fibonacciSerisi.add(0);
        } else if (n==2) {
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
        } else {
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);

            for (int i = 2; i <n ; i++) {

                fibonacciSerisi.add(fibonacciSerisi.get(i-2)+fibonacciSerisi.get(i-1));

            }
        }
        System.out.println(fibonacciSerisi);
    }

    /*
    verilen pozitif bri n tamsayısını alarak,
    bize ilk n tane Fibonacci sayısını bir list olarak döndüren
    bir method yazdırın
     */

    public static List<Integer> fibonacciSerisiOlustur (int seridekiElementSayisi){

        List<Integer> fibonacciSerisi =new ArrayList<>();

        if (seridekiElementSayisi<=0){
            System.out.println("O veya negatif sayı girdiniz.");
        } else if (seridekiElementSayisi==1) {

            fibonacciSerisi.add(0);
        } else if (seridekiElementSayisi==2) {
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
        } else {
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);

            for (int i = 2; i <seridekiElementSayisi ; i++) {

                fibonacciSerisi.add(fibonacciSerisi.get(i-2)+fibonacciSerisi.get(i-1));

            }
        }
        return fibonacciSerisi;
    }

}

