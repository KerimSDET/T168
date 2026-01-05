package K18_arrayLists.D02_Sorular;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C05_FibonacciSayilariniYazdir {

    public static void main(String[] args) {

        /*
        Kullanıcıdan pozitif bir tamsayı alıp
        o tamsayıdan küçük fib sayılarını bir liste olarak yazıdırın

         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen fibonacci sayılarını yazdırın:");
        int maxSayi = scanner.nextInt();

        List<Integer> fibonacciSerisi = new ArrayList<>();
        
        if (maxSayi<0){
            System.out.println("Negatif sayı girilemez");
            } else if (maxSayi==0) {
            fibonacciSerisi.add(0);
        } else if (maxSayi==1) {
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
            fibonacciSerisi.add(2);

        } else {

            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
            fibonacciSerisi.add(2);
            int i =3;
            int birOnekiEleman = fibonacciSerisi.get(i-1);
            int ikiOncekiEleman = fibonacciSerisi.get(i-2);

            while (birOnekiEleman+ikiOncekiEleman<=maxSayi){
                fibonacciSerisi.add(birOnekiEleman+ikiOncekiEleman);
            i++;
            birOnekiEleman=fibonacciSerisi.get(i-1);
            ikiOncekiEleman=fibonacciSerisi.get(i-2);
            }
        }

        System.out.println(fibonacciSerisi);
    }
}
