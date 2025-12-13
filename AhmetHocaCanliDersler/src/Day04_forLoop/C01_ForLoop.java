package Day04_forLoop;

import java.util.Scanner;

public class C01_ForLoop {
    public static void main(String[] args) {
        //3 kere alt alta "Hello World yazdırın

        System.out.println("Hello World\nHello World\nHello World");

        System.out.println("_______");

        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("___________");


        //Kullanıcıdan bir tamsayı alın
        //ve girilen sayı kadar alt alta Hello World yazıdırn

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen tekrar sayısını giriniz :");
        int tekrarSayisi=scanner.nextInt();

        //Loop demek döngü demektir.

        for (int i =0; i<tekrarSayisi; i++){
            //(kaçtan başayacak başlangıç değeri, kaça kadar gidecek?,
            System.out.println("Hello World");
            System.out.println((i+1) +" kadar çalıştı");
        }


    }
}
