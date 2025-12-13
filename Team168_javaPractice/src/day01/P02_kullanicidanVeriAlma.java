package day01;

import java.util.Scanner;

public class P02_kullanicidanVeriAlma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen adınızı giriniz :");
        String name= scanner.nextLine();
        //scan next ilk boşluğa kadar alır devamını almaz.  2 isimlerde 2. isim alınmaz
        // ama nextline olursa satıra yazılanın tümünü alır
        System.out.print("Lütfen soyadınızı giriniz :");
        String surname = scanner.next();
        System.out.println("Numaranızı Giriniz :");
        String number= scanner.next();
        System.out.println("Memleketiniz :");
        String hometown =scanner.next();
        System.out.println("Sayın "+name+" "+surname+" Hoşgeldiniz");

    }
}
